package q1;

import a1.InterfaceC0059a;
import j0.AbstractC0143a;

/* loaded from: classes.dex */
public final class l extends b1.e implements InterfaceC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1.d f3486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1.i f3487c;
    public final /* synthetic */ m1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m1.d dVar, m1.i iVar, m1.a aVar) {
        super(0);
        this.f3486b = dVar;
        this.f3487c = iVar;
        this.d = aVar;
    }

    @Override // a1.InterfaceC0059a
    public final Object a() {
        AbstractC0143a abstractC0143a = this.f3486b.f3139b;
        b1.d.b(abstractC0143a);
        return abstractC0143a.f(this.f3487c.a(), this.d.h.d);
    }
}
