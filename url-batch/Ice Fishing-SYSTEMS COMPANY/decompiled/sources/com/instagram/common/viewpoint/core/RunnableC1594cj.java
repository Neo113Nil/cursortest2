package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1594cj implements Runnable {
    public final /* synthetic */ C1002Ji A00;

    public RunnableC1594cj(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1556c7 c1556c7;
        C1556c7 c1556c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1556c7 = this.A00.A0b;
            if (c1556c7.A0D() != null) {
                c1556c72 = this.A00.A0b;
                c1556c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
