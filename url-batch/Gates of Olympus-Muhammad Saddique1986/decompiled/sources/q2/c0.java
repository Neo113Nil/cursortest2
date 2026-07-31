package q2;

/* loaded from: classes.dex */
public final class c0 extends C0821h {

    /* renamed from: l, reason: collision with root package name */
    public final C0827n f7883l;

    public c0(V1.d dVar, C0827n c0827n) {
        super(1, dVar);
        this.f7883l = c0827n;
    }

    @Override // q2.C0821h
    public final Throwable p(f0 f0Var) {
        Throwable c2;
        C0827n c0827n = this.f7883l;
        c0827n.getClass();
        Object obj = f0.f7895d.get(c0827n);
        return (!(obj instanceof e0) || (c2 = ((e0) obj).c()) == null) ? obj instanceof C0829p ? ((C0829p) obj).f7917a : f0Var.g() : c2;
    }

    @Override // q2.C0821h
    public final String z() {
        return "AwaitContinuation";
    }
}
