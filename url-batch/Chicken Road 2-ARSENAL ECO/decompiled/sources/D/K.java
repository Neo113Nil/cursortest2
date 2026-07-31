package D;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class K extends O {

    /* renamed from: c, reason: collision with root package name */
    public static Field f247c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f248d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f249e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f250f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f251a;

    /* renamed from: b, reason: collision with root package name */
    public w.c f252b;

    public K() {
        this.f251a = e();
    }

    private static WindowInsets e() {
        if (!f248d) {
            try {
                f247c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f248d = true;
        }
        Field field = f247c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f250f) {
            try {
                f249e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            f250f = true;
        }
        Constructor constructor = f249e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    @Override // D.O
    public Y b() {
        a();
        Y c7 = Y.c(this.f251a, null);
        W w5 = c7.f272a;
        w5.o(null);
        w5.q(this.f252b);
        return c7;
    }

    @Override // D.O
    public void c(w.c cVar) {
        this.f252b = cVar;
    }

    @Override // D.O
    public void d(w.c cVar) {
        WindowInsets windowInsets = this.f251a;
        if (windowInsets != null) {
            this.f251a = windowInsets.replaceSystemWindowInsets(cVar.f6127a, cVar.f6128b, cVar.f6129c, cVar.f6130d);
        }
    }

    public K(Y y) {
        super(y);
        this.f251a = y.b();
    }
}
