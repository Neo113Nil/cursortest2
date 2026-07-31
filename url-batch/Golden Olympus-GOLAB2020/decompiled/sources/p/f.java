package p;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f43353a = Math.cos(Math.toRadians(45.0d));

    static float a(float f4, float f5, boolean z4) {
        return z4 ? (float) (f4 + ((1.0d - f43353a) * f5)) : f4;
    }

    static float b(float f4, float f5, boolean z4) {
        return z4 ? (float) ((f4 * 1.5f) + ((1.0d - f43353a) * f5)) : f4 * 1.5f;
    }
}
