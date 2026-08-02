package W1;

import b2.C0195i;
import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public final class E extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1633e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f1634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N.d dVar, double d3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = dVar;
        this.f1634g = d3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        E e3 = new E(this.f, this.f1634g, interfaceC0300c);
        e3.f1633e = obj;
        return e3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        ((N.b) this.f1633e).d(this.f, new Double(this.f1634g));
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        E e3 = (E) b((InterfaceC0300c) obj2, (N.b) obj);
        C0195i c0195i = C0195i.f2555a;
        e3.g(c0195i);
        return c0195i;
    }
}
