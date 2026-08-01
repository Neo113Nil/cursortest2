package w1;

import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class l extends h1.e implements InterfaceC0110a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.d f4251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.i f4252c;
    public final /* synthetic */ s1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s1.d dVar, s1.i iVar, s1.a aVar) {
        super(0);
        this.f4251b = dVar;
        this.f4252c = iVar;
        this.d = aVar;
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        A1.d dVar = this.f4251b.f3602b;
        h1.d.b(dVar);
        return dVar.o(this.f4252c.a(), this.d.f3583h.d);
    }
}
