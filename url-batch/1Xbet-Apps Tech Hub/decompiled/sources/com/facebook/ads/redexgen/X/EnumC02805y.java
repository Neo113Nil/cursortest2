package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02805y {
    A04(A01(16, 5, 50)),
    A06(A01(27, 5, 29)),
    A05(A01(21, 6, 93));

    public static byte[] A01;
    public static String[] A02 = {"k9IbPcfog7a2vud71ZD1yiSptuKC", "7LgXLJxVBX0dpNGH2cpdo2FqGbwHr2dh", "LRipwKypnEKMqg6PamR7G8YuQckBwe", "JMyIsM6N3mQ5xBBSQQoIEfTakpln9APf", "n5EonvV2d0ynVphuWIfrU3PhJk0DBM6W", "TLMtZWSWcMyBHKhNGVy3rrDPFywR", "JEnYl3ig6b1G3QZnd7pVPdvbWtuLiuax", "SOFQxOre1ZQqrgpFIrPfi6IMKTKD0s"};
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(7) != 'N') {
                throw new RuntimeException();
            }
            A02[4] = "tSWii36WTWypzTcQeixtwPDDv3BIvAiF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-51, -47, -59, -53, -55, Ascii.VT, -1, 16, 9, 19, Ascii.SO, Ascii.EM, Ascii.FF, 7, 8, Ascii.DC2, Ascii.DC2, Ascii.SYN, 10, 16, Ascii.SO, 65, 53, 70, 63, 73, 68, 10, -3, -8, -7, 3};
    }

    static {
        A02();
    }

    EnumC02805y(String str) {
        this.A00 = str;
    }

    public static EnumC02805y A00(String str) {
        for (EnumC02805y enumC02805y : values()) {
            if (enumC02805y.A00.equals(str)) {
                return enumC02805y;
            }
        }
        return null;
    }
}
