package m1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f2905a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final w0.a f2906b = new w0.a(w0.a.f3582d);
    public static final w0.a c = new w0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final w0.a f2907d = new w0.a(w0.a.f3583e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f4, float f5, float f6) {
        return ((f5 - f4) * f6) + f4;
    }

    public static float b(float f4, float f5, float f6, float f7, float f8) {
        return f8 <= f6 ? f4 : f8 >= f7 ? f5 : a(f4, f5, (f8 - f6) / (f7 - f6));
    }

    public static int c(int i4, int i5, float f4) {
        return Math.round(f4 * (i5 - i4)) + i4;
    }
}
