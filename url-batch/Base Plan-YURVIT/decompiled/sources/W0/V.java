package W0;

/* loaded from: classes.dex */
public final class V extends C0066f {

    /* renamed from: m, reason: collision with root package name */
    public final C0072l f926m;

    public V(G0.d dVar, C0072l c0072l) {
        super(1, dVar);
        this.f926m = c0072l;
    }

    @Override // W0.C0066f
    public final Throwable s(Z z2) {
        Throwable c2;
        Object D2 = this.f926m.D();
        return (!(D2 instanceof X) || (c2 = ((X) D2).c()) == null) ? D2 instanceof C0074n ? ((C0074n) D2).f965a : z2.z() : c2;
    }

    @Override // W0.C0066f
    public final String z() {
        return "AwaitContinuation";
    }
}
