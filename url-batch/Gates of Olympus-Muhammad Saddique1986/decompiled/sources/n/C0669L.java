package n;

import l2.InterfaceC0604e;
import q.C0808d;
import q.C0809e;
import q2.AbstractC0837y;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.InterfaceC1003p;

/* renamed from: n.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669L extends AbstractC1000m implements Z.c, t0.o0, InterfaceC1003p, Z.q {

    /* renamed from: s, reason: collision with root package name */
    public Z.s f7054s;

    /* renamed from: t, reason: collision with root package name */
    public final C0667J f7055t;

    /* renamed from: u, reason: collision with root package name */
    public final C0670M f7056u;

    /* renamed from: v, reason: collision with root package name */
    public final C0671N f7057v;

    public C0669L(q.k kVar) {
        C0667J c0667j = new C0667J();
        c0667j.f7050q = kVar;
        y0(c0667j);
        this.f7055t = c0667j;
        C0670M c0670m = new C0670M();
        y0(c0670m);
        this.f7056u = c0670m;
        C0671N c0671n = new C0671N();
        y0(c0671n);
        this.f7057v = c0671n;
        y0(new Z.t());
    }

    public final void B0(q.k kVar) {
        C0808d c0808d;
        C0667J c0667j = this.f7055t;
        if (f2.j.a(c0667j.f7050q, kVar)) {
            return;
        }
        q.k kVar2 = c0667j.f7050q;
        if (kVar2 != null && (c0808d = c0667j.f7051r) != null) {
            kVar2.c(new C0809e(c0808d));
        }
        c0667j.f7051r = null;
        c0667j.f7050q = kVar;
    }

    @Override // t0.InterfaceC1003p
    public final void c0(t0.b0 b0Var) {
        this.f7057v.c0(b0Var);
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        Z.s sVar = this.f7054s;
        boolean z3 = false;
        if (sVar != null && sVar.a()) {
            z3 = true;
        }
        InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
        A0.v vVar = A0.s.f176k;
        InterfaceC0604e interfaceC0604e = A0.u.f193a[4];
        vVar.a(iVar, Boolean.valueOf(z3));
        iVar.c(A0.h.f123u, new A0.a(null, new A.h(26, this)));
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // Z.c
    public final void u(Z.s sVar) {
        C0672O y02;
        if (f2.j.a(this.f7054s, sVar)) {
            return;
        }
        boolean a3 = sVar.a();
        t.w wVar = null;
        if (a3) {
            AbstractC0837y.r(m0(), null, null, new C0668K(this, null), 3);
        }
        if (this.f4501p) {
            AbstractC0993f.o(this);
        }
        C0667J c0667j = this.f7055t;
        q.k kVar = c0667j.f7050q;
        if (kVar != null) {
            if (a3) {
                C0808d c0808d = c0667j.f7051r;
                if (c0808d != null) {
                    c0667j.y0(kVar, new C0809e(c0808d));
                    c0667j.f7051r = null;
                }
                C0808d c0808d2 = new C0808d();
                c0667j.y0(kVar, c0808d2);
                c0667j.f7051r = c0808d2;
            } else {
                C0808d c0808d3 = c0667j.f7051r;
                if (c0808d3 != null) {
                    c0667j.y0(kVar, new C0809e(c0808d3));
                    c0667j.f7051r = null;
                }
            }
        }
        C0671N c0671n = this.f7057v;
        if (a3 != c0671n.f7061q) {
            if (a3) {
                t0.b0 b0Var = c0671n.f7062r;
                if (b0Var != null && b0Var.K0().f4501p && (y02 = c0671n.y0()) != null) {
                    y02.y0(c0671n.f7062r);
                }
            } else {
                C0672O y03 = c0671n.y0();
                if (y03 != null) {
                    y03.y0(null);
                }
            }
            c0671n.f7061q = a3;
        }
        C0670M c0670m = this.f7056u;
        if (a3) {
            c0670m.getClass();
            f2.u uVar = new f2.u();
            AbstractC0993f.q(c0670m, new B.f0(uVar, 6, c0670m));
            t.w wVar2 = (t.w) uVar.f5832d;
            if (wVar2 != null) {
                wVar2.a();
                wVar = wVar2;
            }
            c0670m.f7058q = wVar;
        } else {
            t.w wVar3 = c0670m.f7058q;
            if (wVar3 != null) {
                wVar3.b();
            }
            c0670m.f7058q = null;
        }
        c0670m.f7059r = a3;
        this.f7054s = sVar;
    }
}
