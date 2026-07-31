package n;

import I.C0125v0;
import f2.InterfaceC0390e;
import k2.AbstractC0552y;
import q.C0769d;
import q.C0770e;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.InterfaceC0908p;
import t0.n0;
import u.C0921C;
import z0.C1076a;

/* renamed from: n.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639J extends AbstractC0905m implements Z.b, n0, InterfaceC0908p, Z.o {

    /* renamed from: s, reason: collision with root package name */
    public Z.p f6009s;

    /* renamed from: t, reason: collision with root package name */
    public final C0637H f6010t;

    /* renamed from: u, reason: collision with root package name */
    public final C0640K f6011u;

    /* renamed from: v, reason: collision with root package name */
    public final C0641L f6012v;

    public C0639J(q.j jVar) {
        C0637H c0637h = new C0637H();
        c0637h.f6005q = jVar;
        v0(c0637h);
        this.f6010t = c0637h;
        C0640K c0640k = new C0640K();
        v0(c0640k);
        this.f6011u = c0640k;
        C0641L c0641l = new C0641L();
        v0(c0641l);
        this.f6012v = c0641l;
        v0(new Z.q());
    }

    @Override // t0.InterfaceC0908p
    public final void b0(t0.a0 a0Var) {
        this.f6012v.b0(a0Var);
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        Z.p pVar = this.f6009s;
        boolean z3 = false;
        if (pVar != null && pVar.a()) {
            z3 = true;
        }
        InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
        z0.t tVar = z0.q.f9020k;
        InterfaceC0390e interfaceC0390e = z0.s.f9036a[4];
        tVar.a(iVar, Boolean.valueOf(z3));
        iVar.d(z0.h.f8975t, new C1076a(null, new A2.l(26, this)));
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // Z.b
    public final void t(Z.p pVar) {
        C0642M v0;
        if (Z1.i.a(this.f6009s, pVar)) {
            return;
        }
        boolean a3 = pVar.a();
        C0921C c0921c = null;
        if (a3) {
            AbstractC0552y.q(j0(), null, null, new C0638I(this, null), 3);
        }
        if (this.p) {
            AbstractC0898f.o(this);
        }
        C0637H c0637h = this.f6010t;
        q.j jVar = c0637h.f6005q;
        if (jVar != null) {
            if (a3) {
                C0769d c0769d = c0637h.f6006r;
                if (c0769d != null) {
                    c0637h.v0(jVar, new C0770e(c0769d));
                    c0637h.f6006r = null;
                }
                C0769d c0769d2 = new C0769d();
                c0637h.v0(jVar, c0769d2);
                c0637h.f6006r = c0769d2;
            } else {
                C0769d c0769d3 = c0637h.f6006r;
                if (c0769d3 != null) {
                    c0637h.v0(jVar, new C0770e(c0769d3));
                    c0637h.f6006r = null;
                }
            }
        }
        C0641L c0641l = this.f6012v;
        if (a3 != c0641l.f6016q) {
            if (a3) {
                t0.a0 a0Var = c0641l.f6017r;
                if (a0Var != null && a0Var.B0().p && (v0 = c0641l.v0()) != null) {
                    v0.v0(c0641l.f6017r);
                }
            } else {
                C0642M v02 = c0641l.v0();
                if (v02 != null) {
                    v02.v0(null);
                }
            }
            c0641l.f6016q = a3;
        }
        C0640K c0640k = this.f6011u;
        if (a3) {
            c0640k.getClass();
            Z1.t tVar = new Z1.t();
            AbstractC0898f.q(c0640k, new C0125v0(tVar, 5, c0640k));
            C0921C c0921c2 = (C0921C) tVar.f3480d;
            if (c0921c2 != null) {
                c0921c2.a();
                c0921c = c0921c2;
            }
            c0640k.f6013q = c0921c;
        } else {
            C0921C c0921c3 = c0640k.f6013q;
            if (c0921c3 != null) {
                c0921c3.b();
            }
            c0640k.f6013q = null;
        }
        c0640k.f6014r = a3;
        this.f6009s = pVar;
    }

    public final void y0(q.j jVar) {
        C0769d c0769d;
        C0637H c0637h = this.f6010t;
        if (Z1.i.a(c0637h.f6005q, jVar)) {
            return;
        }
        q.j jVar2 = c0637h.f6005q;
        if (jVar2 != null && (c0769d = c0637h.f6006r) != null) {
            jVar2.c(new C0770e(c0769d));
        }
        c0637h.f6006r = null;
        c0637h.f6005q = jVar;
    }
}
