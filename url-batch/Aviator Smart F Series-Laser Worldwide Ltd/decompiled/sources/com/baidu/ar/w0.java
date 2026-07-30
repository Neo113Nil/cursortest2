package com.baidu.ar;

/* loaded from: classes.dex */
public class w0 {
    public static double a(byte[] bArr) {
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            d8 += Math.abs(a(bArr[i8], bArr[i8 + 1]));
        }
        return Math.log10(((d8 / bArr.length) / 2.0d) + 1.0d) * 10.0d;
    }

    public static double b(byte[] bArr) {
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            int a8 = a(bArr[i8], bArr[i8 + 1]);
            d8 += a8 * a8;
        }
        return Math.min(5000.0d, Math.sqrt((d8 / bArr.length) / 2.0d)) / 50.0d;
    }

    public static int a(byte b8, byte b9) {
        int i8 = (b8 & 255) + ((b9 & 255) << 8);
        return i8 >= 32768 ? i8 - 65535 : i8;
    }

    public static void a(byte[] bArr, double d8) {
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            int i9 = i8 + 1;
            int a8 = a(bArr[i8], bArr[i9]);
            int i10 = (int) (a8 * d8);
            if (i10 < 32767 && i10 > -32768) {
                a8 = (short) i10;
            } else if (i10 > 32767) {
                a8 = 32767;
            } else if (i10 < -32768) {
                a8 = -32768;
            }
            bArr[i8] = (byte) (a8 & 255);
            bArr[i9] = (byte) ((a8 >> 8) & 255);
        }
    }
}
