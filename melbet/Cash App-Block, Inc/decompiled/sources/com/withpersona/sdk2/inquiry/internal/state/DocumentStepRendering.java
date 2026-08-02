package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;

/* loaded from: classes9.dex */
public final class DocumentStepRendering implements StepRendering {
    public final DocumentStepFragment fragment;
    public final String name;

    public DocumentStepRendering(String str, DocumentStepFragment documentStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = documentStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
