package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: k0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0178D extends k {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2681e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2682f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2683g = true;

    @Override // k0.k
    public void t(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.t(view, i);
        } else if (f2683g) {
            try {
                AbstractC0177C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2683g = false;
            }
        }
    }

    public void w(View view, int i, int i2, int i3, int i4) {
        if (f2682f) {
            try {
                AbstractC0176B.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2682f = false;
            }
        }
    }

    public void x(View view, Matrix matrix) {
        if (d) {
            try {
                AbstractC0175A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void y(View view, Matrix matrix) {
        if (f2681e) {
            try {
                AbstractC0175A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2681e = false;
            }
        }
    }
}
