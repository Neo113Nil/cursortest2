package o1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f2864a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.a f2865b = new z0.a(z0.a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final z0.a f2866c = new z0.a();
    public static final z0.a d = new z0.a(z0.a.f3849e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f4, float f5) {
        return ((f4 - f2) * f5) + f2;
    }

    public static float b(float f2, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f2 : f7 >= f6 ? f4 : a(f2, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i, int i4, float f2) {
        return Math.round(f2 * (i4 - i)) + i;
    }
}
