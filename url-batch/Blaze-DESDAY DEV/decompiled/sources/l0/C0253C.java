package l0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: l0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0253C extends i0.g {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3059e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3060f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3061g = true;

    @Override // i0.g
    public void r(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.r(view, i);
        } else if (f3061g) {
            try {
                AbstractC0252B.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3061g = false;
            }
        }
    }

    public void u(View view, int i, int i2, int i3, int i4) {
        if (f3060f) {
            try {
                AbstractC0251A.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3060f = false;
            }
        }
    }

    public void v(View view, Matrix matrix) {
        if (d) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f3059e) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3059e = false;
            }
        }
    }
}
