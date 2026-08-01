package m0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import h.AbstractC0112a;

/* renamed from: m0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0253A extends AbstractC0112a {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3225e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3226f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3227g = true;

    @Override // h.AbstractC0112a
    public void s(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.s(view, i);
        } else if (f3227g) {
            try {
                z.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3227g = false;
            }
        }
    }

    public void v(View view, int i, int i2, int i3, int i4) {
        if (f3226f) {
            try {
                y.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3226f = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (d) {
            try {
                x.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void x(View view, Matrix matrix) {
        if (f3225e) {
            try {
                x.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3225e = false;
            }
        }
    }
}
