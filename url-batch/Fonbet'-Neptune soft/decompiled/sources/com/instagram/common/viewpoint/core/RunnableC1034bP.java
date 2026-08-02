package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1034bP implements Runnable {
    public final /* synthetic */ C0507Is A00;

    public RunnableC1034bP(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (z) {
                this.A00.A0L();
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
