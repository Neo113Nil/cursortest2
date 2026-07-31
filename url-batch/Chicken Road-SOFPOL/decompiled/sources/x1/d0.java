package x1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f8394a = new d0();

    public final boolean onClearTranslation(View view) {
        p6.a aVar;
        q6.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = a1.b.f189d;
        o.l g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5496c;
        long[] jArr = g3.f5494a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        o.j0 j0Var = ((d2.o) objArr[(i << 3) + i9]).f2163a.f2159d.f2150d;
                        Object g7 = j0Var.g(d2.s.B);
                        if (g7 == null) {
                            g7 = null;
                        }
                        if (g7 != null) {
                            Object g8 = j0Var.g(d2.i.f2136m);
                            d2.a aVar2 = (d2.a) (g8 != null ? g8 : null);
                            if (aVar2 != null && (aVar = (p6.a) aVar2.f2109b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
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
        p6.c cVar;
        q6.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = a1.b.f189d;
        o.l g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5496c;
        long[] jArr = g3.f5494a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        o.j0 j0Var = ((d2.o) objArr[(i << 3) + i9]).f2163a.f2159d.f2150d;
                        Object g7 = j0Var.g(d2.s.B);
                        if (g7 == null) {
                            g7 = null;
                        }
                        if (q6.i.a(g7, Boolean.TRUE)) {
                            Object g8 = j0Var.g(d2.i.f2135l);
                            d2.a aVar = (d2.a) (g8 != null ? g8 : null);
                            if (aVar != null && (cVar = (p6.c) aVar.f2109b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
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
        p6.c cVar;
        q6.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = a1.b.f190e;
        o.l g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5496c;
        long[] jArr = g3.f5494a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        o.j0 j0Var = ((d2.o) objArr[(i << 3) + i9]).f2163a.f2159d.f2150d;
                        Object g7 = j0Var.g(d2.s.B);
                        if (g7 == null) {
                            g7 = null;
                        }
                        if (q6.i.a(g7, Boolean.FALSE)) {
                            Object g8 = j0Var.g(d2.i.f2135l);
                            d2.a aVar = (d2.a) (g8 != null ? g8 : null);
                            if (aVar != null && (cVar = (p6.c) aVar.f2109b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
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
