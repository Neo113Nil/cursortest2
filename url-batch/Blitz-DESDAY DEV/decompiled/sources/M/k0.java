package M;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class k0 extends n0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f564e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f565f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f566g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f567c;
    public E.c d;

    public k0() {
        this.f567c = i();
    }

    private static WindowInsets i() {
        if (!f565f) {
            try {
                f564e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f565f = true;
        }
        Field field = f564e;
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
                f566g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f566g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // M.n0
    public v0 b() {
        a();
        v0 g2 = v0.g(null, this.f567c);
        E.c[] cVarArr = this.f574b;
        t0 t0Var = g2.f596a;
        t0Var.o(cVarArr);
        t0Var.q(this.d);
        return g2;
    }

    @Override // M.n0
    public void e(E.c cVar) {
        this.d = cVar;
    }

    @Override // M.n0
    public void g(E.c cVar) {
        WindowInsets windowInsets = this.f567c;
        if (windowInsets != null) {
            this.f567c = windowInsets.replaceSystemWindowInsets(cVar.f162a, cVar.f163b, cVar.f164c, cVar.d);
        }
    }

    public k0(v0 v0Var) {
        super(v0Var);
        this.f567c = v0Var.f();
    }
}
