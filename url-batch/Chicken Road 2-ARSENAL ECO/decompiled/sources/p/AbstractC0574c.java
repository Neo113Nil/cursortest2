package p;

import android.graphics.drawable.Drawable;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0574c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f5652a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f7, float f8, boolean z5) {
        if (!z5) {
            return f7;
        }
        return (float) (((1.0d - f5652a) * f8) + f7);
    }

    public static float b(float f7, float f8, boolean z5) {
        if (!z5) {
            return f7 * 1.5f;
        }
        return (float) (((1.0d - f5652a) * f8) + (f7 * 1.5f));
    }
}
