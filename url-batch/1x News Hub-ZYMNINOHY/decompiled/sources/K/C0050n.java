package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* renamed from: K.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050n extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f803e;
    public final /* synthetic */ N f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050n(N n3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = n3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C0050n(this.f, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f803e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            this.f803e = 1;
            if (N.d(this.f, this) == enumC0317a) {
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
        return ((C0050n) b((InterfaceC0300c) obj2, (w2.e) obj)).g(C0195i.f2555a);
    }
}
