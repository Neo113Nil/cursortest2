package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1269f9 implements Runnable {
    public final /* synthetic */ C0337Bw A00;

    public RunnableC1269f9(C0337Bw c0337Bw) {
        this.A00 = c0337Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            C0337Bw.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
