package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class IntegrationStepWorkflowModel implements WorkflowStepModel {
    public final IntegrationWorkflow child;
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda7 handler;
    public final String key;
    public final IntegrationWorkflow.Input props;

    public IntegrationStepWorkflowModel(IntegrationWorkflow integrationWorkflow, IntegrationWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda7 inquiryStateManager$$ExternalSyntheticLambda7) {
        integrationWorkflow.getClass();
        str.getClass();
        this.child = integrationWorkflow;
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda7;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel
    public final StatefulWorkflow getChild() {
        return this.child;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel
    public final Function1 getHandler() {
        return this.handler;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel
    public final String getName() {
        return this.key;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel
    public final Object getProps() {
        return this.props;
    }
}
