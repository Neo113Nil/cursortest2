package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l0 extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f417e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f418f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f419g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f420c;
    public C.c d;

    public l0() {
        this.f420c = i();
    }

    private static WindowInsets i() {
        if (!f418f) {
            try {
                f417e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f418f = true;
        }
        Field field = f417e;
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
                f419g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f419g;
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
        w0 g2 = w0.g(null, this.f420c);
        C.c[] cVarArr = this.f427b;
        u0 u0Var = g2.f449a;
        u0Var.o(cVarArr);
        u0Var.q(this.d);
        return g2;
    }

    @Override // K.o0
    public void e(C.c cVar) {
        this.d = cVar;
    }

    @Override // K.o0
    public void g(C.c cVar) {
        WindowInsets windowInsets = this.f420c;
        if (windowInsets != null) {
            this.f420c = windowInsets.replaceSystemWindowInsets(cVar.f56a, cVar.f57b, cVar.f58c, cVar.d);
        }
    }

    public l0(w0 w0Var) {
        super(w0Var);
        this.f420c = w0Var.f();
    }
}
