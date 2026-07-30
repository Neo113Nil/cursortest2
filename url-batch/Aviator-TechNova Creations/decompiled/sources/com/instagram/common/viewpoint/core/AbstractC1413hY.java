package com.instagram.common.viewpoint.core;

import android.media.MediaFormat;
import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Random;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.hY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1413hY {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, Ascii.CR, 4, 5, 65, Ascii.NAK, Ascii.SO, 65, 19, 4, Ascii.NAK, 19, 8, 4, Ascii.ETB, 4, 65, 44, 4, 5, 8, 0, 39, Ascii.SO, 19, Ascii.FF, 0, Ascii.NAK, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, Ascii.CR, 108, 100, Ascii.CR, 107, Byte.MAX_VALUE, 110, Ascii.CR, 78, 66, 67, 75, 68, 74, 88, 95, 76, 89, 68, 66, 67, Ascii.CR, 89, 66, Ascii.CR, Ascii.FS, 59, Ascii.CR, Ascii.FS, 72, 41, 33, 72, 46, 58, 43, 72, Ascii.RS, 1, Ascii.FF, Ascii.CR, 7, 72, Ascii.FF, Ascii.GS, Ascii.SUB, 9, Ascii.FS, 1, 7, 6, 72, Ascii.FS, 7, 72, 77, Ascii.FF, 55, 58, 54, 56, 55, 43, 57, 36, 32, 40, 34, 56, 57, Ascii.DC2, 57, Utf8.REPLACEMENT_BYTE, 52, 36, 35, 42, Ascii.DC2, 57, 34, Ascii.DC2, 43, 36, 35, 41, Ascii.DC2, 62, 40, 42, 32, 40, 35, 57, Ascii.DC2, 36, 35, Ascii.DC2, 34, 36, 33, 17, 2, 9, 3, 8, Ascii.NAK, 73, Ascii.DC4, 2, 4, 74, 6, Ascii.SO, 1, Ascii.NAK, 4, 74, 19, Ascii.NAK, 6, 9, Ascii.DC4, 1, 2, Ascii.NAK, 74, Ascii.NAK, 2, Ascii.SYN, Ascii.DC2, 2, Ascii.DC4, 19, 73, 17, 6, Ascii.VT, Ascii.DC2, 2, Ascii.SI, Ascii.FS, Ascii.ETB, Ascii.GS, Ascii.SYN, Ascii.VT, 87, 10, Ascii.FS, Ascii.SUB, 84, Ascii.CAN, 16, Ascii.US, Ascii.VT, Ascii.SUB, 84, Ascii.SI, 16, Ascii.GS, Ascii.FS, Ascii.SYN, 84, Ascii.GS, Ascii.FF, Ascii.VT, Ascii.CAN, Ascii.CR, 16, Ascii.SYN, Ascii.ETB, 87, Ascii.SI, Ascii.CAN, Ascii.NAK, Ascii.FF, Ascii.FS, 113, 111, 98, 114, 110};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(Opcodes.DNEG, 37, 71);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * i2 * 1000.0d) + A03.nextInt(AdError.SERVER_ERROR_CODE));
        }
        return (int) Math.min(((i - 1) * 1000) + 500, 5000L);
    }

    public static void A03(C1431hv c1431hv, MediaFormat mediaFormat) {
        String A012 = A01(0, 30, 107);
        String A013 = A01(30, 11, 11);
        if (!c1431hv.A01) {
            return;
        }
        try {
            if (C1411hW.A02()) {
                if (c1431hv.A0O && !C1411hW.A03(mediaFormat.getInteger(A01(232, 5, 12)), mediaFormat.getInteger(A01(Opcodes.LREM, 6, 85)))) {
                    return;
                }
                long j = c1431hv.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(Opcodes.MONITOREXIT, 37, Opcodes.DREM), j);
                    AbstractC1342gL.A01(A013, A01(82, 31, 98), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(156, 39, 109), 1);
                AbstractC1342gL.A00(A013, A01(53, 29, 39));
            }
        } catch (ClassCastException e) {
            AbstractC1342gL.A02(A013, A012, e);
        } catch (NullPointerException e2) {
            AbstractC1342gL.A02(A013, A012, e2);
        }
    }

    public static boolean A04(C1431hv c1431hv, int i, int i2, int i3, int i4) {
        if (c1431hv.A01 && c1431hv.A0O && C1411hW.A03(i, i2) != C1411hW.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
