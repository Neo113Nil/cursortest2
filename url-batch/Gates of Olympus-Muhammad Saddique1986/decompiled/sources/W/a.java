package W;

import A0.h;
import A0.p;
import A0.s;
import C0.C0031g;
import D0.n;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import e2.InterfaceC0424c;
import f2.j;
import h2.AbstractC0508a;
import java.util.List;
import java.util.function.Consumer;
import u0.J0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4561a = new a();

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
        J0 j02;
        p pVar;
        InterfaceC0424c interfaceC0424c;
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            int i4 = i3 + 1;
            long keyAt = longSparseArray.keyAt(i3);
            ViewTranslationResponse i5 = n.i(longSparseArray.get(keyAt));
            if (i5 != null && value != null && text != null && (j02 = (J0) cVar.f().f((int) keyAt)) != null && (pVar = j02.f9202a) != null) {
                Object obj = pVar.f142d.f129d.get(h.f112j);
                if (obj == null) {
                    obj = null;
                }
                A0.a aVar = (A0.a) obj;
                if (aVar != null && (interfaceC0424c = (InterfaceC0424c) aVar.f89b) != null) {
                }
            }
            i3 = i4;
        }
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        p pVar;
        AutofillId autofillId;
        String z3;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j3 : jArr) {
            J0 j02 = (J0) cVar.f().f((int) j3);
            if (j02 != null && (pVar = j02.f9202a) != null) {
                n.k();
                autofillId = cVar.f4567d.getAutofillId();
                ViewTranslationRequest.Builder g3 = n.g(autofillId, pVar.f145g);
                Object obj = pVar.f142d.f129d.get(s.f186u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (z3 = AbstractC0508a.z(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new C0031g(z3, null, 6));
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
        if (j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f4567d.post(new L1.h(cVar, 1, longSparseArray));
        }
    }
}
