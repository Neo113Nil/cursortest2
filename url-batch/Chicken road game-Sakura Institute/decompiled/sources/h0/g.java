package h0;

import g0.a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f4617c;

    static {
        int i7 = 1;
        f4617c = new g(0, i7, i7);
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        for (Object obj : (Object[]) pVar.e(0)) {
            bVar.h(obj);
        }
    }

    @Override // h0.c0
    public final String c(int i7) {
        return i7 == 0 ? "nodes" : super.c(i7);
    }
}
