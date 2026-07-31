package g5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3031a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final i4.a f3032b = new i4.a(i4.a.f3447d);

    /* renamed from: c, reason: collision with root package name */
    public static final i4.a f3033c = new i4.a();

    /* renamed from: d, reason: collision with root package name */
    public static final i4.a f3034d = new i4.a(i4.a.f3448e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f8, float f9) {
        return ((f8 - f6) * f9) + f6;
    }

    public static float b(float f6, float f8, float f9, float f10, float f11) {
        return f11 <= f9 ? f6 : f11 >= f10 ? f8 : a(f6, f8, (f11 - f9) / (f10 - f9));
    }

    public static int c(float f6, int i, int i8) {
        return Math.round(f6 * (i8 - i)) + i;
    }
}
