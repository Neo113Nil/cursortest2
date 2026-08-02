package K;

import d2.InterfaceC0303f;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC0303f {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f801a;

    /* renamed from: b, reason: collision with root package name */
    public final N f802b;

    public m0(m0 m0Var, N instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        this.f801a = m0Var;
        this.f802b = instance;
    }

    public final void c(N n3) {
        if (this.f802b == n3) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        m0 m0Var = this.f801a;
        if (m0Var != null) {
            m0Var.c(n3);
        }
    }

    @Override // d2.InterfaceC0303f
    public final d2.g getKey() {
        return l0.f799a;
    }

    @Override // d2.h
    public final InterfaceC0303f h(d2.g gVar) {
        return android.support.v4.media.session.a.x(this, gVar);
    }

    @Override // d2.h
    public final d2.h i(d2.h hVar) {
        return android.support.v4.media.session.a.E(this, hVar);
    }

    @Override // d2.h
    public final d2.h k(d2.g gVar) {
        return android.support.v4.media.session.a.D(this, gVar);
    }

    @Override // d2.h
    public final Object l(Object obj, l2.p pVar) {
        return pVar.invoke(obj, this);
    }
}
