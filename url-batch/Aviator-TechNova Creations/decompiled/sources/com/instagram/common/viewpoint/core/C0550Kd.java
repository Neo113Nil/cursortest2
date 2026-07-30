package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0550Kd extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C0941Zm A00;

    public C0550Kd(C0941Zm c0941Zm) {
        this.A00 = c0941Zm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
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
