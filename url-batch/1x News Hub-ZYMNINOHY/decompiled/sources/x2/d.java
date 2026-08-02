package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class d extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f10777e;
    public /* synthetic */ InterfaceC1210u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f10778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f10778g = eVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        d dVar = new d(this.f10778g, interfaceC0300c);
        dVar.f = (InterfaceC1210u) obj;
        return dVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f10777e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            v2.p pVar = (v2.p) this.f;
            this.f10777e = 1;
            if (this.f10778g.a(pVar, this) == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) b((InterfaceC0300c) obj2, (v2.p) obj)).g(C0195i.f2555a);
    }
}
