package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1593ci implements Runnable {
    public final /* synthetic */ C1002Ji A00;

    public RunnableC1593ci(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        if (WU.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0D;
            if (z8) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
