package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class YZ extends AbstractRunnableC0604Jv {
    public final /* synthetic */ YY A00;

    public YZ(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0604Jv
    public final void A01() {
        C02565a c02565a;
        C02565a c02565a2;
        c02565a = this.A00.A01.A00;
        if (c02565a.A00() != null) {
            c02565a2 = this.A00.A01.A00;
            c02565a2.A00().onAdsLoaded();
        }
    }
}
