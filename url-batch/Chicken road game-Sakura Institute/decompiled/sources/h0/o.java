package h0;

import g0.a2;
import g0.y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o f4629c = new o(0, 3, 1);

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        y1 y1Var = (y1) pVar.e(1);
        g0.c cVar = (g0.c) pVar.e(0);
        c cVar2 = (c) pVar.e(2);
        a2 w4 = y1Var.w();
        try {
            if (!cVar2.f4603h.W()) {
                g0.d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            cVar2.f4602g.V(bVar, w4, tVar);
            w4.e(true);
            a2Var.d();
            cVar.getClass();
            a2Var.t(y1Var, y1Var.a(cVar));
            a2Var.j();
        } catch (Throwable th) {
            w4.e(false);
            throw th;
        }
    }

    @Override // h0.c0
    public final String c(int i7) {
        return i7 == 0 ? "anchor" : i7 == 1 ? "from" : i7 == 2 ? "fixups" : super.c(i7);
    }
}
