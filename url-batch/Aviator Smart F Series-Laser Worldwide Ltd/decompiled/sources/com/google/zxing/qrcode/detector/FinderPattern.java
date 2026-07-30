package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes4.dex */
public final class FinderPattern extends ResultPoint {
    private final int count;
    private final float estimatedModuleSize;

    FinderPattern(float f8, float f9, float f10) {
        this(f8, f9, f10, 1);
    }

    boolean aboutEquals(float f8, float f9, float f10) {
        if (Math.abs(f9 - getY()) > f8 || Math.abs(f10 - getX()) > f8) {
            return false;
        }
        float abs = Math.abs(f8 - this.estimatedModuleSize);
        return abs <= 1.0f || abs <= this.estimatedModuleSize;
    }

    FinderPattern combineEstimate(float f8, float f9, float f10) {
        int i8 = this.count;
        int i9 = i8 + 1;
        float x7 = (i8 * getX()) + f9;
        float f11 = i9;
        return new FinderPattern(x7 / f11, ((this.count * getY()) + f8) / f11, ((this.count * this.estimatedModuleSize) + f10) / f11, i9);
    }

    int getCount() {
        return this.count;
    }

    public float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
    }

    private FinderPattern(float f8, float f9, float f10, int i8) {
        super(f8, f9);
        this.estimatedModuleSize = f10;
        this.count = i8;
    }
}
