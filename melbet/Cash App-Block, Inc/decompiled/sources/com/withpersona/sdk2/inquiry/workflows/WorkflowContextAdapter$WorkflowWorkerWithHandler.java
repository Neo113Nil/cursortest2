package com.withpersona.sdk2.inquiry.workflows;

import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class WorkflowContextAdapter$WorkflowWorkerWithHandler {
    public Function1 handler;
    public final WorkflowWorker worker;

    public WorkflowContextAdapter$WorkflowWorkerWithHandler(WorkflowWorker workflowWorker, Function1 function1) {
        function1.getClass();
        this.worker = workflowWorker;
        this.handler = function1;
    }
}
