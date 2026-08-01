package u0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b0.C0096a;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0389a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4369a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0096a f4370b = new C0096a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0096a f4371c = new C0096a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0096a f4372d = new C0096a(C0096a.e);

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
