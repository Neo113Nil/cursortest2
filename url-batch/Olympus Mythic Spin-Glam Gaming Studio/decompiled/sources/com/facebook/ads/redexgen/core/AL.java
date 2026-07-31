package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class AL extends C3704p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C20385i c20385i) {
        super(A01(0, 22, 85) + str, c20385i, 2003, 1);
        this.A00 = str;
    }
}
