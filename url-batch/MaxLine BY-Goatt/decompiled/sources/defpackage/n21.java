package defpackage;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n21 extends ks1 {
    public static final vs3 c0;
    public final os2 a0;
    public m21 b0;

    static {
        vs3 e = yj1.e();
        e.e(aw.d);
        ((Paint) e.b).setStrokeWidth(1.0f);
        e.i(1);
        c0 = e;
    }

    public n21(i91 i91Var) {
        super(i91Var);
        os2 os2Var = new os2();
        os2Var.p = 0;
        this.a0 = os2Var;
        os2Var.t = this;
        this.b0 = i91Var.s != null ? new m21(this) : null;
    }

    @Override // defpackage.ks1
    public final void L0() {
        if (this.b0 == null) {
            this.b0 = new m21(this);
        }
    }

    @Override // defpackage.ks1
    public final sg1 O0() {
        return this.b0;
    }

    @Override // defpackage.ks1
    public final ul1 Q0() {
        return this.a0;
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        t21 t = this.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.i(i91Var.P.d, i91Var.m(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [ul1] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [ul1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [eo1] */
    @Override // defpackage.ks1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        i91 i91Var;
        long j2 = j;
        ux0 ux0Var2 = ux0Var;
        int i3 = nm1Var.m;
        i91 i91Var2 = this.A;
        switch (i3) {
            case 3:
                z2 = true;
                break;
            default:
                sh2 w = i91Var2.w();
                z2 = !(w != null && w.p);
                break;
        }
        if (z2) {
            if (r1(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(I0(j2, P0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                return;
            }
            int i4 = ux0Var2.o;
            eo1 x = i91Var2.x();
            Object[] objArr = x.m;
            int i5 = x.o - 1;
            while (i5 >= 0) {
                i91 i91Var3 = (i91) objArr[i5];
                if (i91Var3.J()) {
                    switch (nm1Var.m) {
                        case 3:
                            i91Var3.z(j2, ux0Var2, i2, z3);
                            i91Var = i91Var3;
                            break;
                        default:
                            fs1 fs1Var = i91Var3.P;
                            fs1Var.d.V0(ks1.Z, fs1Var.d.N0(j2), ux0Var2, 1, z3);
                            ux0Var2 = ux0Var;
                            i91Var = i91Var3;
                            break;
                    }
                    long a = ux0Var2.a();
                    if (j8.E(a) < 0.0f && j8.M(a) && !j8.L(a)) {
                        ks1 ks1Var = i91Var.P.d;
                        ks1Var.getClass();
                        ul1 S0 = ks1Var.S0(ls1.g(16));
                        if (S0 != null && S0.z) {
                            if (!S0.m.z) {
                                h21.b("visitLocalDescendants called on an unattached node");
                            }
                            ul1 ul1Var = S0.m;
                            if ((ul1Var.p & 16) != 0) {
                                while (ul1Var != null) {
                                    if ((ul1Var.o & 16) != 0) {
                                        p90 p90Var = ul1Var;
                                        ?? r6 = 0;
                                        while (p90Var != 0) {
                                            if (p90Var instanceof w22) {
                                                if (((w22) p90Var).a0()) {
                                                    ux0Var2.o = ux0Var2.m.b - 1;
                                                }
                                            } else if ((p90Var.o & 16) != 0 && (p90Var instanceof p90)) {
                                                ul1 ul1Var2 = p90Var.B;
                                                int i6 = 0;
                                                p90Var = p90Var;
                                                r6 = r6;
                                                while (ul1Var2 != null) {
                                                    if ((ul1Var2.o & 16) != 0) {
                                                        i6++;
                                                        r6 = r6;
                                                        if (i6 == 1) {
                                                            p90Var = ul1Var2;
                                                        } else {
                                                            if (r6 == 0) {
                                                                r6 = new eo1(new ul1[16]);
                                                            }
                                                            if (p90Var != 0) {
                                                                r6.b(p90Var);
                                                                p90Var = 0;
                                                            }
                                                            r6.b(ul1Var2);
                                                        }
                                                    }
                                                    ul1Var2 = ul1Var2.r;
                                                    p90Var = p90Var;
                                                    r6 = r6;
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            p90Var = s03.c(r6);
                                        }
                                    }
                                    ul1Var = ul1Var.r;
                                }
                            }
                        }
                        ux0Var2.o = i4;
                        return;
                    }
                }
                i5--;
                j2 = j;
                i2 = i;
            }
            ux0Var2.o = i4;
            return;
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
        }
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        t21 t = this.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.b(i91Var.P.d, i91Var.m(), i);
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        t21 t = this.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.g(i91Var.P.d, i91Var.m(), i);
    }

    @Override // defpackage.jj1
    public final n12 c(long j) {
        k0(j);
        i91 i91Var = this.A;
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((i91) objArr[i2]).Q.p.x = g91.o;
        }
        j1(i91Var.G.f(this, i91Var.m(), j));
        b1();
        return this;
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        t21 t = this.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.a(i91Var.P.d, i91Var.m(), i);
    }

    @Override // defpackage.ks1
    public final void f1(ls lsVar, dw0 dw0Var) {
        i91 i91Var = this.A;
        rx1 a = l91.a(i91Var);
        eo1 x = i91Var.x();
        Object[] objArr = x.m;
        int i = x.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (i91Var2.J()) {
                i91Var2.i(lsVar, dw0Var);
            }
        }
        if (((t7) a).getShowLayoutBounds()) {
            long j = this.o;
            lsVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, c0);
        }
    }

    @Override // defpackage.n12
    public final void i0(long j, float f, Function1 function1) {
        g1(j, f, function1);
        if (this.v) {
            return;
        }
        this.A.Q.p.u0();
    }

    @Override // defpackage.qg1
    public final int n0(xx0 xx0Var) {
        m21 m21Var = this.b0;
        if (m21Var != null) {
            return m21Var.n0(xx0Var);
        }
        nj1 nj1Var = this.A.Q.p;
        e91 e91Var = nj1Var.r.d;
        e91 e91Var2 = e91.m;
        j91 j91Var = nj1Var.I;
        if (e91Var == e91Var2) {
            j91Var.d = true;
            if (j91Var.b) {
                nj1Var.G = true;
                nj1Var.H = true;
            }
        } else {
            j91Var.e = true;
        }
        nj1Var.n().w = true;
        nj1Var.q();
        nj1Var.n().w = false;
        Integer num = (Integer) j91Var.g.get(xx0Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
