package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.2H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2H {
    public static C2G A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, Base64.padSymbol, 42, 119, Ascii.CAN, Ascii.GS, 6, Ascii.VT, Ascii.FS, 9, Ascii.SYN, Ascii.VT, Ascii.CR, 16, Ascii.ETB, Ascii.RS, 6, Ascii.SUB, Ascii.SYN, Ascii.ETB, Ascii.US, 16, Ascii.RS};
    }

    public static C2G A00(Y9 y9) {
        if (A00 == null) {
            synchronized (C2G.class) {
                if (A00 == null) {
                    A00 = new C2G(new C0995Zc(y9.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), y9), 0)));
                }
            }
        }
        return A00;
    }
}
