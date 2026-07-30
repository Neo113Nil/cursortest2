package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends h {

    /* renamed from: n, reason: collision with root package name */
    public final n f1678n;

    public c1(h6.d dVar, n nVar) {
        super(1, dVar);
        this.f1678n = nVar;
    }

    @Override // c7.h
    public final Throwable p(f1 f1Var) {
        Throwable d8;
        n nVar = this.f1678n;
        nVar.getClass();
        Object obj = f1.f1692f.get(nVar);
        return (!(obj instanceof e1) || (d8 = ((e1) obj).d()) == null) ? obj instanceof p ? ((p) obj).f1725a : f1Var.w() : d8;
    }

    @Override // c7.h
    public final String y() {
        return "AwaitContinuation";
    }
}
