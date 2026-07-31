package h1;

import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class b0 implements V1.g {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f6135d;

    /* renamed from: e, reason: collision with root package name */
    public final M f6136e;

    public b0(b0 b0Var, M m3) {
        f2.j.f(m3, "instance");
        this.f6135d = b0Var;
        this.f6136e = m3;
    }

    public final void c(M m3) {
        if (this.f6136e == m3) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        b0 b0Var = this.f6135d;
        if (b0Var != null) {
            b0Var.c(m3);
        }
    }

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.g
    public final V1.h getKey() {
        return a0.f6134d;
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        return AbstractC0508a.C(this, hVar);
    }
}
