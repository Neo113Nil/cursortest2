package U;

import A0.C0036g;
import B0.m;
import B1.o;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.K0;
import y0.C1317a;
import y0.h;
import y0.n;
import y0.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4059a = new a();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        K0 k02;
        n nVar;
        Function1 function1;
        int i2 = 0;
        while (i2 < longSparseArray.size()) {
            int i4 = i2 + 1;
            long keyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse k4 = m.k(longSparseArray.get(keyAt));
            if (k4 != null && value != null && text != null && (k02 = (K0) cVar.e().f((int) keyAt)) != null && (nVar = k02.f10067a) != null) {
                Object obj = nVar.f11587d.f11576d.get(h.f11559j);
                if (obj == null) {
                    obj = null;
                }
                C1317a c1317a = (C1317a) obj;
                if (c1317a != null && (function1 = (Function1) c1317a.f11536b) != null) {
                }
            }
            i2 = i4;
        }
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        n nVar;
        String x2;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j4 : jArr) {
            K0 k02 = (K0) cVar.e().f((int) j4);
            if (k02 != null && (nVar = k02.f10067a) != null) {
                m.m();
                ViewTranslationRequest.Builder i2 = m.i(cVar.f4065d.getAutofillId(), nVar.f11590g);
                Object obj = nVar.f11587d.f11576d.get(q.f11632u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (x2 = j0.c.x(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new C0036g(x2, null, 6));
                    i2.setValue("android:text", forText);
                    build = i2.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(c cVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f4065d.post(new o(cVar, 1, longSparseArray));
        }
    }
}
