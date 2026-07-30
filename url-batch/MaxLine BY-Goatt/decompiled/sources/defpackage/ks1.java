package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ks1 extends qg1 implements jj1, t81, sx1 {
    public static final ia2 V;
    public static final q81 W;
    public static final float[] X;
    public static final nm1 Y;
    public static final nm1 Z;
    public final i91 A;
    public ks1 B;
    public ks1 C;
    public boolean D;
    public boolean E;
    public Function1 F;
    public ca0 G;
    public u81 H;
    public pj1 J;
    public hn1 K;
    public float M;
    public sn1 N;
    public q81 O;
    public dw0 P;
    public ls Q;
    public n8 R;
    public boolean T;
    public qx1 U;
    public float I = 0.8f;
    public long L = 0;
    public final hs1 S = new hs1(this, 1);

    static {
        ia2 ia2Var = new ia2();
        ia2Var.n = 1.0f;
        ia2Var.o = 1.0f;
        ia2Var.p = 1.0f;
        long j = gw0.a;
        ia2Var.r = j;
        ia2Var.s = j;
        ia2Var.t = 8.0f;
        ia2Var.u = wy2.b;
        ia2Var.v = ap.e;
        ia2Var.x = 9205357640488583168L;
        ia2Var.y = bd3.c();
        ia2Var.z = u81.m;
        ia2Var.A = 3;
        V = ia2Var;
        W = new q81();
        X = ti1.a();
        Y = new nm1(3);
        Z = new nm1(4);
    }

    public ks1(i91 i91Var) {
        this.A = i91Var;
        this.G = i91Var.I;
        this.H = i91Var.J;
    }

    public static ks1 k1(t81 t81Var) {
        ks1 ks1Var;
        tg1 tg1Var = t81Var instanceof tg1 ? (tg1) t81Var : null;
        if (tg1Var != null && (ks1Var = tg1Var.m.A) != null) {
            return ks1Var;
        }
        t81Var.getClass();
        return (ks1) t81Var;
    }

    @Override // defpackage.qg1
    public final long A0() {
        return this.L;
    }

    @Override // defpackage.sx1
    public final boolean E() {
        return (this.U == null || this.D || !this.A.I()) ? false : true;
    }

    @Override // defpackage.qg1
    public final void E0() {
        i0(this.L, this.M, this.F);
    }

    public final void F0(ks1 ks1Var, sn1 sn1Var, boolean z) {
        if (ks1Var == this) {
            return;
        }
        ks1 ks1Var2 = this.C;
        if (ks1Var2 != null) {
            ks1Var2.F0(ks1Var, sn1Var, z);
        }
        long j = this.L;
        float f = (int) (j >> 32);
        sn1Var.a -= f;
        sn1Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        sn1Var.b -= f2;
        sn1Var.d -= f2;
        qx1 qx1Var = this.U;
        if (qx1Var != null) {
            fw0 fw0Var = (fw0) qx1Var;
            float[] a = fw0Var.a();
            if (!fw0Var.E) {
                if (a == null) {
                    sn1Var.a = 0.0f;
                    sn1Var.b = 0.0f;
                    sn1Var.c = 0.0f;
                    sn1Var.d = 0.0f;
                } else {
                    ti1.c(a, sn1Var);
                }
            }
            if (this.E && z) {
                long j2 = this.o;
                sn1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long G0(ks1 ks1Var, long j) {
        if (ks1Var == this) {
            return j;
        }
        ks1 ks1Var2 = this.C;
        return (ks1Var2 == null || Intrinsics.b(ks1Var, ks1Var2)) ? N0(j) : N0(ks1Var2.G0(ks1Var, j));
    }

    public final long H0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - e0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - d0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final float I0(long j, long j2) {
        if (e0() >= Float.intBitsToFloat((int) (j2 >> 32)) && d0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long H0 = H0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (H0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (H0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - e0());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - d0())) & 4294967295L);
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

    @Override // defpackage.t81
    public final void J(float[] fArr) {
        rx1 a = l91.a(this.A);
        ks1 k1 = k1(yk3.D(this));
        o1(k1, fArr);
        if (a instanceof ui1) {
            ((t7) ((ui1) a)).t(fArr);
            return;
        }
        long b = k1.b(0L);
        if ((9223372034707292159L & b) != 9205357640488583168L) {
            ti1.f(fArr, Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (b & 4294967295L)));
        }
    }

    public final void J0(ls lsVar, dw0 dw0Var) {
        qx1 qx1Var = this.U;
        if (qx1Var == null) {
            long j = this.L;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            lsVar.h(f, f2);
            K0(lsVar, dw0Var);
            lsVar.h(-f, -f2);
            return;
        }
        fw0 fw0Var = (fw0) qx1Var;
        ns nsVar = fw0Var.y;
        fw0Var.g();
        fw0Var.F = fw0Var.m.a.G() > 0.0f;
        mh mhVar = nsVar.n;
        mhVar.G(lsVar);
        mhVar.o = dw0Var;
        ll3.A(nsVar, fw0Var.m);
    }

    public final void K0(ls lsVar, dw0 dw0Var) {
        ks1 ks1Var;
        ls lsVar2;
        dw0 dw0Var2;
        ul1 R0 = R0(4);
        if (R0 == null) {
            f1(lsVar, dw0Var);
            return;
        }
        i91 i91Var = this.A;
        i91Var.getClass();
        k91 sharedDrawScope = ((t7) l91.a(i91Var)).getSharedDrawScope();
        long Q = zm3.Q(this.o);
        sharedDrawScope.getClass();
        eo1 eo1Var = null;
        while (R0 != null) {
            if (R0 instanceof xd0) {
                ks1Var = this;
                lsVar2 = lsVar;
                dw0Var2 = dw0Var;
                sharedDrawScope.b(lsVar2, Q, ks1Var, (xd0) R0, dw0Var2);
            } else {
                ks1Var = this;
                lsVar2 = lsVar;
                dw0Var2 = dw0Var;
                if ((R0.o & 4) != 0 && (R0 instanceof p90)) {
                    int i = 0;
                    for (ul1 ul1Var = ((p90) R0).B; ul1Var != null; ul1Var = ul1Var.r) {
                        if ((ul1Var.o & 4) != 0) {
                            i++;
                            if (i == 1) {
                                R0 = ul1Var;
                            } else {
                                if (eo1Var == null) {
                                    eo1Var = new eo1(new ul1[16]);
                                }
                                if (R0 != null) {
                                    eo1Var.b(R0);
                                    R0 = null;
                                }
                                eo1Var.b(ul1Var);
                            }
                        }
                    }
                    if (i == 1) {
                        lsVar = lsVar2;
                        this = ks1Var;
                        dw0Var = dw0Var2;
                    }
                }
            }
            R0 = s03.c(eo1Var);
            lsVar = lsVar2;
            this = ks1Var;
            dw0Var = dw0Var2;
        }
    }

    @Override // defpackage.t81
    public final void L(t81 t81Var, float[] fArr) {
        ks1 k1 = k1(t81Var);
        k1.a1();
        ks1 M0 = M0(k1);
        ti1.d(fArr);
        k1.o1(M0, fArr);
        n1(M0, fArr);
    }

    public abstract void L0();

    @Override // defpackage.t81
    public final w72 M(t81 t81Var, boolean z) {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!t81Var.y()) {
            h21.b("LayoutCoordinates " + t81Var + " is not attached!");
        }
        ks1 k1 = k1(t81Var);
        k1.a1();
        ks1 M0 = M0(k1);
        sn1 sn1Var = this.N;
        if (sn1Var == null) {
            sn1Var = new sn1();
            this.N = sn1Var;
        }
        sn1Var.a = 0.0f;
        sn1Var.b = 0.0f;
        sn1Var.c = (int) (t81Var.N() >> 32);
        sn1Var.d = (int) (t81Var.N() & 4294967295L);
        while (k1 != M0) {
            k1.h1(sn1Var, z, false);
            if (sn1Var.b()) {
                return w72.e;
            }
            k1 = k1.C;
            k1.getClass();
        }
        F0(M0, sn1Var, z);
        return new w72(sn1Var.a, sn1Var.b, sn1Var.c, sn1Var.d);
    }

    public final ks1 M0(ks1 ks1Var) {
        i91 i91Var = ks1Var.A;
        i91 i91Var2 = this.A;
        if (i91Var == i91Var2) {
            ul1 Q0 = ks1Var.Q0();
            ul1 Q02 = Q0();
            if (!Q02.m.z) {
                h21.b("visitLocalAncestors called on an unattached node");
            }
            for (ul1 ul1Var = Q02.m.q; ul1Var != null; ul1Var = ul1Var.q) {
                if ((ul1Var.o & 2) != 0 && ul1Var == Q0) {
                    return ks1Var;
                }
            }
            return this;
        }
        while (i91Var.z > i91Var2.z) {
            i91Var = i91Var.u();
            i91Var.getClass();
        }
        i91 i91Var3 = i91Var2;
        while (i91Var3.z > i91Var.z) {
            i91Var3 = i91Var3.u();
            i91Var3.getClass();
        }
        while (i91Var != i91Var3) {
            i91Var = i91Var.u();
            i91Var3 = i91Var3.u();
            if (i91Var == null || i91Var3 == null) {
                lh.e("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (i91Var3 != i91Var2) {
            if (i91Var != ks1Var.A) {
                return i91Var.P.c;
            }
            return ks1Var;
        }
        return this;
    }

    @Override // defpackage.t81
    public final long N() {
        return this.o;
    }

    public final long N0(long j) {
        long j2 = this.L;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        qx1 qx1Var = this.U;
        if (qx1Var != null) {
            fw0 fw0Var = (fw0) qx1Var;
            float[] a = fw0Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!fw0Var.E) {
                return ti1.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    public abstract sg1 O0();

    public final long P0() {
        return this.G.c0(this.A.K.g());
    }

    public abstract ul1 Q0();

    public final ul1 R0(int i) {
        boolean g = ls1.g(i);
        ul1 Q0 = Q0();
        if (!g && (Q0 = Q0.q) == null) {
            return null;
        }
        for (ul1 S0 = S0(g); S0 != null && (S0.p & i) != 0; S0 = S0.r) {
            if ((S0.o & i) != 0) {
                return S0;
            }
            if (S0 == Q0) {
                return null;
            }
        }
        return null;
    }

    public final ul1 S0(boolean z) {
        ul1 Q0;
        fs1 fs1Var = this.A.P;
        if (fs1Var.d == this) {
            return fs1Var.f;
        }
        ks1 ks1Var = this.C;
        if (!z) {
            if (ks1Var != null) {
                return ks1Var.Q0();
            }
            return null;
        }
        if (ks1Var == null || (Q0 = ks1Var.Q0()) == null) {
            return null;
        }
        return Q0.r;
    }

    @Override // defpackage.t81
    public final long T(long j) {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        a1();
        while (this != null) {
            j = this.l1(j);
            this = this.C;
        }
        return j;
    }

    public final void T0(ul1 ul1Var, nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z) {
        if (ul1Var == null) {
            W0(nm1Var, j, ux0Var, i, z);
            return;
        }
        int i2 = ux0Var.o;
        jn1 jn1Var = ux0Var.m;
        ux0Var.b(i2 + 1, jn1Var.b);
        ux0Var.o++;
        jn1Var.a(ul1Var);
        ux0Var.n.a(s03.a(-1.0f, z, false));
        T0(tk3.u(ul1Var, nm1Var.q()), nm1Var, j, ux0Var, i, z);
        ux0Var.o = i2;
    }

    public final void U0(ul1 ul1Var, nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z, float f) {
        if (ul1Var == null) {
            W0(nm1Var, j, ux0Var, i, z);
            return;
        }
        int i2 = ux0Var.o;
        jn1 jn1Var = ux0Var.m;
        ux0Var.b(i2 + 1, jn1Var.b);
        ux0Var.o++;
        jn1Var.a(ul1Var);
        ux0Var.n.a(s03.a(f, z, false));
        e1(tk3.u(ul1Var, nm1Var.q()), nm1Var, j, ux0Var, i, z, f, true);
        ux0Var.o = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.j8.q(r18.a(), defpackage.s03.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        ul1 R0 = R0(nm1Var.q());
        if (!r1(j)) {
            if (i == 1) {
                float I0 = I0(j, P0());
                if ((Float.floatToRawIntBits(I0) & Integer.MAX_VALUE) < 2139095040) {
                    if (ux0Var.o != ux0Var.m.b - 1) {
                        if (j8.q(ux0Var.a(), s03.a(I0, false, false)) <= 0) {
                            return;
                        }
                    }
                    U0(R0, nm1Var, j, ux0Var, i, false, I0);
                    return;
                }
                return;
            }
            return;
        }
        if (R0 == null) {
            W0(nm1Var, j, ux0Var, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < e0() && intBitsToFloat2 < d0()) {
            T0(R0, nm1Var, j, ux0Var, i, z);
            return;
        }
        float I02 = i == 1 ? I0(j, P0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(I02) & Integer.MAX_VALUE) < 2139095040) {
            if (ux0Var.o == ux0Var.m.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            e1(R0, nm1Var, j, ux0Var, i, z2, I02, z3);
        }
        z2 = z;
        z3 = false;
        e1(R0, nm1Var, j, ux0Var, i, z2, I02, z3);
    }

    public void W0(nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z) {
        ks1 ks1Var = this.B;
        if (ks1Var != null) {
            ks1Var.V0(nm1Var, ks1Var.N0(j), ux0Var, i, z);
        }
    }

    public final void X0() {
        qx1 qx1Var = this.U;
        if (qx1Var != null) {
            ((fw0) qx1Var).c();
            return;
        }
        ks1 ks1Var = this.C;
        if (ks1Var != null) {
            ks1Var.X0();
        }
    }

    public final boolean Y0() {
        if (this.U != null && this.I <= 0.0f) {
            return true;
        }
        ks1 ks1Var = this.C;
        if (ks1Var != null) {
            return ks1Var.Y0();
        }
        return false;
    }

    public final long Z0(t81 t81Var, long j) {
        if (t81Var instanceof tg1) {
            tg1 tg1Var = (tg1) t81Var;
            tg1Var.m.A.a1();
            return tg1Var.c(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        ks1 k1 = k1(t81Var);
        k1.a1();
        ks1 M0 = M0(k1);
        while (k1 != M0) {
            j = k1.l1(j);
            k1 = k1.C;
            k1.getClass();
        }
        return G0(M0, j);
    }

    public final void a1() {
        this.A.Q.b();
    }

    @Override // defpackage.t81
    public final long b(long j) {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((t7) l91.a(this.A)).u(T(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ul1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [eo1] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b1() {
        ul1 ul1Var;
        boolean g = ls1.g(128);
        ul1 S0 = S0(g);
        if (S0 == null || (S0.m.p & 128) == 0) {
            return;
        }
        nm2 d = ci2.d();
        Function1 e = d != null ? d.e() : null;
        nm2 f = ci2.f(d);
        try {
            if (g) {
                ul1Var = Q0();
            } else {
                ul1Var = Q0().q;
                if (ul1Var == null) {
                    Unit unit = Unit.a;
                    ci2.j(d, f, e);
                }
            }
            for (ul1 S02 = S0(g); S02 != null && (S02.p & 128) != 0; S02 = S02.r) {
                if ((S02.o & 128) != 0) {
                    p90 p90Var = S02;
                    ?? r8 = 0;
                    while (p90Var != 0) {
                        if (p90Var instanceof r81) {
                            ((r81) p90Var).v(this.o);
                        } else if ((p90Var.o & 128) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var2 = p90Var.B;
                            int i = 0;
                            p90Var = p90Var;
                            r8 = r8;
                            while (ul1Var2 != null) {
                                if ((ul1Var2.o & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        p90Var = ul1Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new eo1(new ul1[16]);
                                        }
                                        if (p90Var != 0) {
                                            r8.b(p90Var);
                                            p90Var = 0;
                                        }
                                        r8.b(ul1Var2);
                                    }
                                }
                                ul1Var2 = ul1Var2.r;
                                p90Var = p90Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        p90Var = s03.c(r8);
                    }
                }
                if (S02 == ul1Var) {
                    break;
                }
            }
            Unit unit2 = Unit.a;
            ci2.j(d, f, e);
        } catch (Throwable th) {
            ci2.j(d, f, e);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ul1] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void c1() {
        boolean g = ls1.g(128);
        ul1 Q0 = Q0();
        if (!g && (Q0 = Q0.q) == null) {
            return;
        }
        for (ul1 S0 = S0(g); S0 != null && (S0.p & 128) != 0; S0 = S0.r) {
            if ((S0.o & 128) != 0) {
                p90 p90Var = S0;
                ?? r5 = 0;
                while (p90Var != 0) {
                    if (p90Var instanceof r81) {
                        ((r81) p90Var).q(this);
                    } else if ((p90Var.o & 128) != 0 && (p90Var instanceof p90)) {
                        ul1 ul1Var = p90Var.B;
                        int i = 0;
                        p90Var = p90Var;
                        r5 = r5;
                        while (ul1Var != null) {
                            if ((ul1Var.o & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    p90Var = ul1Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new eo1(new ul1[16]);
                                    }
                                    if (p90Var != 0) {
                                        r5.b(p90Var);
                                        p90Var = 0;
                                    }
                                    r5.b(ul1Var);
                                }
                            }
                            ul1Var = ul1Var.r;
                            p90Var = p90Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    p90Var = s03.c(r5);
                }
            }
            if (S0 == Q0) {
                return;
            }
        }
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.A.I.d();
    }

    public final void d1() {
        this.D = true;
        this.S.invoke();
        i1();
        if (s31.a(this.L, 0L)) {
            return;
        }
        this.A.O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    public final void e1(ul1 ul1Var, nm1 nm1Var, long j, ux0 ux0Var, int i, boolean z, float f, boolean z2) {
        ul1 c;
        boolean z3;
        int i2;
        if (ul1Var == null) {
            W0(nm1Var, j, ux0Var, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            p90 p90Var = ul1Var;
            eo1 eo1Var = null;
            while (true) {
                if (p90Var == 0) {
                    break;
                }
                if (p90Var instanceof w22) {
                    long u = ((w22) p90Var).u();
                    int i4 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i4);
                    i91 i91Var = this.A;
                    long j2 = Long.MIN_VALUE & u;
                    if (intBitsToFloat >= (-((j2 == 0 || i91Var.J == u81.m) ? dq2.d(u, 0) : dq2.d(u, 2)))) {
                        if (Float.intBitsToFloat(i4) < e0() + ((j2 == 0 || i91Var.J == u81.m) ? dq2.d(u, 2) : dq2.d(u, 0))) {
                            int i5 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i5) >= (-dq2.d(u, 1))) {
                                if (Float.intBitsToFloat(i5) < dq2.d(u, 3) + d0()) {
                                    is1 is1Var = new is1(this, ul1Var, nm1Var, j, ux0Var, i3, z, f, z2);
                                    dn1 dn1Var = ux0Var.n;
                                    jn1 jn1Var = ux0Var.m;
                                    int i6 = ux0Var.o;
                                    int i7 = jn1Var.b;
                                    if (i6 == i7 - 1) {
                                        ux0Var.b(i6 + 1, i7);
                                        ux0Var.o++;
                                        jn1Var.a(ul1Var);
                                        dn1Var.a(s03.a(0.0f, z, true));
                                        is1Var.invoke();
                                        ux0Var.o = i6;
                                        return;
                                    }
                                    long a = ux0Var.a();
                                    int i8 = ux0Var.o;
                                    if (!j8.L(a)) {
                                        if (j8.E(a) > 0.0f) {
                                            int i9 = ux0Var.o;
                                            ux0Var.b(i9 + 1, jn1Var.b);
                                            ux0Var.o++;
                                            jn1Var.a(ul1Var);
                                            dn1Var.a(s03.a(0.0f, z, true));
                                            is1Var.invoke();
                                            ux0Var.o = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = jn1Var.b;
                                    int i11 = i10 - 1;
                                    ux0Var.o = i11;
                                    ux0Var.b(i10, jn1Var.b);
                                    ux0Var.o++;
                                    jn1Var.a(ul1Var);
                                    dn1Var.a(s03.a(0.0f, z, true));
                                    is1Var.invoke();
                                    ux0Var.o = i11;
                                    if (j8.E(ux0Var.a()) < 0.0f) {
                                        ux0Var.b(i8 + 1, ux0Var.o + 1);
                                    }
                                    ux0Var.o = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((p90Var.o & 16) != 0 && (p90Var instanceof p90)) {
                        ul1 ul1Var2 = p90Var.B;
                        int i12 = 0;
                        c = p90Var;
                        eo1Var = eo1Var;
                        while (ul1Var2 != null) {
                            if ((ul1Var2.o & 16) != 0) {
                                i12++;
                                eo1Var = eo1Var;
                                if (i12 == 1) {
                                    c = ul1Var2;
                                } else {
                                    if (eo1Var == null) {
                                        eo1Var = new eo1(new ul1[16]);
                                    }
                                    if (c != null) {
                                        eo1Var.b(c);
                                        c = null;
                                    }
                                    eo1Var.b(ul1Var2);
                                }
                            }
                            ul1Var2 = ul1Var2.r;
                            c = c;
                            eo1Var = eo1Var;
                        }
                        if (i12 == 1) {
                            i3 = i;
                            p90Var = c;
                            eo1Var = eo1Var;
                        }
                    }
                    c = s03.c(eo1Var);
                    i3 = i;
                    p90Var = c;
                    eo1Var = eo1Var;
                }
            }
        }
        if (z2) {
            U0(ul1Var, nm1Var, j, ux0Var, i, z, f);
            return;
        }
        switch (nm1Var.m) {
            case 3:
                ?? r4 = 0;
                p90 p90Var2 = ul1Var;
                while (p90Var2 != 0) {
                    if (p90Var2 instanceof w22) {
                        if (((w22) p90Var2).o0()) {
                            z3 = true;
                            break;
                        }
                    } else if ((p90Var2.o & 16) != 0 && (p90Var2 instanceof p90)) {
                        ul1 ul1Var3 = p90Var2.B;
                        int i13 = 0;
                        p90Var2 = p90Var2;
                        r4 = r4;
                        while (ul1Var3 != null) {
                            if ((ul1Var3.o & 16) != 0) {
                                i13++;
                                r4 = r4;
                                if (i13 == 1) {
                                    p90Var2 = ul1Var3;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new eo1(new ul1[16]);
                                    }
                                    if (p90Var2 != 0) {
                                        r4.b(p90Var2);
                                        p90Var2 = 0;
                                    }
                                    r4.b(ul1Var3);
                                }
                            }
                            ul1Var3 = ul1Var3.r;
                            p90Var2 = p90Var2;
                            r4 = r4;
                        }
                        if (i13 == 1) {
                        }
                    }
                    p90Var2 = s03.c(r4);
                }
                break;
            default:
                z3 = false;
                break;
        }
        if (!z3) {
            e1(tk3.u(ul1Var, nm1Var.q()), nm1Var, j, ux0Var, i, z, f, false);
            return;
        }
        js1 js1Var = new js1(this, ul1Var, nm1Var, j, ux0Var, i, z, f);
        dn1 dn1Var2 = ux0Var.n;
        jn1 jn1Var2 = ux0Var.m;
        int i14 = ux0Var.o;
        int i15 = jn1Var2.b;
        if (i14 != i15 - 1) {
            long a2 = ux0Var.a();
            int i16 = ux0Var.o;
            int i17 = jn1Var2.b;
            int i18 = i17 - 1;
            ux0Var.o = i18;
            ux0Var.b(i17, jn1Var2.b);
            ux0Var.o++;
            jn1Var2.a(ul1Var);
            dn1Var2.a(s03.a(f, z, false));
            js1Var.invoke();
            ux0Var.o = i18;
            long a3 = ux0Var.a();
            if (ux0Var.o + 1 >= jn1Var2.b - 1 || j8.q(a2, a3) <= 0) {
                ux0Var.b(ux0Var.o + 1, jn1Var2.b);
            } else {
                int i19 = i16 + 1;
                boolean L = j8.L(a3);
                int i20 = ux0Var.o;
                ux0Var.b(i19, L ? i20 + 2 : i20 + 1);
            }
            ux0Var.o = i16;
            return;
        }
        int i21 = i14 + 1;
        ux0Var.b(i21, i15);
        ux0Var.o++;
        jn1Var2.a(ul1Var);
        dn1Var2.a(s03.a(f, z, false));
        js1Var.invoke();
        ux0Var.o = i14;
        if (i21 == jn1Var2.b - 1 || j8.L(ux0Var.a())) {
            int i22 = ux0Var.o;
            int i23 = i22 + 1;
            jn1Var2.j(i23);
            if (i23 < 0 || i23 >= (i2 = dn1Var2.b)) {
                a.c("Index must be between 0 and size");
                return;
            }
            long[] jArr = dn1Var2.a;
            long j3 = jArr[i23];
            if (i23 != i2 - 1) {
                ni.g(jArr, jArr, i23, i22 + 2, i2);
            }
            dn1Var2.b--;
        }
    }

    public abstract void f1(ls lsVar, dw0 dw0Var);

    @Override // defpackage.t81
    public final long g(long j) {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        t81 D = yk3.D(this);
        t7 t7Var = (t7) l91.a(this.A);
        t7Var.C();
        return Z0(D, au1.f(ti1.b(j, t7Var.h0), D.T(0L)));
    }

    public final void g1(long j, float f, Function1 function1) {
        p1(function1, false);
        boolean a = s31.a(this.L, j);
        i91 i91Var = this.A;
        if (!a) {
            ((t7) l91.a(i91Var)).L(-4.0f);
            this.L = j;
            i91Var.Q.p.q0();
            qx1 qx1Var = this.U;
            if (qx1Var != null) {
                ((fw0) qx1Var).d(j);
            } else {
                ks1 ks1Var = this.C;
                if (ks1Var != null) {
                    ks1Var.X0();
                }
            }
            i91Var.O();
            qg1.C0(this);
            rx1 rx1Var = i91Var.y;
            if (rx1Var != null) {
                ((t7) rx1Var).y(i91Var);
            }
        }
        this.M = f;
        if (!this.w) {
            q0(y0());
        }
        if (this == i91Var.P.d) {
            ((t7) l91.a(i91Var)).getRectManager().g(i91Var, !i91Var.Q.p.w);
        }
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.A.J;
    }

    @Override // defpackage.t81
    public final long h(long j) {
        long T = T(j);
        t7 t7Var = (t7) l91.a(this.A);
        t7Var.C();
        return ti1.b(T, t7Var.g0);
    }

    public final void h1(sn1 sn1Var, boolean z, boolean z2) {
        qx1 qx1Var = this.U;
        if (qx1Var != null) {
            if (this.E) {
                if (z2) {
                    long P0 = P0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (P0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (P0 & 4294967295L)) / 2.0f;
                    long j = this.o;
                    sn1Var.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.o;
                    sn1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (sn1Var.b()) {
                    return;
                }
            }
            fw0 fw0Var = (fw0) qx1Var;
            float[] b = fw0Var.b();
            if (!fw0Var.E) {
                if (b == null) {
                    sn1Var.a = 0.0f;
                    sn1Var.b = 0.0f;
                    sn1Var.c = 0.0f;
                    sn1Var.d = 0.0f;
                } else {
                    ti1.c(b, sn1Var);
                }
            }
        }
        long j3 = this.L;
        float f = (int) (j3 >> 32);
        sn1Var.a += f;
        sn1Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        sn1Var.b += f2;
        sn1Var.d += f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.n12, defpackage.jj1
    public final Object i() {
        i91 i91Var = this.A;
        if (!i91Var.P.d(64)) {
            return null;
        }
        Q0();
        Object obj = null;
        for (ul1 ul1Var = i91Var.P.e; ul1Var != null; ul1Var = ul1Var.q) {
            if ((ul1Var.o & 64) != 0) {
                p90 p90Var = ul1Var;
                ?? r4 = 0;
                while (p90Var != 0) {
                    if (p90Var instanceof mz1) {
                        obj = ((mz1) p90Var).m0(obj);
                    } else if ((p90Var.o & 64) != 0 && (p90Var instanceof p90)) {
                        ul1 ul1Var2 = p90Var.B;
                        int i = 0;
                        p90Var = p90Var;
                        r4 = r4;
                        while (ul1Var2 != null) {
                            if ((ul1Var2.o & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    p90Var = ul1Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new eo1(new ul1[16]);
                                    }
                                    if (p90Var != 0) {
                                        r4.b(p90Var);
                                        p90Var = 0;
                                    }
                                    r4.b(ul1Var2);
                                }
                            }
                            ul1Var2 = ul1Var2.r;
                            p90Var = p90Var;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    p90Var = s03.c(r4);
                }
            }
        }
        return obj;
    }

    public final void i1() {
        if (this.U != null) {
            p1(null, false);
            this.A.V(false);
        }
    }

    @Override // defpackage.t81
    public final t81 j() {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        a1();
        return this.A.P.d.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [ul1] */
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
    /* JADX WARN: Type inference failed for: r9v5, types: [eo1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [eo1] */
    public final void j1(pj1 pj1Var) {
        ks1 ks1Var;
        pj1 pj1Var2 = this.J;
        if (pj1Var != pj1Var2) {
            this.J = pj1Var;
            i91 i91Var = this.A;
            int i = 0;
            if (pj1Var2 == null || pj1Var.e() != pj1Var2.e() || pj1Var.c() != pj1Var2.c()) {
                int e = pj1Var.e();
                int c = pj1Var.c();
                qx1 qx1Var = this.U;
                if (qx1Var != null) {
                    ((fw0) qx1Var).e((e << 32) | (c & 4294967295L));
                } else if (i91Var.J() && (ks1Var = this.C) != null) {
                    ks1Var.X0();
                }
                j0((c & 4294967295L) | (e << 32));
                if (this.F != null) {
                    q1(false);
                }
                boolean g = ls1.g(4);
                ul1 Q0 = Q0();
                if (g || (Q0 = Q0.q) != null) {
                    for (ul1 S0 = S0(g); S0 != null && (S0.p & 4) != 0; S0 = S0.r) {
                        if ((S0.o & 4) != 0) {
                            p90 p90Var = S0;
                            ?? r9 = 0;
                            while (p90Var != 0) {
                                if (p90Var instanceof xd0) {
                                    ((xd0) p90Var).n0();
                                } else if ((p90Var.o & 4) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var = p90Var.B;
                                    int i2 = 0;
                                    p90Var = p90Var;
                                    r9 = r9;
                                    while (ul1Var != null) {
                                        if ((ul1Var.o & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                p90Var = ul1Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r9.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r9.b(ul1Var);
                                            }
                                        }
                                        ul1Var = ul1Var.r;
                                        p90Var = p90Var;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                p90Var = s03.c(r9);
                            }
                        }
                        if (S0 == Q0) {
                            break;
                        }
                    }
                }
                rx1 rx1Var = i91Var.y;
                if (rx1Var != null) {
                    ((t7) rx1Var).y(i91Var);
                }
            }
            hn1 hn1Var = this.K;
            if ((hn1Var == null || hn1Var.e == 0) && pj1Var.a().isEmpty()) {
                return;
            }
            hn1 hn1Var2 = this.K;
            Map a = pj1Var.a();
            if (hn1Var2 != null && hn1Var2.e == a.size()) {
                Object[] objArr = hn1Var2.b;
                int[] iArr = hn1Var2.c;
                long[] jArr = hn1Var2.a;
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
                                Integer num = (Integer) a.get((xx0) obj);
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
            i91Var.Q.p.I.f();
            hn1 hn1Var3 = this.K;
            if (hn1Var3 == null) {
                hn1 hn1Var4 = nt1.a;
                hn1Var3 = new hn1();
                this.K = hn1Var3;
            }
            hn1Var3.a();
            for (Map.Entry entry : pj1Var.a().entrySet()) {
                hn1Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final long l1(long j) {
        qx1 qx1Var = this.U;
        if (qx1Var != null) {
            fw0 fw0Var = (fw0) qx1Var;
            float[] b = fw0Var.b();
            if (!fw0Var.E) {
                j = ti1.b(j, b);
            }
        }
        long j2 = this.L;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final w72 m1() {
        if (Q0().z) {
            t81 D = yk3.D(this);
            sn1 sn1Var = this.N;
            if (sn1Var == null) {
                sn1Var = new sn1();
                this.N = sn1Var;
            }
            long H0 = H0(P0());
            int i = (int) (H0 >> 32);
            sn1Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (H0 & 4294967295L);
            sn1Var.b = -Float.intBitsToFloat(i2);
            sn1Var.c = Float.intBitsToFloat(i) + e0();
            sn1Var.d = Float.intBitsToFloat(i2) + d0();
            while (this != D) {
                this.h1(sn1Var, false, true);
                if (!sn1Var.b()) {
                    this = this.C;
                    this.getClass();
                }
            }
            return new w72(sn1Var.a, sn1Var.b, sn1Var.c, sn1Var.d);
        }
        return w72.e;
    }

    public final void n1(ks1 ks1Var, float[] fArr) {
        float[] a;
        if (Intrinsics.b(ks1Var, this)) {
            return;
        }
        ks1 ks1Var2 = this.C;
        ks1Var2.getClass();
        ks1Var2.n1(ks1Var, fArr);
        if (!s31.a(this.L, 0L)) {
            float[] fArr2 = X;
            ti1.d(fArr2);
            long j = this.L;
            ti1.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ti1.e(fArr, fArr2);
        }
        qx1 qx1Var = this.U;
        if (qx1Var == null || (a = ((fw0) qx1Var).a()) == null) {
            return;
        }
        ti1.e(fArr, a);
    }

    public final void o1(ks1 ks1Var, float[] fArr) {
        while (!this.equals(ks1Var)) {
            qx1 qx1Var = this.U;
            if (qx1Var != null) {
                ti1.e(fArr, ((fw0) qx1Var).b());
            }
            if (!s31.a(this.L, 0L)) {
                float[] fArr2 = X;
                ti1.d(fArr2);
                ti1.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                ti1.e(fArr, fArr2);
            }
            this = this.C;
            this.getClass();
        }
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.A.I.p();
    }

    public final void p1(Function1 function1, boolean z) {
        rx1 rx1Var;
        eo1 eo1Var;
        Reference poll;
        n8 n8Var;
        eo1 eo1Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        i91 i91Var = this.A;
        boolean z2 = (!z && this.F == function1 && Intrinsics.b(this.G, i91Var.I) && this.H == i91Var.J) ? false : true;
        this.G = i91Var.I;
        this.H = i91Var.J;
        boolean I = i91Var.I();
        hs1 hs1Var = this.S;
        if (!I || function1 == null) {
            this.F = null;
            qx1 qx1Var = this.U;
            if (qx1Var != null) {
                fw0 fw0Var = (fw0) qx1Var;
                if (!ll3.M(fw0Var.b())) {
                    i91Var.O();
                }
                fw0Var.p = null;
                fw0Var.q = null;
                fw0Var.s = true;
                fw0Var.f(false);
                cw0 cw0Var = fw0Var.n;
                if (cw0Var != null) {
                    cw0Var.a(fw0Var.m);
                    t7 t7Var = fw0Var.o;
                    tt1 tt1Var = t7Var.F0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) tt1Var.o;
                        eo1Var = (eo1) tt1Var.n;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            eo1Var.k(poll);
                        }
                    } while (poll != null);
                    eo1Var.b(new WeakReference(fw0Var, (ReferenceQueue) tt1Var.o));
                    t7Var.J.remove(fw0Var);
                }
                i91Var.T = true;
                hs1Var.invoke();
                if (Q0().z && i91Var.J() && (rx1Var = i91Var.y) != null) {
                    ((t7) rx1Var).y(i91Var);
                }
            }
            this.U = null;
            this.T = false;
            return;
        }
        this.F = function1;
        if (this.U != null) {
            if (z2 && q1(true)) {
                i91Var.O();
                ((t7) l91.a(i91Var)).getRectManager().f(i91Var);
                return;
            }
            return;
        }
        rx1 a = l91.a(i91Var);
        n8 n8Var2 = this.R;
        if (n8Var2 == null) {
            n8 n8Var3 = new n8(20, this, new hs1(this, i));
            this.R = n8Var3;
            n8Var = n8Var3;
        } else {
            n8Var = n8Var2;
        }
        t7 t7Var2 = (t7) a;
        tt1 tt1Var2 = t7Var2.F0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) tt1Var2.o;
            eo1Var2 = (eo1) tt1Var2.n;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                eo1Var2.k(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = eo1Var2.o;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eo1Var2.l(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        qx1 qx1Var2 = (qx1) obj;
        if (qx1Var2 != null) {
            fw0 fw0Var2 = (fw0) qx1Var2;
            cw0 cw0Var2 = fw0Var2.n;
            if (cw0Var2 == null) {
                throw q40.f("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!fw0Var2.m.s) {
                h21.a("layer should have been released before reuse");
            }
            fw0Var2.m = cw0Var2.b();
            fw0Var2.s = false;
            fw0Var2.p = n8Var;
            fw0Var2.q = hs1Var;
            fw0Var2.C = false;
            fw0Var2.D = false;
            fw0Var2.E = true;
            ti1.d(fw0Var2.t);
            float[] fArr = fw0Var2.u;
            if (fArr != null) {
                ti1.d(fArr);
            }
            fw0Var2.A = wy2.b;
            fw0Var2.F = false;
            fw0Var2.r = 9223372034707292159L;
            fw0Var2.B = null;
            fw0Var2.z = 0;
        } else {
            qx1Var2 = new fw0(t7Var2.getGraphicsContext().b(), t7Var2.getGraphicsContext(), t7Var2, n8Var, hs1Var);
        }
        fw0 fw0Var3 = (fw0) qx1Var2;
        fw0Var3.e(this.o);
        fw0Var3.d(this.L);
        this.U = qx1Var2;
        q1(true);
        i91Var.T = true;
        hs1Var.invoke();
    }

    public final boolean q1(boolean z) {
        i91 i91Var;
        long j;
        boolean z2;
        rx1 rx1Var;
        Function0 function0;
        Function0 function02;
        qx1 qx1Var = this.U;
        Function1 function1 = this.F;
        if (qx1Var == null) {
            if (function1 == null) {
                return false;
            }
            h21.b("null layer with a non-null layerBlock");
            return false;
        }
        if (function1 == null) {
            throw q40.f("updateLayerParameters requires a non-null layerBlock");
        }
        ia2 ia2Var = V;
        ia2Var.e(1.0f);
        ia2Var.g(1.0f);
        ia2Var.a(1.0f);
        ia2Var.h(0.0f);
        long j2 = gw0.a;
        ia2Var.b(j2);
        ia2Var.j(j2);
        if (ia2Var.t != 8.0f) {
            ia2Var.m |= 2048;
            ia2Var.t = 8.0f;
        }
        long j3 = wy2.b;
        ia2Var.l(j3);
        ia2Var.i(ap.e);
        ia2Var.c(false);
        if (ia2Var.A != 3) {
            ia2Var.m |= 524288;
            ia2Var.A = 3;
        }
        ia2Var.x = 9205357640488583168L;
        ia2Var.B = null;
        ia2Var.m = 0;
        i91 i91Var2 = this.A;
        ia2Var.y = i91Var2.I;
        ia2Var.z = i91Var2.J;
        ia2Var.x = zm3.Q(this.o);
        ((t7) l91.a(i91Var2)).getSnapshotObserver().a(this, gs1.n, new u(24, function1));
        q81 q81Var = this.O;
        if (q81Var == null) {
            q81Var = new q81();
            this.O = q81Var;
        }
        q81 q81Var2 = W;
        q81Var2.getClass();
        q81Var2.a = q81Var.a;
        q81Var2.b = q81Var.b;
        q81Var2.c = q81Var.c;
        q81Var2.d = q81Var.d;
        float f = ia2Var.n;
        q81Var.a = f;
        q81Var.b = ia2Var.o;
        q81Var.c = ia2Var.t;
        long j4 = ia2Var.u;
        q81Var.d = j4;
        fw0 fw0Var = (fw0) qx1Var;
        t7 t7Var = fw0Var.o;
        int i = ia2Var.m | fw0Var.z;
        fw0Var.x = ia2Var.z;
        fw0Var.w = ia2Var.y;
        int i2 = i & 4096;
        if (i2 != 0) {
            fw0Var.A = j4;
        }
        if ((i & 1) != 0) {
            ew0 ew0Var = fw0Var.m.a;
            if (ew0Var.d() != f) {
                ew0Var.m(f);
            }
        }
        if ((i & 2) != 0) {
            dw0 dw0Var = fw0Var.m;
            float f2 = ia2Var.o;
            ew0 ew0Var2 = dw0Var.a;
            if (ew0Var2.I() != f2) {
                ew0Var2.B(f2);
            }
        }
        if ((i & 4) != 0) {
            dw0 dw0Var2 = fw0Var.m;
            float f3 = ia2Var.p;
            ew0 ew0Var3 = dw0Var2.a;
            if (ew0Var3.a() != f3) {
                ew0Var3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            ew0 ew0Var4 = fw0Var.m.a;
            if (ew0Var4.q() != 0.0f) {
                ew0Var4.r();
            }
        }
        if ((i & 16) != 0) {
            ew0 ew0Var5 = fw0Var.m.a;
            if (ew0Var5.f() != 0.0f) {
                ew0Var5.g();
            }
        }
        if ((i & 32) != 0) {
            dw0 dw0Var3 = fw0Var.m;
            float f4 = ia2Var.q;
            ew0 ew0Var6 = dw0Var3.a;
            if (ew0Var6.G() != f4) {
                ew0Var6.e(f4);
                dw0Var3.g = true;
                dw0Var3.a();
            }
            if (ia2Var.q > 0.0f && !fw0Var.F && (function02 = fw0Var.q) != null) {
                function02.invoke();
            }
        }
        if ((i & 64) != 0) {
            dw0 dw0Var4 = fw0Var.m;
            long j5 = ia2Var.r;
            ew0 ew0Var7 = dw0Var4.a;
            i91Var = i91Var2;
            if (!aw.c(j5, ew0Var7.M())) {
                ew0Var7.j(j5);
            }
        } else {
            i91Var = i91Var2;
        }
        if ((i & 128) != 0) {
            dw0 dw0Var5 = fw0Var.m;
            long j6 = ia2Var.s;
            ew0 ew0Var8 = dw0Var5.a;
            if (!aw.c(j6, ew0Var8.i())) {
                ew0Var8.A(j6);
            }
        }
        if ((i & 1024) != 0) {
            ew0 ew0Var9 = fw0Var.m.a;
            if (ew0Var9.J() != 0.0f) {
                ew0Var9.z();
            }
        }
        if ((i & 256) != 0) {
            ew0 ew0Var10 = fw0Var.m.a;
            if (ew0Var10.v() != 0.0f) {
                ew0Var10.b();
            }
        }
        if ((i & 512) != 0) {
            ew0 ew0Var11 = fw0Var.m.a;
            if (ew0Var11.E() != 0.0f) {
                ew0Var11.h();
            }
        }
        if ((i & 2048) != 0) {
            dw0 dw0Var6 = fw0Var.m;
            float f5 = ia2Var.t;
            ew0 ew0Var12 = dw0Var6.a;
            if (ew0Var12.o() != f5) {
                ew0Var12.F(f5);
            }
        }
        if (i2 != 0) {
            boolean a = wy2.a(fw0Var.A, j3);
            dw0 dw0Var7 = fw0Var.m;
            if (a) {
                j = 4294967295L;
                if (!au1.b(dw0Var7.v, 9205357640488583168L)) {
                    dw0Var7.v = 9205357640488583168L;
                    dw0Var7.a.L(9205357640488583168L);
                }
            } else {
                j = 4294967295L;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (fw0Var.A >> 32)) * ((int) (fw0Var.r >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (fw0Var.A & 4294967295L)) * ((int) (fw0Var.r & 4294967295L))) & 4294967295L);
                if (!au1.b(dw0Var7.v, floatToRawIntBits)) {
                    dw0Var7.v = floatToRawIntBits;
                    dw0Var7.a.L(floatToRawIntBits);
                }
            }
        } else {
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            dw0 dw0Var8 = fw0Var.m;
            boolean z3 = ia2Var.w;
            if (dw0Var8.w != z3) {
                dw0Var8.w = z3;
                dw0Var8.g = true;
                dw0Var8.a();
            }
        }
        if ((131072 & i) != 0) {
            ew0 ew0Var13 = fw0Var.m.a;
        }
        if ((262144 & i) != 0) {
            ew0 ew0Var14 = fw0Var.m.a;
            if (!Intrinsics.b(ew0Var14.x(), null)) {
                ew0Var14.l();
            }
        }
        if ((i & 524288) != 0) {
            dw0 dw0Var9 = fw0Var.m;
            int i3 = ia2Var.A;
            ew0 ew0Var15 = dw0Var9.a;
            if (ew0Var15.K() != i3) {
                ew0Var15.n(i3);
            }
        }
        if ((32768 & i) != 0) {
            ew0 ew0Var16 = fw0Var.m.a;
            if (ew0Var16.u() != 0) {
                ew0Var16.y(0);
            }
        }
        if ((i & 7963) != 0) {
            fw0Var.C = true;
            fw0Var.D = true;
        }
        if (Intrinsics.b(fw0Var.B, ia2Var.B)) {
            z2 = false;
        } else {
            bx1 bx1Var = ia2Var.B;
            fw0Var.B = bx1Var;
            if (bx1Var != null) {
                dw0 dw0Var10 = fw0Var.m;
                if (bx1Var instanceof zw1) {
                    w72 w72Var = ((zw1) bx1Var).a;
                    float f6 = w72Var.a;
                    float f7 = w72Var.b;
                    dw0Var10.f(0.0f, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & j), (Float.floatToRawIntBits(w72Var.c - f6) << 32) | (Float.floatToRawIntBits(w72Var.d - f7) & j));
                } else if (bx1Var instanceof yw1) {
                    oa oaVar = ((yw1) bx1Var).a;
                    dw0Var10.k = null;
                    dw0Var10.i = 9205357640488583168L;
                    dw0Var10.h = 0L;
                    dw0Var10.j = 0.0f;
                    dw0Var10.g = true;
                    dw0Var10.n = false;
                    dw0Var10.l = oaVar;
                    dw0Var10.a();
                } else {
                    if (!(bx1Var instanceof ax1)) {
                        a.b();
                        return false;
                    }
                    ax1 ax1Var = (ax1) bx1Var;
                    oa oaVar2 = ax1Var.b;
                    if (oaVar2 != null) {
                        dw0Var10.k = null;
                        dw0Var10.i = 9205357640488583168L;
                        dw0Var10.h = 0L;
                        dw0Var10.j = 0.0f;
                        dw0Var10.g = true;
                        dw0Var10.n = false;
                        dw0Var10.l = oaVar2;
                        dw0Var10.a();
                    } else {
                        ub2 ub2Var = ax1Var.a;
                        float f8 = ub2Var.b;
                        float f9 = ub2Var.a;
                        dw0Var10.f(Float.intBitsToFloat((int) (ub2Var.h >> 32)), (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & j), (Float.floatToRawIntBits(ub2Var.c - f9) << 32) | (Float.floatToRawIntBits(ub2Var.d - f8) & j));
                    }
                }
                if ((bx1Var instanceof yw1) && Build.VERSION.SDK_INT < 33 && (function0 = fw0Var.q) != null) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        fw0Var.z = ia2Var.m;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                k31.r(t7Var);
            } else {
                t7Var.invalidate();
            }
            if (t7Var.r) {
                t7Var.L(0.0f);
            }
        }
        boolean z4 = this.E;
        this.E = ia2Var.w;
        this.I = ia2Var.p;
        boolean z5 = q81Var2.a == q81Var.a && q81Var2.b == q81Var.b && q81Var2.c == q81Var.c && wy2.a(q81Var2.d, q81Var.d);
        boolean z6 = !z5;
        if (z && ((!z5 || z4 != this.E) && (rx1Var = i91Var.y) != null)) {
            ((t7) rx1Var).y(i91Var);
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        qx1 qx1Var = this.U;
        if (qx1Var == null || !this.E) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        dw0 dw0Var = ((fw0) qx1Var).m;
        if (dw0Var.w) {
            bx1 d = dw0Var.d();
            if (!(d instanceof zw1)) {
                if (d instanceof ax1) {
                    ub2 ub2Var = ((ax1) d).a;
                    float f = ub2Var.c;
                    float f2 = ub2Var.b;
                    float f3 = ub2Var.d;
                    float f4 = ub2Var.a;
                    long j2 = ub2Var.f;
                    long j3 = ub2Var.h;
                    z = false;
                    z2 = true;
                    long j4 = ub2Var.g;
                    long j5 = ub2Var.e;
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
                                            z3 = gk2.g(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, ub2Var.e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = gk2.g(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, ub2Var.h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = gk2.g(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, ub2Var.g);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = gk2.g(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, ub2Var.f);
                                        }
                                    }
                                }
                            }
                        }
                        oa a = qa.a();
                        oa.a(a, ub2Var);
                        z3 = gk2.f(intBitsToFloat, intBitsToFloat2, a);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(d instanceof yw1)) {
                        a.b();
                        return false;
                    }
                    z3 = gk2.f(intBitsToFloat, intBitsToFloat2, ((yw1) d).a);
                }
                return z3 ? z2 : z;
            }
            w72 w72Var = ((zw1) d).a;
            if (w72Var.a > intBitsToFloat || intBitsToFloat >= w72Var.c || w72Var.b > intBitsToFloat2 || intBitsToFloat2 >= w72Var.d) {
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

    @Override // defpackage.t81
    public final long u(t81 t81Var, long j) {
        return Z0(t81Var, j);
    }

    @Override // defpackage.qg1
    public final qg1 u0() {
        return this.B;
    }

    @Override // defpackage.t81
    public final long v(long j) {
        if (!Q0().z) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return Z0(yk3.D(this), ((t7) l91.a(this.A)).G(j));
    }

    @Override // defpackage.qg1
    public final boolean w0() {
        return this.J != null;
    }

    @Override // defpackage.qg1
    public final i91 x0() {
        return this.A;
    }

    @Override // defpackage.t81
    public final boolean y() {
        return Q0().z;
    }

    @Override // defpackage.qg1
    public final pj1 y0() {
        pj1 pj1Var = this.J;
        if (pj1Var != null) {
            return pj1Var;
        }
        lh.g("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.qg1
    public final qg1 z0() {
        return this.C;
    }

    @Override // defpackage.qg1
    public final t81 v0() {
        return this;
    }
}
