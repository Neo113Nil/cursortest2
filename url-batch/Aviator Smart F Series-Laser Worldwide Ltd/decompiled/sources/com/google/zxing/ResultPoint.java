package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes4.dex */
public class ResultPoint {

    /* renamed from: x, reason: collision with root package name */
    private final float f15124x;

    /* renamed from: y, reason: collision with root package name */
    private final float f15125y;

    public ResultPoint(float f8, float f9) {
        this.f15124x = f8;
        this.f15125y = f9;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f8 = resultPoint2.f15124x;
        float f9 = resultPoint2.f15125y;
        return ((resultPoint3.f15124x - f8) * (resultPoint.f15125y - f9)) - ((resultPoint3.f15125y - f9) * (resultPoint.f15124x - f8));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f15124x, resultPoint.f15125y, resultPoint2.f15124x, resultPoint2.f15125y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f15124x == resultPoint.f15124x && this.f15125y == resultPoint.f15125y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f15124x;
    }

    public final float getY() {
        return this.f15125y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f15124x) * 31) + Float.floatToIntBits(this.f15125y);
    }

    public final String toString() {
        return "(" + this.f15124x + ',' + this.f15125y + ')';
    }
}
