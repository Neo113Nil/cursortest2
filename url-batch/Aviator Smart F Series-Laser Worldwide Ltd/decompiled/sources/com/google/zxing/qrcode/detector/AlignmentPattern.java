package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes4.dex */
public final class AlignmentPattern extends ResultPoint {
    private final float estimatedModuleSize;

    AlignmentPattern(float f8, float f9, float f10) {
        super(f8, f9);
        this.estimatedModuleSize = f10;
    }

    boolean aboutEquals(float f8, float f9, float f10) {
        if (Math.abs(f9 - getY()) > f8 || Math.abs(f10 - getX()) > f8) {
            return false;
        }
        float abs = Math.abs(f8 - this.estimatedModuleSize);
        return abs <= 1.0f || abs <= this.estimatedModuleSize;
    }

    AlignmentPattern combineEstimate(float f8, float f9, float f10) {
        return new AlignmentPattern((getX() + f9) / 2.0f, (getY() + f8) / 2.0f, (this.estimatedModuleSize + f10) / 2.0f);
    }
}
