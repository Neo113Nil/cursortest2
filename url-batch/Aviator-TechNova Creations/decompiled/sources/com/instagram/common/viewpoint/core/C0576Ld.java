package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ld, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0576Ld implements InterfaceC1136cx {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ C0575Lc A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.EM, Ascii.ETB, 9, Ascii.SYN, 7, 16, Ascii.CR, 7, Ascii.SI};
    }

    static {
        A01();
    }

    public C0576Ld(C0575Lc c0575Lc) {
        this.A00 = c0575Lc;
    }

    public /* synthetic */ C0576Ld(C0575Lc c0575Lc, C0593Lu c0593Lu) {
        this(c0575Lc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1136cx
    public final void ACt() {
        this.A00.A0U(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1136cx
    public final void ADW() {
        boolean z;
        AbstractC1434hy abstractC1434hy;
        InterfaceC0890Xn interfaceC0890Xn;
        YY yy;
        US us;
        AbstractC1434hy abstractC1434hy2;
        C1138cz c1138cz;
        C1138cz c1138cz2;
        C1159dL c1159dL;
        YY yy2;
        AbstractC1434hy abstractC1434hy3;
        AbstractC1434hy abstractC1434hy4;
        C1159dL c1159dL2;
        AbstractC1434hy abstractC1434hy5;
        AbstractC1434hy abstractC1434hy6;
        C1159dL c1159dL3;
        NB nb;
        C1159dL c1159dL4;
        C1159dL c1159dL5;
        z = this.A00.A0Z;
        if (!z) {
            abstractC1434hy = this.A00.A0I;
            if (!TextUtils.isEmpty(abstractC1434hy.A25())) {
                us = this.A00.A0M;
                abstractC1434hy2 = this.A00.A0I;
                String A25 = abstractC1434hy2.A25();
                C0944Zp c0944Zp = new C0944Zp();
                c1138cz = this.A00.A07;
                C0944Zp A03 = c0944Zp.A03(c1138cz.getViewabilityChecker());
                c1138cz2 = this.A00.A07;
                us.AB5(A25, A03.A02(c1138cz2.getTouchDataRecorder()).A05());
                c1159dL = this.A00.A0L;
                W2 A00 = W2.A00(c1159dL);
                yy2 = this.A00.A0R;
                String A8d = yy2.A8d();
                abstractC1434hy3 = this.A00.A0I;
                A00.A0E(A8d, abstractC1434hy3.A25());
                abstractC1434hy4 = this.A00.A0I;
                N3 A21 = abstractC1434hy4.A21();
                c1159dL2 = this.A00.A0L;
                N3.A07(A21, c1159dL2);
                abstractC1434hy5 = this.A00.A0I;
                String A0t = abstractC1434hy5.A0t();
                abstractC1434hy6 = this.A00.A0I;
                AbstractC0646Nw.A02(A0t, X0.A00(abstractC1434hy6.A0v()));
                c1159dL3 = this.A00.A0L;
                c1159dL3.A0F().A3D();
                nb = this.A00.A0J;
                if (nb.A0P()) {
                    c1159dL4 = this.A00.A0L;
                    c1159dL4.A0F().ADo();
                }
            }
            C0575Lc c0575Lc = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC0890Xn = c0575Lc.A0Q;
            yy = this.A00.A0R;
            interfaceC0890Xn.A4b(yy.A88());
            return;
        }
        c1159dL5 = this.A00.A0L;
        c1159dL5.A0F().ADp();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1136cx
    public final void AE2() {
        InterfaceC0890Xn interfaceC0890Xn;
        YY yy;
        interfaceC0890Xn = this.A00.A0Q;
        yy = this.A00.A0R;
        interfaceC0890Xn.A4b(yy.A7t());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1136cx
    public final void AFw() {
        InterfaceC0890Xn interfaceC0890Xn;
        interfaceC0890Xn = this.A00.A0Q;
        interfaceC0890Xn.ACf(15);
    }
}
