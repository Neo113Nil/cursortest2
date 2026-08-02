package I;

/* loaded from: classes.dex */
public final class o0 implements H0.g {

    /* renamed from: e, reason: collision with root package name */
    public final o0 f696e;

    /* renamed from: f, reason: collision with root package name */
    public final P f697f;

    public o0(o0 o0Var, P p2) {
        Q0.h.e(p2, "instance");
        this.f696e = o0Var;
        this.f697f = p2;
    }

    public final void c(P p2) {
        if (this.f697f == p2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        o0 o0Var = this.f696e;
        if (o0Var != null) {
            o0Var.c(p2);
        }
    }

    @Override // H0.i
    public final H0.i d(H0.h hVar) {
        return i1.a.v(this, hVar);
    }

    @Override // H0.g
    public final H0.h getKey() {
        return n0.f693e;
    }

    @Override // H0.i
    public final H0.i i(H0.i iVar) {
        Q0.h.e(iVar, "context");
        return iVar == H0.j.f503e ? this : (H0.i) iVar.m(this, H0.b.f498h);
    }

    @Override // H0.i
    public final H0.g k(H0.h hVar) {
        return i1.a.m(this, hVar);
    }

    @Override // H0.i
    public final Object m(Object obj, P0.p pVar) {
        return pVar.h(obj, this);
    }
}
