package m0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import h0.a0;

/* renamed from: m0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0230B extends a0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3119f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3120g = true;
    public static boolean h = true;
    public static boolean i = true;

    @Override // h0.a0
    public void s(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.s(view, i2);
        } else if (i) {
            try {
                AbstractC0229A.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void w(View view, int i2, int i3, int i4, int i5) {
        if (h) {
            try {
                z.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void x(View view, Matrix matrix) {
        if (f3119f) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3119f = false;
            }
        }
    }

    public void y(View view, Matrix matrix) {
        if (f3120g) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3120g = false;
            }
        }
    }
}
