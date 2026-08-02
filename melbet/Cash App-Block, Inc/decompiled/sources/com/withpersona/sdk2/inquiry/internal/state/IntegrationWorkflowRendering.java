package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;

/* loaded from: classes9.dex */
public final class IntegrationWorkflowRendering implements StepRendering {
    public final WorkflowStepFragment fragment;
    public final String name;

    public IntegrationWorkflowRendering(String str, WorkflowStepFragment workflowStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = workflowStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
