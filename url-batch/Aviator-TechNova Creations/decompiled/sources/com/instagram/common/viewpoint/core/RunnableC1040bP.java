package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1040bP implements Runnable {
    public final /* synthetic */ C0513Is A00;

    public RunnableC1040bP(C0513Is c0513Is) {
        this.A00 = c0513Is;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (z) {
                this.A00.A0L();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
