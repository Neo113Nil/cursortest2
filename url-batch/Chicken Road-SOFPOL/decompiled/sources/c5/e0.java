package c5;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class e0 extends a.a {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1662k = true;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1663l = true;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f1664m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f1665n = true;

    public void E(View view, int i, int i8, int i9, int i10) {
        if (f1664m) {
            try {
                c0.a(view, i, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f1664m = false;
            }
        }
    }

    public void F(View view, Matrix matrix) {
        if (f1662k) {
            try {
                b0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1662k = false;
            }
        }
    }

    public void G(View view, Matrix matrix) {
        if (f1663l) {
            try {
                b0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1663l = false;
            }
        }
    }

    @Override // a.a
    public void z(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(view, i);
        } else if (f1665n) {
            try {
                d0.a(view, i);
            } catch (NoSuchMethodError unused) {
                f1665n = false;
            }
        }
    }
}
