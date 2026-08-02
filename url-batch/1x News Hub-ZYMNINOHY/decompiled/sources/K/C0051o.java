package K;

import b2.C0195i;
import d2.InterfaceC0300c;

/* renamed from: K.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051o extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f804e;

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0051o c0051o = new C0051o(2, interfaceC0300c);
        c0051o.f804e = obj;
        return c0051o;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        return Boolean.valueOf(!(((i0) this.f804e) instanceof Z));
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0051o) b((InterfaceC0300c) obj2, (i0) obj)).g(C0195i.f2555a);
    }
}
