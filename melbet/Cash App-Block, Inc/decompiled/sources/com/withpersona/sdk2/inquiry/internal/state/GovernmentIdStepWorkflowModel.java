package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class GovernmentIdStepWorkflowModel implements WorkflowStepModel {
    public final GovernmentIdWorkflow child;
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda3 handler;
    public final String key;
    public final GovernmentIdWorkflow.Input props;

    public GovernmentIdStepWorkflowModel(GovernmentIdWorkflow governmentIdWorkflow, GovernmentIdWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda3 inquiryStateManager$$ExternalSyntheticLambda3) {
        governmentIdWorkflow.getClass();
        str.getClass();
        this.child = governmentIdWorkflow;
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda3;
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
