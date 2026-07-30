package g;

import cn.hutool.core.util.c1;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class j {
    private static final Charset DEFAULT_CHARSET = cn.hutool.core.util.l.CHARSET_UTF_8;
    private static final byte[] STANDARD_ENCODE_TABLE = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static byte[] encode(byte[] bArr, boolean z7) {
        return encode(bArr, z7, false);
    }

    public static String encodeStr(byte[] bArr, boolean z7, boolean z8) {
        return c1.str(encode(bArr, z7, z8), DEFAULT_CHARSET);
    }

    public static byte[] encodeUrlSafe(byte[] bArr, boolean z7) {
        return encode(bArr, z7, true);
    }

    public static String encode(CharSequence charSequence) {
        return encode(charSequence, DEFAULT_CHARSET);
    }

    public static String encodeUrlSafe(CharSequence charSequence) {
        return encodeUrlSafe(charSequence, DEFAULT_CHARSET);
    }

    public static String encode(CharSequence charSequence, Charset charset) {
        return encode(cn.hutool.core.text.l.bytes(charSequence, charset));
    }

    public static String encodeUrlSafe(CharSequence charSequence, Charset charset) {
        return encodeUrlSafe(cn.hutool.core.text.l.bytes(charSequence, charset));
    }

    public static String encode(byte[] bArr) {
        return c1.str(encode(bArr, false), DEFAULT_CHARSET);
    }

    public static String encodeUrlSafe(byte[] bArr) {
        return c1.str(encodeUrlSafe(bArr, false), DEFAULT_CHARSET);
    }

    public static byte[] encode(byte[] bArr, boolean z7, boolean z8) {
        int i8;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        int i9 = (length / 3) * 3;
        int i10 = length - 1;
        int i11 = ((i10 / 3) + 1) << 2;
        int i12 = i11 + (z7 ? ((i11 - 1) / 76) << 1 : 0);
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = z8 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            int i15 = 0;
            while (i13 < i9) {
                int i16 = i13 + 2;
                int i17 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
                i13 += 3;
                int i18 = i17 | (bArr[i16] & 255);
                bArr2[i14] = bArr3[(i18 >>> 18) & 63];
                bArr2[i14 + 1] = bArr3[(i18 >>> 12) & 63];
                bArr2[i14 + 2] = bArr3[(i18 >>> 6) & 63];
                i8 = i14 + 4;
                bArr2[i14 + 3] = bArr3[i18 & 63];
                if (!z7 || (i15 = i15 + 1) != 19 || i8 >= i12 - 2) {
                    i14 = i8;
                }
            }
            int i19 = i14 + 5;
            bArr2[i8] = 13;
            i14 += 6;
            bArr2[i19] = 10;
        }
        int i20 = length - i9;
        if (i20 > 0) {
            int i21 = (i20 == 2 ? (bArr[i10] & 255) << 2 : 0) | ((bArr[i9] & 255) << 10);
            bArr2[i12 - 4] = bArr3[i21 >> 12];
            bArr2[i12 - 3] = bArr3[(i21 >>> 6) & 63];
            if (z8) {
                int i22 = i12 - 2;
                if (2 == i20) {
                    bArr2[i22] = bArr3[i21 & 63];
                    i22 = i12 - 1;
                }
                byte[] bArr4 = new byte[i22];
                System.arraycopy(bArr2, 0, bArr4, 0, i22);
                return bArr4;
            }
            bArr2[i12 - 2] = i20 == 2 ? bArr3[i21 & 63] : (byte) 61;
            bArr2[i12 - 1] = 61;
        }
        return bArr2;
    }
}
