package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* loaded from: classes4.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private PDF417ScanningDecoder() {
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) {
        int[] rowHeights;
        if (detectionResultRowIndicatorColumn == null || (rowHeights = detectionResultRowIndicatorColumn.getRowHeights()) == null) {
            return null;
        }
        int max = getMax(rowHeights);
        int i8 = 0;
        int i9 = 0;
        for (int i10 : rowHeights) {
            i9 += max - i10;
            if (i10 > 0) {
                break;
            }
        }
        Codeword[] codewords = detectionResultRowIndicatorColumn.getCodewords();
        for (int i11 = 0; i9 > 0 && codewords[i11] == null; i11++) {
            i9--;
        }
        for (int length = rowHeights.length - 1; length >= 0; length--) {
            int i12 = rowHeights[length];
            i8 += max - i12;
            if (i12 > 0) {
                break;
            }
        }
        for (int length2 = codewords.length - 1; i8 > 0 && codewords[length2] == null; length2--) {
            i8--;
        }
        return detectionResultRowIndicatorColumn.getBoundingBox().addMissingRows(i9, i8, detectionResultRowIndicatorColumn.isLeft());
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeValueArr) {
        BarcodeValue barcodeValue = barcodeValueArr[0][1];
        int[] value = barcodeValue.getValue();
        int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * detectionResult.getBarcodeRowCount()) - getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        if (value.length != 0) {
            if (value[0] != barcodeColumnCount) {
                barcodeValue.setValue(barcodeColumnCount);
            }
        } else {
            if (barcodeColumnCount <= 0 || barcodeColumnCount > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            barcodeValue.setValue(barcodeColumnCount);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int adjustCodewordStartColumn(BitMatrix bitMatrix, int i8, int i9, boolean z7, int i10, int i11) {
        int i12 = z7 ? -1 : 1;
        int i13 = i10;
        for (int i14 = 0; i14 < 2; i14++) {
            while (true) {
                if (!z7) {
                    if (i13 >= i9) {
                        break;
                    }
                    if (z7 != bitMatrix.get(i13, i11)) {
                        break;
                    }
                } else {
                    if (i13 < i8) {
                        break;
                    }
                    if (z7 != bitMatrix.get(i13, i11)) {
                        if (Math.abs(i10 - i13) > 2) {
                            return i10;
                        }
                        i13 += i12;
                    }
                }
            }
            i12 = -i12;
            z7 = !z7;
        }
        return i13;
    }

    private static boolean checkCodewordSkew(int i8, int i9, int i10) {
        return i9 + (-2) <= i8 && i8 <= i10 + 2;
    }

    private static int correctErrors(int[] iArr, int[] iArr2, int i8) {
        if ((iArr2 == null || iArr2.length <= (i8 / 2) + 3) && i8 >= 0 && i8 <= 512) {
            return errorCorrection.decode(iArr, i8, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResult) {
        int rowNumber;
        BarcodeValue[][] barcodeValueArr = (BarcodeValue[][]) Array.newInstance((Class<?>) BarcodeValue.class, detectionResult.getBarcodeRowCount(), detectionResult.getBarcodeColumnCount() + 2);
        for (BarcodeValue[] barcodeValueArr2 : barcodeValueArr) {
            int i8 = 0;
            while (true) {
                if (i8 < barcodeValueArr2.length) {
                    barcodeValueArr2[i8] = new BarcodeValue();
                    i8++;
                }
            }
        }
        int i9 = 0;
        for (DetectionResultColumn detectionResultColumn : detectionResult.getDetectionResultColumns()) {
            if (detectionResultColumn != null) {
                for (Codeword codeword : detectionResultColumn.getCodewords()) {
                    if (codeword != null && (rowNumber = codeword.getRowNumber()) >= 0 && rowNumber < barcodeValueArr.length) {
                        barcodeValueArr[rowNumber][i9].setValue(codeword.getValue());
                    }
                }
            }
            i9++;
        }
        return barcodeValueArr;
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) {
        BarcodeValue[][] createBarcodeMatrix = createBarcodeMatrix(detectionResult);
        adjustCodewordCount(detectionResult, createBarcodeMatrix);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[detectionResult.getBarcodeRowCount() * detectionResult.getBarcodeColumnCount()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 0; i8 < detectionResult.getBarcodeRowCount(); i8++) {
            int i9 = 0;
            while (i9 < detectionResult.getBarcodeColumnCount()) {
                int i10 = i9 + 1;
                int[] value = createBarcodeMatrix[i8][i10].getValue();
                int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * i8) + i9;
                if (value.length == 0) {
                    arrayList.add(Integer.valueOf(barcodeColumnCount));
                } else if (value.length == 1) {
                    iArr[barcodeColumnCount] = value[0];
                } else {
                    arrayList3.add(Integer.valueOf(barcodeColumnCount));
                    arrayList2.add(value);
                }
                i9 = i10;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = (int[]) arrayList2.get(i11);
        }
        return createDecoderResultFromAmbiguousValues(detectionResult.getBarcodeECLevel(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int i8, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i9 = 100;
        while (true) {
            int i10 = i9 - 1;
            if (i9 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i11 = 0; i11 < length; i11++) {
                iArr[iArr3[i11]] = iArr4[i11][iArr5[i11]];
            }
            try {
                return decodeCodewords(iArr, i8, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    int i13 = iArr5[i12];
                    if (i13 < iArr4[i12].length - 1) {
                        iArr5[i12] = i13 + 1;
                        break;
                    }
                    iArr5[i12] = 0;
                    if (i12 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    i12++;
                }
                i9 = i10;
            }
        }
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = null;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2 = null;
        DetectionResult detectionResult = null;
        BoundingBox boundingBox = new BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        for (int i13 = 0; i13 < 2; i13++) {
            if (resultPoint != null) {
                detectionResultRowIndicatorColumn = getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint, true, i8, i9);
            }
            if (resultPoint3 != null) {
                detectionResultRowIndicatorColumn2 = getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint3, false, i8, i9);
            }
            detectionResult = merge(detectionResultRowIndicatorColumn, detectionResultRowIndicatorColumn2);
            if (detectionResult == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i13 != 0 || detectionResult.getBoundingBox() == null || (detectionResult.getBoundingBox().getMinY() >= boundingBox.getMinY() && detectionResult.getBoundingBox().getMaxY() <= boundingBox.getMaxY())) {
                detectionResult.setBoundingBox(boundingBox);
                break;
            }
            boundingBox = detectionResult.getBoundingBox();
        }
        int barcodeColumnCount = detectionResult.getBarcodeColumnCount() + 1;
        detectionResult.setDetectionResultColumn(0, detectionResultRowIndicatorColumn);
        detectionResult.setDetectionResultColumn(barcodeColumnCount, detectionResultRowIndicatorColumn2);
        boolean z7 = detectionResultRowIndicatorColumn != null;
        int i14 = i8;
        int i15 = i9;
        for (int i16 = 1; i16 <= barcodeColumnCount; i16++) {
            int i17 = z7 ? i16 : barcodeColumnCount - i16;
            if (detectionResult.getDetectionResultColumn(i17) == null) {
                DetectionResultColumn detectionResultRowIndicatorColumn3 = (i17 == 0 || i17 == barcodeColumnCount) ? new DetectionResultRowIndicatorColumn(boundingBox, i17 == 0) : new DetectionResultColumn(boundingBox);
                detectionResult.setDetectionResultColumn(i17, detectionResultRowIndicatorColumn3);
                int i18 = -1;
                int minY = boundingBox.getMinY();
                int i19 = -1;
                while (minY <= boundingBox.getMaxY()) {
                    int startColumn = getStartColumn(detectionResult, i17, minY, z7);
                    if (startColumn >= 0 && startColumn <= boundingBox.getMaxX()) {
                        i12 = startColumn;
                    } else if (i19 != i18) {
                        i12 = i19;
                    } else {
                        i10 = i19;
                        i11 = minY;
                        i19 = i10;
                        minY = i11 + 1;
                        i18 = -1;
                    }
                    i10 = i19;
                    int i20 = minY;
                    Codeword detectCodeword = detectCodeword(bitMatrix, boundingBox.getMinX(), boundingBox.getMaxX(), z7, i12, i20, i14, i15);
                    i11 = i20;
                    if (detectCodeword != null) {
                        detectionResultRowIndicatorColumn3.setCodeword(i11, detectCodeword);
                        i14 = Math.min(i14, detectCodeword.getWidth());
                        i15 = Math.max(i15, detectCodeword.getWidth());
                        i19 = i12;
                        minY = i11 + 1;
                        i18 = -1;
                    }
                    i19 = i10;
                    minY = i11 + 1;
                    i18 = -1;
                }
            }
        }
        return createDecoderResult(detectionResult);
    }

    private static DecoderResult decodeCodewords(int[] iArr, int i8, int[] iArr2) {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i9 = 1 << (i8 + 1);
        int correctErrors = correctErrors(iArr, iArr2, i9);
        verifyCodewordCount(iArr, i9);
        DecoderResult decode = DecodedBitStreamParser.decode(iArr, String.valueOf(i8));
        decode.setErrorsCorrected(Integer.valueOf(correctErrors));
        decode.setErasures(Integer.valueOf(iArr2.length));
        return decode;
    }

    private static Codeword detectCodeword(BitMatrix bitMatrix, int i8, int i9, boolean z7, int i10, int i11, int i12, int i13) {
        int i14;
        int decodedValue;
        int codeword;
        int adjustCodewordStartColumn = adjustCodewordStartColumn(bitMatrix, i8, i9, z7, i10, i11);
        int[] moduleBitCount = getModuleBitCount(bitMatrix, i8, i9, z7, adjustCodewordStartColumn, i11);
        if (moduleBitCount == null) {
            return null;
        }
        int sum = MathUtils.sum(moduleBitCount);
        if (z7) {
            i14 = adjustCodewordStartColumn + sum;
        } else {
            for (int i15 = 0; i15 < moduleBitCount.length / 2; i15++) {
                int i16 = moduleBitCount[i15];
                moduleBitCount[i15] = moduleBitCount[(moduleBitCount.length - 1) - i15];
                moduleBitCount[(moduleBitCount.length - 1) - i15] = i16;
            }
            adjustCodewordStartColumn -= sum;
            i14 = adjustCodewordStartColumn;
        }
        if (checkCodewordSkew(sum, i12, i13) && (codeword = PDF417Common.getCodeword((decodedValue = PDF417CodewordDecoder.getDecodedValue(moduleBitCount)))) != -1) {
            return new Codeword(adjustCodewordStartColumn, i14, getCodewordBucketNumber(decodedValue), codeword);
        }
        return null;
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
        BarcodeMetadata barcodeMetadata;
        BarcodeMetadata barcodeMetadata2;
        if (detectionResultRowIndicatorColumn == null || (barcodeMetadata = detectionResultRowIndicatorColumn.getBarcodeMetadata()) == null) {
            if (detectionResultRowIndicatorColumn2 == null) {
                return null;
            }
            return detectionResultRowIndicatorColumn2.getBarcodeMetadata();
        }
        if (detectionResultRowIndicatorColumn2 == null || (barcodeMetadata2 = detectionResultRowIndicatorColumn2.getBarcodeMetadata()) == null || barcodeMetadata.getColumnCount() == barcodeMetadata2.getColumnCount() || barcodeMetadata.getErrorCorrectionLevel() == barcodeMetadata2.getErrorCorrectionLevel() || barcodeMetadata.getRowCount() == barcodeMetadata2.getRowCount()) {
            return barcodeMetadata;
        }
        return null;
    }

    private static int[] getBitCountForCodeword(int i8) {
        int[] iArr = new int[8];
        int i9 = 0;
        int i10 = 7;
        while (true) {
            int i11 = i8 & 1;
            if (i11 != i9) {
                i10--;
                if (i10 < 0) {
                    return iArr;
                }
                i9 = i11;
            }
            iArr[i10] = iArr[i10] + 1;
            i8 >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int i8) {
        return getCodewordBucketNumber(getBitCountForCodeword(i8));
    }

    private static int getMax(int[] iArr) {
        int i8 = -1;
        for (int i9 : iArr) {
            i8 = Math.max(i8, i9);
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] getModuleBitCount(BitMatrix bitMatrix, int i8, int i9, boolean z7, int i10, int i11) {
        int[] iArr = new int[8];
        int i12 = z7 ? 1 : -1;
        int i13 = 0;
        boolean z8 = z7;
        while (true) {
            if (z7) {
                if (i10 >= i9) {
                    break;
                }
                if (i13 < 8) {
                    break;
                }
                if (bitMatrix.get(i10, i11) == z8) {
                    iArr[i13] = iArr[i13] + 1;
                    i10 += i12;
                } else {
                    i13++;
                    z8 = !z8;
                }
            } else {
                if (i10 < i8) {
                    break;
                }
                if (i13 < 8) {
                }
            }
        }
        if (i13 != 8) {
            if (z7) {
                i8 = i9;
            }
            if (i10 != i8 || i13 != 7) {
                return null;
            }
        }
        return iArr;
    }

    private static int getNumberOfECCodeWords(int i8) {
        return 2 << i8;
    }

    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean z7, int i8, int i9) {
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, z7);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = i10 == 0 ? 1 : -1;
            int x7 = (int) resultPoint.getX();
            for (int y7 = (int) resultPoint.getY(); y7 <= boundingBox.getMaxY() && y7 >= boundingBox.getMinY(); y7 += i11) {
                Codeword detectCodeword = detectCodeword(bitMatrix, 0, bitMatrix.getWidth(), z7, x7, y7, i8, i9);
                if (detectCodeword != null) {
                    detectionResultRowIndicatorColumn.setCodeword(y7, detectCodeword);
                    x7 = z7 ? detectCodeword.getStartX() : detectCodeword.getEndX();
                }
            }
            i10++;
        }
        return detectionResultRowIndicatorColumn;
    }

    private static int getStartColumn(DetectionResult detectionResult, int i8, int i9, boolean z7) {
        int i10 = z7 ? 1 : -1;
        int i11 = i8 - i10;
        Codeword codeword = isValidBarcodeColumn(detectionResult, i11) ? detectionResult.getDetectionResultColumn(i11).getCodeword(i9) : null;
        if (codeword != null) {
            return z7 ? codeword.getEndX() : codeword.getStartX();
        }
        Codeword codewordNearby = detectionResult.getDetectionResultColumn(i8).getCodewordNearby(i9);
        if (codewordNearby != null) {
            return z7 ? codewordNearby.getStartX() : codewordNearby.getEndX();
        }
        if (isValidBarcodeColumn(detectionResult, i11)) {
            codewordNearby = detectionResult.getDetectionResultColumn(i11).getCodewordNearby(i9);
        }
        if (codewordNearby != null) {
            return z7 ? codewordNearby.getEndX() : codewordNearby.getStartX();
        }
        int i12 = 0;
        while (true) {
            i8 -= i10;
            if (!isValidBarcodeColumn(detectionResult, i8)) {
                BoundingBox boundingBox = detectionResult.getBoundingBox();
                return z7 ? boundingBox.getMinX() : boundingBox.getMaxX();
            }
            for (Codeword codeword2 : detectionResult.getDetectionResultColumn(i8).getCodewords()) {
                if (codeword2 != null) {
                    return (z7 ? codeword2.getEndX() : codeword2.getStartX()) + (i10 * i12 * (codeword2.getEndX() - codeword2.getStartX()));
                }
            }
            i12++;
        }
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int i8) {
        return i8 >= 0 && i8 <= detectionResult.getBarcodeColumnCount() + 1;
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
        BarcodeMetadata barcodeMetadata;
        if ((detectionResultRowIndicatorColumn == null && detectionResultRowIndicatorColumn2 == null) || (barcodeMetadata = getBarcodeMetadata(detectionResultRowIndicatorColumn, detectionResultRowIndicatorColumn2)) == null) {
            return null;
        }
        return new DetectionResult(barcodeMetadata, BoundingBox.merge(adjustBoundingBox(detectionResultRowIndicatorColumn), adjustBoundingBox(detectionResultRowIndicatorColumn2)));
    }

    public static String toString(BarcodeValue[][] barcodeValueArr) {
        Formatter formatter = new Formatter();
        for (int i8 = 0; i8 < barcodeValueArr.length; i8++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i8));
                int i9 = 0;
                while (true) {
                    BarcodeValue[] barcodeValueArr2 = barcodeValueArr[i8];
                    if (i9 < barcodeValueArr2.length) {
                        BarcodeValue barcodeValue = barcodeValueArr2[i9];
                        if (barcodeValue.getValue().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(barcodeValue.getValue()[0]), barcodeValue.getConfidence(barcodeValue.getValue()[0]));
                        }
                        i9++;
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

    private static void verifyCodewordCount(int[] iArr, int i8) {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i9 = iArr[0];
        if (i9 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i9 == 0) {
            if (i8 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i8;
        }
    }

    private static int getCodewordBucketNumber(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }
}
