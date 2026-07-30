package h6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: f, reason: collision with root package name */
    public final h f4654f;

    public a(h hVar) {
        this.f4654f = hVar;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public i F(h hVar) {
        return t6.a.G(this, hVar);
    }

    @Override // h6.g
    public final h getKey() {
        return this.f4654f;
    }

    @Override // h6.i
    public g u(h hVar) {
        return t6.a.B(this, hVar);
    }

    @Override // h6.i
    public final i z(i iVar) {
        return t6.a.I(this, iVar);
    }
}
