package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, c.f16475b, 81, 70, 71, c.f16475b, 93, c.f16475b, 93, 85, 88};
    }

    public static void A02(C1839gi c1839gi, AbstractC2004jd abstractC2004jd, boolean z8, O3 o32) {
        if (!C1289Up.A2E(c1839gi)) {
            C1245Sx c1245Sx = new C1245Sx(c1839gi);
            C1111No A07 = abstractC2004jd.A29().A0H().A07();
            c1245Sx.A0e(new VI(abstractC2004jd.A2E(), c1839gi.A0A()));
            if (A07 == null) {
                o32.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o32.AFG();
                return;
            }
            C1241St c1241St = new C1241St(A07.A0L(), abstractC2004jd.A1D(), abstractC2004jd.A10());
            c1241St.A04 = true;
            c1241St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1245Sx.A0Y(c1241St);
                    break;
            }
            c1245Sx.A0c(new C1243Sv(abstractC2004jd.A2C().A01(), -1, -1, abstractC2004jd.A1D(), abstractC2004jd.A10()));
            c1245Sx.A0c(new C1243Sv(A07.A0K(), -1, -1, abstractC2004jd.A1D(), abstractC2004jd.A10()));
            O0.A00(abstractC2004jd, c1245Sx, A00(5, 12, 71));
            c1245Sx.A0X(new C1982jA(c1839gi, o32, c1245Sx, A07, z8), new C1238Sq(abstractC2004jd.A1D(), abstractC2004jd.A10()));
            return;
        }
        o32.AFG();
    }
}
