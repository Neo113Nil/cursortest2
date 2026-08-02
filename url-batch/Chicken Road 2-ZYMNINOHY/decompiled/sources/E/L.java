package E;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class L extends S {

    /* renamed from: b, reason: collision with root package name */
    public static Field f379b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f380c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f381d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f382e = false;

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f383a = c();

    private static WindowInsets c() {
        if (!f380c) {
            try {
                f379b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f380c = true;
        }
        Field field = f379b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f382e) {
            try {
                f381d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f382e = true;
        }
        Constructor constructor = f381d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // E.S
    public e0 b() {
        a();
        e0 a3 = e0.a(null, this.f383a);
        a0 a0Var = a3.f416a;
        a0Var.n(null);
        a0Var.p(null);
        return a3;
    }
}
