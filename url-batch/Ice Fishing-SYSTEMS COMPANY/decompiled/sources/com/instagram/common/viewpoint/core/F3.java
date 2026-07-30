package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class F3 {
    public static byte[] A00;
    public static String[] A01 = {"hxRtgXLlXZBZOOikVlBghnrqRk8D", "kooIKi1fx1Hb2qPm3oF2lCQrgWRqeUq9", "tAS3MHwJkliRqJEhDeJC9YibHYE", "z1PlvRauaFfgQg02R7fRgUIUzlYZ", "X9uQKTEyJl", "tATbEztK", "lnp2iYjILHnNLb0EhQTEEhT3vvCpm0GE", "ASuPVfTQk0HiiSTBHvF2"};

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A01[7] = "l0wMWtKaafBi6h";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 96);
            i10++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-18, -31, -24, -31, -35, -17, -31, -32};
    }

    static {
        A01();
    }

    public static /* synthetic */ boolean A02(F3 f32) {
        throw new NullPointerException(A00(0, 8, 28));
    }
}
