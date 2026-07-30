package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* loaded from: classes4.dex */
final class PDF417CodewordDecoder {
    private static final float[][] RATIOS_TABLE = (float[][]) Array.newInstance((Class<?>) Float.TYPE, PDF417Common.SYMBOL_TABLE.length, 8);

    static {
        int i8;
        int i9 = 0;
        while (true) {
            int[] iArr = PDF417Common.SYMBOL_TABLE;
            if (i9 >= iArr.length) {
                return;
            }
            int i10 = iArr[i9];
            int i11 = i10 & 1;
            int i12 = 0;
            while (i12 < 8) {
                float f8 = 0.0f;
                while (true) {
                    i8 = i10 & 1;
                    if (i8 == i11) {
                        f8 += 1.0f;
                        i10 >>= 1;
                    }
                }
                RATIOS_TABLE[i9][7 - i12] = f8 / 17.0f;
                i12++;
                i11 = i8;
            }
            i9++;
        }
    }

    private PDF417CodewordDecoder() {
    }

    private static int getBitValue(int[] iArr) {
        long j8 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            for (int i9 = 0; i9 < iArr[i8]; i9++) {
                int i10 = 1;
                long j9 = j8 << 1;
                if (i8 % 2 != 0) {
                    i10 = 0;
                }
                j8 = j9 | i10;
            }
        }
        return (int) j8;
    }

    private static int getClosestDecodedValue(int[] iArr) {
        int sum = MathUtils.sum(iArr);
        float[] fArr = new float[8];
        if (sum > 1) {
            for (int i8 = 0; i8 < 8; i8++) {
                fArr[i8] = iArr[i8] / sum;
            }
        }
        float f8 = Float.MAX_VALUE;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            float[][] fArr2 = RATIOS_TABLE;
            if (i10 >= fArr2.length) {
                return i9;
            }
            float[] fArr3 = fArr2[i10];
            float f9 = 0.0f;
            for (int i11 = 0; i11 < 8; i11++) {
                float f10 = fArr3[i11] - fArr[i11];
                f9 += f10 * f10;
                if (f9 >= f8) {
                    break;
                }
            }
            if (f9 < f8) {
                i9 = PDF417Common.SYMBOL_TABLE[i10];
                f8 = f9;
            }
            i10++;
        }
    }

    private static int getDecodedCodewordValue(int[] iArr) {
        int bitValue = getBitValue(iArr);
        if (PDF417Common.getCodeword(bitValue) == -1) {
            return -1;
        }
        return bitValue;
    }

    static int getDecodedValue(int[] iArr) {
        int decodedCodewordValue = getDecodedCodewordValue(sampleBitCounts(iArr));
        return decodedCodewordValue != -1 ? decodedCodewordValue : getClosestDecodedValue(iArr);
    }

    private static int[] sampleBitCounts(int[] iArr) {
        float sum = MathUtils.sum(iArr);
        int[] iArr2 = new int[8];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < 17; i10++) {
            float f8 = (sum / 34.0f) + ((i10 * sum) / 17.0f);
            int i11 = iArr[i9];
            if (i8 + i11 <= f8) {
                i8 += i11;
                i9++;
            }
            iArr2[i9] = iArr2[i9] + 1;
        }
        return iArr2;
    }
}
