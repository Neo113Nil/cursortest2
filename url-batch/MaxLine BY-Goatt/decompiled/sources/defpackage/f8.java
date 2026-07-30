package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f8 implements ViewTranslationCallback {
    public static final f8 a = new f8();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        v8 contentCaptureManager$ui_release = ((t7) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.r = s8.m;
        q31 e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
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
                        tn1 tn1Var = ((di2) objArr[(i << 3) + i3]).a.d.m;
                        Object g = tn1Var.g(gi2.C);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = tn1Var.g(rh2.m);
                            r1 r1Var = (r1) (g2 != null ? g2 : null);
                            if (r1Var != null && (function0 = (Function0) r1Var.b) != null) {
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
        v8 contentCaptureManager$ui_release = ((t7) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.r = s8.m;
        q31 e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
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
                        tn1 tn1Var = ((di2) objArr[(i << 3) + i3]).a.d.m;
                        Object g = tn1Var.g(gi2.C);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.b(g, Boolean.TRUE)) {
                            Object g2 = tn1Var.g(rh2.l);
                            r1 r1Var = (r1) (g2 != null ? g2 : null);
                            if (r1Var != null && (function1 = (Function1) r1Var.b) != null) {
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
        v8 contentCaptureManager$ui_release = ((t7) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.r = s8.n;
        q31 e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
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
                        tn1 tn1Var = ((di2) objArr[(i << 3) + i3]).a.d.m;
                        Object g = tn1Var.g(gi2.C);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.b(g, Boolean.FALSE)) {
                            Object g2 = tn1Var.g(rh2.l);
                            r1 r1Var = (r1) (g2 != null ? g2 : null);
                            if (r1Var != null && (function1 = (Function1) r1Var.b) != null) {
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
