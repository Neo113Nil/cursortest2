package t;

import I.C0150g0;
import e2.InterfaceC0422a;
import p.P;
import r0.InterfaceC0886H;
import s.C0951t;

/* loaded from: classes.dex */
public final class C extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f8425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(F f3, int i3) {
        super(0);
        this.f8424e = i3;
        this.f8425f = f3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        long d3;
        switch (this.f8424e) {
            case 0:
                F f3 = this.f8425f;
                C0951t c0951t = f3.f8432r.f8226a;
                if (c0951t.g().f8281n == P.f7567d) {
                    InterfaceC0886H interfaceC0886H = c0951t.g().f8284q;
                    d3 = O2.d.d(interfaceC0886H.f(), interfaceC0886H.h()) & 4294967295L;
                } else {
                    InterfaceC0886H interfaceC0886H2 = c0951t.g().f8284q;
                    d3 = O2.d.d(interfaceC0886H2.f(), interfaceC0886H2.h()) >> 32;
                }
                int i3 = (int) d3;
                C0951t c0951t2 = f3.f8432r.f8226a;
                return Float.valueOf(i3 - ((-c0951t2.g().f8278k) + c0951t2.g().f8282o));
            case 1:
                C0951t c0951t3 = this.f8425f.f8432r.f8226a;
                return Float.valueOf((((C0150g0) c0951t3.f8320d.f923b).g() * 500) + ((C0150g0) c0951t3.f8320d.f924c).g());
            default:
                C0951t c0951t4 = this.f8425f.f8432r.f8226a;
                int g3 = ((C0150g0) c0951t4.f8320d.f923b).g();
                int g4 = ((C0150g0) c0951t4.f8320d.f924c).g();
                return Float.valueOf(c0951t4.a() ? (g3 * 500) + g4 + 100 : (g3 * 500) + g4);
        }
    }
}
