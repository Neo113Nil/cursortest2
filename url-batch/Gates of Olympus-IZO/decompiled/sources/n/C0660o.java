package n;

import a0.AbstractC0158a;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0278k;
import b0.C0288u;
import b0.InterfaceC0263N;
import d0.C0321b;
import d0.C0325f;
import d0.InterfaceC0323d;
import t0.AbstractC0898f;
import t0.InterfaceC0907o;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660o extends U.k implements InterfaceC0907o, t0.c0 {

    /* renamed from: q, reason: collision with root package name */
    public long f6129q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0259J f6130r;

    /* renamed from: s, reason: collision with root package name */
    public float f6131s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0263N f6132t;

    /* renamed from: u, reason: collision with root package name */
    public long f6133u;

    /* renamed from: v, reason: collision with root package name */
    public M0.j f6134v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0257H f6135w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0263N f6136x;

    @Override // t0.InterfaceC0907o
    public final void d(t0.F f3) {
        C0278k c0278k;
        C0278k c0278k2;
        t0.F f4;
        if (this.f6132t == AbstractC0259J.f4215a) {
            if (!C0288u.c(this.f6129q, C0288u.f4296f)) {
                InterfaceC0323d.s(f3, this.f6129q, 0L, 0L, null, 126);
            }
            AbstractC0259J abstractC0259J = this.f6130r;
            if (abstractC0259J != null) {
                InterfaceC0323d.q(f3, abstractC0259J, 0L, 0L, this.f6131s, null, 118);
            }
        } else {
            Z1.t tVar = new Z1.t();
            C0321b c0321b = f3.f7748d;
            if (a0.f.a(c0321b.c(), this.f6133u) && f3.getLayoutDirection() == this.f6134v && Z1.i.a(this.f6136x, this.f6132t)) {
                AbstractC0257H abstractC0257H = this.f6135w;
                Z1.i.c(abstractC0257H);
                tVar.f3480d = abstractC0257H;
            } else {
                AbstractC0898f.q(this, new E2.j(tVar, this, f3, 1));
            }
            this.f6135w = (AbstractC0257H) tVar.f3480d;
            this.f6133u = c0321b.c();
            this.f6134v = f3.getLayoutDirection();
            this.f6136x = this.f6132t;
            Object obj = tVar.f3480d;
            Z1.i.c(obj);
            AbstractC0257H abstractC0257H2 = (AbstractC0257H) obj;
            boolean c3 = C0288u.c(this.f6129q, C0288u.f4296f);
            C0325f c0325f = C0325f.f4448b;
            if (!c3) {
                long j3 = this.f6129q;
                if (abstractC0257H2 instanceof C0255F) {
                    a0.d dVar = ((C0255F) abstractC0257H2).f4212a;
                    f3.x(j3, I2.l.f(dVar.f3491a, dVar.f3492b), I2.d.h(dVar.c(), dVar.b()), 1.0f, c0325f, null, 3);
                } else {
                    if (abstractC0257H2 instanceof C0256G) {
                        C0256G c0256g = (C0256G) abstractC0257H2;
                        C0278k c0278k3 = c0256g.f4214b;
                        if (c0278k3 != null) {
                            f4 = f3;
                            c0278k2 = c0278k3;
                        } else {
                            a0.e eVar = c0256g.f4213a;
                            float b2 = AbstractC0158a.b(eVar.f3502h);
                            long f5 = I2.l.f(eVar.f3495a, eVar.f3496b);
                            long h3 = I2.d.h(eVar.b(), eVar.a());
                            long a3 = M1.B.a(b2, b2);
                            c0321b.f4443d.f4441c.m(a0.c.d(f5), a0.c.e(f5), a0.f.d(h3) + a0.c.d(f5), a0.f.b(h3) + a0.c.e(f5), AbstractC0158a.b(a3), AbstractC0158a.c(a3), C0321b.b(c0321b, j3, c0325f, 1.0f, null, 3));
                        }
                    } else {
                        if (!(abstractC0257H2 instanceof C0254E)) {
                            throw new L1.f();
                        }
                        c0278k2 = ((C0254E) abstractC0257H2).f4211a;
                        f4 = f3;
                    }
                    f4.M(c0278k2, j3, 1.0f, c0325f, null, 3);
                }
            }
            AbstractC0259J abstractC0259J2 = this.f6130r;
            if (abstractC0259J2 != null) {
                float f6 = this.f6131s;
                if (abstractC0257H2 instanceof C0255F) {
                    a0.d dVar2 = ((C0255F) abstractC0257H2).f4212a;
                    f3.e(abstractC0259J2, I2.l.f(dVar2.f3491a, dVar2.f3492b), I2.d.h(dVar2.c(), dVar2.b()), f6, c0325f, null, 3);
                } else {
                    if (abstractC0257H2 instanceof C0256G) {
                        C0256G c0256g2 = (C0256G) abstractC0257H2;
                        c0278k = c0256g2.f4214b;
                        if (c0278k == null) {
                            a0.e eVar2 = c0256g2.f4213a;
                            float b3 = AbstractC0158a.b(eVar2.f3502h);
                            f3.h(abstractC0259J2, I2.l.f(eVar2.f3495a, eVar2.f3496b), I2.d.h(eVar2.b(), eVar2.a()), M1.B.a(b3, b3), f6, c0325f, null, 3);
                        }
                    } else {
                        if (!(abstractC0257H2 instanceof C0254E)) {
                            throw new L1.f();
                        }
                        c0278k = ((C0254E) abstractC0257H2).f4211a;
                    }
                    f3.z(c0278k, abstractC0259J2, f6, c0325f, null, 3);
                }
            }
        }
        f3.b();
    }

    @Override // t0.c0
    public final void d0() {
        this.f6133u = 9205357640488583168L;
        this.f6134v = null;
        this.f6135w = null;
        this.f6136x = null;
        AbstractC0898f.m(this);
    }
}
