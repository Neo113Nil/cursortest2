package n0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c1 extends j1 {

    /* renamed from: g, reason: collision with root package name */
    public static Field f2761g = null;
    public static boolean h = false;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f2762j = false;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsets f2763e;

    /* renamed from: f, reason: collision with root package name */
    public f0.c f2764f;

    public c1() {
        this.f2763e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                f2761g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            h = true;
        }
        Field field = f2761g;
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
        if (!f2762j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f2762j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // n0.j1
    public v1 b() {
        a();
        v1 g3 = v1.g(null, this.f2763e);
        f0.c[] cVarArr = this.f2789b;
        s1 s1Var = g3.f2842a;
        s1Var.u(cVarArr);
        s1Var.w(this.f2764f);
        s1Var.t(null);
        s1Var.y(this.f2790c);
        s1Var.z(this.d);
        return g3;
    }

    @Override // n0.j1
    public void f(f0.c cVar) {
        this.f2764f = cVar;
    }

    @Override // n0.j1
    public void h(f0.c cVar) {
        WindowInsets windowInsets = this.f2763e;
        if (windowInsets != null) {
            this.f2763e = windowInsets.replaceSystemWindowInsets(cVar.f1415a, cVar.f1416b, cVar.f1417c, cVar.d);
        }
    }

    public c1(v1 v1Var) {
        super(v1Var);
        this.f2763e = v1Var.f();
    }
}
