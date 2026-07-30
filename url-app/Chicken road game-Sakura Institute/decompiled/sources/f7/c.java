package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends g7.e {

    /* renamed from: i, reason: collision with root package name */
    public final g3.o f3445i;

    public c(g3.o oVar, h6.i iVar, int i7, e7.a aVar) {
        super(iVar, i7, aVar);
        this.f3445i = oVar;
    }

    @Override // g7.e
    public final Object d(e7.r rVar, a0.e0 e0Var) {
        Object d8 = this.f3445i.d(rVar, e0Var);
        return d8 == i6.a.f4956f ? d8 : d6.z.f2639a;
    }

    @Override // g7.e
    public final g7.e e(h6.i iVar, int i7, e7.a aVar) {
        return new c(this.f3445i, iVar, i7, aVar);
    }

    @Override // g7.e
    public final String toString() {
        return "block[" + this.f3445i + "] -> " + super.toString();
    }
}
