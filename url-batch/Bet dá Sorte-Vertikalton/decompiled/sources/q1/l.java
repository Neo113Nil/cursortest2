package q1;

import a1.InterfaceC0058a;
import k0.z;

/* loaded from: classes.dex */
public final class l extends b1.e implements InterfaceC0058a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1.d f3539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1.j f3540c;
    public final /* synthetic */ m1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m1.d dVar, m1.j jVar, m1.a aVar) {
        super(0);
        this.f3539b = dVar;
        this.f3540c = jVar;
        this.d = aVar;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        z zVar = this.f3539b.f3171b;
        b1.d.b(zVar);
        return zVar.f(this.f3540c.a(), this.d.h.d);
    }
}
