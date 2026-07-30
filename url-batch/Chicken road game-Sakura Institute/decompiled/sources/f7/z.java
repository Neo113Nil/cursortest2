package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements o0, f, g7.s {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f3566f;

    public z(q0 q0Var) {
        this.f3566f = q0Var;
    }

    @Override // g7.s
    public final f a(h6.i iVar, int i7, e7.a aVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != e7.a.f2834g) ? f0.l(this, iVar, i7, aVar) : this;
    }

    @Override // f7.f
    public final Object b(g gVar, h6.d dVar) {
        this.f3566f.b(gVar, dVar);
        return i6.a.f4956f;
    }

    @Override // f7.o0
    public final Object getValue() {
        return this.f3566f.getValue();
    }
}
