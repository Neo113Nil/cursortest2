package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 extends h {

    /* renamed from: w, reason: collision with root package name */
    public final n f4359w;

    public h1(ld.a aVar, n nVar) {
        super(1, aVar);
        this.f4359w = nVar;
    }

    @Override // ge.h
    public final Throwable q(k1 k1Var) {
        Throwable b10;
        n nVar = this.f4359w;
        nVar.getClass();
        Object obj = k1.f4374d.get(nVar);
        return (!(obj instanceof j1) || (b10 = ((j1) obj).b()) == null) ? obj instanceof q ? ((q) obj).f4394a : k1Var.x() : b10;
    }

    @Override // ge.h
    public final String y() {
        return "AwaitContinuation";
    }
}
