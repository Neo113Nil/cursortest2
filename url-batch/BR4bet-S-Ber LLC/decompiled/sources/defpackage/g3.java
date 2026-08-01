package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class g3 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final hl b = new hl(1);
    public static final hl c = new hl(0);
    public static final hl d = new hl(hl.e);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
