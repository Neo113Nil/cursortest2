package m1;

/* loaded from: classes.dex */
public final class l extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.d f3225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.j f3226c;
    public final /* synthetic */ i1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.d dVar, i1.j jVar, i1.a aVar) {
        super(0);
        this.f3225b = dVar;
        this.f3226c = jVar;
        this.d = aVar;
    }

    @Override // W0.a
    public final Object a() {
        i1.p pVar = this.f3225b.f2408b;
        X0.d.b(pVar);
        return pVar.c(this.f3226c.a(), this.d.h.d);
    }
}
