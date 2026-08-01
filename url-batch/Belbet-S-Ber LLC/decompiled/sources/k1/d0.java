package k1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class d0 extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f2309o = true;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f2310p = true;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f2311q = true;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f2312r = true;

    @Override // b4.d
    public void U(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.U(view, i);
        } else if (f2312r) {
            try {
                c0.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2312r = false;
            }
        }
    }

    public void Z(View view, int i, int i4, int i5, int i6) {
        if (f2311q) {
            try {
                b0.a(view, i, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f2311q = false;
            }
        }
    }

    public void a0(View view, Matrix matrix) {
        if (f2309o) {
            try {
                a0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2309o = false;
            }
        }
    }

    public void b0(View view, Matrix matrix) {
        if (f2310p) {
            try {
                a0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2310p = false;
            }
        }
    }
}
