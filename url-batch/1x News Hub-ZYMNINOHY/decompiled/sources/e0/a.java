package e0;

import K.C0060y;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.i;
import l2.p;
import t2.InterfaceC1210u;
import w2.d;

/* loaded from: classes.dex */
public final class a extends i implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f4965e;
    public final /* synthetic */ d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E1.p f4966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, E1.p pVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = dVar;
        this.f4966g = pVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new a(this.f, this.f4966g, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f4965e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            C0060y c0060y = new C0060y(1, this.f4966g);
            this.f4965e = 1;
            if (this.f.n(c0060y, this) == enumC0317a) {
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
        return ((a) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
