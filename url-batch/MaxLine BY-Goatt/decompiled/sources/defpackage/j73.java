package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j73 extends q73 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public z21 f;

    public j73() {
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

    @Override // defpackage.q73
    public c83 b() {
        a();
        c83 c = c83.c(null, this.e);
        z21[] z21VarArr = this.b;
        z73 z73Var = c.a;
        z73Var.v(z21VarArr);
        z73Var.x(this.f);
        z73Var.u(null);
        z73Var.z(this.c);
        z73Var.A(this.d);
        return c;
    }

    @Override // defpackage.q73
    public void f(z21 z21Var) {
        this.f = z21Var;
    }

    @Override // defpackage.q73
    public void h(z21 z21Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(z21Var.a, z21Var.b, z21Var.c, z21Var.d);
        }
    }

    public j73(c83 c83Var) {
        super(c83Var);
        this.e = c83Var.b();
    }
}
