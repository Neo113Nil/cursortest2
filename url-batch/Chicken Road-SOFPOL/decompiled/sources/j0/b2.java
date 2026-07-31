package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b2 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.e f3584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0.c f3585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.e f3586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.e f3587h;
    public final /* synthetic */ k0.h i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.c f3588j;

    public b2(int i, p6.e eVar, u0.c cVar, p6.e eVar2, p6.e eVar3, k0.h hVar, u0.c cVar2) {
        this.f3583d = i;
        this.f3584e = eVar;
        this.f3585f = cVar;
        this.f3586g = eVar2;
        this.f3587h = eVar3;
        this.i = hVar;
        this.f3588j = cVar2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            d2.b(this.f3583d, this.f3584e, this.f3585f, this.f3586g, this.f3587h, this.i, this.f3588j, sVar, 0);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
