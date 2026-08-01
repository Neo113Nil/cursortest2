package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class x90 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public abstract int a(View view, int i);

    public abstract int b(View view, int i);

    public float c(View view) {
        if (a) {
            try {
                return w90.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public int d(View view) {
        return 0;
    }

    public int e() {
        return 0;
    }

    public abstract void g(int i);

    public abstract void h(View view, int i, int i2);

    public abstract void i(View view, float f, float f2);

    public void j(View view, float f) {
        if (a) {
            try {
                w90.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract boolean k(View view, int i);

    public void f(View view, int i) {
    }
}
