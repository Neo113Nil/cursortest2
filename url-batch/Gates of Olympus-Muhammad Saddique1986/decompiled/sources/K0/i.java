package K0;

import C0.o;
import android.text.TextPaint;
import b0.AbstractC0347p;
import b0.P;
import b0.r;
import d0.AbstractC0404e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3254a = new j(false);

    public static final void a(o oVar, r rVar, AbstractC0347p abstractC0347p, float f3, P p3, N0.j jVar, AbstractC0404e abstractC0404e, int i3) {
        ArrayList arrayList = oVar.f625h;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0.r rVar2 = (C0.r) arrayList.get(i4);
            rVar2.f634a.g(rVar, abstractC0347p, f3, p3, jVar, abstractC0404e, i3);
            rVar.s(0.0f, rVar2.f634a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
