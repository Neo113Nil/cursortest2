package com.google.zxing.pdf417.decoder;

import b5.b;

/* loaded from: classes4.dex */
final class Codeword {
    private static final int BARCODE_ROW_UNKNOWN = -1;
    private final int bucket;
    private final int endX;
    private int rowNumber = -1;
    private final int startX;
    private final int value;

    Codeword(int i8, int i9, int i10, int i11) {
        this.startX = i8;
        this.endX = i9;
        this.bucket = i10;
        this.value = i11;
    }

    int getBucket() {
        return this.bucket;
    }

    int getEndX() {
        return this.endX;
    }

    int getRowNumber() {
        return this.rowNumber;
    }

    int getStartX() {
        return this.startX;
    }

    int getValue() {
        return this.value;
    }

    int getWidth() {
        return this.endX - this.startX;
    }

    boolean hasValidRowNumber() {
        return isValidRowNumber(this.rowNumber);
    }

    boolean isValidRowNumber(int i8) {
        return i8 != -1 && this.bucket == (i8 % 3) * 3;
    }

    void setRowNumber(int i8) {
        this.rowNumber = i8;
    }

    void setRowNumberAsRowIndicatorColumn() {
        this.rowNumber = ((this.value / 30) * 3) + (this.bucket / 3);
    }

    public String toString() {
        return this.rowNumber + b.VERTICAL + this.value;
    }
}
