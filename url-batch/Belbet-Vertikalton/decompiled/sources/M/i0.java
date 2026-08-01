package M;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class i0 extends l0 {
    public static Field e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f761f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f762g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f763h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f764c;

    /* renamed from: d, reason: collision with root package name */
    public E.c f765d;

    public i0() {
        this.f764c = i();
    }

    private static WindowInsets i() {
        if (!f761f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f761f = true;
        }
        Field field = e;
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
        if (!f763h) {
            try {
                f762g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f763h = true;
        }
        Constructor constructor = f762g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // M.l0
    public t0 b() {
        a();
        t0 g2 = t0.g(null, this.f764c);
        E.c[] cVarArr = this.f772b;
        r0 r0Var = g2.f794a;
        r0Var.o(cVarArr);
        r0Var.q(this.f765d);
        return g2;
    }

    @Override // M.l0
    public void e(E.c cVar) {
        this.f765d = cVar;
    }

    @Override // M.l0
    public void g(E.c cVar) {
        WindowInsets windowInsets = this.f764c;
        if (windowInsets != null) {
            this.f764c = windowInsets.replaceSystemWindowInsets(cVar.f279a, cVar.f280b, cVar.f281c, cVar.f282d);
        }
    }

    public i0(t0 t0Var) {
        super(t0Var);
        this.f764c = t0Var.f();
    }
}
