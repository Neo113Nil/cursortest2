package i2;

import a2.o;
import android.text.TextPaint;
import java.util.ArrayList;
import z0.o0;
import z0.p;
import z0.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4884a = new k(false);

    public static final void a(o oVar, r rVar, p pVar, float f9, o0 o0Var, l2.j jVar, b1.f fVar) {
        ArrayList arrayList = oVar.f431h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a2.r rVar2 = (a2.r) arrayList.get(i7);
            rVar2.f440a.g(rVar, pVar, f9, o0Var, jVar, fVar);
            rVar.k(0.0f, rVar2.f440a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f9) {
        if (Float.isNaN(f9)) {
            return;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f9 * 255));
    }
}
