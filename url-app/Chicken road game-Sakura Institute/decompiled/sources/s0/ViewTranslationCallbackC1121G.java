package s0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y0.C1317a;

/* renamed from: s0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTranslationCallbackC1121G implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewTranslationCallbackC1121G f10051a = new ViewTranslationCallbackC1121G();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        U.c contentCaptureManager$ui_release = ((C1166s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4071m = 1;
        i.q e4 = contentCaptureManager$ui_release.e();
        Object[] objArr = e4.f6942c;
        long[] jArr = e4.f6940a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            y0.i iVar = ((K0) objArr[(i2 << 3) + i5]).f10067a.f11587d;
                            y0.t tVar = y0.q.f11634w;
                            LinkedHashMap linkedHashMap = iVar.f11576d;
                            Object obj = linkedHashMap.get(tVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(y0.h.f11561l);
                                C1317a c1317a = (C1317a) (obj2 != null ? obj2 : null);
                                if (c1317a != null && (function0 = (Function0) c1317a.f11536b) != null) {
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        U.c contentCaptureManager$ui_release = ((C1166s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4071m = 1;
        i.q e4 = contentCaptureManager$ui_release.e();
        Object[] objArr = e4.f6942c;
        long[] jArr = e4.f6940a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            y0.i iVar = ((K0) objArr[(i2 << 3) + i5]).f10067a.f11587d;
                            y0.t tVar = y0.q.f11634w;
                            LinkedHashMap linkedHashMap = iVar.f11576d;
                            Object obj = linkedHashMap.get(tVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (Intrinsics.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(y0.h.f11560k);
                                C1317a c1317a = (C1317a) (obj2 != null ? obj2 : null);
                                if (c1317a != null && (function1 = (Function1) c1317a.f11536b) != null) {
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        U.c contentCaptureManager$ui_release = ((C1166s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4071m = 2;
        i.q e4 = contentCaptureManager$ui_release.e();
        Object[] objArr = e4.f6942c;
        long[] jArr = e4.f6940a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j4) < 128) {
                        y0.i iVar = ((K0) objArr[(i2 << 3) + i5]).f10067a.f11587d;
                        y0.t tVar = y0.q.f11634w;
                        LinkedHashMap linkedHashMap = iVar.f11576d;
                        Object obj = linkedHashMap.get(tVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(y0.h.f11560k);
                            C1317a c1317a = (C1317a) (obj2 != null ? obj2 : null);
                            if (c1317a != null && (function1 = (Function1) c1317a.f11536b) != null) {
                            }
                        }
                    }
                    j4 >>= 8;
                }
                if (i4 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }
}
