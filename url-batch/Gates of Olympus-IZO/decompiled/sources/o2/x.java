package o2;

/* loaded from: classes.dex */
public final class x implements P1.d, R1.d {

    /* renamed from: d, reason: collision with root package name */
    public final P1.d f6741d;

    /* renamed from: e, reason: collision with root package name */
    public final P1.i f6742e;

    public x(P1.d dVar, P1.i iVar) {
        this.f6741d = dVar;
        this.f6742e = iVar;
    }

    @Override // R1.d
    public final R1.d getCallerFrame() {
        P1.d dVar = this.f6741d;
        if (dVar instanceof R1.d) {
            return (R1.d) dVar;
        }
        return null;
    }

    @Override // P1.d
    public final P1.i getContext() {
        return this.f6742e;
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        this.f6741d.resumeWith(obj);
    }
}
