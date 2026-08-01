package y0;

import a0.C0057a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0395a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4570a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0057a f4571b = new C0057a(C0057a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final C0057a f4572c = new C0057a();
    public static final C0057a d = new C0057a(C0057a.f1623e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(float f2, int i, int i2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
