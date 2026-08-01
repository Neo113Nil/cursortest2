package m1;

import i1.q;

/* loaded from: classes.dex */
public final class l extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.d f3237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.j f3238c;
    public final /* synthetic */ i1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.d dVar, i1.j jVar, i1.a aVar) {
        super(0);
        this.f3237b = dVar;
        this.f3238c = jVar;
        this.d = aVar;
    }

    @Override // W0.a
    public final Object a() {
        q qVar = this.f3237b.f2403b;
        X0.e.b(qVar);
        return qVar.c(this.f3238c.a(), this.d.h.d);
    }
}
