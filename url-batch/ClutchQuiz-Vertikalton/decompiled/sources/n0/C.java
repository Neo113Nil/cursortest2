package n0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class C extends h0.g {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3115g = true;
    public static boolean h = true;
    public static boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f3116j = true;

    @Override // h0.g
    public void m(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.m(view, i2);
        } else if (f3116j) {
            try {
                B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f3116j = false;
            }
        }
    }

    public void q(View view, int i2, int i3, int i4, int i5) {
        if (i) {
            try {
                AbstractC0257A.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void r(View view, Matrix matrix) {
        if (f3115g) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3115g = false;
            }
        }
    }

    public void s(View view, Matrix matrix) {
        if (h) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
