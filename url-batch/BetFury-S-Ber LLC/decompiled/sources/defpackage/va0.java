package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class va0 extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - a) * f2) + f);
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - a) * f2) + (f * 1.5f));
    }
}
