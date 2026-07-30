package t;

import android.graphics.Rect;
import android.view.View;
import d6.z;
import r1.a1;
import r1.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f8728f;

    public h(l lVar) {
        this.f8728f = lVar;
    }

    @Override // t.a
    public final Object f0(a1 a1Var, q6.a aVar, j6.c cVar) {
        View v5 = r1.f.v(this.f8728f);
        long W = a1Var.W(0L);
        y0.d dVar = (y0.d) aVar.a();
        y0.d h3 = dVar != null ? dVar.h(W) : null;
        if (h3 != null) {
            v5.requestRectangleOnScreen(new Rect((int) h3.f9780a, (int) h3.f9781b, (int) h3.f9782c, (int) h3.f9783d), false);
        }
        return z.f2639a;
    }
}
