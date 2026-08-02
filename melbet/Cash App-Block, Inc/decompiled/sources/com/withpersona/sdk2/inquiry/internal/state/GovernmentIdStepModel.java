package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;

/* loaded from: classes9.dex */
public final class GovernmentIdStepModel implements IntermediateStepModel {
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda3 handler;
    public final String key;
    public final GovernmentIdWorkflow.Input props;

    public GovernmentIdStepModel(GovernmentIdWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda3 inquiryStateManager$$ExternalSyntheticLambda3) {
        str.getClass();
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda3;
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
