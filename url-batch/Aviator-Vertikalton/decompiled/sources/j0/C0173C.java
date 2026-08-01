package j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: j0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0173C extends i1.r {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2870d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2871e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2872f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2873g = true;

    @Override // i1.r
    public void r(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.r(view, i);
        } else if (f2873g) {
            try {
                AbstractC0172B.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2873g = false;
            }
        }
    }

    public void u(View view, int i, int i2, int i3, int i4) {
        if (f2872f) {
            try {
                z.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2872f = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (f2870d) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2870d = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f2871e) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2871e = false;
            }
        }
    }
}
