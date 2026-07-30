package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    private static int[][] calculateBlackPoints(byte[] bArr, int i8, int i9, int i10, int i11) {
        int i12 = 8;
        int i13 = i11 - 8;
        int i14 = i10 - 8;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, i8);
        int i15 = 0;
        while (i15 < i9) {
            int i16 = i15 << 3;
            if (i16 > i13) {
                i16 = i13;
            }
            int i17 = 0;
            while (i17 < i8) {
                int i18 = i17 << 3;
                if (i18 > i14) {
                    i18 = i14;
                }
                int i19 = (i16 * i10) + i18;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 255;
                while (i20 < i12) {
                    int i24 = 0;
                    while (i24 < i12) {
                        int i25 = bArr[i19 + i24] & 255;
                        i21 += i25;
                        if (i25 < i23) {
                            i23 = i25;
                        }
                        if (i25 > i22) {
                            i22 = i25;
                        }
                        i24++;
                        i12 = 8;
                    }
                    if (i22 - i23 > 24) {
                        while (true) {
                            i20++;
                            i19 += i10;
                            if (i20 < 8) {
                                int i26 = 0;
                                for (int i27 = 8; i26 < i27; i27 = 8) {
                                    i21 += bArr[i19 + i26] & 255;
                                    i26++;
                                }
                            }
                        }
                    }
                    i20++;
                    i19 += i10;
                    i12 = 8;
                }
                int i28 = i21 >> 6;
                if (i22 - i23 <= 24) {
                    i28 = i23 / 2;
                    if (i15 > 0 && i17 > 0) {
                        int[] iArr2 = iArr[i15 - 1];
                        int i29 = i17 - 1;
                        int i30 = ((iArr2[i17] + (iArr[i15][i29] * 2)) + iArr2[i29]) / 4;
                        if (i23 < i30) {
                            i28 = i30;
                        }
                    }
                }
                iArr[i15][i17] = i28;
                i17++;
                i12 = 8;
            }
            i15++;
            i12 = 8;
        }
        return iArr;
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i8, int i9, int i10, int i11, int[][] iArr, BitMatrix bitMatrix) {
        int i12 = i11 - 8;
        int i13 = i10 - 8;
        for (int i14 = 0; i14 < i9; i14++) {
            int i15 = i14 << 3;
            int i16 = i15 > i12 ? i12 : i15;
            int cap = cap(i14, 2, i9 - 3);
            for (int i17 = 0; i17 < i8; i17++) {
                int i18 = i17 << 3;
                int i19 = i18 > i13 ? i13 : i18;
                int cap2 = cap(i17, 2, i8 - 3);
                int i20 = 0;
                for (int i21 = -2; i21 <= 2; i21++) {
                    int[] iArr2 = iArr[cap + i21];
                    i20 += iArr2[cap2 - 2] + iArr2[cap2 - 1] + iArr2[cap2] + iArr2[cap2 + 1] + iArr2[cap2 + 2];
                }
                thresholdBlock(bArr, i19, i16, i20 / 25, i10, bitMatrix);
            }
        }
    }

    private static int cap(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    private static void thresholdBlock(byte[] bArr, int i8, int i9, int i10, int i11, BitMatrix bitMatrix) {
        int i12 = (i9 * i11) + i8;
        int i13 = 0;
        while (i13 < 8) {
            for (int i14 = 0; i14 < 8; i14++) {
                if ((bArr[i12 + i14] & 255) <= i10) {
                    bitMatrix.set(i8 + i14, i9 + i13);
                }
            }
            i13++;
            i12 += i11;
        }
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() {
        BitMatrix bitMatrix = this.matrix;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.matrix = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i8 = width >> 3;
            if ((width & 7) != 0) {
                i8++;
            }
            int i9 = i8;
            int i10 = height >> 3;
            if ((height & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int[][] calculateBlackPoints = calculateBlackPoints(matrix, i9, i11, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            calculateThresholdForBlock(matrix, i9, i11, width, height, calculateBlackPoints, bitMatrix2);
            this.matrix = bitMatrix2;
        }
        return this.matrix;
    }
}
