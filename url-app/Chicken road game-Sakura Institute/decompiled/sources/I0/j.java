package I0;

import A0.o;
import Z.AbstractC0319p;
import Z.O;
import Z.r;
import android.text.TextPaint;
import b0.AbstractC0497e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f3373a = new k(false);

    public static final void a(o oVar, r rVar, AbstractC0319p abstractC0319p, float f4, O o4, L0.j jVar, AbstractC0497e abstractC0497e, int i2) {
        ArrayList arrayList = oVar.f357h;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            A0.r rVar2 = (A0.r) arrayList.get(i4);
            rVar2.f366a.g(rVar, abstractC0319p, f4, o4, jVar, abstractC0497e, i2);
            rVar.q(0.0f, rVar2.f366a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f4) {
        if (Float.isNaN(f4)) {
            return;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f4 * 255));
    }
}
