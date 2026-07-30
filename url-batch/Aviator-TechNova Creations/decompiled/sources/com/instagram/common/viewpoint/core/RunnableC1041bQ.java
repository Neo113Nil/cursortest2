package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1041bQ implements Runnable {
    public final /* synthetic */ C0513Is A00;

    public RunnableC1041bQ(C0513Is c0513Is) {
        this.A00 = c0513Is;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0997ai c0997ai;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c0997ai = this.A00.A0c;
            c0997ai.A0E().AFE(true);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
