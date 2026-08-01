package p;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f3005a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f4, boolean z3) {
        if (!z3) {
            return f2;
        }
        return (float) (((1.0d - f3005a) * f4) + f2);
    }

    public static float b(float f2, float f4, boolean z3) {
        if (!z3) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f3005a) * f4) + (f2 * 1.5f));
    }
}
