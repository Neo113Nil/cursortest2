package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class b {
    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i8 = 0; i8 < sArr.length; i8++) {
            bArr[i8] = (byte) sArr[i8];
        }
        return bArr;
    }

    public static int[] convertArraytoInt(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            iArr[i8] = bArr[i8] & 255;
        }
        return iArr;
    }

    public static byte[] convertIntArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            bArr[i8] = (byte) iArr[i8];
        }
        return bArr;
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z7 &= sArr[length] == sArr2[length];
        }
        return z7;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sArr[i8] = (short) (bArr[i8] & 255);
        }
        return sArr;
    }

    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z7 &= equals(sArr[length], sArr2[length]);
        }
        return z7;
    }

    public static byte[][] convertArray(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length);
        for (int i8 = 0; i8 < sArr.length; i8++) {
            for (int i9 = 0; i9 < sArr[0].length; i9++) {
                bArr[i8][i9] = (byte) sArr[i8][i9];
            }
        }
        return bArr;
    }

    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z7 &= equals(sArr[length], sArr2[length]);
        }
        return z7;
    }

    public static short[][] convertArray(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            for (int i9 = 0; i9 < bArr[0].length; i9++) {
                sArr[i8][i9] = (short) (bArr[i8][i9] & 255);
            }
        }
        return sArr;
    }

    public static byte[][][] convertArray(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i8 = 0; i8 < sArr.length; i8++) {
            for (int i9 = 0; i9 < sArr[0].length; i9++) {
                for (int i10 = 0; i10 < sArr[0][0].length; i10++) {
                    bArr[i8][i9][i10] = (byte) sArr[i8][i9][i10];
                }
            }
        }
        return bArr;
    }

    public static short[][][] convertArray(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            for (int i9 = 0; i9 < bArr[0].length; i9++) {
                for (int i10 = 0; i10 < bArr[0][0].length; i10++) {
                    sArr[i8][i9][i10] = (short) (bArr[i8][i9][i10] & 255);
                }
            }
        }
        return sArr;
    }
}
