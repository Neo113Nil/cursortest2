package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public final class j {
    private j() {
    }

    public static void I2OSP(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >>> 8);
        bArr[i9 + 2] = (byte) (i8 >>> 16);
        bArr[i9 + 3] = (byte) (i8 >>> 24);
    }

    public static int OS2IP(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static long OS2LIP(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    public static byte[] toByteArray(int[] iArr, int i8) {
        int length = iArr.length;
        byte[] bArr = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        while (i9 <= length - 2) {
            I2OSP(iArr[i9], bArr, i10);
            i9++;
            i10 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i10, i8 - i10);
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i8 = 0;
        int i9 = 0;
        while (i8 <= length - 2) {
            iArr[i8] = OS2IP(bArr, i9);
            i8++;
            i9 += 4;
        }
        int i10 = length - 1;
        if (length2 != 0) {
            iArr[i10] = OS2IP(bArr, i9, length2);
        } else {
            iArr[i10] = OS2IP(bArr, i9);
        }
        return iArr;
    }

    public static void I2OSP(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            bArr[i9 + i11] = (byte) (i8 >>> (i11 * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i8) {
        int i9 = ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
        return ((bArr[i8 + 3] & 255) << 24) | i9 | ((bArr[i8 + 2] & 255) << 16);
    }

    public static void I2OSP(long j8, byte[] bArr, int i8) {
        bArr[i8] = (byte) j8;
        bArr[i8 + 1] = (byte) (j8 >>> 8);
        bArr[i8 + 2] = (byte) (j8 >>> 16);
        bArr[i8 + 3] = (byte) (j8 >>> 24);
        bArr[i8 + 4] = (byte) (j8 >>> 32);
        bArr[i8 + 5] = (byte) (j8 >>> 40);
        bArr[i8 + 6] = (byte) (j8 >>> 48);
        bArr[i8 + 7] = (byte) (j8 >>> 56);
    }

    public static int OS2IP(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            i10 |= (bArr[i8 + i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public static byte[] I2OSP(int i8) {
        return new byte[]{(byte) i8, (byte) (i8 >>> 8), (byte) (i8 >>> 16), (byte) (i8 >>> 24)};
    }

    public static byte[] I2OSP(long j8) {
        return new byte[]{(byte) j8, (byte) (j8 >>> 8), (byte) (j8 >>> 16), (byte) (j8 >>> 24), (byte) (j8 >>> 32), (byte) (j8 >>> 40), (byte) (j8 >>> 48), (byte) (j8 >>> 56)};
    }
}
