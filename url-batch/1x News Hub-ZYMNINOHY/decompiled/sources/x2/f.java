package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class f extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f10782e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f10783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f10783g = gVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        f fVar = new f(this.f10783g, interfaceC0300c);
        fVar.f = obj;
        return fVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f10782e;
        C0195i c0195i = C0195i.f2555a;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            w2.e eVar = (w2.e) this.f;
            this.f10782e = 1;
            Object n3 = this.f10783g.f10784d.n(eVar, this);
            if (n3 != enumC0317a) {
                n3 = c0195i;
            }
            if (n3 == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        return c0195i;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) b((InterfaceC0300c) obj2, (w2.e) obj)).g(C0195i.f2555a);
    }
}
