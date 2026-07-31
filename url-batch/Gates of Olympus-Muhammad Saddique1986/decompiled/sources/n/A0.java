package n;

import I.C0150g0;
import I.C0171r0;
import e2.InterfaceC0424c;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class A0 extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public y0 f7016q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7017r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7018s;

    @Override // t0.InterfaceC1009w
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7018s ? interfaceC0884F.U(Integer.MAX_VALUE) : interfaceC0884F.U(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7018s ? interfaceC0884F.V(i3) : interfaceC0884F.V(Integer.MAX_VALUE);
    }

    @Override // t0.InterfaceC1009w
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7018s ? interfaceC0884F.O(Integer.MAX_VALUE) : interfaceC0884F.O(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7018s ? interfaceC0884F.c(i3) : interfaceC0884F.c(Integer.MAX_VALUE);
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0695v.g(j3, this.f7018s ? p.P.f7567d : p.P.f7568e);
        AbstractC0893O b3 = interfaceC0884F.b(O0.a.a(j3, 0, this.f7018s ? O0.a.h(j3) : Integer.MAX_VALUE, 0, this.f7018s ? Integer.MAX_VALUE : O0.a.g(j3), 5));
        int i3 = b3.f8126d;
        int h3 = O0.a.h(j3);
        if (i3 > h3) {
            i3 = h3;
        }
        int i4 = b3.f8127e;
        int g3 = O0.a.g(j3);
        if (i4 > g3) {
            i4 = g3;
        }
        int i5 = b3.f8127e - i4;
        int i6 = b3.f8126d - i3;
        if (!this.f7018s) {
            i5 = i6;
        }
        y0 y0Var = this.f7016q;
        C0150g0 c0150g0 = y0Var.f7245d;
        C0150g0 c0150g02 = y0Var.f7242a;
        c0150g0.h(i5);
        S.i c2 = S.u.c();
        InterfaceC0424c f3 = c2 != null ? c2.f() : null;
        S.i d3 = S.u.d(c2);
        try {
            if (c0150g02.g() > i5) {
                c0150g02.h(i5);
            }
            S.u.f(c2, d3, f3);
            this.f7016q.f7243b.h(this.f7018s ? i4 : i3);
            return interfaceC0887I.i0(i3, i4, S1.v.f4321d, new C0171r0(i5, 1, this, b3));
        } catch (Throwable th) {
            S.u.f(c2, d3, f3);
            throw th;
        }
    }
}
