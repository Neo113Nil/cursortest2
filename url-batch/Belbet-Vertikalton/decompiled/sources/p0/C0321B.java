package p0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: p0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0321B extends H1.l {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3789f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3790g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3791h = true;
    public static boolean i = true;

    @Override // H1.l
    public void f0(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f0(view, i2);
        } else if (i) {
            try {
                AbstractC0320A.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void k0(View view, int i2, int i3, int i4, int i5) {
        if (f3791h) {
            try {
                z.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f3791h = false;
            }
        }
    }

    public void l0(View view, Matrix matrix) {
        if (f3789f) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3789f = false;
            }
        }
    }

    public void m0(View view, Matrix matrix) {
        if (f3790g) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3790g = false;
            }
        }
    }
}
