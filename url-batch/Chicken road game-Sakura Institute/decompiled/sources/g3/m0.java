package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 implements h6.g {

    /* renamed from: f, reason: collision with root package name */
    public final m0 f4169f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f4170g;

    public m0(m0 m0Var, a0 a0Var) {
        this.f4169f = m0Var;
        this.f4170g = a0Var;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public final h6.i F(h6.h hVar) {
        return t6.a.G(this, hVar);
    }

    public final void a(a0 a0Var) {
        if (this.f4170g == a0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        m0 m0Var = this.f4169f;
        if (m0Var != null) {
            m0Var.a(a0Var);
        }
    }

    @Override // h6.g
    public final h6.h getKey() {
        return l0.f4167f;
    }

    @Override // h6.i
    public final h6.g u(h6.h hVar) {
        return t6.a.B(this, hVar);
    }

    @Override // h6.i
    public final h6.i z(h6.i iVar) {
        return t6.a.I(this, iVar);
    }
}
