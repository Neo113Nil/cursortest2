package com.withpersona.sdk2.inquiry.workflows;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes9.dex */
public interface WorkflowWorker {
    boolean doesSameWorkAs(WorkflowWorker workflowWorker);

    Flow run();
}
