package B0;

/* renamed from: B0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035m extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L.d f165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f166k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0035m(L.d dVar, String str, H0.d dVar2) {
        super(2, dVar2);
        this.f165j = dVar;
        this.f166k = str;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0035m c0035m = new C0035m(this.f165j, this.f166k, dVar);
        c0035m.f164i = obj;
        return c0035m;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        C0035m c0035m = (C0035m) b((H0.d) obj2, (L.b) obj);
        F0.h hVar = F0.h.f469a;
        c0035m.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        ((L.b) this.f164i).d(this.f165j, this.f166k);
        return F0.h.f469a;
    }
}
