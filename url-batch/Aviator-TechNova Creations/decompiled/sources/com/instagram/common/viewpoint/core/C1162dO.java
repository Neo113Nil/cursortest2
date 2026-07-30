package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1162dO {
    public static byte[] A09;
    public final E1 A02;
    public final C1388h8 A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final DU A04 = new DU() { // from class: com.facebook.ads.redexgen.X.3o
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Z c3z) {
            String str;
            C1388h8 c1388h8;
            str = C1162dO.this.A06;
            C1389h9 c1389h9 = new C1389h9(str, c3z.A03(), c3z.A01(), c3z.A02());
            if (c3z.A00() >= 0.05d) {
                c1389h9.A06(c3z.A01());
            }
            C1162dO.A00(C1162dO.this);
            c1388h8 = C1162dO.this.A05;
            c1388h8.A04(c1389h9);
        }
    };
    public final DX A03 = new DX() { // from class: com.facebook.ads.redexgen.X.3n
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C01253d c01253d) {
            boolean z;
            z = C1162dO.this.A08;
            if (z) {
                C1162dO c1162dO = C1162dO.this;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c1162dO.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, Ascii.SI, -2, 10, 2, -4, 0, Ascii.FF, Ascii.DC2, Ascii.VT, 17, -90, -78, -95, -83, -91, -77};
    }

    public C1162dO(E1 e1, String str, boolean z, Map<String, String> map) {
        this.A06 = str;
        this.A02 = e1;
        this.A07 = map;
        this.A08 = z;
        this.A05 = new C1388h8(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C1162dO c1162dO) {
        int i = c1162dO.A01;
        c1162dO.A01 = i + 1;
        return i;
    }

    public final Map<String, String> A06() {
        String A01 = C1388h8.A01(this.A05.A03());
        HashMap hashMap = new HashMap();
        if (this.A07 != null) {
            hashMap.putAll(this.A07);
        }
        if (A01 == null) {
            A01 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A01);
        hashMap.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        hashMap.put(A02(0, 11, 8), String.valueOf(i));
        return hashMap;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
