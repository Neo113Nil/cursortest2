package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: k0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0175D extends y {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2671e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2672f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2673g = true;

    @Override // k0.y
    public void m(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.m(view, i);
        } else if (f2673g) {
            try {
                AbstractC0174C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2673g = false;
            }
        }
    }

    public void n(View view, int i, int i2, int i3, int i4) {
        if (f2672f) {
            try {
                AbstractC0173B.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2672f = false;
            }
        }
    }

    public void o(View view, Matrix matrix) {
        if (d) {
            try {
                AbstractC0172A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void p(View view, Matrix matrix) {
        if (f2671e) {
            try {
                AbstractC0172A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2671e = false;
            }
        }
    }
}
