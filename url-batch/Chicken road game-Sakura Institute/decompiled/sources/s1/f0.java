package s1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8211a = new f0();

    public final boolean onClearTranslation(View view) {
        q6.a aVar;
        r6.k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        u0.c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f8952l = 1;
        i.p d8 = contentCaptureManager$ui_release.d();
        Object[] objArr = d8.f4772c;
        long[] jArr = d8.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            LinkedHashMap linkedHashMap = ((g2) objArr[(i7 << 3) + i9]).f8236a.f9840d.f9832f;
                            Object obj = linkedHashMap.get(y1.p.f9881w);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(y1.h.f9817l);
                                y1.a aVar2 = (y1.a) (obj2 != null ? obj2 : null);
                                if (aVar2 != null && (aVar = (q6.a) aVar2.f9794b) != null) {
                                }
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        q6.c cVar;
        r6.k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        u0.c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f8952l = 1;
        i.p d8 = contentCaptureManager$ui_release.d();
        Object[] objArr = d8.f4772c;
        long[] jArr = d8.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            LinkedHashMap linkedHashMap = ((g2) objArr[(i7 << 3) + i9]).f8236a.f9840d.f9832f;
                            Object obj = linkedHashMap.get(y1.p.f9881w);
                            if (obj == null) {
                                obj = null;
                            }
                            if (r6.k.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(y1.h.f9816k);
                                y1.a aVar = (y1.a) (obj2 != null ? obj2 : null);
                                if (aVar != null && (cVar = (q6.c) aVar.f9794b) != null) {
                                }
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        q6.c cVar;
        r6.k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        u0.c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f8952l = 2;
        i.p d8 = contentCaptureManager$ui_release.d();
        Object[] objArr = d8.f4772c;
        long[] jArr = d8.f4770a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j8) < 128) {
                        LinkedHashMap linkedHashMap = ((g2) objArr[(i7 << 3) + i9]).f8236a.f9840d.f9832f;
                        Object obj = linkedHashMap.get(y1.p.f9881w);
                        if (obj == null) {
                            obj = null;
                        }
                        if (r6.k.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(y1.h.f9816k);
                            y1.a aVar = (y1.a) (obj2 != null ? obj2 : null);
                            if (aVar != null && (cVar = (q6.c) aVar.f9794b) != null) {
                            }
                        }
                    }
                    j8 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
