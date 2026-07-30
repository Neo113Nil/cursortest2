package b3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f1331e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1332f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f1333g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1334h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f1335c;

    /* renamed from: d, reason: collision with root package name */
    public v2.c f1336d;

    public h0() {
        this.f1335c = i();
    }

    private static WindowInsets i() {
        if (!f1332f) {
            try {
                f1331e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f1332f = true;
        }
        Field field = f1331e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f1334h) {
            try {
                f1333g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f1334h = true;
        }
        Constructor constructor = f1333g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // b3.k0
    public t0 b() {
        a();
        t0 b9 = t0.b(null, this.f1335c);
        v2.c[] cVarArr = this.f1343b;
        q0 q0Var = b9.f1367a;
        q0Var.p(cVarArr);
        q0Var.r(this.f1336d);
        return b9;
    }

    @Override // b3.k0
    public void e(v2.c cVar) {
        this.f1336d = cVar;
    }

    @Override // b3.k0
    public void g(v2.c cVar) {
        WindowInsets windowInsets = this.f1335c;
        if (windowInsets != null) {
            this.f1335c = windowInsets.replaceSystemWindowInsets(cVar.f9102a, cVar.f9103b, cVar.f9104c, cVar.f9105d);
        }
    }

    public h0(t0 t0Var) {
        super(t0Var);
        this.f1335c = t0Var.a();
    }
}
