package x;

import m0.h1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 implements v1.c, y0.k {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8194a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f8195b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f8196c;

    public a0(r0 r0Var) {
        this.f8194a = r0Var;
        this.f8195b = m0.b.q(r0Var);
        this.f8196c = m0.b.q(r0Var);
    }

    @Override // v1.c
    public final void c(v1.f fVar) {
        r0 r0Var = (r0) fVar.d(v0.f8303a);
        r0 r0Var2 = this.f8194a;
        this.f8195b.setValue(new v(r0Var2, r0Var));
        this.f8196c.setValue(new o0(r0Var, r0Var2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return q6.i.a(((a0) obj).f8194a, this.f8194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8194a.hashCode();
    }
}
