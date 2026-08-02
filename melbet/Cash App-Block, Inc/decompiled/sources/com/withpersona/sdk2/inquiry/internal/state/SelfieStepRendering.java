package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;

/* loaded from: classes9.dex */
public final class SelfieStepRendering implements StepRendering {
    public final SelfieStepFragment fragment;
    public final String name;

    public SelfieStepRendering(String str, SelfieStepFragment selfieStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = selfieStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
