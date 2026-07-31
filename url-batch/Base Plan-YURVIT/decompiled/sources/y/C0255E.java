package y;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import r.C0224c;

/* renamed from: y.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255E extends H {

    /* renamed from: c, reason: collision with root package name */
    public static Field f3106c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3107d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3108e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3109f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f3110a = e();

    /* renamed from: b, reason: collision with root package name */
    public C0224c f3111b;

    private static WindowInsets e() {
        if (!f3107d) {
            try {
                f3106c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3107d = true;
        }
        Field field = f3106c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f3109f) {
            try {
                f3108e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3109f = true;
        }
        Constructor constructor = f3108e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // y.H
    public Q b() {
        a();
        Q a2 = Q.a(this.f3110a, null);
        O o2 = a2.f3130a;
        o2.n(null);
        o2.p(this.f3111b);
        return a2;
    }

    @Override // y.H
    public void c(C0224c c0224c) {
        this.f3111b = c0224c;
    }

    @Override // y.H
    public void d(C0224c c0224c) {
        WindowInsets windowInsets = this.f3110a;
        if (windowInsets != null) {
            this.f3110a = windowInsets.replaceSystemWindowInsets(c0224c.f2961a, c0224c.f2962b, c0224c.f2963c, c0224c.f2964d);
        }
    }
}
