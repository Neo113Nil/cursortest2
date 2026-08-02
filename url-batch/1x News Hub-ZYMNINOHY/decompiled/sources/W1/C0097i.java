package W1;

import b2.C0195i;
import d2.InterfaceC0300c;
import java.util.List;

/* renamed from: W1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097i extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1675e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097i(List list, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = list;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0097i c0097i = new C0097i(this.f, interfaceC0300c);
        c0097i.f1675e = obj;
        return c0097i;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        N.b bVar = (N.b) this.f1675e;
        List<String> list = this.f;
        if (list != null) {
            for (String name : list) {
                kotlin.jvm.internal.j.e(name, "name");
                N.d dVar = new N.d(name);
                bVar.b();
                bVar.f977a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f977a.clear();
        }
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        C0097i c0097i = (C0097i) b((InterfaceC0300c) obj2, (N.b) obj);
        C0195i c0195i = C0195i.f2555a;
        c0097i.g(c0195i);
        return c0195i;
    }
}
