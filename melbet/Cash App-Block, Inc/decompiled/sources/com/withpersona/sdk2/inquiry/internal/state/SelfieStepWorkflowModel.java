package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieStepWorkflowModel implements WorkflowStepModel {
    public final SelfieWorkflow child;
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda17 handler;
    public final String key;
    public final SelfieWorkflow.Input props;

    public SelfieStepWorkflowModel(SelfieWorkflow selfieWorkflow, SelfieWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda17 inquiryStateManager$$ExternalSyntheticLambda17) {
        selfieWorkflow.getClass();
        str.getClass();
        this.child = selfieWorkflow;
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda17;
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
