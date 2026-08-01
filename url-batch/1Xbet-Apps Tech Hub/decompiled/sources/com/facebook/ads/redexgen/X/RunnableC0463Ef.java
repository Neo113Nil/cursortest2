package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0463Ef implements Runnable {
    public final /* synthetic */ C0467Ej A00;
    public final /* synthetic */ InterfaceC0470Em A01;

    public RunnableC0463Ef(C0467Ej c0467Ej, InterfaceC0470Em interfaceC0470Em) {
        this.A00 = c0467Ej;
        this.A01 = interfaceC0470Em;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.ACe(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
