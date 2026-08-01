package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0459Eb implements Runnable {
    public final /* synthetic */ C0467Ej A00;
    public final /* synthetic */ C0468Ek A01;
    public final /* synthetic */ C0469El A02;
    public final /* synthetic */ InterfaceC0470Em A03;

    public RunnableC0459Eb(C0467Ej c0467Ej, InterfaceC0470Em interfaceC0470Em, C0468Ek c0468Ek, C0469El c0469El) {
        this.A00 = c0467Ej;
        this.A03 = interfaceC0470Em;
        this.A01 = c0468Ek;
        this.A02 = c0469El;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A03.ABv(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
