package W1;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class D extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1630e;
    public final /* synthetic */ K f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f1632h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(K k3, String str, String str2, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = k3;
        this.f1631g = str;
        this.f1632h = str2;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new D(this.f, this.f1631g, this.f1632h, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f1630e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            this.f1630e = 1;
            if (K.d(this.f, this.f1631g, this.f1632h, this) == enumC0317a) {
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
        return ((D) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
