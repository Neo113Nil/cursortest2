package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fe0 extends me0 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public er f;

    public fe0() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.me0
    public ye0 b() {
        a();
        ye0 g2 = ye0.g(null, this.e);
        er[] erVarArr = this.b;
        ve0 ve0Var = g2.a;
        ve0Var.u(erVarArr);
        ve0Var.w(this.f);
        ve0Var.t(null);
        ve0Var.y(this.c);
        ve0Var.z(this.d);
        return g2;
    }

    @Override // defpackage.me0
    public void f(er erVar) {
        this.f = erVar;
    }

    @Override // defpackage.me0
    public void h(er erVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(erVar.a, erVar.b, erVar.c, erVar.d);
        }
    }

    public fe0(ye0 ye0Var) {
        super(ye0Var);
        this.e = ye0Var.f();
    }
}
