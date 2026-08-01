package k1;

import android.graphics.RectF;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends v {

    /* renamed from: f, reason: collision with root package name */
    public final g f5356f;

    public y(g gVar) {
        this.f5356f = gVar;
    }

    @Override // k1.v
    public final j1.c i() {
        g gVar = this.f5356f;
        if (gVar.f5322b == null) {
            gVar.f5322b = new RectF();
        }
        RectF rectF = gVar.f5322b;
        rectF.getClass();
        gVar.f5321a.computeBounds(rectF, true);
        return new j1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
