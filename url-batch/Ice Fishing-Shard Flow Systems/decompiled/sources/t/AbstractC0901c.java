package t;

import android.graphics.drawable.Drawable;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0901c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f7883a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f7, float f8, boolean z7) {
        if (!z7) {
            return f7;
        }
        return (float) (((1.0d - f7883a) * f8) + f7);
    }

    public static float b(float f7, float f8, boolean z7) {
        if (!z7) {
            return f7 * 1.5f;
        }
        return (float) (((1.0d - f7883a) * f8) + (f7 * 1.5f));
    }
}
