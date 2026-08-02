package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;

/* loaded from: classes9.dex */
public final class IntegrationStepModel implements IntermediateStepModel {
    public final boolean didGoBack;
    public final InquiryStateManager$$ExternalSyntheticLambda7 handler;
    public final String key;
    public final IntegrationWorkflow.Input props;

    public IntegrationStepModel(IntegrationWorkflow.Input input, String str, boolean z, InquiryStateManager$$ExternalSyntheticLambda7 inquiryStateManager$$ExternalSyntheticLambda7) {
        str.getClass();
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = inquiryStateManager$$ExternalSyntheticLambda7;
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
