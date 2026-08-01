package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f505e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f506f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f507g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f508c;
    public C.c d;

    public o0() {
        this.f508c = i();
    }

    private static WindowInsets i() {
        if (!f506f) {
            try {
                f505e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f506f = true;
        }
        Field field = f505e;
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
                f507g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f507g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // K.r0
    public z0 b() {
        a();
        z0 g2 = z0.g(null, this.f508c);
        C.c[] cVarArr = this.f513b;
        x0 x0Var = g2.f536a;
        x0Var.o(cVarArr);
        x0Var.q(this.d);
        return g2;
    }

    @Override // K.r0
    public void e(C.c cVar) {
        this.d = cVar;
    }

    @Override // K.r0
    public void g(C.c cVar) {
        WindowInsets windowInsets = this.f508c;
        if (windowInsets != null) {
            this.f508c = windowInsets.replaceSystemWindowInsets(cVar.f72a, cVar.f73b, cVar.f74c, cVar.d);
        }
    }

    public o0(z0 z0Var) {
        super(z0Var);
        this.f508c = z0Var.f();
    }
}
