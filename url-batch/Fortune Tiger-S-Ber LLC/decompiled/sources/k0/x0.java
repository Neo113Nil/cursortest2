package k0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x0 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2790e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2791f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;

    /* renamed from: d, reason: collision with root package name */
    public c0.c f2792d;

    public x0() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f2791f) {
            try {
                f2790e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f2791f = true;
        }
        Field field = f2790e;
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
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // k0.b1
    public m1 b() {
        a();
        m1 g4 = m1.g(null, this.c);
        c0.c[] cVarArr = this.f2717b;
        i1 i1Var = g4.f2760a;
        i1Var.p(cVarArr);
        i1Var.r(this.f2792d);
        return g4;
    }

    @Override // k0.b1
    public void e(c0.c cVar) {
        this.f2792d = cVar;
    }

    @Override // k0.b1
    public void g(c0.c cVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(cVar.f978a, cVar.f979b, cVar.c, cVar.f980d);
        }
    }

    public x0(m1 m1Var) {
        super(m1Var);
        this.c = m1Var.f();
    }
}
