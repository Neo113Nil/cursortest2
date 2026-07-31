package z0;

import t0.n0;

/* loaded from: classes.dex */
public final class c extends U.k implements n0 {

    /* renamed from: q, reason: collision with root package name */
    public boolean f8946q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8947r;

    /* renamed from: s, reason: collision with root package name */
    public Y1.c f8948s;

    public c(boolean z3, boolean z4, Y1.c cVar) {
        this.f8946q = z3;
        this.f8947r = z4;
        this.f8948s = cVar;
    }

    @Override // t0.n0
    public final boolean L() {
        return this.f8947r;
    }

    @Override // t0.n0
    public final boolean O() {
        return this.f8946q;
    }

    @Override // t0.n0
    public final void h(i iVar) {
        this.f8948s.j(iVar);
    }
}
