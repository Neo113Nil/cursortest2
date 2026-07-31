package W0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class k0 implements G0.g, G0.h {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f958e = new k0();

    @Override // G0.i
    public final Object h(Object obj, O0.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // G0.i
    public final G0.i i(G0.h hVar) {
        return AbstractC0086a.z(this, hVar);
    }

    @Override // G0.i
    public final G0.i j(G0.i iVar) {
        P0.h.e(iVar, "context");
        return iVar == G0.j.f500e ? this : (G0.i) iVar.h(this, new G0.b(1));
    }

    @Override // G0.i
    public final G0.g m(G0.h hVar) {
        return AbstractC0086a.p(this, hVar);
    }

    @Override // G0.g
    public final G0.h getKey() {
        return this;
    }
}
