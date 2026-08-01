package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class m0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f436e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f437f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f438g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f439c;
    public C.d d;

    public m0() {
        this.f439c = i();
    }

    private static WindowInsets i() {
        if (!f437f) {
            try {
                f436e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f437f = true;
        }
        Field field = f436e;
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
                f438g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f438g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // K.p0
    public x0 b() {
        a();
        x0 g2 = x0.g(null, this.f439c);
        C.d[] dVarArr = this.f446b;
        v0 v0Var = g2.f468a;
        v0Var.o(dVarArr);
        v0Var.q(this.d);
        return g2;
    }

    @Override // K.p0
    public void e(C.d dVar) {
        this.d = dVar;
    }

    @Override // K.p0
    public void g(C.d dVar) {
        WindowInsets windowInsets = this.f439c;
        if (windowInsets != null) {
            this.f439c = windowInsets.replaceSystemWindowInsets(dVar.f148a, dVar.f149b, dVar.f150c, dVar.d);
        }
    }

    public m0(x0 x0Var) {
        super(x0Var);
        this.f439c = x0Var.f();
    }
}
