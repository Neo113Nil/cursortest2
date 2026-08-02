package com.withpersona.sdk2.inquiry.internal.state;

import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;

/* loaded from: classes9.dex */
public final class DocumentStepModel implements IntermediateStepModel {
    public final boolean didGoBack;
    public final HCaptcha$$ExternalSyntheticLambda1 handler;
    public final String key;
    public final DocumentWorkflow.Input props;

    public DocumentStepModel(DocumentWorkflow.Input input, String str, boolean z, HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1) {
        str.getClass();
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = hCaptcha$$ExternalSyntheticLambda1;
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
