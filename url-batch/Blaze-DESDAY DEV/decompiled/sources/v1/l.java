package v1;

import f1.InterfaceC0090a;

/* loaded from: classes.dex */
public final class l extends g1.e implements InterfaceC0090a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.d f4059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.j f4060c;
    public final /* synthetic */ r1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r1.d dVar, r1.j jVar, r1.a aVar) {
        super(0);
        this.f4059b = dVar;
        this.f4060c = jVar;
        this.d = aVar;
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        z1.l lVar = this.f4059b.f3418b;
        g1.d.b(lVar);
        return lVar.i(this.f4060c.a(), this.d.h.d);
    }
}
