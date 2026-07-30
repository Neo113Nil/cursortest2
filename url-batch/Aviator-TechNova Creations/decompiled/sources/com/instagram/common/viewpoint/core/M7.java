package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class M7 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, Ascii.FS, 19, 3, 16, 9, Ascii.DC2, 17, 36, Ascii.ESC, Ascii.VT, Ascii.RS, 17, 16, Ascii.NAK, Ascii.RS};
    }

    public static long A00(M8 m8) {
        return m8.A6Z(A02(0, 7, 111), -1L);
    }

    public static Uri A01(M8 m8) {
        String A6b = m8.A6b(A02(7, 9, Opcodes.DNEG), null);
        if (A6b == null) {
            return null;
        }
        return Uri.parse(A6b);
    }
}
