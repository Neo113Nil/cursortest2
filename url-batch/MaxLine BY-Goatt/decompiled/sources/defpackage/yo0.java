package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yo0 extends ul1 implements l00, xt1, yl1 {
    public final Function1 A;
    public boolean B;
    public boolean C;
    public final int D;

    public yo0(rk rkVar, int i) {
        int i2 = (i & 1) != 0 ? 1 : 2;
        this.A = (i & 4) != 0 ? null : rkVar;
        this.D = i2;
    }

    @Override // defpackage.ul1
    public final void A0() {
        if (I0().a()) {
            ((po0) ((t7) s03.K(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [eo1] */
    public final void G0(xo0 xo0Var, xo0 xo0Var2) {
        fs1 fs1Var;
        no0 focusOwner = ((t7) s03.K(this)).getFocusOwner();
        yo0 yo0Var = ((po0) focusOwner).h;
        xo0Var.equals(xo0Var2);
        ul1 ul1Var = this.m;
        if (!ul1Var.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = this.m;
        i91 J = s03.J(this);
        loop0: while (J != null) {
            if ((J.P.f.p & 5120) != 0) {
                while (ul1Var2 != null) {
                    int i = ul1Var2.o;
                    if ((i & 5120) != 0) {
                        if (ul1Var2 != ul1Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 4096) != 0) {
                            p90 p90Var = ul1Var2;
                            ?? r6 = 0;
                            while (p90Var != 0) {
                                if (p90Var instanceof go0) {
                                    go0 go0Var = (go0) p90Var;
                                    if (yo0Var == ((po0) focusOwner).h) {
                                        go0Var.X(xo0Var2);
                                    }
                                } else if ((p90Var.o & 4096) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var3 = p90Var.B;
                                    int i2 = 0;
                                    p90Var = p90Var;
                                    r6 = r6;
                                    while (ul1Var3 != null) {
                                        if ((ul1Var3.o & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                p90Var = ul1Var3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r6.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r6.b(ul1Var3);
                                            }
                                        }
                                        ul1Var3 = ul1Var3.r;
                                        p90Var = p90Var;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                p90Var = s03.c(r6);
                            }
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        Function1 function1 = this.A;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [eo1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eo1] */
    public final ro0 H0() {
        boolean z;
        fs1 fs1Var;
        ro0 ro0Var = new ro0();
        ro0Var.a = true;
        to0 to0Var = to0.b;
        ro0Var.b = to0Var;
        ro0Var.c = to0Var;
        ro0Var.d = to0Var;
        ro0Var.e = to0Var;
        ro0Var.f = to0Var;
        ro0Var.g = to0Var;
        ro0Var.h = to0Var;
        ro0Var.i = to0Var;
        ro0Var.j = bl0.q;
        ro0Var.k = bl0.r;
        int i = this.D;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((v21) ((x21) ((w21) tk3.J(this, p00.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                lh.g("Unknown Focusability");
                return null;
            }
            z = false;
        }
        ro0Var.a = z;
        ul1 ul1Var = this.m;
        if (!ul1Var.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = this.m;
        i91 J = s03.J(this);
        loop0: while (J != null) {
            if ((J.P.f.p & 3072) != 0) {
                while (ul1Var2 != null) {
                    int i2 = ul1Var2.o;
                    if ((i2 & 3072) != 0) {
                        if (ul1Var2 != ul1Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? r7 = 0;
                            p90 p90Var = ul1Var2;
                            while (p90Var != 0) {
                                if (p90Var instanceof so0) {
                                    ((so0) p90Var).T(ro0Var);
                                } else if ((p90Var.o & 2048) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var3 = p90Var.B;
                                    int i3 = 0;
                                    p90Var = p90Var;
                                    r7 = r7;
                                    while (ul1Var3 != null) {
                                        if ((ul1Var3.o & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                p90Var = ul1Var3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r7.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r7.b(ul1Var3);
                                            }
                                        }
                                        ul1Var3 = ul1Var3.r;
                                        p90Var = p90Var;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                p90Var = s03.c(r7);
                            }
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        return ro0Var;
    }

    public final xo0 I0() {
        fs1 fs1Var;
        if (!this.z) {
            return xo0.p;
        }
        yo0 yo0Var = ((po0) ((t7) s03.K(this)).getFocusOwner()).h;
        if (yo0Var == null) {
            return xo0.p;
        }
        if (this == yo0Var) {
            return xo0.m;
        }
        if (yo0Var.z) {
            if (!yo0Var.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var = yo0Var.m.q;
            i91 J = s03.J(yo0Var);
            while (J != null) {
                if ((J.P.f.p & 1024) != 0) {
                    while (ul1Var != null) {
                        if ((ul1Var.o & 1024) != 0) {
                            ul1 ul1Var2 = ul1Var;
                            eo1 eo1Var = null;
                            while (ul1Var2 != null) {
                                if (ul1Var2 instanceof yo0) {
                                    if (this == ((yo0) ul1Var2)) {
                                        return xo0.n;
                                    }
                                } else if ((ul1Var2.o & 1024) != 0 && (ul1Var2 instanceof p90)) {
                                    int i = 0;
                                    for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                        if ((ul1Var3.o & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ul1Var2 = ul1Var3;
                                            } else {
                                                if (eo1Var == null) {
                                                    eo1Var = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var2 != null) {
                                                    eo1Var.b(ul1Var2);
                                                    ul1Var2 = null;
                                                }
                                                eo1Var.b(ul1Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ul1Var2 = s03.c(eo1Var);
                            }
                        }
                        ul1Var = ul1Var.q;
                    }
                }
                J = J.u();
                ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
            }
        }
        return xo0.p;
    }

    public final void J0() {
        int ordinal = I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                a.b();
                return;
            }
        }
        c82 c82Var = new c82();
        j8.P(this, new k7(9, c82Var, this));
        Object obj = c82Var.m;
        if (obj == null) {
            Intrinsics.f("focusProperties");
            throw null;
        }
        if (((qo0) obj).a()) {
            return;
        }
        ((po0) ((t7) s03.K(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean K0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z = false;
            if (!H0().a) {
                return false;
            }
            int ordinal = zm3.I(this).ordinal();
            if (ordinal == 0) {
                z = zm3.J(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z = true;
                } else if (ordinal != 3) {
                    throw new bs1();
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.xt1
    public final void L() {
        J0();
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.ul1
    public final void z0() {
        int ordinal = I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                a.b();
                return;
            }
        }
        po0 po0Var = (po0) ((t7) s03.K(this)).getFocusOwner();
        po0Var.b(8, true, false);
        po0Var.d.a();
    }
}
