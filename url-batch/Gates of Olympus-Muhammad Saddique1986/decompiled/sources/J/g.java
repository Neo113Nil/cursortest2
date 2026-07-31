package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class g extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final g f3130c = new g(0, 1, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        f2.j.d(mVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) c0014o.e(0)) {
            mVar.f(obj);
        }
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "nodes" : super.c(i3);
    }
}
