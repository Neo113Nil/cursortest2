package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1314fs extends AbstractRunnableC0833Vg {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C1312fq A00;

    public C1314fs(C1312fq c1312fq) {
        this.A00 = c1312fq;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0833Vg
    public final void A01() {
        C0725Qz c0725Qz;
        C0725Qz c0725Qz2;
        C0725Qz c0725Qz3;
        c0725Qz = this.A00.A01;
        if (c0725Qz.A06() != null) {
            c0725Qz2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c0725Qz2.A06();
            c0725Qz3 = this.A00.A01;
            A06.onAdClicked(c0725Qz3.A07());
        }
    }
}
