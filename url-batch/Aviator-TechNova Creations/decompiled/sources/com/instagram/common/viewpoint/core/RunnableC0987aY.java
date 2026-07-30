package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0987aY implements Runnable {
    public final /* synthetic */ C0544Jx A00;

    public RunnableC0987aY(C0544Jx c0544Jx) {
        this.A00 = c0544Jx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC0993ae) this.A00).A06.A0E() != null) {
                ((AbstractC0993ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
