package u0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import j.C0542p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class H implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final H f9191a = new H();

    public final boolean onClearTranslation(View view) {
        InterfaceC0422a interfaceC0422a;
        f2.j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C1123s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4573j = 1;
        C0542p f3 = contentCaptureManager$ui_release.f();
        Object[] objArr = f3.f6304c;
        long[] jArr = f3.f6302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            A0.i iVar = ((J0) objArr[(i3 << 3) + i5]).f9202a.f142d;
                            A0.v vVar = A0.s.f188w;
                            LinkedHashMap linkedHashMap = iVar.f129d;
                            Object obj = linkedHashMap.get(vVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(A0.h.f114l);
                                A0.a aVar = (A0.a) (obj2 != null ? obj2 : null);
                                if (aVar != null && (interfaceC0422a = (InterfaceC0422a) aVar.f89b) != null) {
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
        InterfaceC0424c interfaceC0424c;
        f2.j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C1123s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4573j = 1;
        C0542p f3 = contentCaptureManager$ui_release.f();
        Object[] objArr = f3.f6304c;
        long[] jArr = f3.f6302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            A0.i iVar = ((J0) objArr[(i3 << 3) + i5]).f9202a.f142d;
                            A0.v vVar = A0.s.f188w;
                            LinkedHashMap linkedHashMap = iVar.f129d;
                            Object obj = linkedHashMap.get(vVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (f2.j.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(A0.h.f113k);
                                A0.a aVar = (A0.a) (obj2 != null ? obj2 : null);
                                if (aVar != null && (interfaceC0424c = (InterfaceC0424c) aVar.f89b) != null) {
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
        InterfaceC0424c interfaceC0424c;
        f2.j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        W.c contentCaptureManager$ui_release = ((C1123s) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f4573j = 2;
        C0542p f3 = contentCaptureManager$ui_release.f();
        Object[] objArr = f3.f6304c;
        long[] jArr = f3.f6302a;
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
                        A0.i iVar = ((J0) objArr[(i3 << 3) + i5]).f9202a.f142d;
                        A0.v vVar = A0.s.f188w;
                        LinkedHashMap linkedHashMap = iVar.f129d;
                        Object obj = linkedHashMap.get(vVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (f2.j.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(A0.h.f113k);
                            A0.a aVar = (A0.a) (obj2 != null ? obj2 : null);
                            if (aVar != null && (interfaceC0424c = (InterfaceC0424c) aVar.f89b) != null) {
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
