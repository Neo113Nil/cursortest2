package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private Detector() {
    }

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            resultPointArr[iArr[i8]] = resultPointArr2[i8];
        }
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z7) {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> detect = detect(z7, blackMatrix);
        if (detect.isEmpty()) {
            blackMatrix = blackMatrix.m164clone();
            blackMatrix.rotate180();
            detect = detect(z7, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, detect);
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i8, int i9, int i10, boolean z7, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i11 = 0;
        while (bitMatrix.get(i8, i9) && i8 > 0) {
            int i12 = i11 + 1;
            if (i11 >= 3) {
                break;
            }
            i8--;
            i11 = i12;
        }
        int length = iArr.length;
        boolean z8 = z7;
        int i13 = 0;
        int i14 = i8;
        while (i8 < i10) {
            if (bitMatrix.get(i8, i9) != z8) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) < MAX_AVG_VARIANCE) {
                        return new int[]{i14, i8};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i15 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i15);
                    iArr2[i15] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z8 = !z8;
            }
            i8++;
        }
        if (i13 != length - 1 || patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) >= MAX_AVG_VARIANCE) {
            return null;
        }
        return new int[]{i14, i8 - 1};
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i8, int i9, int i10, int i11, int[] iArr) {
        boolean z7;
        int i12;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i13 = i10;
        while (true) {
            if (i13 >= i8) {
                z7 = false;
                break;
            }
            int[] findGuardPattern = findGuardPattern(bitMatrix, i11, i13, i9, false, iArr, iArr2);
            if (findGuardPattern != null) {
                int i14 = i13;
                int[] iArr3 = findGuardPattern;
                while (i14 > 0) {
                    int i15 = i14 - 1;
                    int[] findGuardPattern2 = findGuardPattern(bitMatrix, i11, i15, i9, false, iArr, iArr2);
                    if (findGuardPattern2 == null) {
                        break;
                    }
                    iArr3 = findGuardPattern2;
                    i14 = i15;
                }
                float f8 = i14;
                resultPointArr[0] = new ResultPoint(iArr3[0], f8);
                resultPointArr[1] = new ResultPoint(iArr3[1], f8);
                i13 = i14;
                z7 = true;
            } else {
                i13 += 5;
            }
        }
        int i16 = i13 + 1;
        if (z7) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i17 = i16;
            int i18 = 0;
            while (true) {
                if (i17 >= i8) {
                    i12 = i18;
                    break;
                }
                int i19 = i18;
                int[] findGuardPattern3 = findGuardPattern(bitMatrix, iArr4[0], i17, i9, false, iArr, iArr2);
                if (findGuardPattern3 == null || Math.abs(iArr4[0] - findGuardPattern3[0]) >= 5 || Math.abs(iArr4[1] - findGuardPattern3[1]) >= 5) {
                    i12 = i19;
                    if (i12 > 25) {
                        break;
                    }
                    i18 = i12 + 1;
                } else {
                    iArr4 = findGuardPattern3;
                    i18 = 0;
                }
                i17++;
            }
            i16 = i17 - (i12 + 1);
            float f9 = i16;
            resultPointArr[2] = new ResultPoint(iArr4[0], f9);
            resultPointArr[3] = new ResultPoint(iArr4[1], f9);
        }
        if (i16 - i13 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i8, int i9) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i8, i9, START_PATTERN), INDEXES_START_PATTERN);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            i9 = (int) resultPoint.getX();
            i8 = (int) resultPointArr[4].getY();
        }
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i8, i9, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2, float f8) {
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            i8 += iArr[i10];
            i9 += iArr2[i10];
        }
        if (i8 < i9) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = i8;
        float f10 = f9 / i9;
        float f11 = f8 * f10;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            float f13 = iArr2[i11] * f10;
            float f14 = iArr[i11];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (com.google.zxing.ResultPoint[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<ResultPoint[]> detect(boolean z7, BitMatrix bitMatrix) {
        int x7;
        float y7;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        loop0: while (true) {
            int i9 = 0;
            boolean z8 = false;
            while (true) {
                if (i8 >= bitMatrix.getHeight()) {
                    break loop0;
                }
                ResultPoint[] findVertices = findVertices(bitMatrix, i8, i9);
                if (findVertices[0] != null || findVertices[3] != null) {
                    arrayList.add(findVertices);
                    if (!z7) {
                        break loop0;
                    }
                    ResultPoint resultPoint = findVertices[2];
                    if (resultPoint != null) {
                        x7 = (int) resultPoint.getX();
                        y7 = findVertices[2].getY();
                    } else {
                        x7 = (int) findVertices[4].getX();
                        y7 = findVertices[4].getY();
                    }
                    i8 = (int) y7;
                    i9 = x7;
                    z8 = true;
                } else {
                    break;
                }
            }
            i8 += 5;
        }
        return arrayList;
    }
}
