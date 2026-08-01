package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class q0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f488e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f489f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f490g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f491c;

    /* renamed from: d, reason: collision with root package name */
    public C.d f492d;

    public q0() {
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

    @Override // K.t0
    public B0 b() {
        a();
        B0 g2 = B0.g(null, this.f491c);
        C.d[] dVarArr = this.f500b;
        z0 z0Var = g2.f396a;
        z0Var.o(dVarArr);
        z0Var.q(this.f492d);
        return g2;
    }

    @Override // K.t0
    public void e(C.d dVar) {
        this.f492d = dVar;
    }

    @Override // K.t0
    public void g(C.d dVar) {
        WindowInsets windowInsets = this.f491c;
        if (windowInsets != null) {
            this.f491c = windowInsets.replaceSystemWindowInsets(dVar.f157a, dVar.f158b, dVar.f159c, dVar.f160d);
        }
    }

    public q0(B0 b02) {
        super(b02);
        this.f491c = b02.f();
    }
}
