package l0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: l0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0250C extends h1.d {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3032f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3033g = true;
    public static boolean h = true;
    public static boolean i = true;

    @Override // h1.d
    public void q(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.q(view, i2);
        } else if (i) {
            try {
                AbstractC0249B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
        if (h) {
            try {
                AbstractC0248A.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void u(View view, Matrix matrix) {
        if (f3032f) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3032f = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (f3033g) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3033g = false;
            }
        }
    }
}
