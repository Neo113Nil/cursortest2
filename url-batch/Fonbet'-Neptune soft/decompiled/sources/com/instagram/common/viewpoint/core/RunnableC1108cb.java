package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1108cb implements Runnable {
    public final /* synthetic */ C01333r A00;

    public RunnableC1108cb(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
