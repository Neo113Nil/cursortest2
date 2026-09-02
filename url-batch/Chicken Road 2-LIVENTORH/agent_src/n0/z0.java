package n0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class z0 extends f1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2805e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2806f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2807g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2808h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2809c;
    public f0.c d;

    public z0() {
        this.f2809c = i();
    }

    private static WindowInsets i() {
        if (!f2806f) {
            try {
                f2805e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f2806f = true;
        }
        Field field = f2805e;
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
        if (!f2808h) {
            try {
                f2807g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f2808h = true;
        }
        Constructor constructor = f2807g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // n0.f1
    public q1 b() {
        a();
        q1 g4 = q1.g(null, this.f2809c);
        f0.c[] cVarArr = this.f2727b;
        n1 n1Var = g4.f2775a;
        n1Var.p(cVarArr);
        n1Var.r(this.d);
        return g4;
    }

    @Override // n0.f1
    public void e(f0.c cVar) {
        this.d = cVar;
    }

    @Override // n0.f1
    public void g(f0.c cVar) {
        WindowInsets windowInsets = this.f2809c;
        if (windowInsets != null) {
            this.f2809c = windowInsets.replaceSystemWindowInsets(cVar.f1266a, cVar.f1267b, cVar.f1268c, cVar.d);
        }
    }

    public z0(q1 q1Var) {
        super(q1Var);
        this.f2809c = q1Var.f();
    }
}
