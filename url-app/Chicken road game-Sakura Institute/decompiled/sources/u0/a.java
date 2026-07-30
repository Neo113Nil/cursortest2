package u0;

import a2.g;
import a8.d;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.room.b0;
import b2.l;
import java.util.List;
import java.util.function.Consumer;
import r6.k;
import s1.g2;
import y1.h;
import y1.m;
import y1.p;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8940a = new a();

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
        g2 g2Var;
        m mVar;
        q6.c cVar2;
        int i7 = 0;
        while (i7 < longSparseArray.size()) {
            int i8 = i7 + 1;
            long keyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse k8 = l.k(longSparseArray.get(keyAt));
            if (k8 != null && value != null && text != null && (g2Var = (g2) cVar.d().f((int) keyAt)) != null && (mVar = g2Var.f8236a) != null) {
                Object obj = mVar.f9840d.f9832f.get(h.f9815j);
                if (obj == null) {
                    obj = null;
                }
                y1.a aVar = (y1.a) obj;
                if (aVar != null && (cVar2 = (q6.c) aVar.f9794b) != null) {
                }
            }
            i7 = i8;
        }
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        m mVar;
        AutofillId autofillId;
        String E;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j8 : jArr) {
            g2 g2Var = (g2) cVar.d().f((int) j8);
            if (g2Var != null && (mVar = g2Var.f8236a) != null) {
                l.n();
                autofillId = cVar.f8946f.getAutofillId();
                ViewTranslationRequest.Builder i7 = l.i(autofillId, mVar.f9843g);
                Object obj = mVar.f9840d.f9832f.get(p.f9879u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (E = d.E(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new g(E, null, 6));
                    i7.setValue("android:text", forText);
                    build = i7.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(c cVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f8946f.post(new b0(cVar, 7, longSparseArray));
        }
    }
}
