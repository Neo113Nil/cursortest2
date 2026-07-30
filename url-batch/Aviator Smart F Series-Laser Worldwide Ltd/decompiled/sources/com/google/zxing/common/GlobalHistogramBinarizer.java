package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* loaded from: classes4.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    private static final byte[] EMPTY = new byte[0];
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.luminances = EMPTY;
        this.buckets = new int[32];
    }

    private static int estimateBlackPoint(int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i8) {
                i10 = i11;
                i8 = i12;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 - i10;
            int i17 = iArr[i15] * i16 * i16;
            if (i17 > i14) {
                i13 = i15;
                i14 = i17;
            }
        }
        if (i10 <= i13) {
            int i18 = i10;
            i10 = i13;
            i13 = i18;
        }
        if (i10 - i13 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i19 = i10 - 1;
        int i20 = i19;
        int i21 = -1;
        while (i19 > i13) {
            int i22 = i19 - i13;
            int i23 = i22 * i22 * (i10 - i19) * (i9 - iArr[i19]);
            if (i23 > i21) {
                i20 = i19;
                i21 = i23;
            }
            i19--;
        }
        return i20 << 3;
    }

    private void initArrays(int i8) {
        if (this.luminances.length < i8) {
            this.luminances = new byte[i8];
        }
        for (int i9 = 0; i9 < 32; i9++) {
            this.buckets[i9] = 0;
        }
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        initArrays(width);
        int[] iArr = this.buckets;
        for (int i8 = 1; i8 < 5; i8++) {
            byte[] row = luminanceSource.getRow((height * i8) / 5, this.luminances);
            int i9 = (width << 2) / 5;
            for (int i10 = width / 5; i10 < i9; i10++) {
                int i11 = (row[i10] & 255) >> 3;
                iArr[i11] = iArr[i11] + 1;
            }
        }
        int estimateBlackPoint = estimateBlackPoint(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = i12 * width;
            for (int i14 = 0; i14 < width; i14++) {
                if ((matrix[i13 + i14] & 255) < estimateBlackPoint) {
                    bitMatrix.set(i14, i12);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i8, BitArray bitArray) {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray == null || bitArray.getSize() < width) {
            bitArray = new BitArray(width);
        } else {
            bitArray.clear();
        }
        initArrays(width);
        byte[] row = luminanceSource.getRow(i8, this.luminances);
        int[] iArr = this.buckets;
        for (int i9 = 0; i9 < width; i9++) {
            int i10 = (row[i9] & 255) >> 3;
            iArr[i10] = iArr[i10] + 1;
        }
        int estimateBlackPoint = estimateBlackPoint(iArr);
        if (width < 3) {
            for (int i11 = 0; i11 < width; i11++) {
                if ((row[i11] & 255) < estimateBlackPoint) {
                    bitArray.set(i11);
                }
            }
        } else {
            int i12 = 1;
            int i13 = row[0] & 255;
            int i14 = row[1] & 255;
            while (i12 < width - 1) {
                int i15 = i12 + 1;
                int i16 = row[i15] & 255;
                if ((((i14 << 2) - i13) - i16) / 2 < estimateBlackPoint) {
                    bitArray.set(i12);
                }
                i13 = i14;
                i12 = i15;
                i14 = i16;
            }
        }
        return bitArray;
    }
}
