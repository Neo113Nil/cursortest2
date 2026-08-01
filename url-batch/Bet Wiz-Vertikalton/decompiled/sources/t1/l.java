package t1;

import d1.InterfaceC0081a;

/* loaded from: classes.dex */
public final class l extends e1.e implements InterfaceC0081a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.d f3772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.j f3773c;
    public final /* synthetic */ p1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p1.d dVar, p1.j jVar, p1.a aVar) {
        super(0);
        this.f3772b = dVar;
        this.f3773c = jVar;
        this.d = aVar;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        x1.l lVar = this.f3772b.f3318b;
        e1.d.b(lVar);
        return lVar.n(this.f3773c.a(), this.d.h.d);
    }
}
