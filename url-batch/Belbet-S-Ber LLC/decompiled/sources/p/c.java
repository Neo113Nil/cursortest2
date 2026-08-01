package p;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f3053a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f5, float f6, boolean z4) {
        if (!z4) {
            return f5;
        }
        return (float) (((1.0d - f3053a) * f6) + f5);
    }

    public static float b(float f5, float f6, boolean z4) {
        if (!z4) {
            return f5 * 1.5f;
        }
        return (float) (((1.0d - f3053a) * f6) + (f5 * 1.5f));
    }
}
