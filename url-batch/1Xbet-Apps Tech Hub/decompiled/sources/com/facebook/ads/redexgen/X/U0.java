package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class U0 extends K8 {
    public final /* synthetic */ C0622Kn A00;

    public U0(C0622Kn c0622Kn) {
        this.A00 = c0622Kn;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        Handler handler;
        long j;
        if (this.A00.A06()) {
            this.A00.A02();
            handler = this.A00.A05;
            j = this.A00.A02;
            handler.postDelayed(this, j);
        }
    }
}
