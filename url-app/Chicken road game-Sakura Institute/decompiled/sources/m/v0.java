package m;

import G.C0199g0;
import G.C0220r0;
import Q.AbstractC0274j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class v0 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public u0 f8206t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8207u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8208v;

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f8208v ? interfaceC0944E.X(Integer.MAX_VALUE) : interfaceC0944E.X(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f8208v ? interfaceC0944E.S(Integer.MAX_VALUE) : interfaceC0944E.S(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f8208v ? interfaceC0944E.Z(i2) : interfaceC0944E.Z(Integer.MAX_VALUE);
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f8208v ? interfaceC0944E.b(i2) : interfaceC0944E.b(Integer.MAX_VALUE);
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        M1.a.q(j4, this.f8208v ? o.N.f8665d : o.N.f8666e);
        AbstractC0954O a4 = interfaceC0944E.a(M0.a.b(j4, 0, this.f8208v ? M0.a.i(j4) : Integer.MAX_VALUE, 0, this.f8208v ? Integer.MAX_VALUE : M0.a.h(j4), 5));
        int i2 = a4.f9005d;
        int i4 = M0.a.i(j4);
        if (i2 > i4) {
            i2 = i4;
        }
        int i5 = a4.f9006e;
        int h4 = M0.a.h(j4);
        if (i5 > h4) {
            i5 = h4;
        }
        int i6 = a4.f9006e - i5;
        int i7 = a4.f9005d - i2;
        if (!this.f8208v) {
            i6 = i7;
        }
        u0 u0Var = this.f8206t;
        C0199g0 c0199g0 = u0Var.f8197d;
        C0199g0 c0199g02 = u0Var.f8194a;
        c0199g0.f(i6);
        AbstractC0274j c4 = Q.w.c();
        Function1 f4 = c4 != null ? c4.f() : null;
        AbstractC0274j d4 = Q.w.d(c4);
        try {
            if (c0199g02.d() > i6) {
                c0199g02.f(i6);
            }
            Unit unit = Unit.f7487a;
            Q.w.f(c4, d4, f4);
            this.f8206t.f8195b.f(this.f8208v ? i5 : i2);
            t4 = interfaceC0947H.t(i2, i5, C1412P.c(), new C0220r0(i6, 1, this, a4));
            return t4;
        } catch (Throwable th) {
            Q.w.f(c4, d4, f4);
            throw th;
        }
    }
}
