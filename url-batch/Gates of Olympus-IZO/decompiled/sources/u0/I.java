package u0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import j.C0498p;
import java.util.LinkedHashMap;
import z0.C1076a;

/* loaded from: classes.dex */
public final class I implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final I f8180a = new I();

    public final boolean onClearTranslation(View view) {
        Y1.a aVar;
        Z1.i.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C0997t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f3379j = 1;
        C0498p d3 = contentCaptureManager$ui_release.d();
        Object[] objArr = d3.f5186c;
        long[] jArr = d3.f5184a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            z0.i iVar = ((C1010z0) objArr[(i3 << 3) + i5]).f8507a.f8991d;
                            z0.t tVar = z0.q.f9030v;
                            LinkedHashMap linkedHashMap = iVar.f8982d;
                            Object obj = linkedHashMap.get(tVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(z0.h.f8968l);
                                C1076a c1076a = (C1076a) (obj2 != null ? obj2 : null);
                                if (c1076a != null && (aVar = (Y1.a) c1076a.f8943b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Y1.c cVar;
        Z1.i.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C0997t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f3379j = 1;
        C0498p d3 = contentCaptureManager$ui_release.d();
        Object[] objArr = d3.f5186c;
        long[] jArr = d3.f5184a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            z0.i iVar = ((C1010z0) objArr[(i3 << 3) + i5]).f8507a.f8991d;
                            z0.t tVar = z0.q.f9030v;
                            LinkedHashMap linkedHashMap = iVar.f8982d;
                            Object obj = linkedHashMap.get(tVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (Z1.i.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(z0.h.f8967k);
                                C1076a c1076a = (C1076a) (obj2 != null ? obj2 : null);
                                if (c1076a != null && (cVar = (Y1.c) c1076a.f8943b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Y1.c cVar;
        Z1.i.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C0997t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f3379j = 2;
        C0498p d3 = contentCaptureManager$ui_release.d();
        Object[] objArr = d3.f5186c;
        long[] jArr = d3.f5184a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        z0.i iVar = ((C1010z0) objArr[(i3 << 3) + i5]).f8507a.f8991d;
                        z0.t tVar = z0.q.f9030v;
                        LinkedHashMap linkedHashMap = iVar.f8982d;
                        Object obj = linkedHashMap.get(tVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (Z1.i.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(z0.h.f8967k);
                            C1076a c1076a = (C1076a) (obj2 != null ? obj2 : null);
                            if (c1076a != null && (cVar = (Y1.c) c1076a.f8943b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
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
