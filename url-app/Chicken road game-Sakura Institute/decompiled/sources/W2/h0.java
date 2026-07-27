package W2;

/* loaded from: classes.dex */
public final class h0 extends C0286h {

    /* renamed from: o, reason: collision with root package name */
    public final C0292n f4267o;

    public h0(C2.a aVar, C0292n c0292n) {
        super(1, aVar);
        this.f4267o = c0292n;
    }

    @Override // W2.C0286h
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // W2.C0286h
    public final Throwable q(k0 k0Var) {
        Throwable c4;
        C0292n c0292n = this.f4267o;
        c0292n.getClass();
        Object obj = k0.f4279d.get(c0292n);
        return (!(obj instanceof j0) || (c4 = ((j0) obj).c()) == null) ? obj instanceof C0294p ? ((C0294p) obj).f4291a : k0Var.g() : c4;
    }
}
