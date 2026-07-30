package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class E9 {
    public static byte[] A03;
    public final int A00;
    public final C1802oH A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, Ascii.NAK, Ascii.SYN, Ascii.EM, Ascii.RS, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, 3, 43, 46, 50, 55, -34, 50, 48, Ascii.US, 33, 41, 49, -34, Ascii.US, 48, 35, -34, 44, 45, 50, -34, Ascii.US, 42, 42, 45, 53, 35, 34};
    }

    public E9(C1802oH c1802oH, int... iArr) {
        this(c1802oH, iArr, 0);
    }

    public E9(C1802oH c1802oH, int[] iArr, int i) {
        if (iArr.length == 0) {
            AnonymousClass44.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c1802oH;
        this.A02 = iArr;
        this.A00 = i;
    }
}
