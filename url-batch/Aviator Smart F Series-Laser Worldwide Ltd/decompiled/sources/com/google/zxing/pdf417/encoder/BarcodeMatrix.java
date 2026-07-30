package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    BarcodeMatrix(int i8, int i9) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i8];
        this.matrix = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.matrix[i10] = new BarcodeRow(((i9 + 4) * 17) + 1);
        }
        this.width = i9 * 17;
        this.height = i8;
        this.currentRow = -1;
    }

    BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i8, int i9) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.height * i9, this.width * i8);
        int i10 = this.height * i9;
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[(i10 - i11) - 1] = this.matrix[i11 / i9].getScaledRow(i8);
        }
        return bArr;
    }

    void set(int i8, int i9, byte b8) {
        this.matrix[i9].set(i8, b8);
    }

    void startRow() {
        this.currentRow++;
    }
}
