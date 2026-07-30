package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: j, reason: collision with root package name */
    public final j6.i f4502j;

    /* JADX WARN: Multi-variable type inference failed */
    public k(q6.f fVar, f7.f fVar2, h6.i iVar, int i7, e7.a aVar) {
        super(i7, aVar, fVar2, iVar);
        this.f4502j = (j6.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j6.i, q6.f] */
    @Override // g7.e
    public final e e(h6.i iVar, int i7, e7.a aVar) {
        return new k(this.f4502j, this.f4486i, iVar, i7, aVar);
    }

    @Override // g7.f
    public final Object j(f7.g gVar, h6.d dVar) {
        Object d8 = c7.a0.d(new h(this, gVar, null), dVar);
        return d8 == i6.a.f4956f ? d8 : d6.z.f2639a;
    }
}
