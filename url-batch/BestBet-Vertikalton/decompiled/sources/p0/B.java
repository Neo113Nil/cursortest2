package p0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class B extends b1.g {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3624e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3625f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3626g = true;

    public void D(View view, int i, int i2, int i3, int i4) {
        if (f3625f) {
            try {
                z.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3625f = false;
            }
        }
    }

    public void E(View view, Matrix matrix) {
        if (d) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void F(View view, Matrix matrix) {
        if (f3624e) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3624e = false;
            }
        }
    }

    @Override // b1.g
    public void z(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(view, i);
        } else if (f3626g) {
            try {
                AbstractC0298A.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3626g = false;
            }
        }
    }
}
