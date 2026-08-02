package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class K extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f684e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f685g = n3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        K k3 = new K(this.f685g, interfaceC0300c);
        k3.f = obj;
        return k3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f684e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            a0 a0Var = (a0) this.f;
            this.f684e = 1;
            if (N.c(this.f685g, a0Var, this) == enumC0317a) {
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
        return ((K) b((InterfaceC0300c) obj2, (a0) obj)).g(C0195i.f2555a);
    }
}
