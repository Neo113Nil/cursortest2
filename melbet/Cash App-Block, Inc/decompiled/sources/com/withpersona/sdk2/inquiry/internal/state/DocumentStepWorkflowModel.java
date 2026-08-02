package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class DocumentStepWorkflowModel implements WorkflowStepModel {
    public final DocumentWorkflow child;
    public final boolean didGoBack;
    public final HCaptcha$$ExternalSyntheticLambda1 handler;
    public final String key;
    public final DocumentWorkflow.Input props;

    public DocumentStepWorkflowModel(DocumentWorkflow documentWorkflow, DocumentWorkflow.Input input, String str, boolean z, HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1) {
        documentWorkflow.getClass();
        str.getClass();
        this.child = documentWorkflow;
        this.props = input;
        this.key = str;
        this.didGoBack = z;
        this.handler = hCaptcha$$ExternalSyntheticLambda1;
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
