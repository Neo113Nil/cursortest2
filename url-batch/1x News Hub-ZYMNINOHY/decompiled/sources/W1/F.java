package W1;

import android.content.Context;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class F extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1635e;
    public final /* synthetic */ String f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f1636g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f1637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, K k3, double d3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = str;
        this.f1636g = k3;
        this.f1637h = d3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new F(this.f, this.f1636g, this.f1637h, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f1635e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            N.d dVar = new N.d(this.f);
            Context context = this.f1636g.f1649a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            C0.e a3 = L.a(context);
            E e3 = new E(dVar, this.f1637h, null);
            this.f1635e = 1;
            if (a3.a(new N.h(e3, null), this) == enumC0317a) {
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
        return ((F) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
