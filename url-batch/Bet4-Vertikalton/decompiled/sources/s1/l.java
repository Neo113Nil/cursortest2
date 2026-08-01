package s1;

import c1.InterfaceC0085a;

/* loaded from: classes.dex */
public final class l extends d1.e implements InterfaceC0085a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1.d f3733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1.i f3734c;
    public final /* synthetic */ o1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o1.d dVar, o1.i iVar, o1.a aVar) {
        super(0);
        this.f3733b = dVar;
        this.f3734c = iVar;
        this.d = aVar;
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        w1.d dVar = this.f3733b.f3273b;
        d1.d.b(dVar);
        return dVar.o(this.f3734c.a(), this.d.h.d);
    }
}
