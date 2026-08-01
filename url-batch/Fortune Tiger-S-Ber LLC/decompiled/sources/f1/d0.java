package f1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class d0 extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1659k = true;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1660l = true;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f1661m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f1662n = true;

    @Override // k3.m
    public void V(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.V(view, i4);
        } else if (f1662n) {
            try {
                c0.a(view, i4);
            } catch (NoSuchMethodError unused) {
                f1662n = false;
            }
        }
    }

    public void W(View view, int i4, int i5, int i6, int i7) {
        if (f1661m) {
            try {
                b0.a(view, i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f1661m = false;
            }
        }
    }

    public void X(View view, Matrix matrix) {
        if (f1659k) {
            try {
                a0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1659k = false;
            }
        }
    }

    public void Y(View view, Matrix matrix) {
        if (f1660l) {
            try {
                a0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1660l = false;
            }
        }
    }
}
