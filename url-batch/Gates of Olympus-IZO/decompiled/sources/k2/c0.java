package k2;

/* loaded from: classes.dex */
public final class c0 extends C0536h {

    /* renamed from: l, reason: collision with root package name */
    public final C0542n f5344l;

    public c0(P1.d dVar, C0542n c0542n) {
        super(1, dVar);
        this.f5344l = c0542n;
    }

    @Override // k2.C0536h
    public final Throwable o(f0 f0Var) {
        Throwable c3;
        C0542n c0542n = this.f5344l;
        c0542n.getClass();
        Object obj = f0.f5356d.get(c0542n);
        return (!(obj instanceof e0) || (c3 = ((e0) obj).c()) == null) ? obj instanceof C0544p ? ((C0544p) obj).f5378a : f0Var.m() : c3;
    }

    @Override // k2.C0536h
    public final String y() {
        return "AwaitContinuation";
    }
}
