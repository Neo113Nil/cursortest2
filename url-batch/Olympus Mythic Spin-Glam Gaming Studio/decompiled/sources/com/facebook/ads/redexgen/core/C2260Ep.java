package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2260Ep extends AbstractRunnableC2705Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2255Ek A02;

    public C2260Ep(C2255Ek c2255Ek, int i, int i2) {
        this.A02 = c2255Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C2243Dy(this.A00, this.A01));
    }
}
