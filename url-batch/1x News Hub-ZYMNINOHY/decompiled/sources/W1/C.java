package W1;

import android.content.Context;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class C extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1627e;
    public final /* synthetic */ String f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f1628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, K k3, boolean z, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = str;
        this.f1628g = k3;
        this.f1629h = z;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C(this.f, this.f1628g, this.f1629h, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f1627e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            N.d dVar = new N.d(this.f);
            Context context = this.f1628g.f1649a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            C0.e a3 = L.a(context);
            B b3 = new B(dVar, this.f1629h, null);
            this.f1627e = 1;
            if (a3.a(new N.h(b3, null), this) == enumC0317a) {
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
        return ((C) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
