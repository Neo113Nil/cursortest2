package W1;

import b2.C0195i;
import d2.InterfaceC0300c;

/* renamed from: W1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099k extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1678e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1679g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0099k(N.d dVar, String str, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = dVar;
        this.f1679g = str;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0099k c0099k = new C0099k(this.f, this.f1679g, interfaceC0300c);
        c0099k.f1678e = obj;
        return c0099k;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        ((N.b) this.f1678e).d(this.f, this.f1679g);
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        C0099k c0099k = (C0099k) b((InterfaceC0300c) obj2, (N.b) obj);
        C0195i c0195i = C0195i.f2555a;
        c0099k.g(c0195i);
        return c0195i;
    }
}
