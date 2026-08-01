package D1;

import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final class l extends j1.i implements InterfaceC0181a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.f f248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.l f249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.a f250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z1.f fVar, z1.l lVar, z1.a aVar) {
        super(0);
        this.f248b = fVar;
        this.f249c = lVar;
        this.f250d = aVar;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        H1.l lVar = this.f248b.f4830b;
        j1.h.b(lVar);
        return lVar.i(this.f249c.a(), this.f250d.f4813h.f4878d);
    }
}
