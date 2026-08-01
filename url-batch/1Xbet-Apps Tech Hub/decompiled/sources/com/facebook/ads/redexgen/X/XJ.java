package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class XJ implements AU {
    public final /* synthetic */ C1B A00;

    public XJ(C1B c1b) {
        this.A00 = c1b;
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final void AAd(int i) {
        AQ aq;
        aq = this.A00.A0C;
        aq.A01(i);
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final void ACT() {
        this.A00.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final void ADH(int i, long j, long j2) {
        AQ aq;
        aq = this.A00.A0C;
        aq.A02(i, j, j2);
    }
}
