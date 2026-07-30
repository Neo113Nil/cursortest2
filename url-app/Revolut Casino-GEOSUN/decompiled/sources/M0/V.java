package M0;

/* loaded from: classes.dex */
public final class V extends C0048f {

    /* renamed from: m, reason: collision with root package name */
    public final C0054l f637m;

    public V(w0.d dVar, C0054l c0054l) {
        super(1, dVar);
        this.f637m = c0054l;
    }

    @Override // M0.C0048f
    public final Throwable r(Z z2) {
        Throwable d2;
        Object C2 = this.f637m.C();
        return (!(C2 instanceof X) || (d2 = ((X) C2).d()) == null) ? C2 instanceof C0056n ? ((C0056n) C2).f676a : z2.y() : d2;
    }

    @Override // M0.C0048f
    public final String y() {
        return "AwaitContinuation";
    }
}
