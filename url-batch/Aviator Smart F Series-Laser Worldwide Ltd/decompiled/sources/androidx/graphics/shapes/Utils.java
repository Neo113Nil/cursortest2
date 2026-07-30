package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m8constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f8, float f9) {
        float atan2 = (float) Math.atan2(f9, f8);
        float f10 = TwoPi;
        return (atan2 + f10) % f10;
    }

    public static final void debugLog(String tag, f6.a messageFactory) {
        s.checkNotNullParameter(tag, "tag");
        s.checkNotNullParameter(messageFactory, "messageFactory");
    }

    public static final long directionVector(float f8, float f9) {
        float distance = distance(f8, f9);
        if (distance > 0.0f) {
            return FloatFloatPair.m8constructorimpl(f8 / distance, f9 / distance);
        }
        throw new IllegalArgumentException("Required distance greater than zero".toString());
    }

    public static final float distance(float f8, float f9) {
        return (float) Math.sqrt((f8 * f8) + (f9 * f9));
    }

    public static final float distanceSquared(float f8, float f9) {
        return (f8 * f8) + (f9 * f9);
    }

    public static final float findMinimum(float f8, float f9, float f10, FindMinimumFunction f11) {
        s.checkNotNullParameter(f11, "f");
        while (f9 - f8 > f10) {
            float f12 = 2;
            float f13 = 3;
            float f14 = ((f12 * f8) + f9) / f13;
            float f15 = ((f12 * f9) + f8) / f13;
            if (f11.invoke(f14) < f11.invoke(f15)) {
                f9 = f15;
            } else {
                f8 = f14;
            }
        }
        return (f8 + f9) / 2;
    }

    public static /* synthetic */ float findMinimum$default(float f8, float f9, float f10, FindMinimumFunction findMinimumFunction, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f10 = 0.001f;
        }
        return findMinimum(f8, f9, f10, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f8, float f9, float f10) {
        return ((1 - f10) * f8) + (f10 * f9);
    }

    public static final float positiveModulo(float f8, float f9) {
        return ((f8 % f9) + f9) % f9;
    }

    /* renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m73radialToCartesianL6JJ3z0(float f8, float f9, long j8) {
        return PointKt.m58plusybeJwSQ(PointKt.m60timesso9K2fw(directionVector(f9), f8), j8);
    }

    /* renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m74radialToCartesianL6JJ3z0$default(float f8, float f9, long j8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = Zero;
        }
        return m73radialToCartesianL6JJ3z0(f8, f9, j8);
    }

    /* renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m75rotate90DnnuFBc(long j8) {
        return FloatFloatPair.m8constructorimpl(-PointKt.m55getYDnnuFBc(j8), PointKt.m54getXDnnuFBc(j8));
    }

    public static final float square(float f8) {
        return f8 * f8;
    }

    public static final long directionVector(float f8) {
        double d8 = f8;
        return FloatFloatPair.m8constructorimpl((float) Math.cos(d8), (float) Math.sin(d8));
    }
}
