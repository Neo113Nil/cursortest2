package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0709Qp implements Runnable {
    public final /* synthetic */ C0710Qq A00;

    public RunnableC0709Qp(C0710Qq c0710Qq) {
        this.A00 = c0710Qq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
