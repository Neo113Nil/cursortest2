package m0;

import O1.j;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.i;
import l2.p;
import t2.AbstractC1191a;
import t2.AbstractC1212w;
import t2.C1215z;
import t2.D;
import t2.EnumC1211v;
import t2.InterfaceC1210u;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109b extends i implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f9948e;
    public /* synthetic */ InterfaceC1210u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1110c f9949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109b(C1110c c1110c, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f9949g = c1110c;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C1109b c1109b = new C1109b(this.f9949g, interfaceC0300c);
        c1109b.f = (InterfaceC1210u) obj;
        return c1109b;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f9948e;
        C1110c c1110c = this.f9949g;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            InterfaceC1210u interfaceC1210u = this.f;
            A2.d dVar = D.f10378b;
            C1108a c1108a = new C1108a(c1110c, null);
            EnumC1211v enumC1211v = EnumC1211v.f10442a;
            AbstractC1191a c1215z = new C1215z(AbstractC1212w.h(interfaceC1210u, dVar), true, 0);
            c1215z.V(enumC1211v, c1215z, c1108a);
            this.f9948e = 1;
            if (c1215z.q(this) == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        j jVar = c1110c.f9951b;
        kotlin.jvm.internal.j.b(jVar);
        jVar.success(Boolean.TRUE);
        c1110c.f9951b = null;
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1109b) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
