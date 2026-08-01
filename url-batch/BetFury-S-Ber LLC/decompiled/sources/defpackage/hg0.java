package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hg0 implements fe {
    public final kz f;

    public hg0(kz kzVar) {
        this.f = kzVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((jg0) this.f.f).close();
    }

    @Override // defpackage.fe
    public final Object u(boolean z, xr xrVar, dg dgVar) {
        jg0 jg0Var = (jg0) this.f.f;
        jg0Var.getClass();
        return xrVar.g(new mg0(new gg0(jg0Var.J())), dgVar);
    }
}
