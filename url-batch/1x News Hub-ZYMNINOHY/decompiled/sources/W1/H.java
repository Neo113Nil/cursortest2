package W1;

import b2.C0195i;
import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public final class H extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1641e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(N.d dVar, long j3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = dVar;
        this.f1642g = j3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        H h3 = new H(this.f, this.f1642g, interfaceC0300c);
        h3.f1641e = obj;
        return h3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        ((N.b) this.f1641e).d(this.f, new Long(this.f1642g));
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        H h3 = (H) b((InterfaceC0300c) obj2, (N.b) obj);
        C0195i c0195i = C0195i.f2555a;
        h3.g(c0195i);
        return c0195i;
    }
}
