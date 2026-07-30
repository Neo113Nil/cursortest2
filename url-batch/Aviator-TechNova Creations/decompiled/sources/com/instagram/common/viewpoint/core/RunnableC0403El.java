package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0403El implements Runnable {
    public final InterfaceC0402Ek A00;

    public RunnableC0403El(InterfaceC0402Ek interfaceC0402Ek) {
        this.A00 = interfaceC0402Ek;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
