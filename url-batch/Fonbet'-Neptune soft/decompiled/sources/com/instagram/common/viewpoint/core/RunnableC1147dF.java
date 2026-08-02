package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1147dF implements Runnable {
    public final /* synthetic */ C0391Ef A00;

    public RunnableC1147dF(C0391Ef c0391Ef) {
        this.A00 = c0391Ef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C02006g c02006g;
        int i;
        Handler handler;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                c02006g = this.A00.A05;
                i = this.A00.A01;
                c02006g.scrollBy(i, 0);
                handler = this.A00.A04;
                handler.postDelayed(this, 16L);
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
