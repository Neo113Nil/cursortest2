package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class AlignmentPatternFinder {
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;
    private final List<AlignmentPattern> possibleCenters = new ArrayList(5);
    private final int[] crossCheckStateCount = new int[3];

    AlignmentPatternFinder(BitMatrix bitMatrix, int i8, int i9, int i10, int i11, float f8, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.startX = i8;
        this.startY = i9;
        this.width = i10;
        this.height = i11;
        this.moduleSize = f8;
        this.resultPointCallback = resultPointCallback;
    }

    private static float centerFromEnd(int[] iArr, int i8) {
        return (i8 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float crossCheckVertical(int i8, int i9, int i10, int i11) {
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] iArr = this.crossCheckStateCount;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i12 = i8;
        while (i12 >= 0 && bitMatrix.get(i9, i12)) {
            int i13 = iArr[1];
            if (i13 > i10) {
                break;
            }
            iArr[1] = i13 + 1;
            i12--;
        }
        if (i12 >= 0 && iArr[1] <= i10) {
            while (i12 >= 0 && !bitMatrix.get(i9, i12)) {
                int i14 = iArr[0];
                if (i14 > i10) {
                    break;
                }
                iArr[0] = i14 + 1;
                i12--;
            }
            if (iArr[0] > i10) {
                return Float.NaN;
            }
            int i15 = i8 + 1;
            while (i15 < height && bitMatrix.get(i9, i15)) {
                int i16 = iArr[1];
                if (i16 > i10) {
                    break;
                }
                iArr[1] = i16 + 1;
                i15++;
            }
            if (i15 != height && iArr[1] <= i10) {
                while (i15 < height && !bitMatrix.get(i9, i15)) {
                    int i17 = iArr[2];
                    if (i17 > i10) {
                        break;
                    }
                    iArr[2] = i17 + 1;
                    i15++;
                }
                int i18 = iArr[2];
                if (i18 <= i10 && Math.abs(((iArr[0] + iArr[1]) + i18) - i11) * 5 < i11 * 2 && foundPatternCross(iArr)) {
                    return centerFromEnd(iArr, i15);
                }
            }
        }
        return Float.NaN;
    }

    private boolean foundPatternCross(int[] iArr) {
        float f8 = this.moduleSize;
        float f9 = f8 / 2.0f;
        for (int i8 = 0; i8 < 3; i8++) {
            if (Math.abs(f8 - iArr[i8]) >= f9) {
                return false;
            }
        }
        return true;
    }

    private AlignmentPattern handlePossibleCenter(int[] iArr, int i8, int i9) {
        int i10 = iArr[0] + iArr[1] + iArr[2];
        float centerFromEnd = centerFromEnd(iArr, i9);
        float crossCheckVertical = crossCheckVertical(i8, (int) centerFromEnd, iArr[1] * 2, i10);
        if (Float.isNaN(crossCheckVertical)) {
            return null;
        }
        float f8 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (AlignmentPattern alignmentPattern : this.possibleCenters) {
            if (alignmentPattern.aboutEquals(f8, crossCheckVertical, centerFromEnd)) {
                return alignmentPattern.combineEstimate(crossCheckVertical, centerFromEnd, f8);
            }
        }
        AlignmentPattern alignmentPattern2 = new AlignmentPattern(centerFromEnd, crossCheckVertical, f8);
        this.possibleCenters.add(alignmentPattern2);
        ResultPointCallback resultPointCallback = this.resultPointCallback;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
        return null;
    }

    AlignmentPattern find() {
        AlignmentPattern handlePossibleCenter;
        AlignmentPattern handlePossibleCenter2;
        int i8 = this.startX;
        int i9 = this.height;
        int i10 = this.width + i8;
        int i11 = this.startY + (i9 / 2);
        int[] iArr = new int[3];
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = ((i12 & 1) == 0 ? (i12 + 1) / 2 : -((i12 + 1) / 2)) + i11;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i14 = i8;
            while (i14 < i10 && !this.image.get(i14, i13)) {
                i14++;
            }
            int i15 = 0;
            while (i14 < i10) {
                if (!this.image.get(i14, i13)) {
                    if (i15 == 1) {
                        i15++;
                    }
                    iArr[i15] = iArr[i15] + 1;
                } else if (i15 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i15 != 2) {
                    i15++;
                    iArr[i15] = iArr[i15] + 1;
                } else {
                    if (foundPatternCross(iArr) && (handlePossibleCenter2 = handlePossibleCenter(iArr, i13, i14)) != null) {
                        return handlePossibleCenter2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i15 = 1;
                }
                i14++;
            }
            if (foundPatternCross(iArr) && (handlePossibleCenter = handlePossibleCenter(iArr, i13, i10)) != null) {
                return handlePossibleCenter;
            }
        }
        if (this.possibleCenters.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.possibleCenters.get(0);
    }
}
