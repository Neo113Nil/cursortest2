package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.AbstractC1212w;
import t2.EnumC1211v;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class c extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f10774e;
    public /* synthetic */ InterfaceC1210u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w2.e f10775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f10776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w2.e eVar, e eVar2, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f10775g = eVar;
        this.f10776h = eVar2;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        c cVar = new c(this.f10775g, this.f10776h, interfaceC0300c);
        cVar.f = (InterfaceC1210u) obj;
        return cVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f10774e;
        C0195i c0195i = C0195i.f2555a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return c0195i;
        }
        android.support.v4.media.session.a.T(obj);
        InterfaceC1210u interfaceC1210u = this.f;
        e eVar = this.f10776h;
        int i4 = eVar.f10780b;
        if (i4 == -3) {
            i4 = -2;
        }
        EnumC1211v enumC1211v = EnumC1211v.f10443b;
        l2.p dVar = new d(eVar, null);
        v2.o oVar = new v2.o(AbstractC1212w.h(interfaceC1210u, eVar.f10779a), v2.j.a(i4, eVar.f10781c, 4));
        oVar.V(enumC1211v, oVar, dVar);
        this.f10774e = 1;
        Object b3 = w2.q.b(this.f10775g, oVar, true, this);
        if (b3 != enumC0317a) {
            b3 = c0195i;
        }
        return b3 == enumC0317a ? enumC0317a : c0195i;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
