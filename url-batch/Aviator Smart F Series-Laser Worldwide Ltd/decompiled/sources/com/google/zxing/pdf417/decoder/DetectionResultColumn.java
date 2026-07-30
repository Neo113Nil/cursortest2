package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* loaded from: classes4.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    DetectionResultColumn(BoundingBox boundingBox) {
        this.boundingBox = new BoundingBox(boundingBox);
        this.codewords = new Codeword[(boundingBox.getMaxY() - boundingBox.getMinY()) + 1];
    }

    final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    final Codeword getCodeword(int i8) {
        return this.codewords[imageRowToCodewordIndex(i8)];
    }

    final Codeword getCodewordNearby(int i8) {
        Codeword codeword;
        Codeword codeword2;
        Codeword codeword3 = getCodeword(i8);
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i9 = 1; i9 < 5; i9++) {
            int imageRowToCodewordIndex = imageRowToCodewordIndex(i8) - i9;
            if (imageRowToCodewordIndex >= 0 && (codeword2 = this.codewords[imageRowToCodewordIndex]) != null) {
                return codeword2;
            }
            int imageRowToCodewordIndex2 = imageRowToCodewordIndex(i8) + i9;
            Codeword[] codewordArr = this.codewords;
            if (imageRowToCodewordIndex2 < codewordArr.length && (codeword = codewordArr[imageRowToCodewordIndex2]) != null) {
                return codeword;
            }
        }
        return null;
    }

    final Codeword[] getCodewords() {
        return this.codewords;
    }

    final int imageRowToCodewordIndex(int i8) {
        return i8 - this.boundingBox.getMinY();
    }

    final void setCodeword(int i8, Codeword codeword) {
        this.codewords[imageRowToCodewordIndex(i8)] = codeword;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i8 = 0;
            for (Codeword codeword : this.codewords) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i8));
                    i8++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i8), Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                    i8++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
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
}
