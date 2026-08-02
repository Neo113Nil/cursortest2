package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.ui.UiWorkflow;

/* loaded from: classes9.dex */
public final class UiStepModel implements IntermediateStepModel {
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda9 handler;
    public final String key;
    public final UiWorkflow.Input props;

    public UiStepModel(UiWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda9 inquiryStateManager$$ExternalSyntheticLambda9) {
        str.getClass();
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda9;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel
    public final boolean getDidGoBack() {
        throw null;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel
    public final String getName() {
        return this.key;
    }
}
