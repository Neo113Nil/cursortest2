package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes4.dex */
public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int i8, int[] iArr, int i9, int i10, int i11) {
        this.value = i8;
        this.startEnd = iArr;
        float f8 = i11;
        this.resultPoints = new ResultPoint[]{new ResultPoint(i9, f8), new ResultPoint(i10, f8)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.value == ((FinderPattern) obj).value;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }
}
