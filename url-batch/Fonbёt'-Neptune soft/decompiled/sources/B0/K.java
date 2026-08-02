package B0;

/* loaded from: classes.dex */
public final class K extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L.d f115j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L.d dVar, long j2, H0.d dVar2) {
        super(2, dVar2);
        this.f115j = dVar;
        this.f116k = j2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        K k2 = new K(this.f115j, this.f116k, dVar);
        k2.f114i = obj;
        return k2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        K k2 = (K) b((H0.d) obj2, (L.b) obj);
        F0.h hVar = F0.h.f469a;
        k2.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        ((L.b) this.f114i).d(this.f115j, new Long(this.f116k));
        return F0.h.f469a;
    }
}
