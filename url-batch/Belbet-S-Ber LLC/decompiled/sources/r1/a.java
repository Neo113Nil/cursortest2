package r1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3205a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final a1.a f3206b = new a1.a(a1.a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final a1.a f3207c = new a1.a();
    public static final a1.a d = new a1.a(a1.a.f102e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f5, float f6, float f7) {
        return ((f6 - f5) * f7) + f5;
    }

    public static float b(float f5, float f6, float f7, float f8, float f9) {
        return f9 <= f7 ? f5 : f9 >= f8 ? f6 : a(f5, f6, (f9 - f7) / (f8 - f7));
    }

    public static int c(int i, int i4, float f5) {
        return Math.round(f5 * (i4 - i)) + i;
    }
}
