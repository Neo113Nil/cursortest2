package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;

/* loaded from: classes9.dex */
public final class GovernmentIdStepRendering implements StepRendering {
    public final GovernmentIdStepFragment fragment;
    public final String name;

    public GovernmentIdStepRendering(String str, GovernmentIdStepFragment governmentIdStepFragment) {
        str.getClass();
        this.name = str;
        this.fragment = governmentIdStepFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return this.name;
    }
}
