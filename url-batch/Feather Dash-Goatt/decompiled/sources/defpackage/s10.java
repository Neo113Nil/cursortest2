package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s10 extends zq implements j81, u40, ul, uq0, kj1 {
    public static final j50 A = new j50(21);
    public gn0 u;
    public final e v;
    public w00 w;
    public we0 x;
    public qp0 y;
    public final o10 z;

    public s10(gn0 gn0Var, e eVar) {
        this.u = gn0Var;
        this.v = eVar;
        o10 o10Var = new o10(0, new l10(2, this, s10.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 10);
        z0(o10Var);
        this.z = o10Var;
    }

    @Override // defpackage.uq0
    public final void B() {
        z11 z11Var = new z11();
        gb0.G(this, new vc(z11Var, 2, this));
        we0 we0Var = (we0) z11Var.d;
        if (this.z.E0().a()) {
            we0 we0Var2 = this.x;
            if (we0Var2 != null) {
                we0Var2.b();
            }
            if (we0Var != null) {
                we0Var.a();
            } else {
                we0Var = null;
            }
            this.x = we0Var;
        }
    }

    public final void C0(gn0 gn0Var, ga0 ga0Var) {
        if (!this.r) {
            gn0Var.b(ga0Var);
            return;
        }
        jb0 jb0Var = (jb0) ((cn) n0()).d.d(j41.m);
        uq1.N(n0(), null, new f(gn0Var, ga0Var, jb0Var != null ? jb0Var.h(new c(gn0Var, 4, ga0Var)) : null, null, 7), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void D0() {
        l7 l7Var;
        if (this.r) {
            if (!this.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = this.d.i;
            jd0 I = op.I(this);
            while (I != null) {
                if ((((zl0) I.J.g).h & 262144) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 262144) != 0) {
                            zq zqVar = zl0Var;
                            ?? r4 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof kj1) {
                                    if (t10.s == ((kj1) zqVar).h()) {
                                        return;
                                    }
                                } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i = 0;
                                    zqVar = zqVar;
                                    r4 = r4;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 262144) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r4.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r4.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r4 = r4;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                zqVar = op.o(r4);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
        }
    }

    public final void E0(gn0 gn0Var) {
        w00 w00Var;
        if (Intrinsics.a(this.u, gn0Var)) {
            return;
        }
        gn0 gn0Var2 = this.u;
        if (gn0Var2 != null && (w00Var = this.w) != null) {
            gn0Var2.b(new x00(w00Var));
        }
        this.w = null;
        this.u = gn0Var;
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        boolean a = this.z.E0().a();
        dc0[] dc0VarArr = s81.a;
        t81 t81Var = p81.k;
        dc0 dc0Var = s81.a[4];
        u81Var.a(t81Var, Boolean.valueOf(a));
        u81Var.a(g81.v, new z0(null, new v3(0, this, s10.class, "requestFocus", "requestFocus()Z", 0, 2)));
    }

    @Override // defpackage.kj1
    public final Object h() {
        return A;
    }

    @Override // defpackage.u40
    public final void n(qp0 qp0Var) {
        this.y = qp0Var;
        if (this.z.E0().a()) {
            if (!qp0Var.J0().r) {
                D0();
                return;
            }
            qp0 qp0Var2 = this.y;
            if (qp0Var2 == null || !qp0Var2.J0().r) {
                return;
            }
            D0();
        }
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.zl0
    public final void t0() {
        we0 we0Var = this.x;
        if (we0Var != null) {
            we0Var.b();
        }
        this.x = null;
    }
}
