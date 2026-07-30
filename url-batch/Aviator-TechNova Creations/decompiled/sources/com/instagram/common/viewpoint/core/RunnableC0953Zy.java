package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0953Zy implements Runnable {
    public final /* synthetic */ KL A00;

    public RunnableC0953Zy(KL kl) {
        this.A00 = kl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0m();
            this.A00.A0n();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
