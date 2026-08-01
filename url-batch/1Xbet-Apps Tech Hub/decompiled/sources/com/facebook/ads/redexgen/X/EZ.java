package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EZ implements Runnable {
    public final /* synthetic */ C0467Ej A00;
    public final /* synthetic */ InterfaceC0470Em A01;

    public EZ(C0467Ej c0467Ej, InterfaceC0470Em interfaceC0470Em) {
        this.A00 = c0467Ej;
        this.A01 = interfaceC0470Em;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.AC4(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
