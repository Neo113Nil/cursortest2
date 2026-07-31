package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s1 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f8538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.e f8539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c5.n f8540g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a aVar, f1.e eVar, c5.n nVar) {
        super(0);
        this.f8538e = aVar;
        this.f8539f = eVar;
        this.f8540g = nVar;
    }

    @Override // p6.a
    public final Object b() {
        f1.e eVar = this.f8539f;
        a aVar = this.f8538e;
        aVar.removeOnAttachStateChangeListener(eVar);
        c5.n nVar = this.f8540g;
        q6.i.e(nVar, "listener");
        r2.r.A(aVar).f7478a.remove(nVar);
        return c6.m.f1757a;
    }
}
