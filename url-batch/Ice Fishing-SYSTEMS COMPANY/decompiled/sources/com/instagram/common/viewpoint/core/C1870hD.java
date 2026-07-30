package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1870hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1869hC A01;

    public C1870hD(C1869hC c1869hC, int i) {
        this.A01 = c1869hC;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        C1839gi c1839gi;
        c1839gi = this.A01.A0C;
        c1839gi.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f6) {
        C1520bX c1520bX;
        C1520bX c1520bX2;
        float f9 = 1.0f - (f6 / this.A00);
        c1520bX = this.A01.A0G;
        if (c1520bX != null) {
            c1520bX2 = this.A01.A0G;
            c1520bX2.setProgressWithAnimation(100.0f * f9);
        }
    }
}
