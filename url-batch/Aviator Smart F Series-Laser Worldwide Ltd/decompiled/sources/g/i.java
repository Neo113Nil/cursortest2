package g;

import cn.hutool.core.lang.mutable.MutableInt;
import cn.hutool.core.util.c1;
import cn.hutool.core.util.g0;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class i {
    private static final byte PADDING = -2;
    private static final Charset DEFAULT_CHARSET = cn.hutool.core.util.l.CHARSET_UTF_8;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, a4.a.G0, -1, a4.a.G0, -1, 63, 52, 53, 54, 55, 56, 57, a4.a.C0, a4.a.D0, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, a4.a.f50j0, 39, a4.a.f58l0, 41, a4.a.f66n0, 43, a4.a.f72p0, 45, a4.a.f78r0, 47, 48, 49, 50, 51};

    public static byte[] decode(CharSequence charSequence) {
        return decode(cn.hutool.core.text.l.bytes(charSequence, DEFAULT_CHARSET));
    }

    public static String decodeStr(CharSequence charSequence) {
        return decodeStr(charSequence, DEFAULT_CHARSET);
    }

    private static byte getNextValidDecodeByte(byte[] bArr, MutableInt mutableInt, int i8) {
        byte b8;
        while (mutableInt.intValue() <= i8) {
            byte b9 = bArr[mutableInt.intValue()];
            mutableInt.increment();
            if (b9 > -1 && (b8 = DECODE_TABLE[b9]) > -1) {
                return b8;
            }
        }
        return (byte) -2;
    }

    public static boolean isBase64Code(byte b8) {
        if (b8 != 61) {
            if (b8 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b8 >= bArr.length || bArr[b8] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static byte[] decode(byte[] bArr) {
        return g0.isEmpty(bArr) ? bArr : decode(bArr, 0, bArr.length);
    }

    public static String decodeStr(CharSequence charSequence, Charset charset) {
        return c1.str(decode(charSequence), charset);
    }

    public static byte[] decode(byte[] bArr, int i8, int i9) {
        if (g0.isEmpty(bArr)) {
            return bArr;
        }
        MutableInt mutableInt = new MutableInt(i8);
        int i10 = (i8 + i9) - 1;
        int i11 = (i9 * 3) / 4;
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        while (mutableInt.intValue() <= i10) {
            byte nextValidDecodeByte = getNextValidDecodeByte(bArr, mutableInt, i10);
            byte nextValidDecodeByte2 = getNextValidDecodeByte(bArr, mutableInt, i10);
            byte nextValidDecodeByte3 = getNextValidDecodeByte(bArr, mutableInt, i10);
            byte nextValidDecodeByte4 = getNextValidDecodeByte(bArr, mutableInt, i10);
            if (-2 != nextValidDecodeByte2) {
                bArr2[i12] = (byte) ((nextValidDecodeByte << 2) | (nextValidDecodeByte2 >>> 4));
                i12++;
            }
            if (-2 != nextValidDecodeByte3) {
                bArr2[i12] = (byte) (((nextValidDecodeByte2 & 15) << 4) | (nextValidDecodeByte3 >>> 2));
                i12++;
            }
            if (-2 != nextValidDecodeByte4) {
                bArr2[i12] = (byte) (((nextValidDecodeByte3 & 3) << 6) | nextValidDecodeByte4);
                i12++;
            }
        }
        return i12 == i11 ? bArr2 : (byte[]) cn.hutool.core.util.h.copy(bArr2, new byte[i12], i12);
    }
}
