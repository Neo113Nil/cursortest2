package D0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class D extends com.bumptech.glide.f {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f575d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f576e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f577f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f578g = true;

    @Override // com.bumptech.glide.f
    public void p(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.p(view, i);
        } else if (f578g) {
            try {
                C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f578g = false;
            }
        }
    }

    public void u(View view, int i, int i4, int i9, int i10) {
        if (f577f) {
            try {
                B.a(view, i, i4, i9, i10);
            } catch (NoSuchMethodError unused) {
                f577f = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (f575d) {
            try {
                A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f575d = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f576e) {
            try {
                A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f576e = false;
            }
        }
    }
}
