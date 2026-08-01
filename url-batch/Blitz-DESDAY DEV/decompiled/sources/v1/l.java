package v1;

import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final class l extends g1.e implements InterfaceC0099a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.d f3889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.i f3890c;
    public final /* synthetic */ r1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r1.d dVar, r1.i iVar, r1.a aVar) {
        super(0);
        this.f3889b = dVar;
        this.f3890c = iVar;
        this.d = aVar;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        z1.d dVar = this.f3889b.f3452b;
        g1.d.b(dVar);
        return dVar.h(this.f3890c.a(), this.d.h.d);
    }
}
