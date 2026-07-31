package u2;

/* renamed from: u2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146D implements V1.d, X1.d {

    /* renamed from: d, reason: collision with root package name */
    public final V1.d f9671d;

    /* renamed from: e, reason: collision with root package name */
    public final V1.i f9672e;

    public C1146D(V1.d dVar, V1.i iVar) {
        this.f9671d = dVar;
        this.f9672e = iVar;
    }

    @Override // X1.d
    public final X1.d k() {
        V1.d dVar = this.f9671d;
        if (dVar instanceof X1.d) {
            return (X1.d) dVar;
        }
        return null;
    }

    @Override // V1.d
    public final V1.i t() {
        return this.f9672e;
    }

    @Override // V1.d
    public final void u(Object obj) {
        this.f9671d.u(obj);
    }
}
