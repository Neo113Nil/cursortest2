package c2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i1 extends o0 implements a2.f0, a2.n, p1 {
    public static final k1.d0 Z = new k1.d0();

    /* renamed from: a0, reason: collision with root package name */
    public static final t f1587a0 = new t();

    /* renamed from: b0, reason: collision with root package name */
    public static final c1 f1588b0 = new c1();

    /* renamed from: c0, reason: collision with root package name */
    public static final d1 f1589c0 = new d1();
    public final g0 B;
    public i1 C;
    public i1 D;
    public boolean E;
    public boolean F;
    public Function1 G;
    public x2.c H;
    public x2.l I;
    public a2.h0 K;
    public s.c0 L;
    public float N;
    public j1.a O;
    public t P;
    public boolean R;
    public boolean S;
    public n1.b T;
    public k1.n U;
    public a2.b0 V;
    public boolean X;
    public o1 Y;
    public float J = 0.8f;
    public long M = 0;
    public k1.f0 Q = k1.v.f5351b;
    public final f1 W = new f1(this, 1);

    public i1(g0 g0Var) {
        this.B = g0Var;
        this.H = g0Var.L;
        this.I = g0Var.M;
    }

    public final long A0(long j) {
        long j3 = this.M;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j3 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        o1 o1Var = this.Y;
        if (o1Var == null) {
            return floatToRawIntBits;
        }
        d2.i1 i1Var = (d2.i1) o1Var;
        float[] a9 = i1Var.a();
        if (a9 == null) {
            return 9187343241974906880L;
        }
        return i1Var.G ? floatToRawIntBits : k1.v.m(a9, floatToRawIntBits);
    }

    public abstract p0 B0();

    public final long C0() {
        return this.H.H(this.B.N.b());
    }

    public abstract d1.k D0();

    public final d1.k E0(int i3) {
        boolean g = j1.g(i3);
        d1.k D0 = D0();
        if (!g && (D0 = D0.f3309s) == null) {
            return null;
        }
        for (d1.k F0 = F0(g); F0 != null && (F0.f3308r & i3) != 0; F0 = F0.f3310t) {
            if ((F0.f3307i & i3) != 0) {
                return F0;
            }
            if (F0 == D0) {
                return null;
            }
        }
        return null;
    }

    @Override // a2.n
    public final long F(a2.n nVar, long j) {
        i1 i1Var;
        boolean z10 = nVar instanceof a2.e0;
        if (z10) {
            a2.e0 e0Var = (a2.e0) nVar;
            e0Var.f80d.B.M0();
            return e0Var.F(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        a2.e0 e0Var2 = z10 ? (a2.e0) nVar : null;
        if (e0Var2 == null || (i1Var = e0Var2.f80d.B) == null) {
            nVar.getClass();
            i1Var = (i1) nVar;
        }
        i1Var.M0();
        i1 z02 = z0(i1Var);
        while (i1Var != z02) {
            o1 o1Var = i1Var.Y;
            if (o1Var != null) {
                d2.i1 i1Var2 = (d2.i1) o1Var;
                float[] b10 = i1Var2.b();
                if (!i1Var2.G) {
                    j = k1.v.m(b10, j);
                }
            }
            j = x3.j0.b(j, i1Var.M);
            i1Var = i1Var.D;
            i1Var.getClass();
        }
        return t0(z02, j);
    }

    public final d1.k F0(boolean z10) {
        d1.k D0;
        b1 b1Var = this.B.S;
        if (((i1) b1Var.f1494e) == this) {
            return (d1.k) b1Var.g;
        }
        i1 i1Var = this.D;
        if (!z10) {
            if (i1Var != null) {
                return i1Var.D0();
            }
            return null;
        }
        if (i1Var == null || (D0 = i1Var.D0()) == null) {
            return null;
        }
        return D0.f3310t;
    }

    @Override // a2.n
    public final boolean G() {
        return D0().B;
    }

    public final void G0(d1.k kVar, e1 e1Var, long j, o oVar, int i3, boolean z10) {
        if (kVar == null) {
            J0(e1Var, j, oVar, i3, z10);
            return;
        }
        if (!e1Var.f(kVar)) {
            G0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10);
            return;
        }
        int i10 = oVar.f1630i;
        s.d0 d0Var = oVar.f1628d;
        oVar.c(i10 + 1, d0Var.f8285b);
        oVar.f1630i++;
        d0Var.a(kVar);
        oVar.f1629e.a(k.a(-1.0f, z10, false));
        G0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10);
        oVar.f1630i = i10;
    }

    public final void H0(d1.k kVar, e1 e1Var, long j, o oVar, int i3, boolean z10, float f3) {
        if (kVar == null) {
            J0(e1Var, j, oVar, i3, z10);
            return;
        }
        if (!e1Var.f(kVar)) {
            H0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10, f3);
            return;
        }
        int i10 = oVar.f1630i;
        s.d0 d0Var = oVar.f1628d;
        oVar.c(i10 + 1, d0Var.f8285b);
        oVar.f1630i++;
        d0Var.a(kVar);
        oVar.f1629e.a(k.a(f3, z10, false));
        R0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10, f3, true);
        oVar.f1630i = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (c2.k.g(r18.b(), c2.k.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(e1 e1Var, long j, o oVar, int i3, boolean z10) {
        boolean z11;
        boolean z12;
        d1.k E0 = E0(e1Var.d());
        if (!b1(j)) {
            if (i3 == 1) {
                float v02 = v0(j, C0());
                if ((Float.floatToRawIntBits(v02) & Integer.MAX_VALUE) < 2139095040) {
                    if (oVar.f1630i != oVar.f1628d.f8285b - 1) {
                        if (k.g(oVar.b(), k.a(v02, false, false)) <= 0) {
                            return;
                        }
                    }
                    H0(E0, e1Var, j, oVar, i3, false, v02);
                    return;
                }
                return;
            }
            return;
        }
        if (E0 == null) {
            J0(e1Var, j, oVar, i3, z10);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < X() && intBitsToFloat2 < W()) {
            G0(E0, e1Var, j, oVar, i3, z10);
            return;
        }
        float v03 = i3 == 1 ? v0(j, C0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(v03) & Integer.MAX_VALUE) < 2139095040) {
            if (oVar.f1630i == oVar.f1628d.f8285b - 1) {
                z11 = z10;
            } else {
                z11 = z10;
            }
            z12 = true;
            R0(E0, e1Var, j, oVar, i3, z11, v03, z12);
        }
        z11 = z10;
        z12 = false;
        R0(E0, e1Var, j, oVar, i3, z11, v03, z12);
    }

    @Override // a2.n
    public final long J() {
        return this.f133i;
    }

    public void J0(e1 e1Var, long j, o oVar, int i3, boolean z10) {
        i1 i1Var = this.C;
        if (i1Var != null) {
            i1Var.I0(e1Var, i1Var.A0(j), oVar, i3, z10);
        }
    }

    @Override // a2.n
    public final long K(long j) {
        if (!D0().B) {
            z1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0();
        for (i1 i1Var = this; i1Var != null; i1Var = i1Var.D) {
            g0 g0Var = i1Var.B;
            if (i1Var == ((i1) g0Var.S.f1494e) && !g0Var.f1551i) {
                long b10 = j0.a(g0Var).getRectManager().b(g0Var);
                if (!x2.i.a(b10, 9223372034707292159L)) {
                    return x3.j0.b(j, b10);
                }
            }
            o1 o1Var = i1Var.Y;
            if (o1Var != null) {
                d2.i1 i1Var2 = (d2.i1) o1Var;
                float[] b11 = i1Var2.b();
                if (!i1Var2.G) {
                    j = k1.v.m(b11, j);
                }
            }
            j = x3.j0.b(j, i1Var.M);
        }
        return j;
    }

    public final void K0() {
        o1 o1Var = this.Y;
        if (o1Var != null) {
            ((d2.i1) o1Var).c();
            return;
        }
        i1 i1Var = this.D;
        if (i1Var != null) {
            i1Var.K0();
        }
    }

    public final boolean L0() {
        if (this.Y != null && this.J <= 0.0f) {
            return true;
        }
        i1 i1Var = this.D;
        if (i1Var != null) {
            return i1Var.L0();
        }
        return false;
    }

    public final void M0() {
        this.B.T.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void N0() {
        d1.k kVar;
        boolean g = j1.g(128);
        d1.k F0 = F0(g);
        if (F0 == null || (F0.f3305d.f3308r & 128) == 0) {
            return;
        }
        b1.i e2 = b1.x.e();
        Function1 e9 = e2 != null ? e2.e() : null;
        b1.i h10 = b1.x.h(e2);
        try {
            if (g) {
                kVar = D0();
            } else {
                kVar = D0().f3309s;
                if (kVar == null) {
                }
            }
            for (d1.k F02 = F0(g); F02 != null; F02 = F02.f3310t) {
                if ((F02.f3308r & 128) == 0) {
                    break;
                }
                if ((F02.f3307i & 128) != 0) {
                    j jVar = F02;
                    ?? r82 = 0;
                    while (jVar != 0) {
                        if (jVar instanceof u) {
                            ((u) jVar).e(this.f133i);
                        } else if ((jVar.f3307i & 128) != 0 && (jVar instanceof j)) {
                            d1.k kVar2 = jVar.D;
                            int i3 = 0;
                            jVar = jVar;
                            r82 = r82;
                            while (kVar2 != null) {
                                if ((kVar2.f3307i & 128) != 0) {
                                    i3++;
                                    r82 = r82;
                                    if (i3 == 1) {
                                        jVar = kVar2;
                                    } else {
                                        if (r82 == 0) {
                                            r82 = new o0.e(new d1.k[16]);
                                        }
                                        if (jVar != 0) {
                                            r82.b(jVar);
                                            jVar = 0;
                                        }
                                        r82.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3310t;
                                jVar = jVar;
                                r82 = r82;
                            }
                            if (i3 == 1) {
                            }
                        }
                        jVar = k.e(r82);
                    }
                }
                if (F02 == kVar) {
                    break;
                }
            }
        } finally {
            b1.x.k(e2, h10, e9);
        }
    }

    @Override // a2.n
    public final long O(a2.n nVar, long j) {
        return F(nVar, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d1.k] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void O0() {
        boolean g = j1.g(4194304);
        d1.k D0 = D0();
        if (!g && (D0 = D0.f3309s) == null) {
            return;
        }
        for (d1.k F0 = F0(g); F0 != null && (F0.f3308r & 4194304) != 0; F0 = F0.f3310t) {
            if ((F0.f3307i & 4194304) != 0) {
                j jVar = F0;
                ?? r52 = 0;
                while (jVar != 0) {
                    if (jVar instanceof u) {
                        ((u) jVar).g(this);
                    } else if ((jVar.f3307i & 4194304) != 0 && (jVar instanceof j)) {
                        d1.k kVar = jVar.D;
                        int i3 = 0;
                        jVar = jVar;
                        r52 = r52;
                        while (kVar != null) {
                            if ((kVar.f3307i & 4194304) != 0) {
                                i3++;
                                r52 = r52;
                                if (i3 == 1) {
                                    jVar = kVar;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new o0.e(new d1.k[16]);
                                    }
                                    if (jVar != 0) {
                                        r52.b(jVar);
                                        jVar = 0;
                                    }
                                    r52.b(kVar);
                                }
                            }
                            kVar = kVar.f3310t;
                            jVar = jVar;
                            r52 = r52;
                        }
                        if (i3 == 1) {
                        }
                    }
                    jVar = k.e(r52);
                }
            }
            if (F0 == D0) {
                return;
            }
        }
    }

    public final void P0() {
        this.E = true;
        this.W.invoke();
        V0();
        if (x2.i.a(this.M, 0L)) {
            return;
        }
        this.B.J(this);
    }

    public final void Q0() {
        boolean g = j1.g(1048576);
        d1.k F0 = F0(g);
        if (F0 == null || (F0.f3305d.f3308r & 1048576) == 0) {
            return;
        }
        d1.k D0 = D0();
        if (!g && (D0 = D0.f3309s) == null) {
            return;
        }
        for (d1.k F02 = F0(g); F02 != null && (F02.f3308r & 1048576) != 0; F02 = F02.f3310t) {
            if ((F02.f3307i & 1048576) != 0) {
                d1.k kVar = F02;
                o0.e eVar = null;
                while (kVar != null) {
                    if ((kVar.f3307i & 1048576) != 0 && (kVar instanceof j)) {
                        int i3 = 0;
                        for (d1.k kVar2 = ((j) kVar).D; kVar2 != null; kVar2 = kVar2.f3310t) {
                            if ((kVar2.f3307i & 1048576) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    kVar = kVar2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new o0.e(new d1.k[16]);
                                    }
                                    if (kVar != null) {
                                        eVar.b(kVar);
                                        kVar = null;
                                    }
                                    eVar.b(kVar2);
                                }
                            }
                        }
                        if (i3 == 1) {
                        }
                    }
                    kVar = k.e(eVar);
                }
            }
            if (F02 == D0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d1.k] */
    public final void R0(d1.k kVar, e1 e1Var, long j, o oVar, int i3, boolean z10, float f3, boolean z11) {
        d1.k e2;
        if (kVar == null) {
            J0(e1Var, j, oVar, i3, z10);
            return;
        }
        if (!e1Var.f(kVar)) {
            R0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10, f3, z11);
            return;
        }
        int i10 = i3;
        if (i10 == 3 || i10 == 4) {
            o0.e eVar = null;
            j jVar = kVar;
            while (true) {
                if (jVar == 0) {
                    break;
                }
                int i11 = 0;
                if (jVar instanceof t1) {
                    ((t1) jVar).getClass();
                    int i12 = a2.f1489b;
                    long j3 = a2.f1488a;
                    int i13 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i13);
                    g0 g0Var = this.B;
                    x2.l lVar = g0Var.M;
                    int i14 = a2.f1489b;
                    long j10 = Long.MIN_VALUE & j3;
                    if (intBitsToFloat >= (-((j10 == 0 || lVar == x2.l.f10330d) ? d1.g(0, j3) : d1.g(2, j3)))) {
                        if (Float.intBitsToFloat(i13) < X() + ((j10 == 0 || g0Var.M == x2.l.f10330d) ? d1.g(2, j3) : d1.g(0, j3))) {
                            int i15 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i15) >= (-d1.g(1, j3))) {
                                if (Float.intBitsToFloat(i15) < d1.g(3, j3) + W()) {
                                    g1 g1Var = new g1(this, kVar, e1Var, j, oVar, i10, z10, f3, z11);
                                    s.y yVar = oVar.f1629e;
                                    s.d0 d0Var = oVar.f1628d;
                                    int i16 = oVar.f1630i;
                                    int i17 = d0Var.f8285b;
                                    if (i16 == i17 - 1) {
                                        oVar.c(i16 + 1, i17);
                                        oVar.f1630i++;
                                        d0Var.a(kVar);
                                        yVar.a(k.a(0.0f, z10, true));
                                        g1Var.invoke();
                                        oVar.f1630i = i16;
                                        return;
                                    }
                                    long b10 = oVar.b();
                                    int i18 = oVar.f1630i;
                                    if (!k.o(b10)) {
                                        if (k.k(b10) > 0.0f) {
                                            int i19 = oVar.f1630i;
                                            oVar.c(i19 + 1, d0Var.f8285b);
                                            oVar.f1630i++;
                                            d0Var.a(kVar);
                                            yVar.a(k.a(0.0f, z10, true));
                                            g1Var.invoke();
                                            oVar.f1630i = i19;
                                            return;
                                        }
                                        return;
                                    }
                                    int i20 = d0Var.f8285b;
                                    int i21 = i20 - 1;
                                    oVar.f1630i = i21;
                                    oVar.c(i20, d0Var.f8285b);
                                    oVar.f1630i++;
                                    d0Var.a(kVar);
                                    yVar.a(k.a(0.0f, z10, true));
                                    g1Var.invoke();
                                    oVar.f1630i = i21;
                                    if (k.k(oVar.b()) < 0.0f) {
                                        oVar.c(i18 + 1, oVar.f1630i + 1);
                                    }
                                    oVar.f1630i = i18;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((jVar.f3307i & 16) != 0 && (jVar instanceof j)) {
                        d1.k kVar2 = jVar.D;
                        e2 = jVar;
                        eVar = eVar;
                        while (kVar2 != null) {
                            if ((kVar2.f3307i & 16) != 0) {
                                i11++;
                                eVar = eVar;
                                if (i11 == 1) {
                                    e2 = kVar2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new o0.e(new d1.k[16]);
                                    }
                                    if (e2 != null) {
                                        eVar.b(e2);
                                        e2 = null;
                                    }
                                    eVar.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f3310t;
                            e2 = e2;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                            i10 = i3;
                            jVar = e2;
                            eVar = eVar;
                        }
                    }
                    e2 = k.e(eVar);
                    i10 = i3;
                    jVar = e2;
                    eVar = eVar;
                }
            }
        }
        if (z11) {
            H0(kVar, e1Var, j, oVar, i3, z10, f3);
        } else {
            X0(kVar, e1Var, j, oVar, i3, z10, f3);
        }
    }

    public abstract void S0(k1.n nVar, n1.b bVar);

    public final void T0(long j, float f3, Function1 function1) {
        Z0(function1, false);
        boolean a9 = x2.i.a(this.M, j);
        g0 g0Var = this.B;
        if (!a9) {
            j0.a(g0Var).M(-4.0f);
            this.M = j;
            o1 o1Var = this.Y;
            if (o1Var != null) {
                ((d2.i1) o1Var).d(j);
            } else {
                i1 i1Var = this.D;
                if (i1Var != null) {
                    i1Var.K0();
                }
            }
            g0Var.J(this);
            o0.p0(this);
            d2.v vVar = g0Var.B;
            if (vVar != null) {
                vVar.z(g0Var);
            }
        }
        this.N = f3;
        if (this == ((i1) g0Var.S.f1494e)) {
            j0.a(g0Var).getRectManager().f(g0Var);
        }
        if (this.f1635x) {
            return;
        }
        f0(l0());
    }

    public final void U0(j1.a aVar, boolean z10, boolean z11) {
        long j;
        o1 o1Var = this.Y;
        if (o1Var != null) {
            if (this.F) {
                if (z11) {
                    long C0 = C0();
                    float f3 = aVar.f4910a;
                    float f10 = aVar.f4911b;
                    if (aVar.f4912c >= 0.0f) {
                        long j3 = this.f133i;
                        if (f3 <= ((int) (j3 >> 32)) && aVar.f4913d >= 0.0f && f10 <= ((int) (j3 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (C0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (C0 & 4294967295L));
                            float f11 = (intBitsToFloat - (aVar.f4912c - aVar.f4910a)) / 2.0f;
                            if (f11 > 0.0f) {
                                f3 -= f11;
                            } else {
                                float f12 = (-intBitsToFloat) / 2.0f;
                                if (f3 < f12) {
                                    f3 = f12;
                                }
                            }
                            float f13 = (intBitsToFloat2 - (aVar.f4913d - aVar.f4911b)) / 2.0f;
                            if (f13 > 0.0f) {
                                f10 -= f13;
                            } else {
                                float f14 = (-intBitsToFloat2) / 2.0f;
                                if (f10 < f14) {
                                    f10 = f14;
                                }
                            }
                            j = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j10 = this.f133i;
                            float f15 = (int) (j10 >> 32);
                            int i3 = (int) (C0 >> 32);
                            float f16 = (int) (j10 & 4294967295L);
                            int i10 = (int) (C0 & 4294967295L);
                            aVar.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i3) + f15, Math.max(f15, Float.intBitsToFloat(i3) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i10) + f16, Math.max(f16, Float.intBitsToFloat(i10) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j102 = this.f133i;
                    float f152 = (int) (j102 >> 32);
                    int i32 = (int) (C0 >> 32);
                    float f162 = (int) (j102 & 4294967295L);
                    int i102 = (int) (C0 & 4294967295L);
                    aVar.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i32) + f152, Math.max(f152, Float.intBitsToFloat(i32) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i102) + f162, Math.max(f162, Float.intBitsToFloat(i102) + intBitsToFloat42)));
                } else if (z10) {
                    long j11 = this.f133i;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            d2.i1 i1Var = (d2.i1) o1Var;
            float[] b10 = i1Var.b();
            if (!i1Var.G) {
                if (b10 == null) {
                    aVar.f4910a = 0.0f;
                    aVar.f4911b = 0.0f;
                    aVar.f4912c = 0.0f;
                    aVar.f4913d = 0.0f;
                } else {
                    k1.v.n(b10, aVar);
                }
            }
        }
        long j12 = this.M;
        float f17 = (int) (j12 >> 32);
        aVar.f4910a += f17;
        aVar.f4912c += f17;
        float f18 = (int) (j12 & 4294967295L);
        aVar.f4911b += f18;
        aVar.f4913d += f18;
    }

    public final void V0() {
        if (this.Y != null) {
            Z0(null, false);
            this.B.Q(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o0.e] */
    public final void W0(a2.h0 h0Var) {
        i1 i1Var;
        long j;
        int i3;
        a2.h0 h0Var2 = this.K;
        if (h0Var != h0Var2) {
            this.K = h0Var;
            g0 g0Var = this.B;
            if (h0Var2 == null || h0Var.e() != h0Var2.e() || h0Var.c() != h0Var2.c()) {
                int e2 = h0Var.e();
                int c10 = h0Var.c();
                o1 o1Var = this.Y;
                if (o1Var != null) {
                    ((d2.i1) o1Var).e((e2 << 32) | (c10 & 4294967295L));
                } else if (g0Var.F() && (i1Var = this.D) != null) {
                    i1Var.K0();
                }
                a0((c10 & 4294967295L) | (e2 << 32));
                if (this.G != null) {
                    a1(false);
                }
                boolean g = j1.g(4);
                d1.k D0 = D0();
                if (g || (D0 = D0.f3309s) != null) {
                    for (d1.k F0 = F0(g); F0 != null && (F0.f3308r & 4) != 0; F0 = F0.f3310t) {
                        if ((F0.f3307i & 4) != 0) {
                            j jVar = F0;
                            ?? r9 = 0;
                            while (jVar != 0) {
                                if (jVar instanceof l) {
                                    ((l) jVar).r();
                                } else if ((jVar.f3307i & 4) != 0 && (jVar instanceof j)) {
                                    d1.k kVar = jVar.D;
                                    int i10 = 0;
                                    jVar = jVar;
                                    r9 = r9;
                                    while (kVar != null) {
                                        if ((kVar.f3307i & 4) != 0) {
                                            i10++;
                                            r9 = r9;
                                            if (i10 == 1) {
                                                jVar = kVar;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new o0.e(new d1.k[16]);
                                                }
                                                if (jVar != 0) {
                                                    r9.b(jVar);
                                                    jVar = 0;
                                                }
                                                r9.b(kVar);
                                            }
                                        }
                                        kVar = kVar.f3310t;
                                        jVar = jVar;
                                        r9 = r9;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                jVar = k.e(r9);
                            }
                        }
                        if (F0 == D0) {
                            break;
                        }
                    }
                }
                d2.v vVar = g0Var.B;
                if (vVar != null) {
                    vVar.z(g0Var);
                }
                g0Var.J(this);
            }
            s.c0 c0Var = this.L;
            if ((c0Var == null || c0Var.f8281e == 0) && h0Var.a().isEmpty()) {
                return;
            }
            s.c0 c0Var2 = this.L;
            Map a9 = h0Var.a();
            long j3 = -9187201950435737472L;
            if (c0Var2 != null && c0Var2.f8281e == a9.size()) {
                Object[] objArr = c0Var2.f8278b;
                int[] iArr = c0Var2.f8279c;
                long[] jArr = c0Var2.f8277a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i11 = 0;
                long j10 = 255;
                loop1: while (true) {
                    long j11 = jArr[i11];
                    Object[] objArr2 = objArr;
                    if ((((~j11) << 7) & j11 & j3) != j3) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        j = j10;
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & j) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr2[i15];
                                i3 = i12;
                                int i16 = iArr[i15];
                                Integer num = (Integer) a9.get((a2.a) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop1;
                                } else {
                                    j3 = -9187201950435737472L;
                                }
                            } else {
                                i3 = i12;
                            }
                            j11 >>= i3;
                            i14++;
                            i12 = i3;
                        }
                        if (i13 != i12) {
                            return;
                        }
                    } else {
                        j = j10;
                    }
                    if (i11 == length) {
                        return;
                    }
                    i11++;
                    objArr = objArr2;
                    j10 = j;
                }
            } else {
                j = 255;
            }
            g0Var.T.f1606p.K.f();
            s.c0 c0Var3 = this.L;
            if (c0Var3 == null) {
                s.c0 c0Var4 = s.m0.f8346a;
                c0Var3 = new s.c0();
                this.L = c0Var3;
            }
            c0Var3.f8281e = 0;
            long[] jArr2 = c0Var3.f8277a;
            if (jArr2 != s.p0.f8356a) {
                kotlin.collections.v.j(jArr2, -9187201950435737472L);
                long[] jArr3 = c0Var3.f8277a;
                int i17 = c0Var3.f8280d;
                int i18 = i17 >> 3;
                long j12 = j << ((i17 & 7) << 3);
                jArr3[i18] = (jArr3[i18] & (~j12)) | j12;
            }
            kotlin.collections.v.i(c0Var3.f8278b, 0, c0Var3.f8280d);
            c0Var3.f8282f = s.p0.a(c0Var3.f8280d) - c0Var3.f8281e;
            for (Map.Entry entry : h0Var.a().entrySet()) {
                c0Var3.f(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void X0(d1.k kVar, e1 e1Var, long j, o oVar, int i3, boolean z10, float f3) {
        int i10;
        if (kVar == null) {
            J0(e1Var, j, oVar, i3, z10);
            return;
        }
        if (!e1Var.f(kVar)) {
            X0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10, f3);
            return;
        }
        if (!e1Var.b(kVar)) {
            R0(k.d(kVar, e1Var.d()), e1Var, j, oVar, i3, z10, f3, false);
            return;
        }
        h1 h1Var = new h1(this, kVar, e1Var, j, oVar, i3, z10, f3);
        s.y yVar = oVar.f1629e;
        s.d0 d0Var = oVar.f1628d;
        int i11 = oVar.f1630i;
        int i12 = d0Var.f8285b;
        if (i11 != i12 - 1) {
            long b10 = oVar.b();
            int i13 = oVar.f1630i;
            int i14 = d0Var.f8285b;
            int i15 = i14 - 1;
            oVar.f1630i = i15;
            oVar.c(i14, d0Var.f8285b);
            oVar.f1630i++;
            d0Var.a(kVar);
            yVar.a(k.a(f3, z10, false));
            h1Var.invoke();
            oVar.f1630i = i15;
            long b11 = oVar.b();
            if (oVar.f1630i + 1 >= d0Var.f8285b - 1 || k.g(b10, b11) <= 0) {
                oVar.c(oVar.f1630i + 1, d0Var.f8285b);
            } else {
                int i16 = i13 + 1;
                boolean o6 = k.o(b11);
                int i17 = oVar.f1630i;
                oVar.c(i16, o6 ? i17 + 2 : i17 + 1);
            }
            oVar.f1630i = i13;
            return;
        }
        int i18 = i11 + 1;
        oVar.c(i18, i12);
        oVar.f1630i++;
        d0Var.a(kVar);
        yVar.a(k.a(f3, z10, false));
        h1Var.invoke();
        oVar.f1630i = i11;
        if (i18 == d0Var.f8285b - 1 || k.o(oVar.b())) {
            int i19 = oVar.f1630i;
            int i20 = i19 + 1;
            d0Var.k(i20);
            if (i20 < 0 || i20 >= (i10 = yVar.f8398b)) {
                kotlin.collections.i0.g("Index must be between 0 and size");
                return;
            }
            long[] jArr = yVar.f8397a;
            long j3 = jArr[i20];
            if (i20 != i10 - 1) {
                kotlin.collections.v.e(jArr, jArr, i20, i19 + 2, i10);
            }
            yVar.f8398b--;
        }
    }

    public final j1.c Y0() {
        if (D0().B) {
            a2.n h10 = a2.q.h(this);
            j1.a aVar = this.O;
            if (aVar == null) {
                aVar = new j1.a();
                this.O = aVar;
            }
            long u02 = u0(C0());
            int i3 = (int) (u02 >> 32);
            aVar.f4910a = -Float.intBitsToFloat(i3);
            int i10 = (int) (u02 & 4294967295L);
            aVar.f4911b = -Float.intBitsToFloat(i10);
            aVar.f4912c = Float.intBitsToFloat(i3) + X();
            aVar.f4913d = Float.intBitsToFloat(i10) + W();
            i1 i1Var = this;
            while (i1Var != h10) {
                i1Var.U0(aVar, false, true);
                if (!aVar.b()) {
                    i1Var = i1Var.D;
                    i1Var.getClass();
                }
            }
            return new j1.c(aVar.f4910a, aVar.f4911b, aVar.f4912c, aVar.f4913d);
        }
        return j1.c.f4915e;
    }

    public final void Z0(Function1 function1, boolean z10) {
        d2.v vVar;
        Reference poll;
        a2.b0 b0Var;
        o0.e eVar;
        Reference poll2;
        Object obj;
        g0 g0Var = this.B;
        boolean z11 = (!z10 && this.G == function1 && Intrinsics.a(this.H, g0Var.L) && this.I == g0Var.M) ? false : true;
        this.H = g0Var.L;
        this.I = g0Var.M;
        if (!g0Var.E() || function1 == null) {
            this.G = null;
            o1 o1Var = this.Y;
            if (o1Var != null) {
                d2.i1 i1Var = (d2.i1) o1Var;
                if (!k1.v.l(i1Var.b())) {
                    g0Var.J(this);
                }
                i1Var.f3434r = null;
                i1Var.f3435s = null;
                i1Var.f3437u = true;
                i1Var.f(false);
                k1.t tVar = i1Var.f3432e;
                if (tVar != null) {
                    n1.b bVar = i1Var.f3431d;
                    synchronized (((b7.h) tVar).f1294c) {
                        if (!bVar.f6916s) {
                            bVar.f6916s = true;
                            bVar.b();
                        }
                    }
                    d2.v vVar2 = i1Var.f3433i;
                    c6.e eVar2 = vVar2.K0;
                    do {
                        poll = ((ReferenceQueue) eVar2.f1815i).poll();
                        if (poll != null) {
                            ((o0.e) eVar2.f1814e).k(poll);
                        }
                    } while (poll != null);
                    ((o0.e) eVar2.f1814e).b(new WeakReference(i1Var, (ReferenceQueue) eVar2.f1815i));
                    vVar2.R.j(i1Var);
                }
                this.Y = null;
                g0Var.W = true;
                this.W.invoke();
                if (D0().B && g0Var.F() && (vVar = g0Var.B) != null) {
                    vVar.z(g0Var);
                }
            }
            this.X = false;
            return;
        }
        this.G = function1;
        if (this.Y != null) {
            if (z11) {
                a1(true);
                return;
            }
            return;
        }
        d2.v a9 = j0.a(g0Var);
        a2.b0 b0Var2 = this.V;
        if (b0Var2 == null) {
            a2.b0 b0Var3 = new a2.b0(1, this, new f1(this, 0));
            this.V = b0Var3;
            b0Var = b0Var3;
        } else {
            b0Var = b0Var2;
        }
        f1 f1Var = this.W;
        c6.e eVar3 = a9.K0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) eVar3.f1815i;
            eVar = (o0.e) eVar3.f1814e;
            poll2 = referenceQueue.poll();
            if (poll2 != null) {
                eVar.k(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i3 = eVar.f7319i;
            if (i3 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar.l(i3 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        o1 o1Var2 = (o1) obj;
        if (o1Var2 != null) {
            d2.i1 i1Var2 = (d2.i1) o1Var2;
            k1.t tVar2 = i1Var2.f3432e;
            if (tVar2 == null) {
                throw v4.a.h("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!i1Var2.f3431d.f6916s) {
                z1.a.a("layer should have been released before reuse");
            }
            i1Var2.f3431d = ((b7.h) tVar2).a();
            i1Var2.f3437u = false;
            i1Var2.f3434r = b0Var;
            i1Var2.f3435s = f1Var;
            i1Var2.E = false;
            i1Var2.F = false;
            i1Var2.G = true;
            k1.v.o(i1Var2.f3438v);
            float[] fArr = i1Var2.f3439w;
            if (fArr != null) {
                k1.v.o(fArr);
            }
            i1Var2.C = k1.i0.f5326b;
            long j = Integer.MAX_VALUE;
            i1Var2.f3436t = (j & 4294967295L) | (j << 32);
            i1Var2.D = null;
            i1Var2.B = 0;
        } else {
            o1Var2 = new d2.i1(((b7.h) a9.getGraphicsContext()).a(), a9.getGraphicsContext(), a9, b0Var, f1Var);
        }
        d2.i1 i1Var3 = (d2.i1) o1Var2;
        i1Var3.e(this.f133i);
        i1Var3.d(this.M);
        this.Y = o1Var2;
        a1(true);
        g0Var.W = true;
        this.W.invoke();
    }

    public final void a1(boolean z10) {
        char c10;
        d2.v vVar;
        boolean z11;
        d2.v vVar2;
        d2.v vVar3;
        Function0 function0;
        o1 o1Var = this.Y;
        Function1 function1 = this.G;
        if (o1Var == null) {
            if (function1 == null) {
                return;
            }
            z1.a.b("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw v4.a.h("updateLayerParameters requires a non-null layerBlock");
        }
        k1.d0 d0Var = Z;
        d0Var.a();
        g0 g0Var = this.B;
        d0Var.f5313z = g0Var.L;
        d0Var.A = g0Var.M;
        d0Var.f5312y = z4.m.b(this.f133i);
        j0.a(g0Var).getSnapshotObserver().f1645a.c(this, d.f1514s, new a3.a0(2, function1, this));
        t tVar = this.P;
        if (tVar == null) {
            tVar = new t();
            this.P = tVar;
        }
        t tVar2 = f1587a0;
        tVar2.getClass();
        tVar2.f1670a = tVar.f1670a;
        tVar2.f1671b = tVar.f1671b;
        tVar2.f1672c = tVar.f1672c;
        tVar2.f1673d = tVar.f1673d;
        float f3 = d0Var.f5303e;
        tVar.f1670a = f3;
        tVar.f1671b = d0Var.f5304i;
        tVar.f1672c = d0Var.f5308u;
        long j = d0Var.f5309v;
        tVar.f1673d = j;
        d2.i1 i1Var = (d2.i1) o1Var;
        d2.v vVar4 = i1Var.f3433i;
        int i3 = d0Var.f5302d | i1Var.B;
        i1Var.f3442z = d0Var.A;
        i1Var.f3441y = d0Var.f5313z;
        int i10 = i3 & 4096;
        if (i10 != 0) {
            i1Var.C = j;
        }
        if ((i3 & 1) != 0) {
            n1.d dVar = i1Var.f3431d.f6900a;
            if (dVar.d() != f3) {
                dVar.m(f3);
            }
        }
        if ((i3 & 2) != 0) {
            n1.b bVar = i1Var.f3431d;
            float f10 = d0Var.f5304i;
            n1.d dVar2 = bVar.f6900a;
            if (dVar2.I() != f10) {
                dVar2.B(f10);
            }
        }
        if ((i3 & 4) != 0) {
            n1.b bVar2 = i1Var.f3431d;
            float f11 = d0Var.f5305r;
            n1.d dVar3 = bVar2.f6900a;
            if (dVar3.a() != f11) {
                dVar3.c(f11);
            }
        }
        if ((i3 & 8) != 0) {
            n1.d dVar4 = i1Var.f3431d.f6900a;
            if (dVar4.r() != 0.0f) {
                dVar4.t();
            }
        }
        if ((i3 & 16) != 0) {
            n1.d dVar5 = i1Var.f3431d.f6900a;
            if (dVar5.f() != 0.0f) {
                dVar5.g();
            }
        }
        if ((i3 & 32) != 0) {
            n1.b bVar3 = i1Var.f3431d;
            n1.d dVar6 = bVar3.f6900a;
            if (dVar6.G() != 0.0f) {
                dVar6.q();
                bVar3.g = true;
                bVar3.a();
            }
        }
        if ((i3 & 64) != 0) {
            n1.b bVar4 = i1Var.f3431d;
            long j3 = d0Var.f5306s;
            n1.d dVar7 = bVar4.f6900a;
            if (!k1.p.c(j3, dVar7.M())) {
                dVar7.j(j3);
            }
        }
        if ((i3 & 128) != 0) {
            n1.b bVar5 = i1Var.f3431d;
            long j10 = d0Var.f5307t;
            n1.d dVar8 = bVar5.f6900a;
            if (!k1.p.c(j10, dVar8.i())) {
                dVar8.A(j10);
            }
        }
        if ((i3 & 1024) != 0) {
            n1.d dVar9 = i1Var.f3431d.f6900a;
            if (dVar9.J() != 0.0f) {
                dVar9.z();
            }
        }
        if ((i3 & 256) != 0) {
            n1.d dVar10 = i1Var.f3431d.f6900a;
            if (dVar10.w() != 0.0f) {
                dVar10.b();
            }
        }
        if ((i3 & 512) != 0) {
            n1.d dVar11 = i1Var.f3431d.f6900a;
            if (dVar11.E() != 0.0f) {
                dVar11.h();
            }
        }
        if ((i3 & 2048) != 0) {
            n1.b bVar6 = i1Var.f3431d;
            float f12 = d0Var.f5308u;
            n1.d dVar12 = bVar6.f6900a;
            if (dVar12.o() != f12) {
                dVar12.F(f12);
            }
        }
        if (i10 != 0) {
            c10 = ' ';
            boolean a9 = k1.i0.a(i1Var.C, k1.i0.f5326b);
            n1.b bVar7 = i1Var.f3431d;
            if (!a9) {
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (i1Var.C & 4294967295L)) * ((int) (i1Var.f3436t & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (i1Var.C >> 32)) * ((int) (i1Var.f3436t >> 32))) << 32);
                if (!j1.b.a(bVar7.f6919v, floatToRawIntBits)) {
                    bVar7.f6919v = floatToRawIntBits;
                    bVar7.f6900a.L(floatToRawIntBits);
                }
            } else if (!j1.b.a(bVar7.f6919v, 9205357640488583168L)) {
                bVar7.f6919v = 9205357640488583168L;
                bVar7.f6900a.L(9205357640488583168L);
            }
        } else {
            c10 = ' ';
        }
        if ((i3 & 16384) != 0) {
            n1.b bVar8 = i1Var.f3431d;
            boolean z12 = d0Var.f5311x;
            if (bVar8.f6920w != z12) {
                bVar8.f6920w = z12;
                bVar8.g = true;
                bVar8.a();
            }
        }
        if ((131072 & i3) != 0) {
            n1.d dVar13 = i1Var.f3431d.f6900a;
        }
        if ((262144 & i3) != 0) {
            n1.d dVar14 = i1Var.f3431d.f6900a;
            if (!Intrinsics.a(dVar14.x(), null)) {
                dVar14.l();
            }
        }
        if ((524288 & i3) != 0) {
            n1.b bVar9 = i1Var.f3431d;
            int i11 = d0Var.B;
            n1.d dVar15 = bVar9.f6900a;
            if (dVar15.K() != i11) {
                dVar15.n(i11);
            }
        }
        if ((32768 & i3) != 0) {
            n1.d dVar16 = i1Var.f3431d.f6900a;
            if (dVar16.v() != 0) {
                dVar16.y(0);
            }
        }
        if ((i3 & 7963) != 0) {
            i1Var.E = true;
            i1Var.F = true;
        }
        if (Intrinsics.a(i1Var.D, d0Var.C)) {
            vVar = vVar4;
            z11 = false;
        } else {
            k1.v vVar5 = d0Var.C;
            i1Var.D = vVar5;
            if (vVar5 == null) {
                vVar = vVar4;
            } else {
                n1.b bVar10 = i1Var.f3431d;
                if (vVar5 instanceof k1.z) {
                    j1.c cVar = ((k1.z) vVar5).f5357f;
                    float f13 = cVar.f4916a;
                    float f14 = cVar.f4917b;
                    vVar = vVar4;
                    bVar10.e((Float.floatToRawIntBits(f13) << c10) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(cVar.f4918c - f13) << c10) | (Float.floatToRawIntBits(cVar.f4919d - f14) & 4294967295L), 0.0f);
                } else {
                    vVar = vVar4;
                    if (vVar5 instanceof k1.y) {
                        k1.g gVar = ((k1.y) vVar5).f5356f;
                        bVar10.f6908k = null;
                        bVar10.f6907i = 9205357640488583168L;
                        bVar10.f6906h = 0L;
                        bVar10.j = 0.0f;
                        bVar10.g = true;
                        bVar10.f6911n = false;
                        bVar10.f6909l = gVar;
                        bVar10.a();
                    } else {
                        if (!(vVar5 instanceof k1.a0)) {
                            a2.r.p();
                            return;
                        }
                        k1.a0 a0Var = (k1.a0) vVar5;
                        k1.g gVar2 = a0Var.g;
                        if (gVar2 != null) {
                            bVar10.f6908k = null;
                            bVar10.f6907i = 9205357640488583168L;
                            bVar10.f6906h = 0L;
                            bVar10.j = 0.0f;
                            bVar10.g = true;
                            bVar10.f6911n = false;
                            bVar10.f6909l = gVar2;
                            bVar10.a();
                        } else {
                            j1.d dVar17 = a0Var.f5295f;
                            float f15 = dVar17.f4920a;
                            bVar10.e((Float.floatToRawIntBits(f15) << c10) | (Float.floatToRawIntBits(dVar17.f4921b) & 4294967295L), (Float.floatToRawIntBits(dVar17.f4922c - f15) << c10) | (Float.floatToRawIntBits(dVar17.a()) & 4294967295L), Float.intBitsToFloat((int) (dVar17.f4926h >> c10)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((vVar5 instanceof k1.y) || ((vVar5 instanceof k1.a0) && !g8.b.G(((k1.a0) vVar5).f5295f))) && (function0 = i1Var.f3435s) != null)) {
                    function0.invoke();
                }
            }
            z11 = true;
        }
        i1Var.B = d0Var.f5302d;
        if (i3 != 0 || z11) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = vVar.getParent();
                if (parent != null) {
                    vVar2 = vVar;
                    parent.onDescendantInvalidated(vVar2, vVar2);
                } else {
                    vVar2 = vVar;
                }
            } else {
                vVar2 = vVar;
                vVar2.invalidate();
            }
            if (d2.v.r()) {
                vVar2.M(0.0f);
            }
        }
        boolean z13 = this.F;
        this.F = d0Var.f5311x;
        this.J = d0Var.f5305r;
        boolean z14 = tVar2.f1670a == tVar.f1670a && tVar2.f1671b == tVar.f1671b && tVar2.f1672c == tVar.f1672c && k1.i0.a(tVar2.f1673d, tVar.f1673d);
        if (z10 && ((!z14 || z13 != this.F) && (vVar3 = g0Var.B) != null)) {
            vVar3.z(g0Var);
        }
        if (z14) {
            return;
        }
        g0Var.J(this);
        if (g0Var.f1547c0 > 0) {
            d2.v a10 = j0.a(g0Var);
            c6.s sVar = a10.f3563m0.f1681e;
            sVar.getClass();
            if (g0Var.f1547c0 > 0) {
                ((o0.e) sVar.f1868d).b(g0Var);
                g0Var.f1546b0 = true;
            }
            a10.G(null);
        }
    }

    @Override // a2.n
    public final long b(long j) {
        if (!D0().B) {
            z1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return j0.a(this.B).v(K(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b1(long j) {
        boolean z10;
        boolean z11;
        boolean z12;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        o1 o1Var = this.Y;
        if (o1Var == null || !this.F) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        n1.b bVar = ((d2.i1) o1Var).f3431d;
        if (bVar.f6920w) {
            k1.v d10 = bVar.d();
            if (!(d10 instanceof k1.z)) {
                if (d10 instanceof k1.a0) {
                    j1.d dVar = ((k1.a0) d10).f5295f;
                    float f3 = dVar.f4922c;
                    float f10 = dVar.f4920a;
                    long j3 = dVar.f4925f;
                    long j10 = dVar.f4926h;
                    z10 = false;
                    z11 = true;
                    long j11 = dVar.g;
                    float f11 = dVar.f4923d;
                    float f12 = dVar.f4921b;
                    long j12 = dVar.f4924e;
                    if (intBitsToFloat >= f10 && intBitsToFloat < f3 && intBitsToFloat2 >= f12 && intBitsToFloat2 < f11) {
                        int i3 = (int) (j12 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i3);
                        int i10 = (int) (j3 >> 32);
                        if (Float.intBitsToFloat(i10) + intBitsToFloat3 <= f3 - f10) {
                            int i11 = (int) (j10 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i11);
                            int i12 = (int) (j11 >> 32);
                            if (Float.intBitsToFloat(i12) + intBitsToFloat4 <= f3 - f10) {
                                int i13 = (int) (j12 & 4294967295L);
                                int i14 = (int) (j10 & 4294967295L);
                                if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= dVar.a()) {
                                    int i15 = (int) (j3 & 4294967295L);
                                    int i16 = (int) (j11 & 4294967295L);
                                    if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= dVar.a()) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i3) + f10;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i13) + f12;
                                        float intBitsToFloat7 = f3 - Float.intBitsToFloat(i10);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i15) + f12;
                                        float intBitsToFloat9 = f3 - Float.intBitsToFloat(i12);
                                        float intBitsToFloat10 = f11 - Float.intBitsToFloat(i16);
                                        float intBitsToFloat11 = f11 - Float.intBitsToFloat(i14);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i11) + f10;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z12 = d2.h0.q(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, dVar.f4924e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z12 = d2.h0.q(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, dVar.f4926h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z12 = d2.h0.q(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, dVar.g);
                                            }
                                            z12 = z11;
                                        } else {
                                            z12 = d2.h0.q(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, dVar.f4925f);
                                        }
                                    }
                                }
                            }
                        }
                        k1.g a9 = k1.i.a();
                        k1.g.b(a9, dVar);
                        z12 = d2.h0.p(intBitsToFloat, intBitsToFloat2, a9);
                    }
                } else {
                    z10 = false;
                    z11 = true;
                    if (!(d10 instanceof k1.y)) {
                        a2.r.p();
                        return false;
                    }
                    z12 = d2.h0.p(intBitsToFloat, intBitsToFloat2, ((k1.y) d10).f5356f);
                }
                return z12 ? z11 : z10;
            }
            j1.c cVar = ((k1.z) d10).f5357f;
            if (cVar.f4916a > intBitsToFloat || intBitsToFloat >= cVar.f4918c || cVar.f4917b > intBitsToFloat2 || intBitsToFloat2 >= cVar.f4919d) {
                z10 = false;
                z11 = true;
            }
            z12 = z10;
            if (z12) {
            }
        }
        z10 = false;
        z11 = true;
        z12 = z11;
        if (z12) {
        }
    }

    @Override // x2.c
    public final float d() {
        return this.B.L.d();
    }

    @Override // a2.n
    public final long e(long j) {
        long K = K(j);
        d2.v a9 = j0.a(this.B);
        a9.D();
        return k1.v.m(a9.f3566p0, K);
    }

    @Override // x2.c
    public final float g() {
        return this.B.L.g();
    }

    @Override // a2.i0
    public final x2.l getLayoutDirection() {
        return this.B.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // a2.o0, a2.f0
    public final Object h() {
        g0 g0Var = this.B;
        if (!g0Var.S.d(64)) {
            return null;
        }
        D0();
        wd.b0 b0Var = new wd.b0();
        for (d1.k kVar = (z1) g0Var.S.f1495f; kVar != null; kVar = kVar.f3309s) {
            if ((kVar.f3307i & 64) != 0) {
                j jVar = kVar;
                ?? r52 = 0;
                while (jVar != 0) {
                    if (jVar instanceof r1) {
                        b0Var.f10141d = ((r1) jVar).q(b0Var.f10141d);
                    } else if ((jVar.f3307i & 64) != 0 && (jVar instanceof j)) {
                        d1.k kVar2 = jVar.D;
                        int i3 = 0;
                        jVar = jVar;
                        r52 = r52;
                        while (kVar2 != null) {
                            if ((kVar2.f3307i & 64) != 0) {
                                i3++;
                                r52 = r52;
                                if (i3 == 1) {
                                    jVar = kVar2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new o0.e(new d1.k[16]);
                                    }
                                    if (jVar != 0) {
                                        r52.b(jVar);
                                        jVar = 0;
                                    }
                                    r52.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f3310t;
                            jVar = jVar;
                            r52 = r52;
                        }
                        if (i3 == 1) {
                        }
                    }
                    jVar = k.e(r52);
                }
            }
        }
        return b0Var.f10141d;
    }

    @Override // c2.o0
    public final o0 h0() {
        return this.C;
    }

    @Override // c2.o0
    public final boolean j0() {
        return this.K != null;
    }

    @Override // a2.n
    public final a2.n k() {
        boolean z10 = D0().B;
        g0 g0Var = this.B;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (g0 g0Var2 = g0Var; g0Var2 != null; g0Var2 = g0Var2.s()) {
                sb2.append("\n|");
                sb2.append(g0Var2);
                sb2.append(" isAttached=");
                sb2.append(g0Var2.E());
                sb2.append(" modifier=");
                sb2.append(g0Var2.X);
                sb2.append(" tail=");
                sb2.append(D0());
            }
            z1.a.b(sb2.toString());
        }
        M0();
        return ((i1) g0Var.S.f1494e).D;
    }

    @Override // c2.o0
    public final g0 k0() {
        return this.B;
    }

    @Override // c2.o0
    public final a2.h0 l0() {
        a2.h0 h0Var = this.K;
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.collections.i0.l("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // c2.o0
    public final o0 m0() {
        return this.D;
    }

    @Override // c2.o0
    public final long n0() {
        return this.M;
    }

    @Override // c2.p1
    public final boolean o() {
        return (this.Y == null || this.E || !this.B.E()) ? false : true;
    }

    @Override // a2.n
    public final j1.c p(a2.n nVar, boolean z10) {
        i1 i1Var;
        if (!D0().B) {
            z1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!nVar.G()) {
            z1.a.b("LayoutCoordinates " + nVar + " is not attached!");
        }
        a2.e0 e0Var = nVar instanceof a2.e0 ? (a2.e0) nVar : null;
        if (e0Var == null || (i1Var = e0Var.f80d.B) == null) {
            i1Var = (i1) nVar;
        }
        i1Var.M0();
        i1 z02 = z0(i1Var);
        j1.a aVar = this.O;
        if (aVar == null) {
            aVar = new j1.a();
            this.O = aVar;
        }
        aVar.f4910a = 0.0f;
        aVar.f4911b = 0.0f;
        aVar.f4912c = (int) (nVar.J() >> 32);
        aVar.f4913d = (int) (nVar.J() & 4294967295L);
        while (i1Var != z02) {
            i1Var.U0(aVar, z10, false);
            if (aVar.b()) {
                return j1.c.f4915e;
            }
            i1Var = i1Var.D;
            i1Var.getClass();
        }
        s0(z02, aVar, z10);
        return new j1.c(aVar.f4910a, aVar.f4911b, aVar.f4912c, aVar.f4913d);
    }

    @Override // c2.o0
    public final void r0() {
        Z(this.M, this.N, this.G);
    }

    public final void s0(i1 i1Var, j1.a aVar, boolean z10) {
        if (i1Var == this) {
            return;
        }
        i1 i1Var2 = this.D;
        if (i1Var2 != null) {
            i1Var2.s0(i1Var, aVar, z10);
        }
        long j = this.M;
        float f3 = (int) (j >> 32);
        aVar.f4910a -= f3;
        aVar.f4912c -= f3;
        float f10 = (int) (j & 4294967295L);
        aVar.f4911b -= f10;
        aVar.f4913d -= f10;
        o1 o1Var = this.Y;
        if (o1Var != null) {
            d2.i1 i1Var3 = (d2.i1) o1Var;
            float[] a9 = i1Var3.a();
            if (!i1Var3.G) {
                if (a9 == null) {
                    aVar.f4910a = 0.0f;
                    aVar.f4911b = 0.0f;
                    aVar.f4912c = 0.0f;
                    aVar.f4913d = 0.0f;
                } else {
                    k1.v.n(a9, aVar);
                }
            }
            if (this.F && z10) {
                long j3 = this.f133i;
                aVar.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
            }
        }
    }

    public final long t0(i1 i1Var, long j) {
        if (i1Var == this) {
            return j;
        }
        i1 i1Var2 = this.D;
        return (i1Var2 == null || Intrinsics.a(i1Var, i1Var2)) ? A0(j) : A0(i1Var2.t0(i1Var, j));
    }

    public final long u0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - X();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - W();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float v0(long j, long j3) {
        if (X() >= Float.intBitsToFloat((int) (j3 >> 32)) && W() >= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long u02 = u0(j3);
        float intBitsToFloat = Float.intBitsToFloat((int) (u02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (u02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - X());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - W())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i3 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i3) <= intBitsToFloat) {
                int i10 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i3);
                    float intBitsToFloat5 = Float.intBitsToFloat(i10);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void w0(k1.n nVar, n1.b bVar) {
        boolean z10;
        Canvas canvas;
        boolean z11;
        int i3;
        boolean z12;
        float f3;
        o1 o1Var = this.Y;
        if (o1Var == null) {
            long j = this.M;
            float f10 = (int) (j >> 32);
            float f11 = (int) (j & 4294967295L);
            nVar.e(f10, f11);
            x0(nVar, bVar);
            nVar.e(-f10, -f11);
            return;
        }
        d2.i1 i1Var = (d2.i1) o1Var;
        m1.b bVar2 = i1Var.A;
        i1Var.g();
        i1Var.f3431d.f6900a.G();
        a1.n nVar2 = bVar2.f6406e;
        a1.n nVar3 = bVar2.f6406e;
        nVar2.H(nVar);
        nVar2.f40e = bVar;
        n1.b bVar3 = i1Var.f3431d;
        k1.n p4 = nVar3.p();
        n1.b bVar4 = (n1.b) nVar3.f40e;
        n1.d dVar = bVar3.f6900a;
        if (bVar3.f6916s) {
            return;
        }
        bVar3.a();
        if (!dVar.H()) {
            try {
                bVar3.f6900a.s(bVar3.f6901b, bVar3.f6902c, bVar3, bVar3.f6904e);
            } catch (Throwable unused) {
            }
        }
        boolean z13 = dVar.G() > 0.0f;
        if (z13) {
            p4.o();
        }
        Canvas a9 = k1.c.a(p4);
        boolean isHardwareAccelerated = a9.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j3 = bVar3.f6917t;
            float f12 = (int) (j3 >> 32);
            float f13 = (int) (j3 & 4294967295L);
            long j10 = bVar3.f6918u;
            float f14 = ((int) (j10 >> 32)) + f12;
            float f15 = f13 + ((int) (j10 & 4294967295L));
            float a10 = dVar.a();
            k1.j x10 = dVar.x();
            int K = dVar.K();
            if (a10 < 1.0f || K != 3 || x10 != null || dVar.v() == 1) {
                y6.l lVar = bVar3.f6913p;
                if (lVar == null) {
                    lVar = k1.v.e();
                    bVar3.f6913p = lVar;
                }
                lVar.f(a10);
                lVar.g(K);
                lVar.i(x10);
                f3 = f12;
                a9.saveLayer(f3, f13, f14, f15, (Paint) lVar.f10660e);
            } else {
                a9.save();
                f3 = f12;
            }
            a9.translate(f3, f13);
            a9.concat(dVar.C());
        }
        boolean z14 = !isHardwareAccelerated && bVar3.f6920w;
        if (z14) {
            p4.h();
            k1.v d10 = bVar3.d();
            if (d10 instanceof k1.z) {
                j1.c cVar = ((k1.z) d10).f5357f;
                p4.l(cVar.f4916a, cVar.f4917b, cVar.f4918c, cVar.f4919d);
            } else if (d10 instanceof k1.a0) {
                k1.g gVar = bVar3.f6910m;
                if (gVar != null) {
                    gVar.f5321a.rewind();
                } else {
                    gVar = k1.i.a();
                    bVar3.f6910m = gVar;
                }
                k1.g.b(gVar, ((k1.a0) d10).f5295f);
                p4.n(gVar);
            } else {
                if (!(d10 instanceof k1.y)) {
                    a2.r.p();
                    return;
                }
                p4.n(((k1.y) d10).f5356f);
            }
        }
        if (bVar4 != null) {
            b7.h hVar = bVar4.f6915r;
            if (!hVar.f1292a) {
                k1.x.a("Only add dependencies during a tracking");
            }
            s.i0 i0Var = (s.i0) hVar.f1295d;
            if (i0Var != null) {
                i0Var.a(bVar3);
            } else if (((n1.b) hVar.f1293b) != null) {
                int i10 = s.q0.f8360a;
                s.i0 i0Var2 = new s.i0();
                n1.b bVar5 = (n1.b) hVar.f1293b;
                bVar5.getClass();
                i0Var2.a(bVar5);
                i0Var2.a(bVar3);
                hVar.f1295d = i0Var2;
                hVar.f1293b = null;
            } else {
                hVar.f1293b = bVar3;
            }
            s.i0 i0Var3 = (s.i0) hVar.f1296e;
            if (i0Var3 != null) {
                boolean k10 = i0Var3.k(bVar3);
                i3 = 1;
                z12 = !k10;
            } else {
                i3 = 1;
                if (((n1.b) hVar.f1294c) != bVar3) {
                    z12 = true;
                } else {
                    hVar.f1294c = null;
                    z12 = false;
                }
            }
            if (z12) {
                bVar3.f6914q += i3;
            }
        }
        if (((k1.b) p4).f5296a.isHardwareAccelerated()) {
            z10 = z13;
            canvas = a9;
            z11 = z14;
            dVar.e(p4);
        } else {
            m1.b bVar6 = bVar3.f6912o;
            if (bVar6 == null) {
                bVar6 = new m1.b();
                bVar3.f6912o = bVar6;
            }
            a1.n nVar4 = bVar6.f6406e;
            x2.c cVar2 = bVar3.f6901b;
            x2.l lVar2 = bVar3.f6902c;
            long b10 = z4.m.b(bVar3.f6918u);
            m1.a aVar = ((m1.b) nVar4.f42r).f6405d;
            x2.c cVar3 = aVar.f6401a;
            x2.l lVar3 = aVar.f6402b;
            k1.n p10 = nVar4.p();
            canvas = a9;
            z11 = z14;
            long u2 = nVar4.u();
            z10 = z13;
            n1.b bVar7 = (n1.b) nVar4.f40e;
            nVar4.I(cVar2);
            nVar4.J(lVar2);
            nVar4.H(p4);
            nVar4.K(b10);
            nVar4.f40e = bVar3;
            p4.h();
            try {
                bVar3.c(bVar6);
            } finally {
                p4.f();
                nVar4.I(cVar3);
                nVar4.J(lVar3);
                nVar4.H(p10);
                nVar4.K(u2);
                nVar4.f40e = bVar7;
            }
        }
        if (z11) {
            p4.f();
        }
        if (z10) {
            p4.i();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public final void x0(k1.n nVar, n1.b bVar) {
        k1.n nVar2;
        n1.b bVar2;
        d1.k E0 = E0(4);
        if (E0 == null) {
            S0(nVar, bVar);
            return;
        }
        g0 g0Var = this.B;
        g0Var.getClass();
        i0 sharedDrawScope = j0.a(g0Var).getSharedDrawScope();
        long b10 = z4.m.b(this.f133i);
        sharedDrawScope.getClass();
        o0.e eVar = null;
        while (E0 != null) {
            if (E0 instanceof l) {
                nVar2 = nVar;
                bVar2 = bVar;
                sharedDrawScope.b(nVar2, b10, this, (l) E0, bVar2);
            } else {
                nVar2 = nVar;
                bVar2 = bVar;
                if ((E0.f3307i & 4) != 0 && (E0 instanceof j)) {
                    int i3 = 0;
                    for (d1.k kVar = ((j) E0).D; kVar != null; kVar = kVar.f3310t) {
                        if ((kVar.f3307i & 4) != 0) {
                            i3++;
                            if (i3 == 1) {
                                E0 = kVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new o0.e(new d1.k[16]);
                                }
                                if (E0 != null) {
                                    eVar.b(E0);
                                    E0 = null;
                                }
                                eVar.b(kVar);
                            }
                        }
                    }
                    if (i3 == 1) {
                        nVar = nVar2;
                        bVar = bVar2;
                    }
                }
            }
            E0 = k.e(eVar);
            nVar = nVar2;
            bVar = bVar2;
        }
    }

    public abstract void y0();

    public final i1 z0(i1 i1Var) {
        g0 g0Var = i1Var.B;
        g0 g0Var2 = this.B;
        if (g0Var == g0Var2) {
            d1.k D0 = i1Var.D0();
            d1.k D02 = D0();
            if (!D02.f3305d.B) {
                z1.a.b("visitLocalAncestors called on an unattached node");
            }
            for (d1.k kVar = D02.f3305d.f3309s; kVar != null; kVar = kVar.f3309s) {
                if ((kVar.f3307i & 2) != 0 && kVar == D0) {
                    return i1Var;
                }
            }
            return this;
        }
        while (g0Var.D > g0Var2.D) {
            g0Var = g0Var.s();
            g0Var.getClass();
        }
        g0 g0Var3 = g0Var2;
        while (g0Var3.D > g0Var.D) {
            g0Var3 = g0Var3.s();
            g0Var3.getClass();
        }
        while (g0Var != g0Var3) {
            g0Var = g0Var.s();
            g0Var3 = g0Var3.s();
            if (g0Var == null || g0Var3 == null) {
                te.a1.e("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (g0Var3 != g0Var2) {
            if (g0Var != i1Var.B) {
                return (q) g0Var.S.f1493d;
            }
            return i1Var;
        }
        return this;
    }

    @Override // c2.o0
    public final a2.n i0() {
        return this;
    }
}
