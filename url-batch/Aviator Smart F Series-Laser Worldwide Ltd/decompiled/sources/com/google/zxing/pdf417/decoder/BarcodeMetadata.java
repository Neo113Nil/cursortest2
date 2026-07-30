package com.google.zxing.pdf417.decoder;

/* loaded from: classes4.dex */
final class BarcodeMetadata {
    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    BarcodeMetadata(int i8, int i9, int i10, int i11) {
        this.columnCount = i8;
        this.errorCorrectionLevel = i11;
        this.rowCountUpperPart = i9;
        this.rowCountLowerPart = i10;
        this.rowCount = i9 + i10;
    }

    int getColumnCount() {
        return this.columnCount;
    }

    int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    int getRowCount() {
        return this.rowCount;
    }

    int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }

    int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }
}
