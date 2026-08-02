package Y0;

/* loaded from: classes.dex */
public final class V extends C0112f {

    /* renamed from: m, reason: collision with root package name */
    public final C0118l f1180m;

    public V(H0.d dVar, C0118l c0118l) {
        super(1, dVar);
        this.f1180m = c0118l;
    }

    @Override // Y0.C0112f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // Y0.C0112f
    public final Throwable t(Z z2) {
        Throwable c2;
        Object E2 = this.f1180m.E();
        return (!(E2 instanceof X) || (c2 = ((X) E2).c()) == null) ? E2 instanceof C0120n ? ((C0120n) E2).f1219a : z2.A() : c2;
    }
}
