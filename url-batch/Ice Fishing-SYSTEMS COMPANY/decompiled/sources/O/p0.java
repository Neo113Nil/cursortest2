package O;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2305e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2306f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2307g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2308h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2309c;

    /* renamed from: d, reason: collision with root package name */
    public G.e f2310d;

    public p0() {
        this.f2309c = i();
    }

    private static WindowInsets i() {
        if (!f2306f) {
            try {
                f2305e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f2306f = true;
        }
        Field field = f2305e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f2308h) {
            try {
                f2307g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f2308h = true;
        }
        Constructor constructor = f2307g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // O.s0
    public A0 b() {
        a();
        A0 h9 = A0.h(null, this.f2309c);
        G.e[] eVarArr = this.f2318b;
        y0 y0Var = h9.f2213a;
        y0Var.o(eVarArr);
        y0Var.q(this.f2310d);
        return h9;
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2310d = eVar;
    }

    @Override // O.s0
    public void g(G.e eVar) {
        WindowInsets windowInsets = this.f2309c;
        if (windowInsets != null) {
            this.f2309c = windowInsets.replaceSystemWindowInsets(eVar.f1151a, eVar.f1152b, eVar.f1153c, eVar.f1154d);
        }
    }

    public p0(A0 a02) {
        super(a02);
        this.f2309c = a02.g();
    }
}
