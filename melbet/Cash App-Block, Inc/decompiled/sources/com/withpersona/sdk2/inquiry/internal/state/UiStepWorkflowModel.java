package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class UiStepWorkflowModel implements WorkflowStepModel {
    public final UiWorkflow child;
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda9 handler;
    public final String key;
    public final UiWorkflow.Input props;

    public UiStepWorkflowModel(UiWorkflow uiWorkflow, UiWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda9 inquiryStateManager$$ExternalSyntheticLambda9) {
        uiWorkflow.getClass();
        str.getClass();
        this.child = uiWorkflow;
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda9;
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
