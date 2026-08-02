package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0397El implements Runnable {
    public final InterfaceC0396Ek A00;

    public RunnableC0397El(InterfaceC0396Ek interfaceC0396Ek) {
        this.A00 = interfaceC0396Ek;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
