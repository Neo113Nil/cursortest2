package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieStepModel implements IntermediateStepModel {
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda17 handler;
    public final String key;
    public final SelfieWorkflow.Input props;

    public SelfieStepModel(SelfieWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda17 inquiryStateManager$$ExternalSyntheticLambda17) {
        str.getClass();
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda17;
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
