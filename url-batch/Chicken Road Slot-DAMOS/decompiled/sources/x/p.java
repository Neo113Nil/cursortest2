package x;

import a3.z;
import b0.l0;
import c2.c2;
import c2.i1;
import c2.k1;
import c2.x1;
import ge.a0;
import ge.c1;
import ge.f1;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import wd.b0;
import wd.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends c2.j implements x1, c2.m, c2.h, k1, c2 {
    public static final o J = new o(2);
    public z.f E;
    public final f1 F;
    public z.a G;
    public i1 H;
    public final i1.t I;

    public p(z.f fVar, f1 f1Var) {
        this.E = fVar;
        this.F = f1Var;
        i1.t tVar = new i1.t(0, new z(2, this, p.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 10);
        I(tVar);
        this.I = tVar;
    }

    public final void L(z.f fVar, z.e eVar) {
        if (!this.B) {
            fVar.b(eVar);
            return;
        }
        c1 c1Var = (c1) ((le.d) w()).f5969d.m(ge.u.f4403e);
        a0.s(w(), null, new b5.t(fVar, eVar, c1Var != null ? c1Var.o(new l0(24, fVar, eVar)) : null, null, 15), 3);
    }

    public final void M(z.f fVar) {
        z.a aVar;
        if (Intrinsics.a(this.E, fVar)) {
            return;
        }
        z.f fVar2 = this.E;
        if (fVar2 != null && (aVar = this.G) != null) {
            fVar2.b(new z.b(aVar));
        }
        this.G = null;
        this.E = fVar;
    }

    @Override // c2.c2
    public final Object d() {
        return J;
    }

    @Override // c2.k1
    public final void h() {
        b0 b0Var = new b0();
        c2.k.r(this, new a4.a(14, b0Var, this));
        if (b0Var.f10141d == null) {
            this.I.M().a();
        } else {
            i0.j();
        }
    }

    @Override // c2.m
    public final void t(i1 i1Var) {
        this.H = i1Var;
        if (this.I.M().a()) {
            boolean z10 = i1Var.D0().B;
            o oVar = q.C;
            if (!z10) {
                if (this.B) {
                    c2.k.j(this, oVar);
                }
            } else {
                i1 i1Var2 = this.H;
                if (i1Var2 != null && i1Var2.D0().B && this.B) {
                    c2.k.j(this, oVar);
                }
            }
        }
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        boolean a9 = this.I.M().a();
        y[] yVarArr = j2.s.f5019a;
        j2.t tVar = j2.q.f5002l;
        y yVar = j2.s.f5019a[4];
        uVar.b(tVar, Boolean.valueOf(a9));
        uVar.b(j2.i.f4969u, new j2.a(null, new d2.o(0, this, p.class, "requestFocus", "requestFocus()Z", 0, 6)));
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }

    @Override // d1.k
    public final void C() {
    }
}
