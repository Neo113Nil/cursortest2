package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2555Qe extends AbstractRunnableC2705Wc {
    public final /* synthetic */ XO A00;

    public C2555Qe(XO xo) {
        this.A00 = xo;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        Handler handler;
        long j;
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        handler = this.A00.A05;
        j = this.A00.A02;
        handler.postDelayed(this, j);
    }
}
