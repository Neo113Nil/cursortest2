package com.withpersona.sdk2.inquiry.internal.state;

import com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment;

/* loaded from: classes9.dex */
public final class LoadingRendering implements StepRendering {
    public final LoadingFragment fragment;

    public LoadingRendering(LoadingFragment loadingFragment) {
        this.fragment = loadingFragment;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.StepRendering
    public final String getName() {
        return "$pi2_loading";
    }
}
