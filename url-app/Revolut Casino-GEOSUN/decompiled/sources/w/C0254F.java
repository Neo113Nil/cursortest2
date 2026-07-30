package w;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p.C0217c;

/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254F extends I {

    /* renamed from: c, reason: collision with root package name */
    public static Field f3021c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3022d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3023e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3024f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f3025a = e();

    /* renamed from: b, reason: collision with root package name */
    public C0217c f3026b;

    private static WindowInsets e() {
        if (!f3022d) {
            try {
                f3021c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3022d = true;
        }
        Field field = f3021c;
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
        if (!f3024f) {
            try {
                f3023e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3024f = true;
        }
        Constructor constructor = f3023e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // w.I
    public S b() {
        a();
        S a2 = S.a(this.f3025a, null);
        P p2 = a2.f3045a;
        p2.n(null);
        p2.p(this.f3026b);
        return a2;
    }

    @Override // w.I
    public void c(C0217c c0217c) {
        this.f3026b = c0217c;
    }

    @Override // w.I
    public void d(C0217c c0217c) {
        WindowInsets windowInsets = this.f3025a;
        if (windowInsets != null) {
            this.f3025a = windowInsets.replaceSystemWindowInsets(c0217c.f2808a, c0217c.f2809b, c0217c.f2810c, c0217c.f2811d);
        }
    }
}
