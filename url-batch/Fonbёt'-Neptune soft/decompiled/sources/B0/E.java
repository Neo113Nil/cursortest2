package B0;

/* loaded from: classes.dex */
public final class E extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f92i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L.d f93j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f94k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L.d dVar, boolean z2, H0.d dVar2) {
        super(2, dVar2);
        this.f93j = dVar;
        this.f94k = z2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        E e2 = new E(this.f93j, this.f94k, dVar);
        e2.f92i = obj;
        return e2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        E e2 = (E) b((H0.d) obj2, (L.b) obj);
        F0.h hVar = F0.h.f469a;
        e2.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        ((L.b) this.f92i).d(this.f93j, Boolean.valueOf(this.f94k));
        return F0.h.f469a;
    }
}
