package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.Formatter;

/* loaded from: classes4.dex */
final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
        this.barcodeMetadata = barcodeMetadata;
        int columnCount = barcodeMetadata.getColumnCount();
        this.barcodeColumnCount = columnCount;
        this.boundingBox = boundingBox;
        this.detectionResultColumns = new DetectionResultColumn[columnCount + 2];
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            ((DetectionResultRowIndicatorColumn) detectionResultColumn).adjustCompleteIndicatorColumnRowNumbers(this.barcodeMetadata);
        }
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
        if (codeword2 == null || !codeword2.hasValidRowNumber() || codeword2.getBucket() != codeword.getBucket()) {
            return false;
        }
        codeword.setRowNumber(codeword2.getRowNumber());
        return true;
    }

    private static int adjustRowNumberIfValid(int i8, int i9, Codeword codeword) {
        if (codeword == null) {
            return i9;
        }
        if (codeword.hasValidRowNumber()) {
            return i9;
        }
        if (!codeword.isValidRowNumber(i8)) {
            return i9 + 1;
        }
        codeword.setRowNumber(i8);
        return 0;
    }

    private int adjustRowNumbers() {
        int adjustRowNumbersByRow = adjustRowNumbersByRow();
        if (adjustRowNumbersByRow == 0) {
            return 0;
        }
        for (int i8 = 1; i8 < this.barcodeColumnCount + 1; i8++) {
            Codeword[] codewords = this.detectionResultColumns[i8].getCodewords();
            for (int i9 = 0; i9 < codewords.length; i9++) {
                Codeword codeword = codewords[i9];
                if (codeword != null && !codeword.hasValidRowNumber()) {
                    adjustRowNumbers(i8, i9, codewords);
                }
            }
        }
        return adjustRowNumbersByRow;
    }

    private int adjustRowNumbersByRow() {
        adjustRowNumbersFromBothRI();
        return adjustRowNumbersFromLRI() + adjustRowNumbersFromRRI();
    }

    private void adjustRowNumbersFromBothRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null || detectionResultColumnArr[this.barcodeColumnCount + 1] == null) {
            return;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        Codeword[] codewords2 = this.detectionResultColumns[this.barcodeColumnCount + 1].getCodewords();
        for (int i8 = 0; i8 < codewords.length; i8++) {
            Codeword codeword = codewords[i8];
            if (codeword != null && codewords2[i8] != null && codeword.getRowNumber() == codewords2[i8].getRowNumber()) {
                for (int i9 = 1; i9 <= this.barcodeColumnCount; i9++) {
                    Codeword codeword2 = this.detectionResultColumns[i9].getCodewords()[i8];
                    if (codeword2 != null) {
                        codeword2.setRowNumber(codewords[i8].getRowNumber());
                        if (!codeword2.hasValidRowNumber()) {
                            this.detectionResultColumns[i9].getCodewords()[i8] = null;
                        }
                    }
                }
            }
        }
    }

    private int adjustRowNumbersFromLRI() {
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[0];
        if (detectionResultColumn == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        int i8 = 0;
        for (int i9 = 0; i9 < codewords.length; i9++) {
            Codeword codeword = codewords[i9];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int i10 = 0;
                for (int i11 = 1; i11 < this.barcodeColumnCount + 1 && i10 < 2; i11++) {
                    Codeword codeword2 = this.detectionResultColumns[i11].getCodewords()[i9];
                    if (codeword2 != null) {
                        i10 = adjustRowNumberIfValid(rowNumber, i10, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i8++;
                        }
                    }
                }
            }
        }
        return i8;
    }

    private int adjustRowNumbersFromRRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        int i8 = this.barcodeColumnCount;
        if (detectionResultColumnArr[i8 + 1] == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumnArr[i8 + 1].getCodewords();
        int i9 = 0;
        for (int i10 = 0; i10 < codewords.length; i10++) {
            Codeword codeword = codewords[i10];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int i11 = 0;
                for (int i12 = this.barcodeColumnCount + 1; i12 > 0 && i11 < 2; i12--) {
                    Codeword codeword2 = this.detectionResultColumns[i12].getCodewords()[i10];
                    if (codeword2 != null) {
                        i11 = adjustRowNumberIfValid(rowNumber, i11, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i9++;
                        }
                    }
                }
            }
        }
        return i9;
    }

    int getBarcodeColumnCount() {
        return this.barcodeColumnCount;
    }

    int getBarcodeECLevel() {
        return this.barcodeMetadata.getErrorCorrectionLevel();
    }

    int getBarcodeRowCount() {
        return this.barcodeMetadata.getRowCount();
    }

    BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    DetectionResultColumn getDetectionResultColumn(int i8) {
        return this.detectionResultColumns[i8];
    }

    DetectionResultColumn[] getDetectionResultColumns() {
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[0]);
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[this.barcodeColumnCount + 1]);
        int i8 = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int adjustRowNumbers = adjustRowNumbers();
            if (adjustRowNumbers <= 0 || adjustRowNumbers >= i8) {
                break;
            }
            i8 = adjustRowNumbers;
        }
        return this.detectionResultColumns;
    }

    void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    void setDetectionResultColumn(int i8, DetectionResultColumn detectionResultColumn) {
        this.detectionResultColumns[i8] = detectionResultColumn;
    }

    public String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.barcodeColumnCount + 1];
        }
        Formatter formatter = new Formatter();
        for (int i8 = 0; i8 < detectionResultColumn.getCodewords().length; i8++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i8));
                for (int i9 = 0; i9 < this.barcodeColumnCount + 2; i9++) {
                    DetectionResultColumn detectionResultColumn2 = this.detectionResultColumns[i9];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.getCodewords()[i8];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    private void adjustRowNumbers(int i8, int i9, Codeword[] codewordArr) {
        Codeword codeword = codewordArr[i9];
        Codeword[] codewords = this.detectionResultColumns[i8 - 1].getCodewords();
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[i8 + 1];
        Codeword[] codewords2 = detectionResultColumn != null ? detectionResultColumn.getCodewords() : codewords;
        Codeword[] codewordArr2 = new Codeword[14];
        codewordArr2[2] = codewords[i9];
        codewordArr2[3] = codewords2[i9];
        if (i9 > 0) {
            int i10 = i9 - 1;
            codewordArr2[0] = codewordArr[i10];
            codewordArr2[4] = codewords[i10];
            codewordArr2[5] = codewords2[i10];
        }
        if (i9 > 1) {
            int i11 = i9 - 2;
            codewordArr2[8] = codewordArr[i11];
            codewordArr2[10] = codewords[i11];
            codewordArr2[11] = codewords2[i11];
        }
        if (i9 < codewordArr.length - 1) {
            int i12 = i9 + 1;
            codewordArr2[1] = codewordArr[i12];
            codewordArr2[6] = codewords[i12];
            codewordArr2[7] = codewords2[i12];
        }
        if (i9 < codewordArr.length - 2) {
            int i13 = i9 + 2;
            codewordArr2[9] = codewordArr[i13];
            codewordArr2[12] = codewords[i13];
            codewordArr2[13] = codewords2[i13];
        }
        for (int i14 = 0; i14 < 14 && !adjustRowNumber(codeword, codewordArr2[i14]); i14++) {
        }
    }
}
