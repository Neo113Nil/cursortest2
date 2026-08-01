package p;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f3334a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f3, boolean z2) {
        if (!z2) {
            return f2;
        }
        return (float) (((1.0d - f3334a) * f3) + f2);
    }

    public static float b(float f2, float f3, boolean z2) {
        if (!z2) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f3334a) * f3) + (f2 * 1.5f));
    }
}
