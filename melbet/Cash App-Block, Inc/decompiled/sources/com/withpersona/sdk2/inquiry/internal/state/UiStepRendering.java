package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;

/* loaded from: classes9.dex */
public final class UiStepRendering implements StepRendering {
    public final UiStepFragment fragment;
    public final String name;

    public UiStepRendering(String str, UiStepFragment uiStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = uiStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
