package com.instagram.common.viewpoint.core;

import android.R;

/* loaded from: assets/audience_network.dex */
public class NL extends AbstractRunnableC0840Vt {
    public final /* synthetic */ Y0 A00;

    public NL(Y0 y0) {
        this.A00 = y0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(17432576, R.anim.fade_out);
    }
}
