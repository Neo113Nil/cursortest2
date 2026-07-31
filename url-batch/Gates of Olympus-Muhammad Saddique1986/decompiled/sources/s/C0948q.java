package s;

import E.F;
import I.C0150g0;
import R1.y;
import e2.InterfaceC0426e;
import p.U;
import t0.E;

/* renamed from: s.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948q extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0951t f8309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948q(C0951t c0951t, int i3, int i4, V1.d dVar) {
        super(2, dVar);
        this.f8309h = c0951t;
        this.f8310i = i3;
        this.f8311j = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0948q c0948q = (C0948q) o((V1.d) obj2, (U) obj);
        y yVar = y.f4171a;
        c0948q.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0948q(this.f8309h, this.f8310i, this.f8311j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0951t c0951t = this.f8309h;
        F f3 = c0951t.f8320d;
        int g3 = ((C0150g0) f3.f923b).g();
        int i3 = this.f8310i;
        int i4 = this.f8311j;
        if (g3 != i3 || ((C0150g0) f3.f924c).g() != i4) {
            c0951t.f8329m.c();
        }
        f3.i(i3, i4);
        f3.f925d = null;
        E e3 = c0951t.f8326j;
        if (e3 != null) {
            e3.k();
        }
        return y.f4171a;
    }
}
