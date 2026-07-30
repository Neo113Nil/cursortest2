package D;

/* loaded from: classes.dex */
public final class q0 implements w0.g {

    /* renamed from: e, reason: collision with root package name */
    public final q0 f256e;

    /* renamed from: f, reason: collision with root package name */
    public final S f257f;

    public q0(q0 q0Var, S s2) {
        F0.i.e(s2, "instance");
        this.f256e = q0Var;
        this.f257f = s2;
    }

    public final void c(S s2) {
        if (this.f257f == s2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        q0 q0Var = this.f256e;
        if (q0Var != null) {
            q0Var.c(s2);
        }
    }

    @Override // w0.i
    public final w0.g f(w0.h hVar) {
        return o.g.m(this, hVar);
    }

    @Override // w0.g
    public final w0.h getKey() {
        return p0.f254e;
    }

    @Override // w0.i
    public final Object h(Object obj, E0.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // w0.i
    public final w0.i i(w0.h hVar) {
        return o.g.u(this, hVar);
    }

    @Override // w0.i
    public final w0.i k(w0.i iVar) {
        F0.i.e(iVar, "context");
        return iVar == w0.j.f3082e ? this : (w0.i) iVar.h(this, new w0.b(1));
    }
}
