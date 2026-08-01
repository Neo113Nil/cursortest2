package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class YY implements C6I {
    public final List<C1060ah> A00;
    public final /* synthetic */ YX A01;

    public YY(YX yx, List<C1060ah> list) {
        this.A01 = yx;
        this.A00 = list;
    }

    private void A00() {
        C02565a c02565a;
        C02565a c02565a2;
        C02565a c02565a3;
        YA ya;
        C02565a c02565a4;
        C02565a c02565a5;
        YA ya2;
        c02565a = this.A01.A00;
        c02565a.A05(true);
        c02565a2 = this.A01.A00;
        c02565a2.A02();
        c02565a3 = this.A01.A00;
        c02565a3.A03(0);
        for (C1060ah c1060ah : this.A00) {
            ya = this.A01.A01;
            UM A0K = UJ.A0K();
            c02565a4 = this.A01.A00;
            UJ uj = new UJ(ya, c1060ah, null, A0K, c02565a4.A01());
            if (uj.A0y() != null && uj.A0y().A0F() != null) {
                ((AbstractC1020a3) uj.A0y().A0F()).A00(uj);
            }
            c02565a5 = this.A01.A00;
            ya2 = this.A01.A01;
            c02565a5.A04(new NativeAd(ya2, uj));
        }
        C0608Jz.A00(new YZ(this));
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A00();
    }
}
