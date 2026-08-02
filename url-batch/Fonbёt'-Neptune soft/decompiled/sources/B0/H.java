package B0;

/* loaded from: classes.dex */
public final class H extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f103i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L.d f104j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f105k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L.d dVar, double d2, H0.d dVar2) {
        super(2, dVar2);
        this.f104j = dVar;
        this.f105k = d2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        H h2 = new H(this.f104j, this.f105k, dVar);
        h2.f103i = obj;
        return h2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        H h2 = (H) b((H0.d) obj2, (L.b) obj);
        F0.h hVar = F0.h.f469a;
        h2.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        ((L.b) this.f103i).d(this.f104j, new Double(this.f105k));
        return F0.h.f469a;
    }
}
