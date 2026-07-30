package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0715Qp implements Runnable {
    public final /* synthetic */ C0716Qq A00;

    public RunnableC0715Qp(C0716Qq c0716Qq) {
        this.A00 = c0716Qq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
