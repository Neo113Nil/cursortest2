package m1;

/* loaded from: classes.dex */
public final class l extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.d f3219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.j f3220c;
    public final /* synthetic */ i1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.d dVar, i1.j jVar, i1.a aVar) {
        super(0);
        this.f3219b = dVar;
        this.f3220c = jVar;
        this.d = aVar;
    }

    @Override // W0.a
    public final Object a() {
        i1.p pVar = this.f3219b.f2402b;
        X0.e.b(pVar);
        return pVar.c(this.f3220c.a(), this.d.h.d);
    }
}
