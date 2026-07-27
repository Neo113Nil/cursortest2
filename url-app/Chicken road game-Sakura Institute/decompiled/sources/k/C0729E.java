package k;

import kotlin.jvm.functions.Function0;
import l.f0;
import l.g0;
import l.m0;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729E extends S.n implements InterfaceC1081w {

    /* renamed from: A, reason: collision with root package name */
    public long f7243A = s.f7321a;
    public S.c B;

    /* renamed from: C, reason: collision with root package name */
    public final C0728D f7244C;

    /* renamed from: t, reason: collision with root package name */
    public m0 f7245t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f7246u;

    /* renamed from: v, reason: collision with root package name */
    public g0 f7247v;

    /* renamed from: w, reason: collision with root package name */
    public C0730F f7248w;

    /* renamed from: x, reason: collision with root package name */
    public C0731G f7249x;

    /* renamed from: y, reason: collision with root package name */
    public Function0 f7250y;

    /* renamed from: z, reason: collision with root package name */
    public x f7251z;

    public C0729E(m0 m0Var, g0 g0Var, g0 g0Var2, C0730F c0730f, C0731G c0731g, Function0 function0, x xVar) {
        this.f7245t = m0Var;
        this.f7246u = g0Var;
        this.f7247v = g0Var2;
        this.f7248w = c0730f;
        this.f7249x = c0731g;
        this.f7250y = function0;
        this.f7251z = xVar;
        u3.d.b(0, 0, 15);
        this.f7244C = new C0728D(this, 0);
        new C0728D(this, 1);
    }

    public final S.c B0() {
        if (this.f7245t.f().a(w.f7338d, w.f7339e)) {
            t tVar = this.f7248w.f7253a.f7269b;
            if (tVar == null && (tVar = this.f7249x.f7256a.f7269b) == null) {
                return null;
            }
            return tVar.f7322a;
        }
        t tVar2 = this.f7249x.f7256a.f7269b;
        if (tVar2 == null && (tVar2 = this.f7248w.f7253a.f7269b) == null) {
            return null;
        }
        return tVar2.f7322a;
    }

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.X(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.S(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.Z(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.b(i2);
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        InterfaceC0946G t6;
        Object obj = null;
        if (this.f7245t.f7800a.l() == this.f7245t.f7803d.getValue()) {
            this.B = null;
        } else if (this.B == null) {
            S.c B02 = B0();
            if (B02 == null) {
                B02 = S.b.f3952d;
            }
            this.B = B02;
        }
        if (interfaceC0947H.A()) {
            AbstractC0954O a4 = interfaceC0944E.a(j4);
            long c4 = u3.d.c(a4.f9005d, a4.f9006e);
            this.f7243A = c4;
            t6 = interfaceC0947H.t((int) (c4 >> 32), (int) (c4 & 4294967295L), C1412P.c(), new P0.n(a4, 2));
            return t6;
        }
        if (!((Boolean) this.f7250y.invoke()).booleanValue()) {
            AbstractC0954O a5 = interfaceC0944E.a(j4);
            t4 = interfaceC0947H.t(a5.f9005d, a5.f9006e, C1412P.c(), new P0.n(a5, 3));
            return t4;
        }
        x xVar = this.f7251z;
        g0 g0Var = xVar.f7342a;
        C0730F c0730f = xVar.f7345d;
        C0731G c0731g = xVar.f7346e;
        f0 a6 = g0Var != null ? g0Var.a(new y(c0730f, c0731g, 0), new y(c0730f, c0731g, 1)) : null;
        g0 g0Var2 = xVar.f7343b;
        f0 a7 = g0Var2 != null ? g0Var2.a(new y(c0730f, c0731g, 2), new y(c0730f, c0731g, 3)) : null;
        if (xVar.f7344c.f7800a.l() == w.f7338d) {
            O o4 = c0731g.f7256a;
        } else {
            O o5 = c0731g.f7256a;
        }
        g0 g0Var3 = xVar.f7347f;
        P.h hVar = new P.h(a6, a7, g0Var3 != null ? g0Var3.a(u.f7329k, new P.h(obj, c0730f, c0731g, 6)) : null, 5);
        AbstractC0954O a8 = interfaceC0944E.a(j4);
        long c5 = u3.d.c(a8.f9005d, a8.f9006e);
        long j5 = !M0.j.a(this.f7243A, s.f7321a) ? this.f7243A : c5;
        g0 g0Var4 = this.f7246u;
        f0 a9 = g0Var4 != null ? g0Var4.a(this.f7244C, new C0727C(this, j5, 0)) : null;
        if (a9 != null) {
            c5 = ((M0.j) a9.getValue()).f3554a;
        }
        long p4 = u3.d.p(j4, c5);
        g0 g0Var5 = this.f7247v;
        long j6 = g0Var5 != null ? ((M0.h) g0Var5.a(u.f7332n, new C0727C(this, j5, 1)).getValue()).f3548a : 0L;
        S.c cVar = this.B;
        t5 = interfaceC0947H.t((int) (p4 >> 32), (int) (4294967295L & p4), C1412P.c(), new C0726B(a8, M0.h.c(cVar != null ? cVar.a(j5, p4, M0.k.f3555d) : 0L, 0L), j6, hVar, 0));
        return t5;
    }

    @Override // S.n
    public final void t0() {
        this.f7243A = s.f7321a;
    }
}
