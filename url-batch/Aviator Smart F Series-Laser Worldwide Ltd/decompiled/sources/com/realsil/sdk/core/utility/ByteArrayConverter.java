package com.realsil.sdk.core.utility;

import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class ByteArrayConverter {
    public static final int BYTE_ORDER_BIG_ENDIAN = 1;
    public static final int BYTE_ORDER_LITTLE_ENDIAN = 0;

    public static byte[] combine(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr3, 0, length);
        }
        if (length2 > 0) {
            System.arraycopy(bArr, 0, bArr3, length, length2);
        }
        return bArr3;
    }

    public static byte[] extract(byte[] bArr, int i8, int i9) {
        int length = bArr.length - i8;
        if (length >= i9) {
            byte[] bArr2 = new byte[i9];
            if (i9 > 0) {
                System.arraycopy(bArr, i8, bArr2, 0, i9);
            }
            return bArr2;
        }
        ZLogger.w("extractBytes() remaining length " + length + " is less than copying length " + i9 + ", array length is " + bArr.length + " start is " + i8);
        return new byte[0];
    }

    public static byte[] fromInt(int i8) {
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255)};
    }

    public static byte[] fromShort(short s7) {
        return new byte[]{(byte) (s7 & 255), (byte) ((s7 >> 8) & 255)};
    }

    public static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i8 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[i8] = bArr[length];
            i8++;
        }
        return bArr2;
    }

    public static int toInt(byte[] bArr, int i8) {
        return toInt(bArr, i8, 0);
    }

    public static int toInt16(byte[] bArr, int i8, int i9) {
        int i10;
        byte b8;
        if (bArr == null || bArr.length - i8 < 2) {
            return 0;
        }
        if (i9 == 0) {
            i10 = (bArr[i8 + 1] << 8) & 65280;
            b8 = bArr[i8];
        } else {
            i10 = (bArr[i8] << 8) & 65280;
            b8 = bArr[i8 + 1];
        }
        return (b8 & 255) | i10;
    }

    public static int toInt32(byte[] bArr, int i8, int i9) {
        int i10;
        byte b8;
        if (bArr == null || bArr.length - i8 < 4) {
            return 0;
        }
        if (i9 == 0) {
            i10 = ((bArr[i8 + 3] << 24) & (-16777216)) | (16711680 & (bArr[i8 + 2] << 16)) | (65280 & (bArr[i8 + 1] << 8));
            b8 = bArr[i8];
        } else {
            i10 = ((bArr[i8] << 24) & (-16777216)) | (16711680 & (bArr[i8 + 1] << 16)) | (65280 & (bArr[i8 + 2] << 8));
            b8 = bArr[i8 + 3];
        }
        return (b8 & 255) | i10;
    }

    public static long toInt64(byte[] bArr, int i8, int i9) {
        if (bArr == null || bArr.length - i8 < 8) {
            return 0L;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(i9 == 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        return wrap.getLong(i8);
    }

    public static short toShort(byte[] bArr, int i8) {
        return toShort(bArr, i8, 0);
    }

    public static int toInt(byte[] bArr, int i8, int i9) {
        return toInt32(bArr, i8, i9);
    }

    public static short toShort(byte[] bArr, int i8, int i9) {
        int length;
        int i10;
        byte b8;
        int i11;
        if (bArr == null || (length = bArr.length - i8) < 1) {
            return (short) 0;
        }
        if (length < 2) {
            i11 = bArr[i8] & 255;
        } else {
            if (i9 == 0) {
                i10 = (bArr[i8 + 1] << 8) & 65280;
                b8 = bArr[i8];
            } else {
                i10 = (bArr[i8] << 8) & 65280;
                b8 = bArr[i8 + 1];
            }
            i11 = ((b8 & 255) | i10) & 65535;
        }
        return (short) i11;
    }
}
