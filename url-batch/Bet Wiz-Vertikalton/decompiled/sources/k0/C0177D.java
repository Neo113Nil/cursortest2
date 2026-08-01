package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: k0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0177D extends k {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2730e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2731f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2732g = true;

    @Override // k0.k
    public void s(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.s(view, i);
        } else if (f2732g) {
            try {
                AbstractC0176C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2732g = false;
            }
        }
    }

    public void u(View view, int i, int i2, int i3, int i4) {
        if (f2731f) {
            try {
                AbstractC0175B.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2731f = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (d) {
            try {
                AbstractC0174A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f2730e) {
            try {
                AbstractC0174A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2730e = false;
            }
        }
    }
}
