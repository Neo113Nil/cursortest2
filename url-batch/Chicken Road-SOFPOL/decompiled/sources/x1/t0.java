package x1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t0 extends y0.l implements a2.a {

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup f8589r;

    @Override // a2.a
    public final Object G(w1.d1 d1Var, a2.b bVar, i6.i iVar) {
        long O0 = d1Var.O0(0L);
        e1.c cVar = (e1.c) bVar.b();
        e1.c e8 = cVar != null ? cVar.e(O0) : null;
        if (e8 != null) {
            this.f8589r.requestRectangleOnScreen(f1.p.s(e8), false);
        }
        return c6.m.f1757a;
    }
}
