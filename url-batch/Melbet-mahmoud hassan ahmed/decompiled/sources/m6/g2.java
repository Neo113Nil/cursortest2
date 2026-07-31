package m6;

/* loaded from: classes.dex */
public final class g2 extends f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final g2 f19288g = new g2();

    private g2() {
    }

    @Override // m6.f0
    public void P(y5.g gVar, Runnable runnable) {
        j2 j2Var = (j2) gVar.get(j2.f19295g);
        if (j2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        j2Var.f19296f = true;
    }

    @Override // m6.f0
    public boolean Q(y5.g gVar) {
        return false;
    }

    @Override // m6.f0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
