package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1099cM implements Runnable {
    public final /* synthetic */ C4K A00;

    public RunnableC1099cM(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106cT interfaceC1106cT;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A = true;
            interfaceC1106cT = this.A00.A0V;
            interfaceC1106cT.AFE(true);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
