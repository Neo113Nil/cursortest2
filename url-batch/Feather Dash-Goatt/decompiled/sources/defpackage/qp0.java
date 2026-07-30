package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.appsflyer.internal.l;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class qp0 extends ej0 implements qk0, uc0, fu0 {
    public static final o31 Q;
    public static final rc0 R;
    public static final j41 S;
    public static final j50 T;
    public wk0 B;
    public ln0 C;
    public float E;
    public un0 F;
    public rc0 G;
    public boolean I;
    public boolean J;
    public l50 K;
    public xf L;
    public r4 M;
    public boolean O;
    public du0 P;
    public final jd0 s;
    public qp0 t;
    public qp0 u;
    public boolean v;
    public boolean w;
    public Function1 x;
    public nr y;
    public vc0 z;
    public float A = 0.8f;
    public long D = 0;
    public u91 H = m90.m;
    public final np0 N = new np0(this, 1);

    static {
        o31 o31Var = new o31();
        o31Var.e = 1.0f;
        o31Var.g = 1.0f;
        o31Var.h = 1.0f;
        long j = o50.a;
        o31Var.j = j;
        o31Var.k = j;
        o31Var.l = 8.0f;
        o31Var.m = aj1.a;
        o31Var.n = m90.m;
        o31Var.p = 9205357640488583168L;
        o31Var.q = la0.i();
        o31Var.r = vc0.d;
        o31Var.s = 3;
        Q = o31Var;
        R = new rc0();
        S = new j41(24);
        T = new j50(25);
    }

    public qp0(jd0 jd0Var) {
        this.s = jd0Var;
        this.y = jd0Var.C;
        this.z = jd0Var.D;
    }

    public final long A0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - W();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - S();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final float B0(long j, long j2) {
        if (W() >= Float.intBitsToFloat((int) (j2 >> 32)) && S() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long A0 = A0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (A0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (A0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - W());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - S())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.uc0
    public final long C(uc0 uc0Var, long j) {
        return F(uc0Var, j);
    }

    public final void C0(xf xfVar, l50 l50Var) {
        du0 du0Var = this.P;
        if (du0Var == null) {
            long j = this.D;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            xfVar.h(f, f2);
            D0(xfVar, l50Var);
            xfVar.h(-f, -f2);
            return;
        }
        n50 n50Var = (n50) du0Var;
        zf zfVar = n50Var.q;
        n50Var.g();
        n50Var.x = n50Var.d.a.l > 0.0f;
        i8 i8Var = zfVar.e;
        i8Var.s(xfVar);
        i8Var.g = l50Var;
        uq1.C(zfVar, n50Var.d);
    }

    public final void D0(xf xfVar, l50 l50Var) {
        qp0 qp0Var;
        xf xfVar2;
        l50 l50Var2;
        zl0 K0 = K0(4);
        if (K0 == null) {
            Y0(xfVar, l50Var);
            return;
        }
        jd0 jd0Var = this.s;
        jd0Var.getClass();
        ld0 sharedDrawScope = ((d4) md0.a(jd0Var)).getSharedDrawScope();
        long x = ca0.x(this.g);
        sharedDrawScope.getClass();
        eo0 eo0Var = null;
        while (K0 != null) {
            if (K0 instanceof gu) {
                qp0Var = this;
                xfVar2 = xfVar;
                l50Var2 = l50Var;
                sharedDrawScope.b(xfVar2, x, qp0Var, (gu) K0, l50Var2);
            } else {
                qp0Var = this;
                xfVar2 = xfVar;
                l50Var2 = l50Var;
                if ((K0.g & 4) != 0 && (K0 instanceof zq)) {
                    int i = 0;
                    for (zl0 zl0Var = ((zq) K0).t; zl0Var != null; zl0Var = zl0Var.j) {
                        if ((zl0Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                K0 = zl0Var;
                            } else {
                                if (eo0Var == null) {
                                    eo0Var = new eo0(new zl0[16]);
                                }
                                if (K0 != null) {
                                    eo0Var.b(K0);
                                    K0 = null;
                                }
                                eo0Var.b(zl0Var);
                            }
                        }
                    }
                    if (i == 1) {
                        xfVar = xfVar2;
                        this = qp0Var;
                        l50Var = l50Var2;
                    }
                }
            }
            K0 = op.o(eo0Var);
            xfVar = xfVar2;
            this = qp0Var;
            l50Var = l50Var2;
        }
    }

    @Override // defpackage.uc0
    public final boolean E() {
        return J0().r;
    }

    public abstract void E0();

    @Override // defpackage.uc0
    public final long F(uc0 uc0Var, long j) {
        qp0 qp0Var;
        boolean z = uc0Var instanceof hj0;
        if (z) {
            hj0 hj0Var = (hj0) uc0Var;
            hj0Var.d.s.S0();
            return hj0Var.F(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        hj0 hj0Var2 = z ? (hj0) uc0Var : null;
        if (hj0Var2 == null || (qp0Var = hj0Var2.d.s) == null) {
            uc0Var.getClass();
            qp0Var = (qp0) uc0Var;
        }
        qp0Var.S0();
        qp0 F0 = F0(qp0Var);
        while (qp0Var != F0) {
            du0 du0Var = qp0Var.P;
            if (du0Var != null) {
                n50 n50Var = (n50) du0Var;
                float[] b = n50Var.b();
                if (!n50Var.w) {
                    j = y90.u(b, j);
                }
            }
            j = t90.v(j, qp0Var.D);
            qp0Var = qp0Var.u;
            qp0Var.getClass();
        }
        return z0(F0, j);
    }

    public final qp0 F0(qp0 qp0Var) {
        jd0 jd0Var = qp0Var.s;
        jd0 jd0Var2 = this.s;
        if (jd0Var == jd0Var2) {
            zl0 J0 = qp0Var.J0();
            zl0 J02 = J0();
            if (!J02.d.r) {
                o80.b("visitLocalAncestors called on an unattached node");
            }
            for (zl0 zl0Var = J02.d.i; zl0Var != null; zl0Var = zl0Var.i) {
                if ((zl0Var.g & 2) != 0 && zl0Var == J0) {
                    return qp0Var;
                }
            }
            return this;
        }
        while (jd0Var.u > jd0Var2.u) {
            jd0Var = jd0Var.s();
            jd0Var.getClass();
        }
        jd0 jd0Var3 = jd0Var2;
        while (jd0Var3.u > jd0Var.u) {
            jd0Var3 = jd0Var3.s();
            jd0Var3.getClass();
        }
        while (jd0Var != jd0Var3) {
            jd0Var = jd0Var.s();
            jd0Var3 = jd0Var3.s();
            if (jd0Var == null || jd0Var3 == null) {
                dd0.e("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (jd0Var3 != jd0Var2) {
            if (jd0Var != qp0Var.s) {
                return (v80) jd0Var.J.d;
            }
            return qp0Var;
        }
        return this;
    }

    public final long G0(long j) {
        long j2 = this.D;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        du0 du0Var = this.P;
        if (du0Var != null) {
            n50 n50Var = (n50) du0Var;
            float[] a = n50Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!n50Var.w) {
                return y90.u(a, floatToRawIntBits);
            }
        }
        return floatToRawIntBits;
    }

    public abstract gj0 H0();

    public final long I0() {
        return this.y.Q(this.s.E.c());
    }

    @Override // defpackage.uc0
    public final s11 J(uc0 uc0Var, boolean z) {
        qp0 qp0Var;
        if (!J0().r) {
            o80.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!uc0Var.E()) {
            o80.b("LayoutCoordinates " + uc0Var + " is not attached!");
        }
        hj0 hj0Var = uc0Var instanceof hj0 ? (hj0) uc0Var : null;
        if (hj0Var == null || (qp0Var = hj0Var.d.s) == null) {
            qp0Var = (qp0) uc0Var;
        }
        qp0Var.S0();
        qp0 F0 = F0(qp0Var);
        un0 un0Var = this.F;
        if (un0Var == null) {
            un0Var = new un0();
            this.F = un0Var;
        }
        un0Var.a = 0.0f;
        un0Var.b = 0.0f;
        un0Var.c = (int) (uc0Var.K() >> 32);
        un0Var.d = (int) (uc0Var.K() & 4294967295L);
        while (qp0Var != F0) {
            qp0Var.a1(un0Var, z, false);
            if (un0Var.b()) {
                return s11.e;
            }
            qp0Var = qp0Var.u;
            qp0Var.getClass();
        }
        y0(F0, un0Var, z);
        return new s11(un0Var.a, un0Var.b, un0Var.c, un0Var.d);
    }

    public abstract zl0 J0();

    @Override // defpackage.uc0
    public final long K() {
        return this.g;
    }

    public final zl0 K0(int i) {
        boolean g = rp0.g(i);
        zl0 J0 = J0();
        if (!g && (J0 = J0.i) == null) {
            return null;
        }
        for (zl0 L0 = L0(g); L0 != null && (L0.h & i) != 0; L0 = L0.j) {
            if ((L0.g & i) != 0) {
                return L0;
            }
            if (L0 == J0) {
                return null;
            }
        }
        return null;
    }

    public final zl0 L0(boolean z) {
        zl0 J0;
        l7 l7Var = this.s.J;
        if (((qp0) l7Var.e) == this) {
            return (zl0) l7Var.g;
        }
        qp0 qp0Var = this.u;
        if (!z) {
            if (qp0Var != null) {
                return qp0Var.J0();
            }
            return null;
        }
        if (qp0Var == null || (J0 = qp0Var.J0()) == null) {
            return null;
        }
        return J0.j;
    }

    @Override // defpackage.uc0
    public final long M(long j) {
        if (!J0().r) {
            o80.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S0();
        while (this != null) {
            jd0 jd0Var = this.s;
            if (this == ((qp0) jd0Var.J.e) && !jd0Var.g) {
                long b = ((d4) md0.a(jd0Var)).getRectManager().b(jd0Var);
                if (!s90.a(b, 9223372034707292159L)) {
                    return t90.v(j, b);
                }
            }
            du0 du0Var = this.P;
            if (du0Var != null) {
                n50 n50Var = (n50) du0Var;
                float[] b2 = n50Var.b();
                if (!n50Var.w) {
                    j = y90.u(b2, j);
                }
            }
            j = t90.v(j, this.D);
            this = this.u;
        }
        return j;
    }

    public final void M0(zl0 zl0Var, mp0 mp0Var, long j, i60 i60Var, int i, boolean z) {
        if (zl0Var == null) {
            P0(mp0Var, j, i60Var, i, z);
            return;
        }
        int i2 = i60Var.g;
        mn0 mn0Var = i60Var.d;
        i60Var.b(i2 + 1, mn0Var.b);
        i60Var.g++;
        mn0Var.a(zl0Var);
        i60Var.e.a(yr1.m(-1.0f, z, false));
        M0(ka0.d(zl0Var, mp0Var.h()), mp0Var, j, i60Var, i, z);
        i60Var.g = i2;
    }

    public final void N0(zl0 zl0Var, mp0 mp0Var, long j, i60 i60Var, int i, boolean z, float f) {
        if (zl0Var == null) {
            P0(mp0Var, j, i60Var, i, z);
            return;
        }
        int i2 = i60Var.g;
        mn0 mn0Var = i60Var.d;
        i60Var.b(i2 + 1, mn0Var.b);
        i60Var.g++;
        mn0Var.a(zl0Var);
        i60Var.e.a(yr1.m(f, z, false));
        X0(ka0.d(zl0Var, mp0Var.h()), mp0Var, j, i60Var, i, z, f, true);
        i60Var.g = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.mo.i(r18.a(), defpackage.yr1.m(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(mp0 mp0Var, long j, i60 i60Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        zl0 K0 = K0(mp0Var.h());
        if (!g1(j)) {
            if (i == 1) {
                float B0 = B0(j, I0());
                if ((Float.floatToRawIntBits(B0) & Integer.MAX_VALUE) < 2139095040) {
                    if (i60Var.g != i60Var.d.b - 1) {
                        if (mo.i(i60Var.a(), yr1.m(B0, false, false)) <= 0) {
                            return;
                        }
                    }
                    N0(K0, mp0Var, j, i60Var, i, false, B0);
                    return;
                }
                return;
            }
            return;
        }
        if (K0 == null) {
            P0(mp0Var, j, i60Var, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < W() && intBitsToFloat2 < S()) {
            M0(K0, mp0Var, j, i60Var, i, z);
            return;
        }
        float B02 = i == 1 ? B0(j, I0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(B02) & Integer.MAX_VALUE) < 2139095040) {
            if (i60Var.g == i60Var.d.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            X0(K0, mp0Var, j, i60Var, i, z2, B02, z3);
        }
        z2 = z;
        z3 = false;
        X0(K0, mp0Var, j, i60Var, i, z2, B02, z3);
    }

    public void P0(mp0 mp0Var, long j, i60 i60Var, int i, boolean z) {
        qp0 qp0Var = this.t;
        if (qp0Var != null) {
            qp0Var.O0(mp0Var, qp0Var.G0(j), i60Var, i, z);
        }
    }

    public final void Q0() {
        du0 du0Var = this.P;
        if (du0Var != null) {
            ((n50) du0Var).c();
            return;
        }
        qp0 qp0Var = this.u;
        if (qp0Var != null) {
            qp0Var.Q0();
        }
    }

    public final boolean R0() {
        if (this.P != null && this.A <= 0.0f) {
            return true;
        }
        qp0 qp0Var = this.u;
        if (qp0Var != null) {
            return qp0Var.R0();
        }
        return false;
    }

    public final void S0() {
        this.s.K.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void T0() {
        zl0 zl0Var;
        boolean g = rp0.g(128);
        zl0 L0 = L0(g);
        if (L0 == null || (L0.d.h & 128) == 0) {
            return;
        }
        ib1 n = ca0.n();
        Function1 e = n != null ? n.e() : null;
        ib1 s = ca0.s(n);
        try {
            if (g) {
                zl0Var = J0();
            } else {
                zl0Var = J0().i;
                if (zl0Var == null) {
                }
            }
            for (zl0 L02 = L0(g); L02 != null; L02 = L02.j) {
                if ((L02.h & 128) == 0) {
                    break;
                }
                if ((L02.g & 128) != 0) {
                    zq zqVar = L02;
                    ?? r8 = 0;
                    while (zqVar != 0) {
                        if (zqVar instanceof sc0) {
                            ((sc0) zqVar).l(this.g);
                        } else if ((zqVar.g & 128) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var2 = zqVar.t;
                            int i = 0;
                            zqVar = zqVar;
                            r8 = r8;
                            while (zl0Var2 != null) {
                                if ((zl0Var2.g & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        zqVar = zl0Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new eo0(new zl0[16]);
                                        }
                                        if (zqVar != 0) {
                                            r8.b(zqVar);
                                            zqVar = 0;
                                        }
                                        r8.b(zl0Var2);
                                    }
                                }
                                zl0Var2 = zl0Var2.j;
                                zqVar = zqVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        zqVar = op.o(r8);
                    }
                }
                if (L02 == zl0Var) {
                    break;
                }
            }
        } finally {
            ca0.u(n, s, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void U0() {
        boolean g = rp0.g(4194304);
        zl0 J0 = J0();
        if (!g && (J0 = J0.i) == null) {
            return;
        }
        for (zl0 L0 = L0(g); L0 != null && (L0.h & 4194304) != 0; L0 = L0.j) {
            if ((L0.g & 4194304) != 0) {
                zq zqVar = L0;
                ?? r5 = 0;
                while (zqVar != 0) {
                    if (zqVar instanceof sc0) {
                        ((sc0) zqVar).g(this);
                    } else if ((zqVar.g & 4194304) != 0 && (zqVar instanceof zq)) {
                        zl0 zl0Var = zqVar.t;
                        int i = 0;
                        zqVar = zqVar;
                        r5 = r5;
                        while (zl0Var != null) {
                            if ((zl0Var.g & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    zqVar = zl0Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new eo0(new zl0[16]);
                                    }
                                    if (zqVar != 0) {
                                        r5.b(zqVar);
                                        zqVar = 0;
                                    }
                                    r5.b(zl0Var);
                                }
                            }
                            zl0Var = zl0Var.j;
                            zqVar = zqVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    zqVar = op.o(r5);
                }
            }
            if (L0 == J0) {
                return;
            }
        }
    }

    public final void V0() {
        this.v = true;
        this.N.invoke();
        b1();
        if (s90.a(this.D, 0L)) {
            return;
        }
        this.s.L();
    }

    public final void W0() {
        boolean g = rp0.g(1048576);
        zl0 L0 = L0(g);
        if (L0 == null || (L0.d.h & 1048576) == 0) {
            return;
        }
        zl0 J0 = J0();
        if (!g && (J0 = J0.i) == null) {
            return;
        }
        for (zl0 L02 = L0(g); L02 != null && (L02.h & 1048576) != 0; L02 = L02.j) {
            if ((L02.g & 1048576) != 0) {
                zl0 zl0Var = L02;
                eo0 eo0Var = null;
                while (zl0Var != null) {
                    if ((zl0Var.g & 1048576) != 0 && (zl0Var instanceof zq)) {
                        int i = 0;
                        for (zl0 zl0Var2 = ((zq) zl0Var).t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
                            if ((zl0Var2.g & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    zl0Var = zl0Var2;
                                } else {
                                    if (eo0Var == null) {
                                        eo0Var = new eo0(new zl0[16]);
                                    }
                                    if (zl0Var != null) {
                                        eo0Var.b(zl0Var);
                                        zl0Var = null;
                                    }
                                    eo0Var.b(zl0Var2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    zl0Var = op.o(eo0Var);
                }
            }
            if (L02 == J0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r2v28 */
    public final void X0(zl0 zl0Var, mp0 mp0Var, long j, i60 i60Var, int i, boolean z, float f, boolean z2) {
        zl0 o;
        int i2;
        if (zl0Var == null) {
            P0(mp0Var, j, i60Var, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            zq zqVar = zl0Var;
            eo0 eo0Var = null;
            while (true) {
                if (zqVar == 0) {
                    break;
                }
                if (zqVar instanceof tx0) {
                    int i4 = uq1.q;
                    long j2 = uq1.p;
                    int i5 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i5);
                    jd0 jd0Var = this.s;
                    long j3 = Long.MIN_VALUE & Long.MIN_VALUE;
                    if (intBitsToFloat >= (-((j3 == 0 || jd0Var.D == vc0.d) ? me1.b(0, Long.MIN_VALUE) : me1.b(2, Long.MIN_VALUE)))) {
                        if (Float.intBitsToFloat(i5) < W() + ((j3 == 0 || jd0Var.D == vc0.d) ? me1.b(2, Long.MIN_VALUE) : me1.b(0, Long.MIN_VALUE))) {
                            int i6 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i6) >= (-me1.b(1, Long.MIN_VALUE))) {
                                if (Float.intBitsToFloat(i6) < me1.b(3, Long.MIN_VALUE) + S()) {
                                    op0 op0Var = new op0(this, zl0Var, mp0Var, j, i60Var, i3, z, f, z2);
                                    hn0 hn0Var = i60Var.e;
                                    mn0 mn0Var = i60Var.d;
                                    int i7 = i60Var.g;
                                    int i8 = mn0Var.b;
                                    if (i7 == i8 - 1) {
                                        i60Var.b(i7 + 1, i8);
                                        i60Var.g++;
                                        mn0Var.a(zl0Var);
                                        hn0Var.a(yr1.m(0.0f, z, true));
                                        op0Var.invoke();
                                        i60Var.g = i7;
                                        return;
                                    }
                                    long a = i60Var.a();
                                    int i9 = i60Var.g;
                                    if (!mo.w(a)) {
                                        if (mo.s(a) > 0.0f) {
                                            int i10 = i60Var.g;
                                            i60Var.b(i10 + 1, mn0Var.b);
                                            i60Var.g++;
                                            mn0Var.a(zl0Var);
                                            hn0Var.a(yr1.m(0.0f, z, true));
                                            op0Var.invoke();
                                            i60Var.g = i10;
                                            return;
                                        }
                                        return;
                                    }
                                    int i11 = mn0Var.b;
                                    int i12 = i11 - 1;
                                    i60Var.g = i12;
                                    i60Var.b(i11, mn0Var.b);
                                    i60Var.g++;
                                    mn0Var.a(zl0Var);
                                    hn0Var.a(yr1.m(0.0f, z, true));
                                    op0Var.invoke();
                                    i60Var.g = i12;
                                    if (mo.s(i60Var.a()) < 0.0f) {
                                        i60Var.b(i9 + 1, i60Var.g + 1);
                                    }
                                    i60Var.g = i9;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                        zl0 zl0Var2 = zqVar.t;
                        int i13 = 0;
                        o = zqVar;
                        eo0Var = eo0Var;
                        while (zl0Var2 != null) {
                            if ((zl0Var2.g & 16) != 0) {
                                i13++;
                                eo0Var = eo0Var;
                                if (i13 == 1) {
                                    o = zl0Var2;
                                } else {
                                    if (eo0Var == null) {
                                        eo0Var = new eo0(new zl0[16]);
                                    }
                                    if (o != null) {
                                        eo0Var.b(o);
                                        o = null;
                                    }
                                    eo0Var.b(zl0Var2);
                                }
                            }
                            zl0Var2 = zl0Var2.j;
                            o = o;
                            eo0Var = eo0Var;
                        }
                        if (i13 == 1) {
                            i3 = i;
                            zqVar = o;
                            eo0Var = eo0Var;
                        }
                    }
                    o = op.o(eo0Var);
                    i3 = i;
                    zqVar = o;
                    eo0Var = eo0Var;
                }
            }
        }
        if (z2) {
            N0(zl0Var, mp0Var, j, i60Var, i, z, f);
            return;
        }
        if (!mp0Var.g(zl0Var)) {
            X0(ka0.d(zl0Var, mp0Var.h()), mp0Var, j, i60Var, i, z, f, false);
            return;
        }
        pp0 pp0Var = new pp0(this, zl0Var, mp0Var, j, i60Var, i, z, f);
        hn0 hn0Var2 = i60Var.e;
        mn0 mn0Var2 = i60Var.d;
        int i14 = i60Var.g;
        int i15 = mn0Var2.b;
        if (i14 != i15 - 1) {
            long a2 = i60Var.a();
            int i16 = i60Var.g;
            int i17 = mn0Var2.b;
            int i18 = i17 - 1;
            i60Var.g = i18;
            i60Var.b(i17, mn0Var2.b);
            i60Var.g++;
            mn0Var2.a(zl0Var);
            hn0Var2.a(yr1.m(f, z, false));
            pp0Var.invoke();
            i60Var.g = i18;
            long a3 = i60Var.a();
            if (i60Var.g + 1 >= mn0Var2.b - 1 || mo.i(a2, a3) <= 0) {
                i60Var.b(i60Var.g + 1, mn0Var2.b);
            } else {
                int i19 = i16 + 1;
                boolean w = mo.w(a3);
                int i20 = i60Var.g;
                i60Var.b(i19, w ? i20 + 2 : i20 + 1);
            }
            i60Var.g = i16;
            return;
        }
        int i21 = i14 + 1;
        i60Var.b(i21, i15);
        i60Var.g++;
        mn0Var2.a(zl0Var);
        hn0Var2.a(yr1.m(f, z, false));
        pp0Var.invoke();
        i60Var.g = i14;
        if (i21 == mn0Var2.b - 1 || mo.w(i60Var.a())) {
            int i22 = i60Var.g;
            int i23 = i22 + 1;
            mn0Var2.k(i23);
            if (i23 < 0 || i23 >= (i2 = hn0Var2.b)) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            long[] jArr = hn0Var2.a;
            long j4 = jArr[i23];
            if (i23 != i2 - 1) {
                w9.b(jArr, jArr, i23, i22 + 2, i2);
            }
            hn0Var2.b--;
        }
    }

    public abstract void Y0(xf xfVar, l50 l50Var);

    public final void Z0(long j, float f, Function1 function1) {
        e1(function1, false);
        boolean a = s90.a(this.D, j);
        jd0 jd0Var = this.s;
        if (!a) {
            ((d4) md0.a(jd0Var)).K(-4.0f);
            this.D = j;
            jd0Var.K.p.h0();
            du0 du0Var = this.P;
            if (du0Var != null) {
                ((n50) du0Var).d(j);
            } else {
                qp0 qp0Var = this.u;
                if (qp0Var != null) {
                    qp0Var.Q0();
                }
            }
            jd0Var.L();
            ej0.v0(this);
            eu0 eu0Var = jd0Var.s;
            if (eu0Var != null) {
                ((d4) eu0Var).x(jd0Var);
            }
        }
        this.E = f;
        if (this == ((qp0) jd0Var.J.e)) {
            ((d4) md0.a(jd0Var)).getRectManager().f(jd0Var, false);
        }
        if (this.o) {
            return;
        }
        h0(r0());
    }

    public final void a1(un0 un0Var, boolean z, boolean z2) {
        du0 du0Var = this.P;
        if (du0Var != null) {
            if (this.w) {
                if (z2) {
                    long I0 = I0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (I0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (I0 & 4294967295L)) / 2.0f;
                    long j = this.g;
                    un0Var.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.g;
                    un0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (un0Var.b()) {
                    return;
                }
            }
            n50 n50Var = (n50) du0Var;
            float[] b = n50Var.b();
            if (!n50Var.w) {
                if (b == null) {
                    un0Var.a = 0.0f;
                    un0Var.b = 0.0f;
                    un0Var.c = 0.0f;
                    un0Var.d = 0.0f;
                } else {
                    y90.v(b, un0Var);
                }
            }
        }
        long j3 = this.D;
        float f = (int) (j3 >> 32);
        un0Var.a += f;
        un0Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        un0Var.b += f2;
        un0Var.d += f2;
    }

    @Override // defpackage.uc0
    public final long b(long j) {
        if (!J0().r) {
            o80.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((d4) md0.a(this.s)).s(M(j));
    }

    public final void b1() {
        if (this.P != null) {
            e1(null, false);
            this.s.S(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [eo0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [eo0] */
    public final void c1(wk0 wk0Var) {
        qp0 qp0Var;
        wk0 wk0Var2 = this.B;
        if (wk0Var != wk0Var2) {
            this.B = wk0Var;
            jd0 jd0Var = this.s;
            int i = 0;
            if (wk0Var2 == null || wk0Var.e() != wk0Var2.e() || wk0Var.c() != wk0Var2.c()) {
                int e = wk0Var.e();
                int c = wk0Var.c();
                du0 du0Var = this.P;
                if (du0Var != null) {
                    ((n50) du0Var).e((e << 32) | (c & 4294967295L));
                } else if (jd0Var.G() && (qp0Var = this.u) != null) {
                    qp0Var.Q0();
                }
                Z((c & 4294967295L) | (e << 32));
                if (this.x != null) {
                    f1(false);
                }
                boolean g = rp0.g(4);
                zl0 J0 = J0();
                if (g || (J0 = J0.i) != null) {
                    for (zl0 L0 = L0(g); L0 != null && (L0.h & 4) != 0; L0 = L0.j) {
                        if ((L0.g & 4) != 0) {
                            zq zqVar = L0;
                            ?? r9 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof gu) {
                                    ((gu) zqVar).f0();
                                } else if ((zqVar.g & 4) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var = zqVar.t;
                                    int i2 = 0;
                                    zqVar = zqVar;
                                    r9 = r9;
                                    while (zl0Var != null) {
                                        if ((zl0Var.g & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                zqVar = zl0Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r9.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r9.b(zl0Var);
                                            }
                                        }
                                        zl0Var = zl0Var.j;
                                        zqVar = zqVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zqVar = op.o(r9);
                            }
                        }
                        if (L0 == J0) {
                            break;
                        }
                    }
                }
                eu0 eu0Var = jd0Var.s;
                if (eu0Var != null) {
                    ((d4) eu0Var).x(jd0Var);
                }
            }
            ln0 ln0Var = this.C;
            if ((ln0Var == null || ln0Var.e == 0) && wk0Var.a().isEmpty()) {
                return;
            }
            ln0 ln0Var2 = this.C;
            Map a = wk0Var.a();
            if (ln0Var2 != null && ln0Var2.e == a.size()) {
                Object[] objArr = ln0Var2.b;
                int[] iArr = ln0Var2.c;
                long[] jArr = ln0Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) a.get((m60) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            jd0Var.K.p.A.f();
            ln0 ln0Var3 = this.C;
            if (ln0Var3 == null) {
                ln0 ln0Var4 = qq0.a;
                ln0Var3 = new ln0();
                this.C = ln0Var3;
            }
            ln0Var3.a();
            for (Map.Entry entry : wk0Var.a().entrySet()) {
                ln0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final s11 d1() {
        if (J0().r) {
            uc0 n = t80.n(this);
            un0 un0Var = this.F;
            if (un0Var == null) {
                un0Var = new un0();
                this.F = un0Var;
            }
            long A0 = A0(I0());
            int i = (int) (A0 >> 32);
            un0Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (A0 & 4294967295L);
            un0Var.b = -Float.intBitsToFloat(i2);
            un0Var.c = Float.intBitsToFloat(i) + W();
            un0Var.d = Float.intBitsToFloat(i2) + S();
            while (this != n) {
                this.a1(un0Var, false, true);
                if (!un0Var.b()) {
                    this = this.u;
                    this.getClass();
                }
            }
            return new s11(un0Var.a, un0Var.b, un0Var.c, un0Var.d);
        }
        return s11.e;
    }

    public final void e1(Function1 function1, boolean z) {
        eu0 eu0Var;
        eo0 eo0Var;
        Reference poll;
        r4 r4Var;
        eo0 eo0Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        jd0 jd0Var = this.s;
        boolean z2 = (!z && this.x == function1 && Intrinsics.a(this.y, jd0Var.C) && this.z == jd0Var.D) ? false : true;
        this.y = jd0Var.C;
        this.z = jd0Var.D;
        boolean F = jd0Var.F();
        np0 np0Var = this.N;
        if (!F || function1 == null) {
            this.x = null;
            du0 du0Var = this.P;
            if (du0Var != null) {
                n50 n50Var = (n50) du0Var;
                if (!ca0.q(n50Var.b())) {
                    jd0Var.L();
                }
                n50Var.h = null;
                n50Var.i = null;
                n50Var.k = true;
                n50Var.f(false);
                k50 k50Var = n50Var.e;
                if (k50Var != null) {
                    k50Var.a(n50Var.d);
                    d4 d4Var = n50Var.g;
                    c51 c51Var = d4Var.y0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c51Var.g;
                        eo0Var = (eo0) c51Var.e;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            eo0Var.j(poll);
                        }
                    } while (poll != null);
                    eo0Var.b(new WeakReference(n50Var, (ReferenceQueue) c51Var.g));
                    d4Var.H.j(n50Var);
                }
                jd0Var.N = true;
                np0Var.invoke();
                if (J0().r && jd0Var.G() && (eu0Var = jd0Var.s) != null) {
                    ((d4) eu0Var).x(jd0Var);
                }
            }
            this.P = null;
            this.O = false;
            return;
        }
        this.x = function1;
        if (this.P != null) {
            if (z2) {
                f1(true);
                return;
            }
            return;
        }
        eu0 a = md0.a(jd0Var);
        r4 r4Var2 = this.M;
        if (r4Var2 == null) {
            r4 r4Var3 = new r4(this, 3, new np0(this, i));
            this.M = r4Var3;
            r4Var = r4Var3;
        } else {
            r4Var = r4Var2;
        }
        d4 d4Var2 = (d4) a;
        c51 c51Var2 = d4Var2.y0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c51Var2.g;
            eo0Var2 = (eo0) c51Var2.e;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                eo0Var2.j(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = eo0Var2.g;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eo0Var2.k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        du0 du0Var2 = (du0) obj;
        if (du0Var2 != null) {
            n50 n50Var2 = (n50) du0Var2;
            k50 k50Var2 = n50Var2.e;
            if (k50Var2 == null) {
                throw qy0.g("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!n50Var2.d.s) {
                o80.a("layer should have been released before reuse");
            }
            n50Var2.d = k50Var2.b();
            n50Var2.k = false;
            n50Var2.h = r4Var;
            n50Var2.i = np0Var;
            n50Var2.u = false;
            n50Var2.v = false;
            n50Var2.w = true;
            y90.B(n50Var2.l);
            float[] fArr = n50Var2.m;
            if (fArr != null) {
                y90.B(fArr);
            }
            n50Var2.s = aj1.a;
            n50Var2.x = false;
            n50Var2.j = 9223372034707292159L;
            n50Var2.t = null;
            n50Var2.r = 0;
        } else {
            du0Var2 = new n50(d4Var2.getGraphicsContext().b(), d4Var2.getGraphicsContext(), d4Var2, r4Var, np0Var);
        }
        n50 n50Var3 = (n50) du0Var2;
        n50Var3.e(this.g);
        n50Var3.d(this.D);
        this.P = du0Var2;
        f1(true);
        jd0Var.N = true;
        np0Var.invoke();
    }

    @Override // defpackage.nr
    public final float f() {
        return this.s.C.f();
    }

    public final void f1(boolean z) {
        rc0 rc0Var;
        long j;
        rc0 rc0Var2;
        boolean z2;
        eu0 eu0Var;
        Function0 function0;
        Function0 function02;
        du0 du0Var = this.P;
        Function1 function1 = this.x;
        if (du0Var == null) {
            if (function1 == null) {
                return;
            }
            o80.b("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw qy0.g("updateLayerParameters requires a non-null layerBlock");
        }
        o31 o31Var = Q;
        if (o31Var.e != 1.0f) {
            o31Var.d |= 1;
            o31Var.e = 1.0f;
        }
        if (o31Var.g != 1.0f) {
            o31Var.d |= 2;
            o31Var.g = 1.0f;
        }
        if (o31Var.h != 1.0f) {
            o31Var.d |= 4;
            o31Var.h = 1.0f;
        }
        if (o31Var.i != 0.0f) {
            o31Var.d |= 32;
            o31Var.i = 0.0f;
        }
        long j2 = o50.a;
        if (!hi.c(o31Var.j, j2)) {
            o31Var.d |= 64;
            o31Var.j = j2;
        }
        if (!hi.c(o31Var.k, j2)) {
            o31Var.d |= 128;
            o31Var.k = j2;
        }
        if (o31Var.l != 8.0f) {
            o31Var.d |= 2048;
            o31Var.l = 8.0f;
        }
        long j3 = aj1.a;
        if (o31Var.m != j3) {
            o31Var.d |= 4096;
            o31Var.m = j3;
        }
        p60 p60Var = m90.m;
        if (!Intrinsics.a(o31Var.n, p60Var)) {
            o31Var.d |= 8192;
            o31Var.n = p60Var;
        }
        if (o31Var.o) {
            o31Var.d |= 16384;
            o31Var.o = false;
        }
        if (o31Var.s != 3) {
            o31Var.d |= 524288;
            o31Var.s = 3;
        }
        o31Var.p = 9205357640488583168L;
        o31Var.t = null;
        o31Var.d = 0;
        jd0 jd0Var = this.s;
        o31Var.q = jd0Var.C;
        o31Var.r = jd0Var.D;
        o31Var.p = ca0.x(this.g);
        ((d4) md0.a(jd0Var)).getSnapshotObserver().a.b(this, y3.y, new w3(function1, 8, this));
        rc0 rc0Var3 = this.G;
        if (rc0Var3 == null) {
            rc0Var3 = new rc0();
            this.G = rc0Var3;
        }
        rc0 rc0Var4 = R;
        rc0Var4.getClass();
        rc0Var4.a = rc0Var3.a;
        rc0Var4.b = rc0Var3.b;
        rc0Var4.c = rc0Var3.c;
        rc0Var4.d = rc0Var3.d;
        float f = o31Var.e;
        rc0Var3.a = f;
        rc0Var3.b = o31Var.g;
        rc0Var3.c = o31Var.l;
        long j4 = o31Var.m;
        rc0Var3.d = j4;
        n50 n50Var = (n50) du0Var;
        d4 d4Var = n50Var.g;
        int i = n50Var.r | o31Var.d;
        n50Var.p = o31Var.r;
        n50Var.o = o31Var.q;
        int i2 = i & 4096;
        if (i2 != 0) {
            n50Var.s = j4;
        }
        if ((i & 1) != 0) {
            p50 p50Var = n50Var.d.a;
            if (p50Var.j != f) {
                p50Var.j = f;
                p50Var.c.setScaleX(f);
            }
        }
        if ((i & 2) != 0) {
            l50 l50Var = n50Var.d;
            float f2 = o31Var.g;
            p50 p50Var2 = l50Var.a;
            if (p50Var2.k != f2) {
                p50Var2.k = f2;
                p50Var2.c.setScaleY(f2);
            }
        }
        if ((i & 4) != 0) {
            l50 l50Var2 = n50Var.d;
            float f3 = o31Var.h;
            p50 p50Var3 = l50Var2.a;
            if (p50Var3.h != f3) {
                p50Var3.h = f3;
                p50Var3.c.setAlpha(f3);
            }
        }
        if ((i & 8) != 0) {
            p50 p50Var4 = n50Var.d.a;
        }
        if ((i & 16) != 0) {
            p50 p50Var5 = n50Var.d.a;
        }
        if ((i & 32) != 0) {
            l50 l50Var3 = n50Var.d;
            float f4 = o31Var.i;
            p50 p50Var6 = l50Var3.a;
            if (p50Var6.l != f4) {
                p50Var6.l = f4;
                p50Var6.c.setElevation(f4);
                l50Var3.g = true;
                l50Var3.a();
            }
            if (o31Var.i > 0.0f && !n50Var.x && (function02 = n50Var.i) != null) {
                function02.invoke();
            }
        }
        if ((i & 64) != 0) {
            l50 l50Var4 = n50Var.d;
            rc0Var = rc0Var4;
            long j5 = o31Var.j;
            p50 p50Var7 = l50Var4.a;
            if (!hi.c(j5, p50Var7.m)) {
                p50Var7.m = j5;
                p50Var7.c.setAmbientShadowColor(la0.W(j5));
            }
        } else {
            rc0Var = rc0Var4;
        }
        if ((i & 128) != 0) {
            l50 l50Var5 = n50Var.d;
            long j6 = o31Var.k;
            p50 p50Var8 = l50Var5.a;
            if (!hi.c(j6, p50Var8.n)) {
                p50Var8.n = j6;
                p50Var8.c.setSpotShadowColor(la0.W(j6));
            }
        }
        if ((i & 1024) != 0) {
            p50 p50Var9 = n50Var.d.a;
        }
        if ((i & 256) != 0) {
            p50 p50Var10 = n50Var.d.a;
        }
        if ((i & 512) != 0) {
            p50 p50Var11 = n50Var.d.a;
        }
        if ((i & 2048) != 0) {
            l50 l50Var6 = n50Var.d;
            float f5 = o31Var.l;
            p50 p50Var12 = l50Var6.a;
            if (p50Var12.o != f5) {
                p50Var12.o = f5;
                p50Var12.c.setCameraDistance(f5);
            }
        }
        if (i2 != 0) {
            boolean z3 = n50Var.s == j3;
            l50 l50Var7 = n50Var.d;
            if (z3) {
                j = 4294967295L;
                l50Var7.f(9205357640488583168L);
            } else {
                j = 4294967295L;
                l50Var7.f((Float.floatToRawIntBits(Float.intBitsToFloat((int) (n50Var.s & 4294967295L)) * ((int) (n50Var.j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r10 >> 32)) * ((int) (n50Var.j >> 32))) << 32));
            }
        } else {
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            l50 l50Var8 = n50Var.d;
            boolean z4 = o31Var.o;
            if (l50Var8.w != z4) {
                l50Var8.w = z4;
                l50Var8.g = true;
                l50Var8.a();
            }
        }
        if ((131072 & i) != 0) {
            p50 p50Var13 = n50Var.d.a;
        }
        if ((262144 & i) != 0) {
            p50 p50Var14 = n50Var.d.a;
        }
        if ((i & 524288) != 0) {
            l50 l50Var9 = n50Var.d;
            int i3 = o31Var.s;
            p50 p50Var15 = l50Var9.a;
            if (p50Var15.i != i3) {
                p50Var15.i = i3;
                Paint paint = p50Var15.e;
                if (paint == null) {
                    paint = new Paint();
                    p50Var15.e = paint;
                }
                paint.setBlendMode(op.O(i3));
                p50Var15.c();
            }
        }
        if ((32768 & i) != 0) {
            p50 p50Var16 = n50Var.d.a;
            if (p50Var16.s != 0) {
                p50Var16.s = 0;
                p50Var16.c();
            }
        }
        if ((i & 7963) != 0) {
            n50Var.u = true;
            n50Var.v = true;
        }
        if (Intrinsics.a(n50Var.t, o31Var.t)) {
            rc0Var2 = rc0Var;
            z2 = false;
        } else {
            ka0 ka0Var = o31Var.t;
            n50Var.t = ka0Var;
            if (ka0Var == null) {
                rc0Var2 = rc0Var;
            } else {
                l50 l50Var10 = n50Var.d;
                if (ka0Var instanceof ht0) {
                    s11 s11Var = ((ht0) ka0Var).a;
                    float f6 = s11Var.a;
                    float f7 = s11Var.b;
                    l50Var10.h(0.0f, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & j), (Float.floatToRawIntBits(s11Var.c - f6) << 32) | (Float.floatToRawIntBits(s11Var.d - f7) & j));
                } else if (ka0Var instanceof gt0) {
                    c6 c6Var = ((gt0) ka0Var).a;
                    l50Var10.k = null;
                    l50Var10.i = 9205357640488583168L;
                    l50Var10.h = 0L;
                    l50Var10.j = 0.0f;
                    l50Var10.g = true;
                    l50Var10.n = false;
                    l50Var10.l = c6Var;
                    l50Var10.a();
                } else {
                    if (!(ka0Var instanceof it0)) {
                        l.a();
                        return;
                    }
                    it0 it0Var = (it0) ka0Var;
                    c6 c6Var2 = it0Var.b;
                    if (c6Var2 != null) {
                        l50Var10.k = null;
                        rc0Var2 = rc0Var;
                        l50Var10.i = 9205357640488583168L;
                        l50Var10.h = 0L;
                        l50Var10.j = 0.0f;
                        l50Var10.g = true;
                        l50Var10.n = false;
                        l50Var10.l = c6Var2;
                        l50Var10.a();
                    } else {
                        rc0Var2 = rc0Var;
                        l41 l41Var = it0Var.a;
                        float f8 = l41Var.b;
                        float f9 = l41Var.a;
                        l50Var10.h(Float.intBitsToFloat((int) (l41Var.h >> 32)), (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & j), (Float.floatToRawIntBits(l41Var.c - f9) << 32) | (Float.floatToRawIntBits(l41Var.d - f8) & j));
                    }
                    if ((ka0Var instanceof gt0) && Build.VERSION.SDK_INT < 33 && (function0 = n50Var.i) != null) {
                        function0.invoke();
                    }
                }
                rc0Var2 = rc0Var;
                if (ka0Var instanceof gt0) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        n50Var.r = o31Var.d;
        if (i != 0 || z2) {
            ViewParent parent = d4Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(d4Var, d4Var);
            }
            if (d4Var.p) {
                d4Var.K(0.0f);
            }
        }
        boolean z5 = this.w;
        boolean z6 = o31Var.o;
        this.w = z6;
        this.A = o31Var.h;
        rc0 rc0Var5 = rc0Var2;
        boolean z7 = rc0Var5.a == rc0Var3.a && rc0Var5.b == rc0Var3.b && rc0Var5.c == rc0Var3.c && rc0Var5.d == rc0Var3.d;
        if (z && ((!z7 || z5 != z6) && (eu0Var = jd0Var.s) != null)) {
            ((d4) eu0Var).x(jd0Var);
        }
        if (z7) {
            return;
        }
        nd0 nd0Var = jd0Var.K;
        if (nd0Var.l > 0) {
            if (nd0Var.k || nd0Var.j) {
                jd0Var.S(false);
            }
            nd0Var.p.h0();
        }
        jd0Var.L();
        d4 d4Var2 = (d4) md0.a(jd0Var);
        u11 rectManager = d4Var2.getRectManager();
        if (this == ((qp0) jd0Var.J.e)) {
            rectManager.f(jd0Var, false);
        } else {
            rectManager.getClass();
            if (jd0Var.G()) {
                long g = u11.g(jd0Var);
                if (s90.a(g, 9223372034707292159L)) {
                    rectManager.d(jd0Var);
                } else {
                    jd0Var.j = g;
                    jd0Var.k = false;
                    eo0 x = jd0Var.x();
                    Object[] objArr = x.d;
                    int i4 = x.g;
                    for (int i5 = 0; i5 < i4; i5++) {
                        rectManager.f((jd0) objArr[i5], false);
                    }
                    rectManager.e(jd0Var);
                }
            }
        }
        if (jd0Var.T > 0) {
            yw ywVar = d4Var2.a0.e;
            ywVar.getClass();
            if (jd0Var.T > 0) {
                ((eo0) ywVar.e).b(jd0Var);
                jd0Var.S = true;
            }
            d4Var2.E(null);
        }
    }

    @Override // defpackage.uc0
    public final long g(long j) {
        long M = M(j);
        d4 d4Var = (d4) md0.a(this.s);
        d4Var.B();
        return y90.u(d4Var.d0, M);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        du0 du0Var = this.P;
        if (du0Var == null || !this.w) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        l50 l50Var = ((n50) du0Var).d;
        if (l50Var.w) {
            ka0 d = l50Var.d();
            if (!(d instanceof ht0)) {
                if (d instanceof it0) {
                    l41 l41Var = ((it0) d).a;
                    float f = l41Var.c;
                    float f2 = l41Var.b;
                    float f3 = l41Var.d;
                    float f4 = l41Var.a;
                    long j2 = l41Var.f;
                    long j3 = l41Var.h;
                    z = false;
                    z2 = true;
                    long j4 = l41Var.g;
                    long j5 = l41Var.e;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = t80.D(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, l41Var.e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = t80.D(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, l41Var.h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = t80.D(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, l41Var.g);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = t80.D(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, l41Var.f);
                                        }
                                    }
                                }
                            }
                        }
                        c6 a = e6.a();
                        c6.b(a, l41Var);
                        z3 = t80.C(intBitsToFloat, intBitsToFloat2, a);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(d instanceof gt0)) {
                        l.a();
                        return false;
                    }
                    z3 = t80.C(intBitsToFloat, intBitsToFloat2, ((gt0) d).a);
                }
                return z3 ? z2 : z;
            }
            s11 s11Var = ((ht0) d).a;
            if (s11Var.a > intBitsToFloat || intBitsToFloat >= s11Var.c || s11Var.b > intBitsToFloat2 || intBitsToFloat2 >= s11Var.d) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    @Override // defpackage.xk0
    public final vc0 getLayoutDirection() {
        return this.s.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [zl0] */
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
    @Override // defpackage.zw0, defpackage.qk0
    public final Object h() {
        jd0 jd0Var = this.s;
        if (!jd0Var.J.g(64)) {
            return null;
        }
        J0();
        z11 z11Var = new z11();
        for (zl0 zl0Var = (ig1) jd0Var.J.f; zl0Var != null; zl0Var = zl0Var.i) {
            if ((zl0Var.g & 64) != 0) {
                zq zqVar = zl0Var;
                ?? r4 = 0;
                while (zqVar != 0) {
                    if (zqVar instanceof bv0) {
                        z11Var.d = ((bv0) zqVar).e0(z11Var.d);
                    } else if ((zqVar.g & 64) != 0 && (zqVar instanceof zq)) {
                        zl0 zl0Var2 = zqVar.t;
                        int i = 0;
                        zqVar = zqVar;
                        r4 = r4;
                        while (zl0Var2 != null) {
                            if ((zl0Var2.g & 64) != 0) {
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
        }
        return z11Var.d;
    }

    @Override // defpackage.nr
    public final float k() {
        return this.s.C.k();
    }

    @Override // defpackage.uc0
    public final uc0 l() {
        boolean z = J0().r;
        jd0 jd0Var = this.s;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (jd0 jd0Var2 = jd0Var; jd0Var2 != null; jd0Var2 = jd0Var2.s()) {
                sb.append("\n|");
                sb.append(jd0Var2);
                sb.append(" isAttached=");
                sb.append(jd0Var2.F());
                sb.append(" modifier=");
                sb.append(jd0Var2.O);
                sb.append(" tail=");
                sb.append(J0());
            }
            o80.b(sb.toString());
        }
        S0();
        return ((qp0) jd0Var.J.e).u;
    }

    @Override // defpackage.ej0
    public final ej0 n0() {
        return this.t;
    }

    @Override // defpackage.ej0
    public final boolean p0() {
        return this.B != null;
    }

    @Override // defpackage.ej0
    public final jd0 q0() {
        return this.s;
    }

    @Override // defpackage.ej0
    public final wk0 r0() {
        wk0 wk0Var = this.B;
        if (wk0Var != null) {
            return wk0Var;
        }
        dd0.j("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.ej0
    public final ej0 s0() {
        return this.u;
    }

    @Override // defpackage.fu0
    public final boolean t() {
        return (this.P == null || this.v || !this.s.F()) ? false : true;
    }

    @Override // defpackage.ej0
    public final long t0() {
        return this.D;
    }

    @Override // defpackage.ej0
    public final void x0() {
        Y(this.D, this.E, this.x);
    }

    public final void y0(qp0 qp0Var, un0 un0Var, boolean z) {
        if (qp0Var == this) {
            return;
        }
        qp0 qp0Var2 = this.u;
        if (qp0Var2 != null) {
            qp0Var2.y0(qp0Var, un0Var, z);
        }
        long j = this.D;
        float f = (int) (j >> 32);
        un0Var.a -= f;
        un0Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        un0Var.b -= f2;
        un0Var.d -= f2;
        du0 du0Var = this.P;
        if (du0Var != null) {
            n50 n50Var = (n50) du0Var;
            float[] a = n50Var.a();
            if (!n50Var.w) {
                if (a == null) {
                    un0Var.a = 0.0f;
                    un0Var.b = 0.0f;
                    un0Var.c = 0.0f;
                    un0Var.d = 0.0f;
                } else {
                    y90.v(a, un0Var);
                }
            }
            if (this.w && z) {
                long j2 = this.g;
                un0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long z0(qp0 qp0Var, long j) {
        if (qp0Var == this) {
            return j;
        }
        qp0 qp0Var2 = this.u;
        return (qp0Var2 == null || Intrinsics.a(qp0Var, qp0Var2)) ? G0(j) : G0(qp0Var2.z0(qp0Var, j));
    }

    @Override // defpackage.ej0
    public final uc0 o0() {
        return this;
    }
}
