package com.github.yujiarui.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.yujiarui.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
