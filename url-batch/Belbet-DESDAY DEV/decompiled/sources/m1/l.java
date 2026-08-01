package m1;

import i1.q;

/* loaded from: classes.dex */
public final class l extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.d f3242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.j f3243c;
    public final /* synthetic */ i1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.d dVar, i1.j jVar, i1.a aVar) {
        super(0);
        this.f3242b = dVar;
        this.f3243c = jVar;
        this.d = aVar;
    }

    @Override // W0.a
    public final Object a() {
        q qVar = this.f3242b.f2406b;
        X0.d.b(qVar);
        return qVar.c(this.f3243c.a(), this.d.h.d);
    }
}
