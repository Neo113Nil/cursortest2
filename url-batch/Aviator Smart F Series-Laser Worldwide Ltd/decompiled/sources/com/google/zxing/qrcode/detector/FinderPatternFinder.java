package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    private static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private CenterComparator(float f8) {
            this.average = f8;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            int compare = Integer.compare(finderPattern2.getCount(), finderPattern.getCount());
            return compare == 0 ? Float.compare(Math.abs(finderPattern.getEstimatedModuleSize() - this.average), Math.abs(finderPattern2.getEstimatedModuleSize() - this.average)) : compare;
        }
    }

    private static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private FurthestFromAverageComparator(float f8) {
            this.average = f8;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(Math.abs(finderPattern2.getEstimatedModuleSize() - this.average), Math.abs(finderPattern.getEstimatedModuleSize() - this.average));
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    private static float centerFromEnd(int[] iArr, int i8) {
        return ((i8 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean crossCheckDiagonal(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i13 = 0;
        while (i8 >= i13 && i9 >= i13 && this.image.get(i9 - i13, i8 - i13)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i13++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i8 >= i13 && i9 >= i13 && !this.image.get(i9 - i13, i8 - i13)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i13++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i8 >= i13 && i9 >= i13 && this.image.get(i9 - i13, i8 - i13)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i13++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i14 = 1;
        while (true) {
            int i15 = i8 + i14;
            if (i15 >= height || (i12 = i9 + i14) >= width || !this.image.get(i12, i15)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i14++;
        }
        while (true) {
            int i16 = i8 + i14;
            if (i16 >= height || (i11 = i9 + i14) >= width || this.image.get(i11, i16)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i14++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i17 = i8 + i14;
            if (i17 >= height || (i10 = i9 + i14) >= width || !this.image.get(i10, i17)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i14++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.get(r11, r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b3, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        if (foundPatternCross(r2) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00be, code lost:
    
        return centerFromEnd(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float crossCheckHorizontal(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i14 = i8;
        while (i14 >= 0 && bitMatrix.get(i14, i9)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bitMatrix.get(i14, i9)) {
            int i15 = crossCheckStateCount[1];
            if (i15 > i10) {
                break;
            }
            crossCheckStateCount[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && crossCheckStateCount[1] <= i10) {
            while (i14 >= 0 && bitMatrix.get(i14, i9) && (i13 = crossCheckStateCount[0]) <= i10) {
                crossCheckStateCount[0] = i13 + 1;
                i14--;
            }
            if (crossCheckStateCount[0] > i10) {
                return Float.NaN;
            }
            int i16 = i8 + 1;
            while (i16 < width && bitMatrix.get(i16, i9)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i16++;
            }
            if (i16 == width) {
                return Float.NaN;
            }
            while (i16 < width && !bitMatrix.get(i16, i9) && (i12 = crossCheckStateCount[3]) < i10) {
                crossCheckStateCount[3] = i12 + 1;
                i16++;
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.get(r12, r11) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b5, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ba, code lost:
    
        if (foundPatternCross(r2) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        return centerFromEnd(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float crossCheckVertical(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i14 = i8;
        while (i14 >= 0 && bitMatrix.get(i9, i14)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bitMatrix.get(i9, i14)) {
            int i15 = crossCheckStateCount[1];
            if (i15 > i10) {
                break;
            }
            crossCheckStateCount[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && crossCheckStateCount[1] <= i10) {
            while (i14 >= 0 && bitMatrix.get(i9, i14) && (i13 = crossCheckStateCount[0]) <= i10) {
                crossCheckStateCount[0] = i13 + 1;
                i14--;
            }
            if (crossCheckStateCount[0] > i10) {
                return Float.NaN;
            }
            int i16 = i8 + 1;
            while (i16 < height && bitMatrix.get(i9, i16)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i16++;
            }
            if (i16 == height) {
                return Float.NaN;
            }
            while (i16 < height && !bitMatrix.get(i9, i16) && (i12 = crossCheckStateCount[3]) < i10) {
                crossCheckStateCount[3] = i12 + 1;
                i16++;
            }
        }
        return Float.NaN;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    protected static boolean foundPatternCross(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 5; i9++) {
            int i10 = iArr[i9];
            if (i10 == 0) {
                return false;
            }
            i8 += i10;
        }
        if (i8 < 7) {
            return false;
        }
        float f8 = i8 / 7.0f;
        float f9 = f8 / 2.0f;
        return Math.abs(f8 - ((float) iArr[0])) < f9 && Math.abs(f8 - ((float) iArr[1])) < f9 && Math.abs((f8 * 3.0f) - ((float) iArr[2])) < 3.0f * f9 && Math.abs(f8 - ((float) iArr[3])) < f9 && Math.abs(f8 - ((float) iArr[4])) < f9;
    }

    protected static boolean foundPatternDiagonal(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 5; i9++) {
            int i10 = iArr[i9];
            if (i10 == 0) {
                return false;
            }
            i8 += i10;
        }
        if (i8 < 7) {
            return false;
        }
        float f8 = i8 / 7.0f;
        float f9 = f8 / 1.333f;
        return Math.abs(f8 - ((float) iArr[0])) < f9 && Math.abs(f8 - ((float) iArr[1])) < f9 && Math.abs((f8 * 3.0f) - ((float) iArr[2])) < 3.0f * f9 && Math.abs(f8 - ((float) iArr[3])) < f9 && Math.abs(f8 - ((float) iArr[4])) < f9;
    }

    private int[] getCrossCheckStateCount() {
        clearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float f8 = 0.0f;
        int i8 = 0;
        float f9 = 0.0f;
        for (FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i8++;
                f9 += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i8 < 3) {
            return false;
        }
        float f10 = f9 / size;
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            f8 += Math.abs(it.next().getEstimatedModuleSize() - f10);
        }
        return f8 <= f9 * 0.05f;
    }

    private FinderPattern[] selectBestPatterns() {
        int size = this.possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float f8 = 0.0f;
        if (size > 3) {
            Iterator<FinderPattern> it = this.possibleCenters.iterator();
            float f9 = 0.0f;
            float f10 = 0.0f;
            while (it.hasNext()) {
                float estimatedModuleSize = it.next().getEstimatedModuleSize();
                f9 += estimatedModuleSize;
                f10 += estimatedModuleSize * estimatedModuleSize;
            }
            float f11 = f9 / size;
            float sqrt = (float) Math.sqrt((f10 / r0) - (f11 * f11));
            Collections.sort(this.possibleCenters, new FurthestFromAverageComparator(f11));
            float max = Math.max(0.2f * f11, sqrt);
            int i8 = 0;
            while (i8 < this.possibleCenters.size() && this.possibleCenters.size() > 3) {
                if (Math.abs(this.possibleCenters.get(i8).getEstimatedModuleSize() - f11) > max) {
                    this.possibleCenters.remove(i8);
                    i8--;
                }
                i8++;
            }
        }
        if (this.possibleCenters.size() > 3) {
            Iterator<FinderPattern> it2 = this.possibleCenters.iterator();
            while (it2.hasNext()) {
                f8 += it2.next().getEstimatedModuleSize();
            }
            Collections.sort(this.possibleCenters, new CenterComparator(f8 / this.possibleCenters.size()));
            List<FinderPattern> list = this.possibleCenters;
            list.subList(3, list.size()).clear();
        }
        return new FinderPattern[]{this.possibleCenters.get(0), this.possibleCenters.get(1), this.possibleCenters.get(2)};
    }

    protected final void clearCounts(int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            iArr[i8] = 0;
        }
    }

    final FinderPatternInfo find(Map<DecodeHintType, ?> map) {
        boolean z7 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i8 = (height * 3) / 388;
        if (i8 < 3 || z7) {
            i8 = 3;
        }
        int[] iArr = new int[5];
        int i9 = i8 - 1;
        boolean z8 = false;
        while (i9 < height && !z8) {
            clearCounts(iArr);
            int i10 = 0;
            int i11 = 0;
            while (i10 < width) {
                if (this.image.get(i10, i9)) {
                    if ((i11 & 1) == 1) {
                        i11++;
                    }
                    iArr[i11] = iArr[i11] + 1;
                } else if ((i11 & 1) != 0) {
                    iArr[i11] = iArr[i11] + 1;
                } else if (i11 == 4) {
                    if (!foundPatternCross(iArr)) {
                        shiftCounts2(iArr);
                    } else if (handlePossibleCenter(iArr, i9, i10)) {
                        if (this.hasSkipped) {
                            z8 = haveMultiplyConfirmedCenters();
                        } else {
                            int findRowSkip = findRowSkip();
                            int i12 = iArr[2];
                            if (findRowSkip > i12) {
                                i9 += (findRowSkip - i12) - 2;
                                i10 = width - 1;
                            }
                        }
                        clearCounts(iArr);
                        i8 = 2;
                        i11 = 0;
                    } else {
                        shiftCounts2(iArr);
                    }
                    i11 = 3;
                } else {
                    i11++;
                    iArr[i11] = iArr[i11] + 1;
                }
                i10++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i9, width)) {
                i8 = iArr[0];
                if (this.hasSkipped) {
                    z8 = haveMultiplyConfirmedCenters();
                }
            }
            i9 += i8;
        }
        FinderPattern[] selectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(selectBestPatterns);
        return new FinderPatternInfo(selectBestPatterns);
    }

    protected final BitMatrix getImage() {
        return this.image;
    }

    protected final List<FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    @Deprecated
    protected final boolean handlePossibleCenter(int[] iArr, int i8, int i9, boolean z7) {
        return handlePossibleCenter(iArr, i8, i9);
    }

    protected final void shiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    protected final boolean handlePossibleCenter(int[] iArr, int i8, int i9) {
        int i10 = 0;
        int i11 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int centerFromEnd = (int) centerFromEnd(iArr, i9);
        float crossCheckVertical = crossCheckVertical(i8, centerFromEnd, iArr[2], i11);
        if (!Float.isNaN(crossCheckVertical)) {
            int i12 = (int) crossCheckVertical;
            float crossCheckHorizontal = crossCheckHorizontal(centerFromEnd, i12, iArr[2], i11);
            if (!Float.isNaN(crossCheckHorizontal) && crossCheckDiagonal(i12, (int) crossCheckHorizontal)) {
                float f8 = i11 / 7.0f;
                while (true) {
                    if (i10 < this.possibleCenters.size()) {
                        FinderPattern finderPattern = this.possibleCenters.get(i10);
                        if (finderPattern.aboutEquals(f8, crossCheckVertical, crossCheckHorizontal)) {
                            this.possibleCenters.set(i10, finderPattern.combineEstimate(crossCheckVertical, crossCheckHorizontal, f8));
                            break;
                        }
                        i10++;
                    } else {
                        FinderPattern finderPattern2 = new FinderPattern(crossCheckHorizontal, crossCheckVertical, f8);
                        this.possibleCenters.add(finderPattern2);
                        ResultPointCallback resultPointCallback = this.resultPointCallback;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
