package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1106bY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1105bX A01;

    public RunnableC1106bY(C1105bX c1105bX, int i) {
        this.A01 = c1105bX;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC0804Rp interfaceC0804Rp;
        Handler handler;
        Runnable runnable;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A01.A01;
            if (z) {
                C1105bX c1105bX = this.A01;
                interfaceC0804Rp = c1105bX.A05;
                c1105bX.A04(interfaceC0804Rp.AAE());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
