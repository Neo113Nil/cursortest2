package e1;

/* loaded from: classes.dex */
public final class c0 implements P1.g {

    /* renamed from: d, reason: collision with root package name */
    public final c0 f4684d;

    /* renamed from: e, reason: collision with root package name */
    public final C0351N f4685e;

    public c0(c0 c0Var, C0351N c0351n) {
        Z1.i.f(c0351n, "instance");
        this.f4684d = c0Var;
        this.f4685e = c0351n;
    }

    public final void c(C0351N c0351n) {
        if (this.f4685e == c0351n) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        c0 c0Var = this.f4684d;
        if (c0Var != null) {
            c0Var.c(c0351n);
        }
    }

    @Override // P1.g
    public final P1.h getKey() {
        return b0.f4681d;
    }

    @Override // P1.i
    public final P1.g k(P1.h hVar) {
        return I2.l.A(this, hVar);
    }

    @Override // P1.i
    public final P1.i o(P1.i iVar) {
        return I2.l.M(this, iVar);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // P1.i
    public final P1.i x(P1.h hVar) {
        return I2.l.H(this, hVar);
    }
}
