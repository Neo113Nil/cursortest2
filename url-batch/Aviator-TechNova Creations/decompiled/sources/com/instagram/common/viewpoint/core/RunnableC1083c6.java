package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1083c6 implements Runnable {
    public final /* synthetic */ C01614n A00;

    public RunnableC1083c6(C01614n c01614n) {
        this.A00 = c01614n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106cT interfaceC1106cT;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            interfaceC1106cT = this.A00.A0M;
            interfaceC1106cT.AFE(true);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
