package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m4 implements ViewTranslationCallback {
    public static final m4 a = new m4();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        z4 contentCaptureManager$ui = ((d4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = w4.d;
        q90 h = contentCaptureManager$ui.h();
        Object[] objArr = h.c;
        long[] jArr = h.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        vn0 vn0Var = ((n81) objArr[(i << 3) + i3]).a.d.d;
                        Object g = vn0Var.g(p81.B);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = vn0Var.g(g81.n);
                            z0 z0Var = (z0) (g2 != null ? g2 : null);
                            if (z0Var != null && (function0 = (Function0) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        z4 contentCaptureManager$ui = ((d4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = w4.d;
        q90 h = contentCaptureManager$ui.h();
        Object[] objArr = h.c;
        long[] jArr = h.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        vn0 vn0Var = ((n81) objArr[(i << 3) + i3]).a.d.d;
                        Object g = vn0Var.g(p81.B);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.a(g, Boolean.TRUE)) {
                            Object g2 = vn0Var.g(g81.m);
                            z0 z0Var = (z0) (g2 != null ? g2 : null);
                            if (z0Var != null && (function1 = (Function1) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        z4 contentCaptureManager$ui = ((d4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = w4.e;
        q90 h = contentCaptureManager$ui.h();
        Object[] objArr = h.c;
        long[] jArr = h.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        vn0 vn0Var = ((n81) objArr[(i << 3) + i3]).a.d.d;
                        Object g = vn0Var.g(p81.B);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.a(g, Boolean.FALSE)) {
                            Object g2 = vn0Var.g(g81.m);
                            z0 z0Var = (z0) (g2 != null ? g2 : null);
                            if (z0Var != null && (function1 = (Function1) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
