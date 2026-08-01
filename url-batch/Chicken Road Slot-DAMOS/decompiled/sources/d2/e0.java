package d2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f3404a = new e0();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        f1.e contentCaptureManager$ui = ((v) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f4050t = f1.a.f4037d;
        s.k f3 = contentCaptureManager$ui.f();
        Object[] objArr = f3.f8338c;
        long[] jArr = f3.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        s.h0 h0Var = ((j2.n) objArr[(i3 << 3) + i11]).f4986a.f4983d.f4975d;
                        Object g = h0Var.g(j2.q.C);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = h0Var.g(j2.i.f4961m);
                            j2.a aVar = (j2.a) (g2 != null ? g2 : null);
                            if (aVar != null && (function0 = (Function0) aVar.f4929b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        f1.e contentCaptureManager$ui = ((v) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f4050t = f1.a.f4037d;
        s.k f3 = contentCaptureManager$ui.f();
        Object[] objArr = f3.f8338c;
        long[] jArr = f3.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        s.h0 h0Var = ((j2.n) objArr[(i3 << 3) + i11]).f4986a.f4983d.f4975d;
                        Object g = h0Var.g(j2.q.C);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.a(g, Boolean.TRUE)) {
                            Object g2 = h0Var.g(j2.i.f4960l);
                            j2.a aVar = (j2.a) (g2 != null ? g2 : null);
                            if (aVar != null && (function1 = (Function1) aVar.f4929b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        f1.e contentCaptureManager$ui = ((v) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f4050t = f1.a.f4038e;
        s.k f3 = contentCaptureManager$ui.f();
        Object[] objArr = f3.f8338c;
        long[] jArr = f3.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        s.h0 h0Var = ((j2.n) objArr[(i3 << 3) + i11]).f4986a.f4983d.f4975d;
                        Object g = h0Var.g(j2.q.C);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.a(g, Boolean.FALSE)) {
                            Object g2 = h0Var.g(j2.i.f4960l);
                            j2.a aVar = (j2.a) (g2 != null ? g2 : null);
                            if (aVar != null && (function1 = (Function1) aVar.f4929b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }
}
