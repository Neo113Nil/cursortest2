package t2;

import android.text.TextPaint;
import m2.h0;
import m2.r;
import m2.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9251a = new j(false);

    public static final boolean a(h0 h0Var) {
        r rVar;
        s sVar = h0Var.f6483c;
        m2.h hVar = (sVar == null || (rVar = sVar.f6513a) == null) ? null : new m2.h(rVar.f6512b);
        boolean z10 = false;
        if (hVar != null && hVar.f6479a == 1) {
            z10 = true;
        }
        return !z10;
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
