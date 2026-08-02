package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0544Kd extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C0935Zm A00;

    public C0544Kd(C0935Zm c0935Zm) {
        this.A00 = c0935Zm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (!z) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
