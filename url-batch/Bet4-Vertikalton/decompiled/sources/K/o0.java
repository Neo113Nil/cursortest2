package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f488e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f489f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f490g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f491c;
    public C.c d;

    public o0() {
        this.f491c = i();
    }

    private static WindowInsets i() {
        if (!f489f) {
            try {
                f488e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f489f = true;
        }
        Field field = f488e;
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
                f490g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f490g;
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
        z0 g2 = z0.g(null, this.f491c);
        C.c[] cVarArr = this.f496b;
        x0 x0Var = g2.f519a;
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
        WindowInsets windowInsets = this.f491c;
        if (windowInsets != null) {
            this.f491c = windowInsets.replaceSystemWindowInsets(cVar.f107a, cVar.f108b, cVar.f109c, cVar.d);
        }
    }

    public o0(z0 z0Var) {
        super(z0Var);
        this.f491c = z0Var.f();
    }
}
