package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1034Ko {
    public static byte[] A00;
    public static String[] A01 = {"rzG5nsHyiLOWX8UOWspYPJE0qk8", "zzN7h9kZ1110Ms84Vk8TxNIxLbkfn1bs", "Ea1csqz6uGTsOrOcIglVsCF", "HzbrV2YdC0QyP2mr3Tf3UtzOp", "wDtYJLWcmo8biPQhT7PXhiXa0nvGQfME", "EfdNeKI6mNZbvmHLu3zFEqD29", "z9B2Nu2EMki8SlMmHuJ5tm0bMARcwAxE", "Vyy1RSqHmZDwxzuj6K"};
    public static final Pattern A02;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{115, 108, 48, 13, 5, 16, 22, 1, 16, 17, 85, 34, 48, 55, 35, 33, 33, 91, 85, 50, 26, 1, 85, 76, 121, 110, Byte.MAX_VALUE, 121, 114, 104, 125, 123, 121, 111, 60, 113, 105, 111, 104, 60, 121, 114, 120, 60, 107, 117, 104, 116, 60, 57, 87, 69, 66, 86, 84, 84, 121, 11, 74, 90, 91, c.f16475b, 81, 60, 79, 52, 29, 73, 58, 62, 61, 43, 48};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(58, 15, 19));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 81))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 27));
    }

    public static long A01(String str) throws NumberFormatException {
        long j9 = 0;
        String[] subparts = C5C.A1P(str, A02(56, 2, 34));
        for (String str2 : C5C.A1O(subparts[0], A02(1, 1, 81))) {
            long j10 = 60 * j9;
            if (A01[0].length() != 27) {
                throw new RuntimeException();
            }
            String[] parts = A01;
            parts[2] = "6AHxBA9eqgTuoeEClHZkEfjq11VkmmF";
            long value = Long.parseLong(str2);
            j9 = j10 + value;
        }
        long j11 = j9 * 1000;
        if (subparts.length == 2) {
            long value2 = Long.parseLong(subparts[1]);
            j11 += value2;
        }
        return 1000 * j11;
    }

    public static void A04(C06464v c06464v) throws C3K {
        int A09 = c06464v.A09();
        if (A05(c06464v)) {
            return;
        }
        c06464v.A0f(A09);
        throw C3K.A01(A02(2, 21, 114) + c06464v.A0T(), null);
    }

    public static boolean A05(C06464v c06464v) {
        String A0T = c06464v.A0T();
        if (A0T != null) {
            String line = A02(50, 6, 7);
            if (A0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
