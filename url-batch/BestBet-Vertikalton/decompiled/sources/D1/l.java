package D1;

import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class l extends k1.f implements InterfaceC0170a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.d f191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.i f192c;
    public final /* synthetic */ z1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z1.d dVar, z1.i iVar, z1.a aVar) {
        super(0);
        this.f191b = dVar;
        this.f192c = iVar;
        this.d = aVar;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        H1.d dVar = this.f191b.f4649b;
        k1.e.b(dVar);
        return dVar.p(this.f192c.a(), this.d.h.d);
    }
}
