package q0;

import a0.C0059a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3384a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0059a f3385b = new C0059a(C0059a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final C0059a f3386c = new C0059a();
    public static final C0059a d = new C0059a(C0059a.f1252e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
