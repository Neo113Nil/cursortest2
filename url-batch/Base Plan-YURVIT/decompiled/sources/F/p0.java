package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class p0 implements G0.g {

    /* renamed from: e, reason: collision with root package name */
    public final p0 f419e;

    /* renamed from: f, reason: collision with root package name */
    public final P f420f;

    public p0(p0 p0Var, P p2) {
        this.f419e = p0Var;
        this.f420f = p2;
    }

    public final void c(P p2) {
        if (this.f420f == p2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        p0 p0Var = this.f419e;
        if (p0Var != null) {
            p0Var.c(p2);
        }
    }

    @Override // G0.g
    public final G0.h getKey() {
        return o0.f416e;
    }

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
}
