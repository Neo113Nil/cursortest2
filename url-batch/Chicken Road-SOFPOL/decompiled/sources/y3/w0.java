package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 implements g6.f {

    /* renamed from: d, reason: collision with root package name */
    public final w0 f8958d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f8959e;

    public w0(w0 w0Var, b0 b0Var) {
        this.f8958d = w0Var;
        this.f8959e = b0Var;
    }

    @Override // g6.h
    public final /* bridge */ g6.h c(g6.h hVar) {
        return a.a.v(this, hVar);
    }

    public final void e(b0 b0Var) {
        if (this.f8959e == b0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        w0 w0Var = this.f8958d;
        if (w0Var != null) {
            w0Var.e(b0Var);
        }
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.f
    public final g6.g getKey() {
        return v0.f8952d;
    }

    @Override // g6.h
    public final /* bridge */ g6.f l(g6.g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // g6.h
    public final /* bridge */ g6.h v(g6.g gVar) {
        return a.a.s(this, gVar);
    }
}
