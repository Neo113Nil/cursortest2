package m;

import kotlin.jvm.internal.Intrinsics;
import p.C0928d;
import p.C0929e;
import p.C0935k;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.InterfaceC1075p;
import y0.C1317a;

/* loaded from: classes.dex */
public final class J extends AbstractC1073n implements X.c, r0.n0, InterfaceC1075p, X.q {

    /* renamed from: v, reason: collision with root package name */
    public X.s f8024v;

    /* renamed from: w, reason: collision with root package name */
    public final H f8025w;

    /* renamed from: x, reason: collision with root package name */
    public final K f8026x;

    /* renamed from: y, reason: collision with root package name */
    public final L f8027y;

    public J(C0935k c0935k) {
        H h4 = new H();
        h4.f8020t = c0935k;
        B0(h4);
        this.f8025w = h4;
        K k4 = new K();
        B0(k4);
        this.f8026x = k4;
        L l4 = new L();
        B0(l4);
        this.f8027y = l4;
        B0(new X.t());
    }

    public final void E0(C0935k c0935k) {
        C0928d c0928d;
        H h4 = this.f8025w;
        if (Intrinsics.a(h4.f8020t, c0935k)) {
            return;
        }
        C0935k c0935k2 = h4.f8020t;
        if (c0935k2 != null && (c0928d = h4.f8021u) != null) {
            c0935k2.c(new C0929e(c0928d));
        }
        h4.f8021u = null;
        h4.f8020t = c0935k;
    }

    @Override // r0.InterfaceC1075p
    public final void H(r0.a0 a0Var) {
        this.f8027y.H(a0Var);
    }

    @Override // X.c
    public final void Q(X.s sVar) {
        M B02;
        if (Intrinsics.a(this.f8024v, sVar)) {
            return;
        }
        boolean a4 = sVar.a();
        s.v vVar = null;
        if (a4) {
            W2.B.m(p0(), null, null, new I(this, null), 3);
        }
        if (this.f3990s) {
            AbstractC1065f.p(this);
        }
        H h4 = this.f8025w;
        C0935k c0935k = h4.f8020t;
        if (c0935k != null) {
            if (a4) {
                C0928d c0928d = h4.f8021u;
                if (c0928d != null) {
                    h4.B0(c0935k, new C0929e(c0928d));
                    h4.f8021u = null;
                }
                C0928d c0928d2 = new C0928d();
                h4.B0(c0935k, c0928d2);
                h4.f8021u = c0928d2;
            } else {
                C0928d c0928d3 = h4.f8021u;
                if (c0928d3 != null) {
                    h4.B0(c0935k, new C0929e(c0928d3));
                    h4.f8021u = null;
                }
            }
        }
        L l4 = this.f8027y;
        if (a4 != l4.f8031t) {
            if (a4) {
                r0.a0 a0Var = l4.f8032u;
                if (a0Var != null && a0Var.O0().f3990s && (B02 = l4.B0()) != null) {
                    B02.B0(l4.f8032u);
                }
            } else {
                M B03 = l4.B0();
                if (B03 != null) {
                    B03.B0(null);
                }
            }
            l4.f8031t = a4;
        }
        K k4 = this.f8026x;
        if (a4) {
            k4.getClass();
            M2.E e4 = new M2.E();
            AbstractC1065f.s(k4, new A.f0(e4, 6, k4));
            s.v vVar2 = (s.v) e4.f3580d;
            if (vVar2 != null) {
                vVar2.a();
                vVar = vVar2;
            }
            k4.f8028t = vVar;
        } else {
            s.v vVar3 = k4.f8028t;
            if (vVar3 != null) {
                vVar3.b();
            }
            k4.f8028t = null;
        }
        k4.f8029u = a4;
        this.f8024v = sVar;
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        X.s sVar = this.f8024v;
        boolean z4 = false;
        if (sVar != null && sVar.a()) {
            z4 = true;
        }
        S2.e[] eVarArr = y0.s.f11639a;
        y0.t tVar = y0.q.f11622k;
        S2.e eVar = y0.s.f11639a[4];
        tVar.a(iVar, Boolean.valueOf(z4));
        iVar.s(y0.h.f11570u, new C1317a(null, new A3.e(19, this)));
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }
}
