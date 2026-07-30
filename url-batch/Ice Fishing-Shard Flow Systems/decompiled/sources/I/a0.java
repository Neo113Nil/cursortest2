package I;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class a0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f1166e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1167f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f1168g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1169h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f1170c;

    /* renamed from: d, reason: collision with root package name */
    public B.c f1171d;

    public a0() {
        this.f1170c = f();
    }

    private static WindowInsets f() {
        if (!f1167f) {
            try {
                f1166e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f1167f = true;
        }
        Field field = f1166e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f1169h) {
            try {
                f1168g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f1169h = true;
        }
        Constructor constructor = f1168g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // I.h0
    public v0 b() {
        a();
        v0 c7 = v0.c(this.f1170c, null);
        r0 r0Var = c7.f1239a;
        r0Var.t(null);
        r0Var.v(this.f1171d);
        r0Var.s(null);
        r0Var.x(this.f1192a);
        r0Var.y(this.f1193b);
        return c7;
    }

    @Override // I.h0
    public void d(B.c cVar) {
        this.f1171d = cVar;
    }

    @Override // I.h0
    public void e(B.c cVar) {
        WindowInsets windowInsets = this.f1170c;
        if (windowInsets != null) {
            this.f1170c = windowInsets.replaceSystemWindowInsets(cVar.f147a, cVar.f148b, cVar.f149c, cVar.f150d);
        }
    }

    public a0(v0 v0Var) {
        super(v0Var);
        this.f1170c = v0Var.b();
    }
}
