package com.withpersona.sdk2.inquiry.workflows;

/* loaded from: classes9.dex */
public abstract class SimpleWorkflowState implements WorkflowState {
    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
    public final boolean isSameStateAs(WorkflowState workflowState) {
        return getClass() == workflowState.getClass();
    }
}
