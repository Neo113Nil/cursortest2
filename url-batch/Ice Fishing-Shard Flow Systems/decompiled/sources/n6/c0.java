package n6;

/* loaded from: classes.dex */
public final class c0 extends C0775h {

    /* renamed from: q, reason: collision with root package name */
    public final C0781n f7042q;

    public c0(V5.b bVar, C0781n c0781n) {
        super(1, bVar);
        this.f7042q = c0781n;
    }

    @Override // n6.C0775h
    public final Throwable q(f0 f0Var) {
        Throwable d7;
        C0781n c0781n = this.f7042q;
        c0781n.getClass();
        Object obj = f0.f7054d.get(c0781n);
        return (!(obj instanceof e0) || (d7 = ((e0) obj).d()) == null) ? obj instanceof C0784q ? ((C0784q) obj).f7076a : f0Var.w() : d7;
    }

    @Override // n6.C0775h
    public final String y() {
        return "AwaitContinuation";
    }
}
