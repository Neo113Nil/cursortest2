package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class s extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f10800e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w2.e f10801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f10801g = eVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        s sVar = new s(this.f10801g, interfaceC0300c);
        sVar.f = obj;
        return sVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f10800e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            Object obj2 = this.f;
            this.f10800e = 1;
            if (this.f10801g.a(obj2, this) == enumC0317a) {
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
        return ((s) b((InterfaceC0300c) obj2, obj)).g(C0195i.f2555a);
    }
}
