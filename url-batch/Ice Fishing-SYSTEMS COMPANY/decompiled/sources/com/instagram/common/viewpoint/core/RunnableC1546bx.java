package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1546bx implements Runnable {
    public final /* synthetic */ C1022Kc A00;

    public RunnableC1546bx(C1022Kc c1022Kc) {
        this.A00 = c1022Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1552c3) this.A00).A07.A0D() != null) {
                ((AbstractC1552c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
