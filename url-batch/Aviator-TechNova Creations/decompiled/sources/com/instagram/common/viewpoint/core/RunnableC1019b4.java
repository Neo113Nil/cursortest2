package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1019b4 implements Runnable {
    public final /* synthetic */ JU A00;

    public RunnableC1019b4(JU ju) {
        this.A00 = ju;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0Q;
            if (z) {
                this.A00.A0N();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
