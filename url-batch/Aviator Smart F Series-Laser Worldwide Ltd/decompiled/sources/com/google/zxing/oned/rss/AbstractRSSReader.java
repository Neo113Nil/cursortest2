package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;

/* loaded from: classes4.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.2f;
    private static final float MAX_FINDER_PATTERN_RATIO = 0.89285713f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.45f;
    private static final float MIN_FINDER_PATTERN_RATIO = 0.7916667f;
    private final int[] dataCharacterCounters;
    private final int[] evenCounts;
    private final int[] oddCounts;
    private final int[] decodeFinderCounters = new int[4];
    private final float[] oddRoundingErrors = new float[4];
    private final float[] evenRoundingErrors = new float[4];

    protected AbstractRSSReader() {
        int[] iArr = new int[8];
        this.dataCharacterCounters = iArr;
        this.oddCounts = new int[iArr.length / 2];
        this.evenCounts = new int[iArr.length / 2];
    }

    @Deprecated
    protected static int count(int[] iArr) {
        return MathUtils.sum(iArr);
    }

    protected static void decrement(int[] iArr, float[] fArr) {
        int i8 = 0;
        float f8 = fArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 < f8) {
                i8 = i9;
                f8 = f9;
            }
        }
        iArr[i8] = iArr[i8] - 1;
    }

    protected static void increment(int[] iArr, float[] fArr) {
        int i8 = 0;
        float f8 = fArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 > f8) {
                i8 = i9;
                f8 = f9;
            }
        }
        iArr[i8] = iArr[i8] + 1;
    }

    protected static boolean isFinderPattern(int[] iArr) {
        float f8 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f8 >= MIN_FINDER_PATTERN_RATIO && f8 <= MAX_FINDER_PATTERN_RATIO) {
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MIN_VALUE;
            for (int i10 : iArr) {
                if (i10 > i9) {
                    i9 = i10;
                }
                if (i10 < i8) {
                    i8 = i10;
                }
            }
            if (i9 < i8 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int parseFinderValue(int[] iArr, int[][] iArr2) {
        for (int i8 = 0; i8 < iArr2.length; i8++) {
            if (OneDReader.patternMatchVariance(iArr, iArr2[i8], MAX_INDIVIDUAL_VARIANCE) < 0.2f) {
                return i8;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    protected final int[] getDataCharacterCounters() {
        return this.dataCharacterCounters;
    }

    protected final int[] getDecodeFinderCounters() {
        return this.decodeFinderCounters;
    }

    protected final int[] getEvenCounts() {
        return this.evenCounts;
    }

    protected final float[] getEvenRoundingErrors() {
        return this.evenRoundingErrors;
    }

    protected final int[] getOddCounts() {
        return this.oddCounts;
    }

    protected final float[] getOddRoundingErrors() {
        return this.oddRoundingErrors;
    }
}
