package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0465Eh implements Runnable {
    public final /* synthetic */ C0467Ej A00;
    public final /* synthetic */ C0469El A01;
    public final /* synthetic */ InterfaceC0470Em A02;

    public RunnableC0465Eh(C0467Ej c0467Ej, InterfaceC0470Em interfaceC0470Em, C0469El c0469El) {
        this.A00 = c0467Ej;
        this.A02 = interfaceC0470Em;
        this.A01 = c0469El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A02.AB8(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
