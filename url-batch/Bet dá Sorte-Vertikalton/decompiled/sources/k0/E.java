package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class E extends z {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2717e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2718f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2719g = true;

    @Override // k0.z
    public void p(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.p(view, i);
        } else if (f2719g) {
            try {
                D.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2719g = false;
            }
        }
    }

    public void q(View view, int i, int i2, int i3, int i4) {
        if (f2718f) {
            try {
                C.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2718f = false;
            }
        }
    }

    public void r(View view, Matrix matrix) {
        if (d) {
            try {
                B.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void s(View view, Matrix matrix) {
        if (f2717e) {
            try {
                B.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2717e = false;
            }
        }
    }
}
