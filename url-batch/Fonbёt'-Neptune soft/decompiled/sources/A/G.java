package A;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import t.C0307c;

/* loaded from: classes.dex */
public final class G extends K {

    /* renamed from: c, reason: collision with root package name */
    public static Field f5c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f6d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f7e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f8f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f9a = e();

    /* renamed from: b, reason: collision with root package name */
    public C0307c f10b;

    private static WindowInsets e() {
        if (!f6d) {
            try {
                f5c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f6d = true;
        }
        Field field = f5c;
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
        if (!f8f) {
            try {
                f7e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f8f = true;
        }
        Constructor constructor = f7e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // A.K
    public T b() {
        a();
        T a2 = T.a(this.f9a, null);
        S s2 = a2.f24a;
        s2.j(null);
        s2.l(this.f10b);
        return a2;
    }

    @Override // A.K
    public void c(C0307c c0307c) {
        this.f10b = c0307c;
    }

    @Override // A.K
    public void d(C0307c c0307c) {
        WindowInsets windowInsets = this.f9a;
        if (windowInsets != null) {
            this.f9a = windowInsets.replaceSystemWindowInsets(c0307c.f3437a, c0307c.f3438b, c0307c.f3439c, c0307c.f3440d);
        }
    }
}
