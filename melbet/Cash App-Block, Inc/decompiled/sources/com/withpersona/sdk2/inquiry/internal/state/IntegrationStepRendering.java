package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;

/* loaded from: classes9.dex */
public final class IntegrationStepRendering implements StepRendering {
    public final IntegrationStepFragment fragment;
    public final String name;

    public IntegrationStepRendering(String str, IntegrationStepFragment integrationStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = integrationStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
