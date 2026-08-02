package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02749p extends AbstractC1808oU {
    public static byte[] A02;
    public static String[] A03 = {"Ze0y2PQb31vngbi38k5mfZCC", "5", "jLmR5cr6Hwks3p4PsKfIxGU921nipvRD", "Pp3qhBBlWU8bouyoK5QiOWA", "ww40dK", "331B", "UQZ2ltoBgBcCSgXWY09raSZ", "C"};
    public static final C1R<C02749p> A04;
    public static final String A05;
    public static final String A06;
    public final float A00;
    public final int A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "26ayShss4mhG1SZ6mAOlhU0";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-108, -120, -97, 122, -101, -120, -103, -102, 71, -108, -100, -102, -101, 71, -119, -116, 71, -120, 71, -105, -106, -102, -112, -101, -112, -99, -116, 71, -112, -107, -101, -116, -114, -116, -103, -68, -67, -86, -69, -101, -86, -67, -78, -73, -80, 105, -78, -68, 105, -72, -66, -67, 105, -72, -81, 105, -69, -86, -73, -80, -82, 105, -92, 121, 117, 105, -74, -86, -63, -100, -67, -86, -69, -68, -90};
    }

    static {
        A03();
        A05 = AbstractC01424a.A0h(1);
        A06 = AbstractC01424a.A0h(2);
        A04 = new C1R() { // from class: com.facebook.ads.redexgen.X.oT
            @Override // com.instagram.common.viewpoint.core.C1R
            public final C1S A6X(Bundle bundle) {
                C02749p A00;
                A00 = C02749p.A00(bundle);
                return A00;
            }
        };
    }

    public C02749p(int i) {
        C3M.A09(i > 0, A02(0, 35, 26));
        this.A01 = i;
        this.A00 = -1.0f;
    }

    public C02749p(int i, float f) {
        C3M.A09(i > 0, A02(0, 35, 26));
        C3M.A09(f >= 0.0f && f <= ((float) i), A02(35, 40, 60));
        this.A01 = i;
        this.A00 = f;
    }

    public static C02749p A00(Bundle bundle) {
        C3M.A07(bundle.getInt(AbstractC1808oU.A02, -1) == 2);
        int i = bundle.getInt(A05, 5);
        float starRating = bundle.getFloat(A06, -1.0f);
        if (starRating == -1.0f) {
            return new C02749p(i);
        }
        return new C02749p(i, starRating);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02749p)) {
            return false;
        }
        C02749p c02749p = (C02749p) obj;
        return this.A01 == c02749p.A01 && this.A00 == c02749p.A00;
    }

    public final int hashCode() {
        return BX.A00(Integer.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
