package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class EP extends AbstractC1013Zw {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    public static final AnonymousClass24 A03 = new C1004Zl();
    public C1008Zq A00;
    public final AnonymousClass23 A01;

    public EP(AnonymousClass23 anonymousClass23) {
        super(anonymousClass23.A05(), A03.A4d(anonymousClass23));
        this.A01 = anonymousClass23;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1013Zw
    public final void A05() {
        C1008Zq c1008Zq = this.A00;
        if (c1008Zq != null) {
            c1008Zq.A0F();
        }
        InterfaceC01791y interfaceC01791y = super.A00;
        EnumC01781x enumC01781x = EnumC01781x.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC01791y.AFC(enumC01781x);
    }

    public final C1008Zq A07() {
        return this.A00;
    }

    public final void A08() {
        C1008Zq c1008Zq = new C1008Zq(this.A01, this, this.A02);
        this.A00 = c1008Zq;
        c1008Zq.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5Y()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C1008Zq c1008Zq = this.A00;
        if (c1008Zq != null) {
            c1008Zq.A0I(cacheFlags, str);
            return;
        }
        this.A01.A0J(cacheFlags);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C1008Zq c1008Zq = this.A00;
        if (c1008Zq != null) {
            return c1008Zq.A0J();
        }
        if (this.A01.A00() > 0) {
            long A00 = LM.A00();
            long A002 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (A00 > A002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C1008Zq c1008Zq = this.A00;
        if (c1008Zq != null) {
            return c1008Zq.A0K();
        }
        return super.A00.A5r() == EnumC01781x.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5Z()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C1008Zq c1008Zq = this.A00;
        if (c1008Zq != null) {
            return c1008Zq.A0L();
        }
        C1008Zq c1008Zq2 = new C1008Zq(this.A01, this, this.A02);
        this.A00 = c1008Zq2;
        c1008Zq2.A0L();
        return false;
    }
}
