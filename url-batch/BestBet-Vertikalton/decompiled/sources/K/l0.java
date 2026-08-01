package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l0 extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f636e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f637f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f638g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f639c;
    public C.d d;

    public l0() {
        this.f639c = i();
    }

    private static WindowInsets i() {
        if (!f637f) {
            try {
                f636e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f637f = true;
        }
        Field field = f636e;
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
        if (!h) {
            try {
                f638g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f638g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // K.o0
    public w0 b() {
        a();
        w0 g2 = w0.g(null, this.f639c);
        C.d[] dVarArr = this.f644b;
        u0 u0Var = g2.f668a;
        u0Var.o(dVarArr);
        u0Var.q(this.d);
        return g2;
    }

    @Override // K.o0
    public void e(C.d dVar) {
        this.d = dVar;
    }

    @Override // K.o0
    public void g(C.d dVar) {
        WindowInsets windowInsets = this.f639c;
        if (windowInsets != null) {
            this.f639c = windowInsets.replaceSystemWindowInsets(dVar.f68a, dVar.f69b, dVar.f70c, dVar.d);
        }
    }

    public l0(w0 w0Var) {
        super(w0Var);
        this.f639c = w0Var.f();
    }
}
