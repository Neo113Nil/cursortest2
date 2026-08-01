package L;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f556e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f557f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f558g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f559h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f560c;
    public D.c d;

    public o0() {
        this.f560c = i();
    }

    private static WindowInsets i() {
        if (!f557f) {
            try {
                f556e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f557f = true;
        }
        Field field = f556e;
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
        if (!f559h) {
            try {
                f558g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f559h = true;
        }
        Constructor constructor = f558g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // L.r0
    public z0 b() {
        a();
        z0 g2 = z0.g(null, this.f560c);
        D.c[] cVarArr = this.f565b;
        x0 x0Var = g2.f589a;
        x0Var.o(cVarArr);
        x0Var.q(this.d);
        return g2;
    }

    @Override // L.r0
    public void e(D.c cVar) {
        this.d = cVar;
    }

    @Override // L.r0
    public void g(D.c cVar) {
        WindowInsets windowInsets = this.f560c;
        if (windowInsets != null) {
            this.f560c = windowInsets.replaceSystemWindowInsets(cVar.f114a, cVar.f115b, cVar.f116c, cVar.d);
        }
    }

    public o0(z0 z0Var) {
        super(z0Var);
        this.f560c = z0Var.f();
    }
}
