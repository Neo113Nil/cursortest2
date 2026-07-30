package defpackage;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v80 extends qp0 {
    public static final xu1 W;
    public final ig1 U;
    public u80 V;

    static {
        xu1 d = m90.d();
        d.e(hi.d);
        ((Paint) d.b).setStrokeWidth(1.0f);
        d.j(1);
        W = d;
    }

    public v80(jd0 jd0Var) {
        super(jd0Var);
        ig1 ig1Var = new ig1();
        ig1Var.h = 0;
        this.U = ig1Var;
        ig1Var.l = this;
        this.V = jd0Var.m != null ? new u80(this) : null;
    }

    @Override // defpackage.qp0
    public final void E0() {
        if (this.V == null) {
            this.V = new u80(this);
        }
    }

    @Override // defpackage.qp0
    public final gj0 H0() {
        return this.V;
    }

    @Override // defpackage.qp0
    public final zl0 J0() {
        return this.U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(mp0 mp0Var, long j, i60 i60Var, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2 = j;
        jd0 jd0Var = this.s;
        mp0 mp0Var2 = mp0Var;
        if (mp0Var2.o(jd0Var)) {
            if (g1(j2)) {
                i2 = i;
                z2 = z;
                z3 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(B0(j2, I0())) & Integer.MAX_VALUE) < 2139095040) {
                    z3 = true;
                    z2 = false;
                }
            }
            if (z3) {
                return;
            }
            int i3 = i60Var.g;
            eo0 w = jd0Var.w();
            Object[] objArr = w.d;
            int i4 = w.g - 1;
            loop0: while (i4 >= 0) {
                jd0 jd0Var2 = (jd0) objArr[i4];
                if (jd0Var2.G()) {
                    int i5 = i2;
                    z4 = z2;
                    mp0Var2.i(jd0Var2, j2, i60Var, i5, z4);
                    long a = i60Var.a();
                    if (mo.s(a) < 0.0f && mo.x(a) && !mo.w(a)) {
                        qp0 qp0Var = (qp0) jd0Var2.J.e;
                        qp0Var.getClass();
                        zl0 L0 = qp0Var.L0(rp0.g(16));
                        if (L0 == null || !L0.r) {
                            break;
                        }
                        if (!L0.d.r) {
                            o80.b("visitLocalDescendants called on an unattached node");
                        }
                        zl0 zl0Var = L0.d;
                        if ((zl0Var.h & 16) == 0) {
                            break;
                        }
                        while (zl0Var != null) {
                            if ((zl0Var.g & 16) != 0) {
                                zq zqVar = zl0Var;
                                ?? r5 = 0;
                                while (zqVar != 0) {
                                    if (zqVar instanceof tx0) {
                                        if (((tx0) zqVar).O()) {
                                            i60Var.g = i60Var.d.b - 1;
                                        }
                                    } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                                        zl0 zl0Var2 = zqVar.t;
                                        int i6 = 0;
                                        zqVar = zqVar;
                                        r5 = r5;
                                        while (zl0Var2 != null) {
                                            if ((zl0Var2.g & 16) != 0) {
                                                i6++;
                                                r5 = r5;
                                                if (i6 == 1) {
                                                    zqVar = zl0Var2;
                                                } else {
                                                    if (r5 == 0) {
                                                        r5 = new eo0(new zl0[16]);
                                                    }
                                                    if (zqVar != 0) {
                                                        r5.b(zqVar);
                                                        zqVar = 0;
                                                    }
                                                    r5.b(zl0Var2);
                                                }
                                            }
                                            zl0Var2 = zl0Var2.j;
                                            zqVar = zqVar;
                                            r5 = r5;
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    zqVar = op.o(r5);
                                }
                            }
                            zl0Var = zl0Var.j;
                        }
                        break loop0;
                    }
                } else {
                    z4 = z2;
                }
                i4--;
                mp0Var2 = mp0Var;
                j2 = j;
                z2 = z4;
                i2 = i;
            }
            i60Var.g = i3;
            return;
        }
        i2 = i;
        z2 = z;
        z3 = false;
        if (z3) {
        }
    }

    @Override // defpackage.zw0
    public final void Y(long j, float f, Function1 function1) {
        Z0(j, f, function1);
        if (this.n) {
            return;
        }
        this.s.K.p.j0();
    }

    @Override // defpackage.qp0
    public final void Y0(xf xfVar, l50 l50Var) {
        jd0 jd0Var = this.s;
        eu0 a = md0.a(jd0Var);
        eo0 w = jd0Var.w();
        Object[] objArr = w.d;
        int i = w.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (jd0Var2.G()) {
                jd0Var2.i(xfVar, l50Var);
            }
        }
        if (((d4) a).getShowLayoutBounds()) {
            long j = this.g;
            xfVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, W);
        }
    }

    @Override // defpackage.qk0
    public final zw0 c(long j) {
        c0(j);
        jd0 jd0Var = this.s;
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jd0) objArr[i2]).K.p.p = hd0.g;
        }
        c1(jd0Var.B.f(this, jd0Var.K.p.d0(), j));
        T0();
        return this;
    }

    @Override // defpackage.ej0
    public final int e0(m60 m60Var) {
        u80 u80Var = this.V;
        if (u80Var != null) {
            return u80Var.e0(m60Var);
        }
        uk0 uk0Var = this.s.K.p;
        fd0 fd0Var = uk0Var.j.d;
        fd0 fd0Var2 = fd0.d;
        kd0 kd0Var = uk0Var.A;
        if (fd0Var == fd0Var2) {
            kd0Var.d = true;
            if (kd0Var.b) {
                uk0Var.y = true;
                uk0Var.z = true;
            }
        } else {
            kd0Var.e = true;
        }
        v80 y = uk0Var.y();
        boolean z = y.o;
        y.o = true;
        uk0Var.B();
        y.o = z;
        Integer num = (Integer) kd0Var.g.get(m60Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
