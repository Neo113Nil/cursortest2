package W1;

import b2.C0195i;
import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public final class B extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1625e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(N.d dVar, boolean z, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = dVar;
        this.f1626g = z;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        B b3 = new B(this.f, this.f1626g, interfaceC0300c);
        b3.f1625e = obj;
        return b3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        ((N.b) this.f1625e).d(this.f, Boolean.valueOf(this.f1626g));
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        B b3 = (B) b((InterfaceC0300c) obj2, (N.b) obj);
        C0195i c0195i = C0195i.f2555a;
        b3.g(c0195i);
        return c0195i;
    }
}
