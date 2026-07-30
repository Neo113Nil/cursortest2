package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h20 extends ul1 implements r81, l00 {
    public ww1 A;
    public final cg2 B;
    public boolean C;
    public wp D;
    public t81 F;
    public w72 G;
    public boolean H;
    public boolean J;
    public final mp E = new mp(0);
    public long I = 0;

    public h20(ww1 ww1Var, cg2 cg2Var, boolean z, wp wpVar) {
        this.A = ww1Var;
        this.B = cg2Var;
        this.C = z;
        this.D = wpVar;
    }

    public static final float G0(h20 h20Var, wp wpVar) {
        w72 w72Var;
        int compare;
        if (!x31.a(h20Var.I, 0L)) {
            eo1 eo1Var = h20Var.E.a;
            int i = eo1Var.o;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = eo1Var.m;
                w72Var = null;
                while (true) {
                    w72 w72Var2 = (w72) ((g20) objArr[i2]).a.invoke();
                    if (w72Var2 != null) {
                        long b = w72Var2.b();
                        long Q = zm3.Q(h20Var.I);
                        int ordinal = h20Var.A.ordinal();
                        if (ordinal == 0) {
                            compare = Float.compare(ql2.b(b), ql2.b(Q));
                        } else {
                            if (ordinal != 1) {
                                a.b();
                                return 0.0f;
                            }
                            compare = Float.compare(ql2.d(b), ql2.d(Q));
                        }
                        if (compare <= 0) {
                            w72Var = w72Var2;
                        } else if (w72Var == null) {
                            w72Var = w72Var2;
                        }
                    }
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                }
            } else {
                w72Var = null;
            }
            if (w72Var == null) {
                w72 H0 = h20Var.H ? h20Var.H0() : null;
                if (H0 != null) {
                    w72Var = H0;
                }
            }
            long Q2 = zm3.Q(h20Var.I);
            int ordinal2 = h20Var.A.ordinal();
            if (ordinal2 == 0) {
                float f = w72Var.b;
                return wpVar.a(f, w72Var.d - f, ql2.b(Q2));
            }
            if (ordinal2 == 1) {
                float f2 = w72Var.a;
                return wpVar.a(f2, w72Var.c - f2, ql2.d(Q2));
            }
            a.b();
            return 0.0f;
        }
        return 0.0f;
    }

    public final w72 H0() {
        if (this.z) {
            ks1 I = s03.I(this);
            t81 t81Var = this.F;
            if (t81Var != null) {
                if (!t81Var.y()) {
                    t81Var = null;
                }
                if (t81Var != null) {
                    return I.M(t81Var, false);
                }
            }
        }
        return null;
    }

    public final boolean I0(w72 w72Var, long j) {
        long K0 = K0(w72Var, j);
        return Math.abs(au1.d(K0)) <= 0.5f && Math.abs(au1.e(K0)) <= 0.5f;
    }

    public final void J0() {
        wp wpVar = this.D;
        if (wpVar == null) {
            wpVar = (wp) tk3.J(this, yp.a);
        }
        wp wpVar2 = wpVar;
        if (this.J) {
            lh.g("launchAnimation called when previous animation was running");
            return;
        }
        z23 z23Var = new z23(wpVar2.b());
        a50 u0 = u0();
        d50 d50Var = d50.m;
        z71.H(u0, null, new j5(this, z23Var, wpVar2, (o30) null, 4), 1);
    }

    public final long K0(w72 w72Var, long j) {
        long Q = zm3.Q(j);
        int ordinal = this.A.ordinal();
        if (ordinal == 0) {
            wp wpVar = this.D;
            if (wpVar == null) {
                wpVar = (wp) tk3.J(this, yp.a);
            }
            float f = w72Var.b;
            return ap.i(0.0f, wpVar.a(f, w72Var.d - f, ql2.b(Q)));
        }
        if (ordinal != 1) {
            a.b();
            return 0L;
        }
        wp wpVar2 = this.D;
        if (wpVar2 == null) {
            wpVar2 = (wp) tk3.J(this, yp.a);
        }
        float f2 = w72Var.a;
        return ap.i(wpVar2.a(f2, w72Var.c - f2, ql2.d(Q)), 0.0f);
    }

    @Override // defpackage.r81
    public final void v(long j) {
        int c;
        w72 H0;
        long j2 = this.I;
        this.I = j;
        int ordinal = this.A.ordinal();
        if (ordinal == 0) {
            c = Intrinsics.c((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (ordinal != 1) {
                a.b();
                return;
            }
            c = Intrinsics.c((int) (j >> 32), (int) (j2 >> 32));
        }
        if (c < 0 && (H0 = H0()) != null) {
            w72 w72Var = this.G;
            if (w72Var == null) {
                w72Var = H0;
            }
            if (!this.J && !this.H && I0(w72Var, j2) && !I0(H0, j)) {
                this.H = true;
                J0();
            }
            this.G = H0;
        }
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
