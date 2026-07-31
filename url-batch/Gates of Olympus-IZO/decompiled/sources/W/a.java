package W;

import B0.C0007d;
import C0.k;
import D1.j;
import I2.d;
import Z1.i;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import u0.C1010z0;
import z0.C1076a;
import z0.h;
import z0.n;
import z0.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3367a = new a();

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
        C1010z0 c1010z0;
        n nVar;
        Y1.c cVar2;
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            int i4 = i3 + 1;
            long keyAt = longSparseArray.keyAt(i3);
            ViewTranslationResponse i5 = k.i(longSparseArray.get(keyAt));
            if (i5 != null && value != null && text != null && (c1010z0 = (C1010z0) cVar.d().f((int) keyAt)) != null && (nVar = c1010z0.f8507a) != null) {
                Object obj = nVar.f8991d.f8982d.get(h.f8966j);
                if (obj == null) {
                    obj = null;
                }
                C1076a c1076a = (C1076a) obj;
                if (c1076a != null && (cVar2 = (Y1.c) c1076a.f8943b) != null) {
                }
            }
            i3 = i4;
        }
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        n nVar;
        AutofillId autofillId;
        String w3;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j3 : jArr) {
            C1010z0 c1010z0 = (C1010z0) cVar.d().f((int) j3);
            if (c1010z0 != null && (nVar = c1010z0.f8507a) != null) {
                k.k();
                autofillId = cVar.f3373d.getAutofillId();
                ViewTranslationRequest.Builder g3 = k.g(autofillId, nVar.f8994g);
                Object obj = nVar.f8991d.f8982d.get(q.f9028t);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (w3 = d.w(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new C0007d(w3, null, null, null));
                    g3.setValue("android:text", forText);
                    build = g3.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(c cVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f3373d.post(new j(cVar, 1, longSparseArray));
        }
    }
}
