package j1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class d0 extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1897k = true;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1898l = true;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f1899m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f1900n = true;

    @Override // h.a
    public void n0(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.n0(view, i);
        } else if (f1900n) {
            try {
                c0.a(view, i);
            } catch (NoSuchMethodError unused) {
                f1900n = false;
            }
        }
    }

    public void t0(View view, int i, int i4, int i5, int i6) {
        if (f1899m) {
            try {
                b0.a(view, i, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f1899m = false;
            }
        }
    }

    public void u0(View view, Matrix matrix) {
        if (f1897k) {
            try {
                a0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1897k = false;
            }
        }
    }

    public void v0(View view, Matrix matrix) {
        if (f1898l) {
            try {
                a0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1898l = false;
            }
        }
    }
}
