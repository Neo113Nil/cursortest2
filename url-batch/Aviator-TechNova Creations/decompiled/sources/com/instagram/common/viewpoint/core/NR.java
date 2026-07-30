package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class NR {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.DREM);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.VT, 77, 81, 72, 73};
    }

    public static void A02(C1159dL c1159dL, AbstractC1434hy abstractC1434hy, boolean z, NP np) {
        if (!U7.A27(c1159dL)) {
            SF sf = new SF(c1159dL);
            NB A07 = abstractC1434hy.A20().A0H().A07();
            sf.A0e(new C0802Ua(abstractC1434hy.A25(), c1159dL.A0A()));
            if (A07 == null) {
                np.AEZ(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0O()) {
                np.AEa();
                return;
            }
            SB sb = new SB(A07.A0F(), abstractC1434hy.A17(), abstractC1434hy.A0v());
            sb.A04 = true;
            sb.A03 = A00(0, 5, 86);
            switch (NO.A00[A07.A0A().ordinal()]) {
                case 1:
                case 2:
                    sf.A0Y(sb);
                    break;
            }
            sf.A0c(new SD(abstractC1434hy.A23().A01(), -1, -1, abstractC1434hy.A17(), abstractC1434hy.A0v()));
            sf.A0c(new SD(A07.A0E(), -1, -1, abstractC1434hy.A17(), abstractC1434hy.A0v()));
            sf.A0X(new C1414hZ(c1159dL, np, sf, A07, z), new S8(abstractC1434hy.A17(), abstractC1434hy.A0v()));
            return;
        }
        np.AEa();
    }
}
