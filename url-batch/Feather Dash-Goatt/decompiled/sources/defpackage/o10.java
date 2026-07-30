package defpackage;

import android.os.Trace;
import com.appsflyer.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o10 extends zl0 implements ul, sc0, uq0, cm0, yq {
    public final boolean s;
    public final Function2 t;
    public boolean u;
    public boolean v;
    public final int w;

    public o10(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.s = z;
        this.t = function2;
        this.w = i;
    }

    public final void A0(j10 j10Var, j10 j10Var2) {
        l7 l7Var;
        Function2 function2;
        e10 e10Var = (e10) ((d4) op.J(this)).getFocusOwner();
        o10 f = e10Var.f();
        if (!j10Var.equals(j10Var2) && (function2 = this.t) != null) {
            function2.b(j10Var, j10Var2);
        }
        zl0 zl0Var = this.d;
        if (!zl0Var.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var2 = this.d;
        jd0 I = op.I(this);
        while (I != null) {
            if ((((zl0) I.J.g).h & 5120) != 0) {
                while (zl0Var2 != null) {
                    int i = zl0Var2.g;
                    if ((i & 5120) != 0) {
                        if (zl0Var2 != zl0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            zl0 zl0Var3 = zl0Var2;
                            eo0 eo0Var = null;
                            while (zl0Var3 != null) {
                                if (zl0Var3 instanceof xc) {
                                    xc xcVar = (xc) zl0Var3;
                                    if (f == e10Var.f()) {
                                        xcVar.A0();
                                        throw null;
                                    }
                                } else if ((zl0Var3.g & 4096) != 0 && (zl0Var3 instanceof zq)) {
                                    int i2 = 0;
                                    for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                        if ((zl0Var4.g & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                zl0Var3 = zl0Var4;
                                            } else {
                                                if (eo0Var == null) {
                                                    eo0Var = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var3 != null) {
                                                    eo0Var.b(zl0Var3);
                                                    zl0Var3 = null;
                                                }
                                                eo0Var.b(zl0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zl0Var3 = op.o(eo0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    zl0Var2 = zl0Var2.i;
                }
            }
            I = I.s();
            zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
    }

    @Override // defpackage.uq0
    public final void B() {
        F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eo0] */
    public final g10 B0() {
        boolean z;
        l7 l7Var;
        g10 g10Var = new g10();
        g10Var.a = true;
        i10 i10Var = i10.b;
        g10Var.b = i10Var;
        g10Var.c = i10Var;
        g10Var.d = i10Var;
        g10Var.e = i10Var;
        g10Var.f = i10Var;
        g10Var.g = i10Var;
        g10Var.h = i10Var;
        g10Var.i = i10Var;
        g10Var.j = y3.s;
        g10Var.k = y3.t;
        g10Var.l = j41.l;
        int i = this.w;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((z80) ((b90) ((a90) mo.k(this, yl.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                dd0.j("Unknown Focusability");
                return null;
            }
            z = false;
        }
        g10Var.a = z;
        zl0 zl0Var = this.d;
        if (!zl0Var.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var2 = this.d;
        jd0 I = op.I(this);
        loop0: while (I != null) {
            if ((((zl0) I.J.g).h & 3072) != 0) {
                while (zl0Var2 != null) {
                    int i2 = zl0Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (zl0Var2 != zl0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? r7 = 0;
                            zq zqVar = zl0Var2;
                            while (zqVar != 0) {
                                if (zqVar instanceof h10) {
                                    ((h10) zqVar).J(g10Var);
                                } else if ((zqVar.g & 2048) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var3 = zqVar.t;
                                    int i3 = 0;
                                    zqVar = zqVar;
                                    r7 = r7;
                                    while (zl0Var3 != null) {
                                        if ((zl0Var3.g & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                zqVar = zl0Var3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r7.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r7.b(zl0Var3);
                                            }
                                        }
                                        zl0Var3 = zl0Var3.j;
                                        zqVar = zqVar;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zqVar = op.o(r7);
                            }
                        }
                    }
                    zl0Var2 = zl0Var2.i;
                }
            }
            I = I.s();
            zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
        return g10Var;
    }

    public final s11 C0(uc0 uc0Var) {
        s11 s11Var = B0().l;
        return s11Var != j41.l ? uc0Var == null ? s11Var : s11Var.e(uc0Var.F(op.H(this), 0L)) : uc0Var != null ? uc0Var.J(op.H(this), false) : t90.c(0L, ca0.x(op.H(this).g));
    }

    public final je0 D0() {
        l7 l7Var;
        Object obj;
        if (!this.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var = this.d.i;
        jd0 I = op.I(this);
        while (true) {
            if (I == null) {
                break;
            }
            if ((((zl0) I.J.g).h & 8388640) != 0) {
                while (zl0Var != null) {
                    int i = zl0Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(zl0Var instanceof je0)) {
                                if (zl0Var instanceof zq) {
                                    zl0Var = null;
                                    for (zl0 zl0Var2 = ((zq) zl0Var).t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
                                        if (zl0Var2 instanceof je0) {
                                            zl0Var = zl0Var2;
                                        }
                                    }
                                } else {
                                    zl0Var = null;
                                }
                            }
                            je0 je0Var = (je0) zl0Var;
                            if (je0Var != null) {
                                return je0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (zl0Var instanceof cm0) {
                                obj = zl0Var;
                            } else if (zl0Var instanceof zq) {
                                obj = null;
                                for (zl0 zl0Var3 = ((zq) zl0Var).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                    if (zl0Var3 instanceof cm0) {
                                        obj = zl0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            cm0 cm0Var = (cm0) obj;
                            if (cm0Var != null) {
                                cm0Var.c();
                            }
                        }
                    }
                    zl0Var = zl0Var.i;
                }
            }
            I = I.s();
            zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
        return null;
    }

    public final j10 E0() {
        l7 l7Var;
        if (!this.r) {
            return j10.g;
        }
        o10 f = ((e10) ((d4) op.J(this)).getFocusOwner()).f();
        if (f == null) {
            return j10.g;
        }
        if (this == f) {
            return j10.d;
        }
        if (f.r) {
            if (!f.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = f.d.i;
            jd0 I = op.I(f);
            while (I != null) {
                if ((((zl0) I.J.g).h & 1024) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 1024) != 0) {
                            zl0 zl0Var2 = zl0Var;
                            eo0 eo0Var = null;
                            while (zl0Var2 != null) {
                                if (zl0Var2 instanceof o10) {
                                    if (this == ((o10) zl0Var2)) {
                                        return j10.e;
                                    }
                                } else if ((zl0Var2.g & 1024) != 0 && (zl0Var2 instanceof zq)) {
                                    int i = 0;
                                    for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                        if ((zl0Var3.g & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                zl0Var2 = zl0Var3;
                                            } else {
                                                if (eo0Var == null) {
                                                    eo0Var = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var2 != null) {
                                                    eo0Var.b(zl0Var2);
                                                    zl0Var2 = null;
                                                }
                                                eo0Var.b(zl0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                zl0Var2 = op.o(eo0Var);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
        }
        return j10.g;
    }

    public final void F0() {
        int ordinal = E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                l.a();
                return;
            }
        }
        z11 z11Var = new z11();
        gb0.G(this, new w3(z11Var, 5, this));
        Object obj = z11Var.d;
        if (obj == null) {
            Intrinsics.e("focusProperties");
            throw null;
        }
        if (((f10) obj).c()) {
            return;
        }
        ((e10) ((d4) op.J(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean G0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return B0().a ? z0(i) : gb0.s(this, i, new z3(i, 3));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.zl0
    public final void s0() {
        int ordinal = E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b10 focusOwner = ((d4) op.J(this)).getFocusOwner();
                o10 E = uq1.E(this);
                if (E == null || !E.s) {
                    return;
                }
                e10 e10Var = (e10) focusOwner;
                e10Var.a.D();
                e10Var.d.a();
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                l.a();
                return;
            }
        }
        e10 e10Var2 = (e10) ((d4) op.J(this)).getFocusOwner();
        e10Var2.b(8, true, false);
        if (this.s) {
            e10Var2.a.D();
        }
        e10Var2.d.a();
    }

    @Override // defpackage.zl0
    public final void t0() {
        if (E0().a()) {
            ((e10) ((d4) op.J(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean z0(int i) {
        int ordinal = la0.S(this, i).ordinal();
        if (ordinal == 0) {
            return la0.T(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        l.a();
        return false;
    }

    @Override // defpackage.sc0
    public final void g(uc0 uc0Var) {
    }
}
