package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class BB extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{47, 7, 6, Ascii.VT, 3, 66, 6, Ascii.CR, 7, 17, 66, Ascii.FF, Ascii.CR, Ascii.SYN, 66, 17, Ascii.ETB, Ascii.DC2, Ascii.DC2, Ascii.CR, 16, Ascii.SYN, 66, Ascii.ETB, Ascii.ETB, Ascii.VT, 6, 88, 66};
    }

    public BB(UUID uuid) {
        super(A00(0, 29, 29) + uuid);
    }
}
