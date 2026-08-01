package o3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 extends y0 {
    public static Field g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f7437h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Constructor f7438i = null;
    public static boolean j = false;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsets f7439e;

    /* renamed from: f, reason: collision with root package name */
    public h3.b f7440f;

    public r0() {
        this.f7439e = j();
    }

    private static WindowInsets j() {
        if (!f7437h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f7437h = true;
        }
        Field field = g;
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
        if (!j) {
            try {
                f7438i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            j = true;
        }
        Constructor constructor = f7438i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // o3.y0
    public k1 b() {
        a();
        k1 c10 = k1.c(this.f7439e, null);
        h3.b[] bVarArr = this.f7452b;
        h1 h1Var = c10.f7415a;
        h1Var.w(bVarArr);
        h1Var.z(this.f7440f);
        h1Var.v(null);
        h1Var.B(this.f7453c);
        h1Var.C(this.f7454d);
        return c10;
    }

    @Override // o3.y0
    public void f(h3.b bVar) {
        this.f7440f = bVar;
    }

    @Override // o3.y0
    public void h(h3.b bVar) {
        WindowInsets windowInsets = this.f7439e;
        if (windowInsets != null) {
            this.f7439e = windowInsets.replaceSystemWindowInsets(bVar.f4443a, bVar.f4444b, bVar.f4445c, bVar.f4446d);
        }
    }

    public r0(k1 k1Var) {
        super(k1Var);
        this.f7439e = k1Var.b();
    }
}
