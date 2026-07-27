package r0;

import A0.C0030a;
import G.C0223t;
import Q.AbstractC0274j;
import Z.C0311h;
import a.AbstractC0345a;
import android.os.Build;
import android.view.View;
import c0.C0531b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.AbstractC0960V;
import p0.C0943D;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0980p;
import s0.AbstractC1125K;
import s0.C1156m0;
import s0.C1164q0;
import s0.C1166s;
import s0.F0;
import s0.R0;
import s0.S0;
import z2.C1436t;
import z2.C1441y;

/* loaded from: classes.dex */
public abstract class a0 extends O implements InterfaceC0944E, InterfaceC0980p, h0 {

    /* renamed from: K, reason: collision with root package name */
    public static final Z.M f9748K;

    /* renamed from: L, reason: collision with root package name */
    public static final C1079u f9749L;

    /* renamed from: M, reason: collision with root package name */
    public static final float[] f9750M;

    /* renamed from: N, reason: collision with root package name */
    public static final C1063d f9751N;

    /* renamed from: O, reason: collision with root package name */
    public static final C1063d f9752O;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0946G f9753A;
    public LinkedHashMap B;

    /* renamed from: D, reason: collision with root package name */
    public float f9755D;

    /* renamed from: E, reason: collision with root package name */
    public Y.b f9756E;

    /* renamed from: F, reason: collision with root package name */
    public C1079u f9757F;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9760I;

    /* renamed from: J, reason: collision with root package name */
    public f0 f9761J;

    /* renamed from: r, reason: collision with root package name */
    public final E f9762r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f9763s;

    /* renamed from: t, reason: collision with root package name */
    public a0 f9764t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9765u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9766v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f9767w;

    /* renamed from: x, reason: collision with root package name */
    public M0.b f9768x;

    /* renamed from: y, reason: collision with root package name */
    public M0.k f9769y;

    /* renamed from: z, reason: collision with root package name */
    public float f9770z = 0.8f;

    /* renamed from: C, reason: collision with root package name */
    public long f9754C = 0;

    /* renamed from: G, reason: collision with root package name */
    public final C0030a f9758G = new C0030a(12, this);

    /* renamed from: H, reason: collision with root package name */
    public final A3.e f9759H = new A3.e(28, this);

    static {
        Z.M m4 = new Z.M();
        m4.f4467e = 1.0f;
        m4.f4468i = 1.0f;
        m4.f4469j = 1.0f;
        long j4 = Z.B.f4449a;
        m4.f4473n = j4;
        m4.f4474o = j4;
        m4.f4478s = 8.0f;
        m4.f4479t = Z.U.f4510b;
        m4.f4480u = Z.K.f4461a;
        m4.f4482w = 0;
        m4.f4483x = 9205357640488583168L;
        m4.f4484y = u3.l.J();
        m4.f4485z = M0.k.f3555d;
        f9748K = m4;
        f9749L = new C1079u();
        f9750M = Z.E.a();
        f9751N = new C1063d(1);
        f9752O = new C1063d(2);
    }

    public a0(E e4) {
        this.f9762r = e4;
        this.f9768x = e4.f9610w;
        this.f9769y = e4.f9611x;
    }

    public static a0 f1(InterfaceC0980p interfaceC0980p) {
        a0 a0Var;
        C0943D c0943d = interfaceC0980p instanceof C0943D ? (C0943D) interfaceC0980p : null;
        if (c0943d != null && (a0Var = c0943d.f8996d.f9707r) != null) {
            return a0Var;
        }
        Intrinsics.d(interfaceC0980p, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (a0) interfaceC0980p;
    }

    @Override // r0.O
    public final void B0() {
        n0(this.f9754C, this.f9755D, this.f9767w);
    }

    public final void C0(a0 a0Var, Y.b bVar, boolean z4) {
        if (a0Var == this) {
            return;
        }
        a0 a0Var2 = this.f9764t;
        if (a0Var2 != null) {
            a0Var2.C0(a0Var, bVar, z4);
        }
        long j4 = this.f9754C;
        float f4 = (int) (j4 >> 32);
        bVar.f4368a -= f4;
        bVar.f4370c -= f4;
        float f5 = (int) (j4 & 4294967295L);
        bVar.f4369b -= f5;
        bVar.f4371d -= f5;
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            f0Var.l(bVar, true);
            if (this.f9766v && z4) {
                long j5 = this.f9007i;
                bVar.a(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L));
            }
        }
    }

    public final long D0(a0 a0Var, long j4) {
        if (a0Var == this) {
            return j4;
        }
        a0 a0Var2 = this.f9764t;
        return (a0Var2 == null || Intrinsics.a(a0Var, a0Var2)) ? L0(j4, true) : L0(a0Var2.D0(a0Var, j4), true);
    }

    public final long E0(long j4) {
        return u3.l.N(Math.max(0.0f, (Y.f.d(j4) - g0()) / 2.0f), Math.max(0.0f, (Y.f.b(j4) - f0()) / 2.0f));
    }

    public final float F0(long j4, long j5) {
        if (g0() >= Y.f.d(j5) && f0() >= Y.f.b(j5)) {
            return Float.POSITIVE_INFINITY;
        }
        long E02 = E0(j5);
        float d4 = Y.f.d(E02);
        float b4 = Y.f.b(E02);
        float d5 = Y.c.d(j4);
        float max = Math.max(0.0f, d5 < 0.0f ? -d5 : d5 - g0());
        float e4 = Y.c.e(j4);
        long c4 = AbstractC0345a.c(max, Math.max(0.0f, e4 < 0.0f ? -e4 : e4 - f0()));
        if ((d4 <= 0.0f && b4 <= 0.0f) || Y.c.d(c4) > d4 || Y.c.e(c4) > b4) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (c4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c4 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void G0(Z.r rVar, C0531b c0531b) {
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            f0Var.a(rVar, c0531b);
            return;
        }
        long j4 = this.f9754C;
        float f4 = (int) (j4 >> 32);
        float f5 = (int) (j4 & 4294967295L);
        rVar.q(f4, f5);
        I0(rVar, c0531b);
        rVar.q(-f4, -f5);
    }

    public final void H0(Z.r rVar, C0311h c0311h) {
        long j4 = this.f9007i;
        rVar.getClass();
        rVar.m(0.5f, 0.5f, ((int) (j4 >> 32)) - 0.5f, ((int) (j4 & 4294967295L)) - 0.5f, c0311h);
    }

    public final void I0(Z.r rVar, C0531b c0531b) {
        S.n P02 = P0(4);
        if (P02 == null) {
            a1(rVar, c0531b);
            return;
        }
        E e4 = this.f9762r;
        e4.getClass();
        G sharedDrawScope = ((C1166s) H.a(e4)).getSharedDrawScope();
        long U3 = u3.d.U(this.f9007i);
        sharedDrawScope.getClass();
        I.d dVar = null;
        while (P02 != null) {
            if (P02 instanceof InterfaceC1074o) {
                sharedDrawScope.b(rVar, U3, this, (InterfaceC1074o) P02, c0531b);
            } else if ((P02.f3980i & 4) != 0 && (P02 instanceof AbstractC1073n)) {
                int i2 = 0;
                for (S.n nVar = ((AbstractC1073n) P02).f9826u; nVar != null; nVar = nVar.f3983l) {
                    if ((nVar.f3980i & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            P02 = nVar;
                        } else {
                            if (dVar == null) {
                                dVar = new I.d(new S.n[16]);
                            }
                            if (P02 != null) {
                                dVar.b(P02);
                                P02 = null;
                            }
                            dVar.b(nVar);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            P02 = AbstractC1065f.f(dVar);
        }
    }

    public abstract void J0();

    @Override // p0.InterfaceC0980p
    public final long K() {
        return this.f9007i;
    }

    public final a0 K0(a0 a0Var) {
        E e4 = a0Var.f9762r;
        E e5 = this.f9762r;
        if (e4 == e5) {
            S.n O0 = a0Var.O0();
            S.n nVar = O0().f3978d;
            if (!nVar.f3990s) {
                AbstractC0864b.D("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (S.n nVar2 = nVar.f3982k; nVar2 != null; nVar2 = nVar2.f3982k) {
                if ((nVar2.f3980i & 2) != 0 && nVar2 == O0) {
                    return a0Var;
                }
            }
            return this;
        }
        while (e4.f9603p > e5.f9603p) {
            e4 = e4.s();
            Intrinsics.c(e4);
        }
        E e6 = e5;
        while (e6.f9603p > e4.f9603p) {
            e6 = e6.s();
            Intrinsics.c(e6);
        }
        while (e4 != e6) {
            e4 = e4.s();
            e6 = e6.s();
            if (e4 == null || e6 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return e6 == e5 ? this : e4 == a0Var.f9762r ? a0Var : (C1078t) e4.B.f2909c;
    }

    public final long L0(long j4, boolean z4) {
        if (z4 || !this.f9701l) {
            long j5 = this.f9754C;
            j4 = AbstractC0345a.c(Y.c.d(j4) - ((int) (j5 >> 32)), Y.c.e(j4) - ((int) (j5 & 4294967295L)));
        }
        f0 f0Var = this.f9761J;
        return f0Var != null ? f0Var.e(j4, true) : j4;
    }

    public abstract P M0();

    @Override // r0.h0
    public final boolean N() {
        return (this.f9761J == null || this.f9765u || !this.f9762r.D()) ? false : true;
    }

    public final long N0() {
        return this.f9768x.E(this.f9762r.f9612y.g());
    }

    public abstract S.n O0();

    public final S.n P0(int i2) {
        boolean h4 = b0.h(i2);
        S.n O0 = O0();
        if (!h4 && (O0 = O0.f3982k) == null) {
            return null;
        }
        for (S.n Q02 = Q0(h4); Q02 != null && (Q02.f3981j & i2) != 0; Q02 = Q02.f3983l) {
            if ((Q02.f3980i & i2) != 0) {
                return Q02;
            }
            if (Q02 == O0) {
                return null;
            }
        }
        return null;
    }

    @Override // p0.InterfaceC0980p
    public final long Q(long j4) {
        if (!O0().f3990s) {
            AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        X0();
        for (a0 a0Var = this; a0Var != null; a0Var = a0Var.f9764t) {
            j4 = a0Var.g1(j4, true);
        }
        return j4;
    }

    public final S.n Q0(boolean z4) {
        S.n O0;
        C0223t c0223t = this.f9762r.B;
        if (((a0) c0223t.f2910d) == this) {
            return (S.n) c0223t.f2912f;
        }
        if (z4) {
            a0 a0Var = this.f9764t;
            if (a0Var != null && (O0 = a0Var.O0()) != null) {
                return O0.f3983l;
            }
        } else {
            a0 a0Var2 = this.f9764t;
            if (a0Var2 != null) {
                return a0Var2.O0();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [S.n] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void R0(S.n nVar, C1063d c1063d, long j4, r rVar, boolean z4, boolean z5) {
        if (nVar == null) {
            T0(c1063d, j4, rVar, z4, z5);
            return;
        }
        rVar.h(nVar, -1.0f, z5, new Y(this, nVar, c1063d, j4, rVar, z4, z5));
        a0 a0Var = nVar.f3985n;
        if (a0Var != null) {
            S.n Q02 = a0Var.Q0(b0.h(16));
            if (Q02 != null && Q02.f3990s) {
                S.n nVar2 = Q02.f3978d;
                if (!nVar2.f3990s) {
                    AbstractC0864b.D("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((nVar2.f3981j & 16) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f3980i & 16) != 0) {
                            AbstractC1073n abstractC1073n = nVar2;
                            ?? r5 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof l0) {
                                    if (((l0) abstractC1073n).y()) {
                                        return;
                                    }
                                } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar3 = abstractC1073n.f9826u;
                                    int i2 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r5 = r5;
                                    while (nVar3 != null) {
                                        if ((nVar3.f3980i & 16) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                abstractC1073n = nVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n != 0) {
                                                    r5.b(abstractC1073n);
                                                    abstractC1073n = 0;
                                                }
                                                r5.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f3983l;
                                        abstractC1073n = abstractC1073n;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r5);
                            }
                        }
                        nVar2 = nVar2.f3983l;
                    }
                }
            }
            rVar.f9839k = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        if (r0.AbstractC1065f.h(r21.e(), r0.AbstractC1065f.a(r15, r23)) > 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(C1063d c1063d, long j4, r rVar, boolean z4, boolean z5) {
        f0 f0Var;
        S.n P02 = P0(c1063d.a());
        if (!AbstractC0345a.y(j4) || ((f0Var = this.f9761J) != null && this.f9766v && !f0Var.k(j4))) {
            if (z4) {
                float F02 = F0(j4, N0());
                if (Float.isInfinite(F02) || Float.isNaN(F02)) {
                    return;
                }
                if (rVar.f9837i != C1441y.d(rVar)) {
                    if (AbstractC1065f.h(rVar.e(), AbstractC1065f.a(F02, false)) <= 0) {
                        return;
                    }
                }
                boolean z6 = false;
                if (P02 == null) {
                    T0(c1063d, j4, rVar, z4, false);
                    return;
                } else {
                    rVar.h(P02, F02, false, new Z(this, P02, c1063d, j4, rVar, z4, z6, F02, 0));
                    return;
                }
            }
            return;
        }
        if (P02 == null) {
            T0(c1063d, j4, rVar, z4, z5);
            return;
        }
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        if (d4 >= 0.0f && e4 >= 0.0f && d4 < g0() && e4 < f0()) {
            R0(P02, c1063d, j4, rVar, z4, z5);
            return;
        }
        float F03 = !z4 ? Float.POSITIVE_INFINITY : F0(j4, N0());
        if (!Float.isInfinite(F03) && !Float.isNaN(F03)) {
            if (rVar.f9837i != C1441y.d(rVar)) {
            }
            rVar.h(P02, F03, z5, new Z(this, P02, c1063d, j4, rVar, z4, z5, F03, 0));
            return;
        }
        e1(P02, c1063d, j4, rVar, z4, z5, F03);
    }

    public void T0(C1063d c1063d, long j4, r rVar, boolean z4, boolean z5) {
        a0 a0Var = this.f9763s;
        if (a0Var != null) {
            a0Var.S0(c1063d, a0Var.L0(j4, true), rVar, z4, z5);
        }
    }

    public final void U0() {
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            f0Var.invalidate();
            return;
        }
        a0 a0Var = this.f9764t;
        if (a0Var != null) {
            a0Var.U0();
        }
    }

    public final boolean V0() {
        if (this.f9761J != null && this.f9770z <= 0.0f) {
            return true;
        }
        a0 a0Var = this.f9764t;
        if (a0Var != null) {
            return a0Var.V0();
        }
        return false;
    }

    public final long W0(InterfaceC0980p interfaceC0980p, long j4) {
        if (interfaceC0980p instanceof C0943D) {
            ((C0943D) interfaceC0980p).f8996d.f9707r.X0();
            return ((C0943D) interfaceC0980p).b(this, j4 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        a0 f12 = f1(interfaceC0980p);
        f12.X0();
        a0 K02 = K0(f12);
        while (f12 != K02) {
            j4 = f12.g1(j4, true);
            f12 = f12.f9764t;
            Intrinsics.c(f12);
        }
        return D0(K02, j4);
    }

    public final void X0() {
        L l4 = this.f9762r.f9584C;
        int i2 = l4.f9674a.f9584C.f9676c;
        if (i2 == 3 || i2 == 4) {
            if (l4.f9691r.f9649C) {
                l4.e(true);
            } else {
                l4.d(true);
            }
        }
        if (i2 == 4) {
            J j4 = l4.f9692s;
            if (j4 == null || !j4.f9647z) {
                l4.f(true);
            } else {
                l4.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [S.n] */
    /* JADX WARN: Type inference failed for: r8v7, types: [S.n] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void Y0() {
        S.n nVar;
        S.n Q02 = Q0(b0.h(128));
        if (Q02 == null || (Q02.f3978d.f3981j & 128) == 0) {
            return;
        }
        AbstractC0274j c4 = Q.w.c();
        Function1 f4 = c4 != null ? c4.f() : null;
        AbstractC0274j d4 = Q.w.d(c4);
        try {
            boolean h4 = b0.h(128);
            if (h4) {
                nVar = O0();
            } else {
                nVar = O0().f3982k;
                if (nVar == null) {
                    Unit unit = Unit.f7487a;
                    Q.w.f(c4, d4, f4);
                }
            }
            for (S.n Q03 = Q0(h4); Q03 != null && (Q03.f3981j & 128) != 0; Q03 = Q03.f3983l) {
                if ((Q03.f3980i & 128) != 0) {
                    ?? r9 = 0;
                    AbstractC1073n abstractC1073n = Q03;
                    while (abstractC1073n != 0) {
                        if (abstractC1073n instanceof InterfaceC1080v) {
                            ((InterfaceC1080v) abstractC1073n).z(this.f9007i);
                        } else if ((abstractC1073n.f3980i & 128) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                            S.n nVar2 = abstractC1073n.f9826u;
                            int i2 = 0;
                            abstractC1073n = abstractC1073n;
                            r9 = r9;
                            while (nVar2 != null) {
                                if ((nVar2.f3980i & 128) != 0) {
                                    i2++;
                                    r9 = r9;
                                    if (i2 == 1) {
                                        abstractC1073n = nVar2;
                                    } else {
                                        if (r9 == 0) {
                                            r9 = new I.d(new S.n[16]);
                                        }
                                        if (abstractC1073n != 0) {
                                            r9.b(abstractC1073n);
                                            abstractC1073n = 0;
                                        }
                                        r9.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f3983l;
                                abstractC1073n = abstractC1073n;
                                r9 = r9;
                            }
                            if (i2 == 1) {
                            }
                        }
                        abstractC1073n = AbstractC1065f.f(r9);
                    }
                }
                if (Q03 == nVar) {
                    break;
                }
            }
            Unit unit2 = Unit.f7487a;
            Q.w.f(c4, d4, f4);
        } catch (Throwable th) {
            Q.w.f(c4, d4, f4);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [S.n] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void Z0() {
        boolean h4 = b0.h(128);
        S.n O0 = O0();
        if (!h4 && (O0 = O0.f3982k) == null) {
            return;
        }
        for (S.n Q02 = Q0(h4); Q02 != null && (Q02.f3981j & 128) != 0; Q02 = Q02.f3983l) {
            if ((Q02.f3980i & 128) != 0) {
                AbstractC1073n abstractC1073n = Q02;
                ?? r5 = 0;
                while (abstractC1073n != 0) {
                    if (abstractC1073n instanceof InterfaceC1080v) {
                        ((InterfaceC1080v) abstractC1073n).x(this);
                    } else if ((abstractC1073n.f3980i & 128) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                        S.n nVar = abstractC1073n.f9826u;
                        int i2 = 0;
                        abstractC1073n = abstractC1073n;
                        r5 = r5;
                        while (nVar != null) {
                            if ((nVar.f3980i & 128) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    abstractC1073n = nVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new I.d(new S.n[16]);
                                    }
                                    if (abstractC1073n != 0) {
                                        r5.b(abstractC1073n);
                                        abstractC1073n = 0;
                                    }
                                    r5.b(nVar);
                                }
                            }
                            nVar = nVar.f3983l;
                            abstractC1073n = abstractC1073n;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC1073n = AbstractC1065f.f(r5);
                }
            }
            if (Q02 == O0) {
                return;
            }
        }
    }

    public abstract void a1(Z.r rVar, C0531b c0531b);

    public final void b1(long j4, float f4, Function1 function1) {
        j1(function1, false);
        if (!M0.h.a(this.f9754C, j4)) {
            this.f9754C = j4;
            E e4 = this.f9762r;
            e4.f9584C.f9691r.u0();
            f0 f0Var = this.f9761J;
            if (f0Var != null) {
                f0Var.f(j4);
            } else {
                a0 a0Var = this.f9764t;
                if (a0Var != null) {
                    a0Var.U0();
                }
            }
            O.A0(this);
            C1166s c1166s = e4.f9602o;
            if (c1166s != null) {
                c1166s.w(e4);
            }
        }
        this.f9755D = f4;
        if (this.f9703n) {
            return;
        }
        s0(new k0(x0(), this));
    }

    @Override // p0.InterfaceC0980p
    public final long c(long j4) {
        if (!O0().f3990s) {
            AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        InterfaceC0980p g4 = AbstractC0960V.g(this);
        C1166s c1166s = (C1166s) H.a(this.f9762r);
        c1166s.A();
        return W0(g4, Y.c.g(Z.E.b(j4, c1166s.f10336S), g4.Q(0L)));
    }

    public final void c1(Y.b bVar, boolean z4, boolean z5) {
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            if (this.f9766v) {
                if (z5) {
                    long N02 = N0();
                    float d4 = Y.f.d(N02) / 2.0f;
                    float b4 = Y.f.b(N02) / 2.0f;
                    long j4 = this.f9007i;
                    bVar.a(-d4, -b4, ((int) (j4 >> 32)) + d4, ((int) (j4 & 4294967295L)) + b4);
                } else if (z4) {
                    long j5 = this.f9007i;
                    bVar.a(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            f0Var.l(bVar, false);
        }
        long j6 = this.f9754C;
        float f4 = (int) (j6 >> 32);
        bVar.f4368a += f4;
        bVar.f4370c += f4;
        float f5 = (int) (j6 & 4294967295L);
        bVar.f4369b += f5;
        bVar.f4371d += f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [S.n] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void d1(InterfaceC0946G interfaceC0946G) {
        a0 a0Var;
        InterfaceC0946G interfaceC0946G2 = this.f9753A;
        if (interfaceC0946G != interfaceC0946G2) {
            this.f9753A = interfaceC0946G;
            E e4 = this.f9762r;
            if (interfaceC0946G2 == null || interfaceC0946G.g() != interfaceC0946G2.g() || interfaceC0946G.j() != interfaceC0946G2.j()) {
                int g4 = interfaceC0946G.g();
                int j4 = interfaceC0946G.j();
                f0 f0Var = this.f9761J;
                if (f0Var != null) {
                    f0Var.h(u3.d.c(g4, j4));
                } else if (e4.E() && (a0Var = this.f9764t) != null) {
                    a0Var.U0();
                }
                p0(u3.d.c(g4, j4));
                if (this.f9767w != null) {
                    k1(false);
                }
                boolean h4 = b0.h(4);
                S.n O0 = O0();
                if (h4 || (O0 = O0.f3982k) != null) {
                    for (S.n Q02 = Q0(h4); Q02 != null && (Q02.f3981j & 4) != 0; Q02 = Q02.f3983l) {
                        if ((Q02.f3980i & 4) != 0) {
                            AbstractC1073n abstractC1073n = Q02;
                            ?? r7 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof InterfaceC1074o) {
                                    ((InterfaceC1074o) abstractC1073n).f0();
                                } else if ((abstractC1073n.f3980i & 4) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar = abstractC1073n.f9826u;
                                    int i2 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r7 = r7;
                                    while (nVar != null) {
                                        if ((nVar.f3980i & 4) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                abstractC1073n = nVar;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n != 0) {
                                                    r7.b(abstractC1073n);
                                                    abstractC1073n = 0;
                                                }
                                                r7.b(nVar);
                                            }
                                        }
                                        nVar = nVar.f3983l;
                                        abstractC1073n = abstractC1073n;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r7);
                            }
                        }
                        if (Q02 == O0) {
                            break;
                        }
                    }
                }
                C1166s c1166s = e4.f9602o;
                if (c1166s != null) {
                    c1166s.w(e4);
                }
            }
            LinkedHashMap linkedHashMap = this.B;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && interfaceC0946G.k().isEmpty()) || Intrinsics.a(interfaceC0946G.k(), this.B)) {
                return;
            }
            e4.f9584C.f9691r.f9673z.f();
            LinkedHashMap linkedHashMap2 = this.B;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.B = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0946G.k());
        }
    }

    @Override // M0.b
    public final float e() {
        return this.f9762r.f9610w.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [I.d] */
    public final void e1(S.n nVar, C1063d c1063d, long j4, r rVar, boolean z4, boolean z5, float f4) {
        boolean z6;
        if (nVar == null) {
            T0(c1063d, j4, rVar, z4, z5);
            return;
        }
        switch (c1063d.f9777d) {
            case 1:
                ?? r2 = 0;
                AbstractC1073n abstractC1073n = nVar;
                while (true) {
                    int i2 = 0;
                    if (abstractC1073n == 0) {
                        z6 = false;
                        break;
                    } else {
                        if (abstractC1073n instanceof l0) {
                            if (((l0) abstractC1073n).g0()) {
                                z6 = true;
                                break;
                            }
                        } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                            S.n nVar2 = abstractC1073n.f9826u;
                            abstractC1073n = abstractC1073n;
                            r2 = r2;
                            while (nVar2 != null) {
                                if ((nVar2.f3980i & 16) != 0) {
                                    i2++;
                                    r2 = r2;
                                    if (i2 == 1) {
                                        abstractC1073n = nVar2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new I.d(new S.n[16]);
                                        }
                                        if (abstractC1073n != 0) {
                                            r2.b(abstractC1073n);
                                            abstractC1073n = 0;
                                        }
                                        r2.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f3983l;
                                abstractC1073n = abstractC1073n;
                                r2 = r2;
                            }
                            if (i2 == 1) {
                            }
                        }
                        abstractC1073n = AbstractC1065f.f(r2);
                    }
                }
                break;
            default:
                z6 = false;
                break;
        }
        if (!z6) {
            e1(AbstractC1065f.e(nVar, c1063d.a()), c1063d, j4, rVar, z4, z5, f4);
            return;
        }
        Z z7 = new Z(this, nVar, c1063d, j4, rVar, z4, z5, f4, 1);
        if (rVar.f9837i == C1441y.d(rVar)) {
            rVar.h(nVar, f4, z5, z7);
            if (rVar.f9837i + 1 == C1441y.d(rVar)) {
                rVar.s();
                return;
            }
            return;
        }
        long e4 = rVar.e();
        int i4 = rVar.f9837i;
        rVar.f9837i = C1441y.d(rVar);
        rVar.h(nVar, f4, z5, z7);
        if (rVar.f9837i + 1 < C1441y.d(rVar) && AbstractC1065f.h(e4, rVar.e()) > 0) {
            int i5 = rVar.f9837i + 1;
            int i6 = i4 + 1;
            Object[] objArr = rVar.f9835d;
            C1436t.f(objArr, objArr, i6, i5, rVar.f9838j);
            long[] destination = rVar.f9836e;
            int i7 = rVar.f9838j;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i5, destination, i6, i7 - i5);
            rVar.f9837i = ((rVar.f9838j + i4) - rVar.f9837i) - 1;
        }
        rVar.s();
        rVar.f9837i = i4;
    }

    public final long g1(long j4, boolean z4) {
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            j4 = f0Var.e(j4, false);
        }
        if (!z4 && this.f9701l) {
            return j4;
        }
        long j5 = this.f9754C;
        return AbstractC0345a.c(Y.c.d(j4) + ((int) (j5 >> 32)), Y.c.e(j4) + ((int) (j5 & 4294967295L)));
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9762r.f9611x;
    }

    public final void h1(a0 a0Var, float[] fArr) {
        if (Intrinsics.a(a0Var, this)) {
            return;
        }
        a0 a0Var2 = this.f9764t;
        Intrinsics.c(a0Var2);
        a0Var2.h1(a0Var, fArr);
        if (!M0.h.a(this.f9754C, 0L)) {
            float[] fArr2 = f9750M;
            Z.E.d(fArr2);
            long j4 = this.f9754C;
            Z.E.h(fArr2, -((int) (j4 >> 32)), -((int) (j4 & 4294967295L)), 0.0f);
            Z.E.g(fArr, fArr2);
        }
        f0 f0Var = this.f9761J;
        if (f0Var != null) {
            f0Var.c(fArr);
        }
    }

    @Override // p0.InterfaceC0980p
    public final void i(InterfaceC0980p interfaceC0980p, float[] fArr) {
        a0 f12 = f1(interfaceC0980p);
        f12.X0();
        a0 K02 = K0(f12);
        Z.E.d(fArr);
        f12.i1(K02, fArr);
        h1(K02, fArr);
    }

    public final void i1(a0 a0Var, float[] fArr) {
        a0 a0Var2 = this;
        while (!a0Var2.equals(a0Var)) {
            f0 f0Var = a0Var2.f9761J;
            if (f0Var != null) {
                f0Var.j(fArr);
            }
            if (!M0.h.a(a0Var2.f9754C, 0L)) {
                float[] fArr2 = f9750M;
                Z.E.d(fArr2);
                Z.E.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L), 0.0f);
                Z.E.g(fArr, fArr2);
            }
            a0Var2 = a0Var2.f9764t;
            Intrinsics.c(a0Var2);
        }
    }

    @Override // p0.InterfaceC0980p
    public final long j(long j4) {
        long Q3 = Q(j4);
        C1166s c1166s = (C1166s) H.a(this.f9762r);
        c1166s.A();
        return Z.E.b(Q3, c1166s.f10335R);
    }

    public final void j1(Function1 function1, boolean z4) {
        C1166s c1166s;
        Reference poll;
        I.d dVar;
        Object obj;
        E e4 = this.f9762r;
        boolean z5 = (!z4 && this.f9767w == function1 && Intrinsics.a(this.f9768x, e4.f9610w) && this.f9769y == e4.f9611x) ? false : true;
        this.f9768x = e4.f9610w;
        this.f9769y = e4.f9611x;
        boolean D3 = e4.D();
        A3.e eVar = this.f9759H;
        if (!D3 || function1 == null) {
            this.f9767w = null;
            f0 f0Var = this.f9761J;
            if (f0Var != null) {
                f0Var.d();
                e4.f9587F = true;
                eVar.invoke();
                if (O0().f3990s && (c1166s = e4.f9602o) != null) {
                    c1166s.w(e4);
                }
            }
            this.f9761J = null;
            this.f9760I = false;
            return;
        }
        this.f9767w = function1;
        if (this.f9761J != null) {
            if (z5) {
                k1(true);
                return;
            }
            return;
        }
        C1166s c1166s2 = (C1166s) H.a(e4);
        C0030a c0030a = this.f9758G;
        do {
            l2.g gVar = c1166s2.f10374u0;
            poll = ((ReferenceQueue) gVar.f7977c).poll();
            dVar = (I.d) gVar.f7976b;
            if (poll != null) {
                dVar.m(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.l()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.n(dVar.f3332i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        f0 f0Var2 = (f0) obj;
        if (f0Var2 != null) {
            f0Var2.i(c0030a, eVar);
        } else if (!c1166s2.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (c1166s2.isHardwareAccelerated() && c1166s2.f10340W) {
                try {
                    f0Var2 = new F0(c1166s2, c0030a, eVar);
                } catch (Throwable unused) {
                    c1166s2.f10340W = false;
                }
            }
            if (c1166s2.f10327J == null) {
                if (!R0.f10115y) {
                    AbstractC1125K.q(new View(c1166s2.getContext()));
                }
                C1156m0 c1156m0 = R0.f10116z ? new C1156m0(c1166s2.getContext()) : new S0(c1166s2.getContext());
                c1166s2.f10327J = c1156m0;
                c1166s2.addView(c1156m0, -1);
            }
            C1156m0 c1156m02 = c1166s2.f10327J;
            Intrinsics.c(c1156m02);
            f0Var2 = new R0(c1166s2, c1156m02, c0030a, eVar);
        } else {
            f0Var2 = new C1164q0(c1166s2.getGraphicsContext().b(), c1166s2.getGraphicsContext(), c1166s2, c0030a, eVar);
        }
        f0Var2.h(this.f9007i);
        f0Var2.f(this.f9754C);
        this.f9761J = f0Var2;
        k1(true);
        e4.f9587F = true;
        eVar.invoke();
    }

    public final void k1(boolean z4) {
        C1166s c1166s;
        f0 f0Var = this.f9761J;
        if (f0Var == null) {
            if (this.f9767w == null) {
                return;
            }
            AbstractC0864b.D("null layer with a non-null layerBlock");
            throw null;
        }
        Function1 function1 = this.f9767w;
        if (function1 == null) {
            AbstractC0864b.E("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        Z.M m4 = f9748K;
        m4.d(1.0f);
        m4.f(1.0f);
        m4.a(1.0f);
        if (m4.f4470k != 0.0f) {
            m4.f4466d |= 8;
            m4.f4470k = 0.0f;
        }
        if (m4.f4471l != 0.0f) {
            m4.f4466d |= 16;
            m4.f4471l = 0.0f;
        }
        m4.g(0.0f);
        long j4 = Z.B.f4449a;
        m4.b(j4);
        m4.j(j4);
        if (m4.f4475p != 0.0f) {
            m4.f4466d |= 256;
            m4.f4475p = 0.0f;
        }
        if (m4.f4476q != 0.0f) {
            m4.f4466d |= 512;
            m4.f4476q = 0.0f;
        }
        if (m4.f4477r != 0.0f) {
            m4.f4466d |= 1024;
            m4.f4477r = 0.0f;
        }
        if (m4.f4478s != 8.0f) {
            m4.f4466d |= 2048;
            m4.f4478s = 8.0f;
        }
        m4.k(Z.U.f4510b);
        m4.i(Z.K.f4461a);
        m4.c(false);
        if (!Intrinsics.a(null, null)) {
            m4.f4466d |= 131072;
        }
        if (!Z.K.p(m4.f4482w, 0)) {
            m4.f4466d |= 32768;
            m4.f4482w = 0;
        }
        m4.f4483x = 9205357640488583168L;
        m4.f4465A = null;
        m4.f4466d = 0;
        E e4 = this.f9762r;
        m4.f4484y = e4.f9610w;
        m4.f4485z = e4.f9611x;
        m4.f4483x = u3.d.U(this.f9007i);
        ((C1166s) H.a(e4)).getSnapshotObserver().a(this, C1064e.f9782k, new A3.e(29, function1));
        C1079u c1079u = this.f9757F;
        if (c1079u == null) {
            c1079u = new C1079u();
            this.f9757F = c1079u;
        }
        c1079u.f9843a = m4.f4467e;
        c1079u.f9844b = m4.f4468i;
        c1079u.f9845c = m4.f4470k;
        c1079u.f9846d = m4.f4471l;
        c1079u.f9847e = m4.f4475p;
        c1079u.f9848f = m4.f4476q;
        c1079u.f9849g = m4.f4477r;
        c1079u.f9850h = m4.f4478s;
        c1079u.f9851i = m4.f4479t;
        f0Var.b(m4);
        this.f9766v = m4.f4481v;
        this.f9770z = m4.f4469j;
        if (!z4 || (c1166s = e4.f9602o) == null) {
            return;
        }
        c1166s.w(e4);
    }

    @Override // p0.InterfaceC0980p
    public final long m(long j4) {
        if (O0().f3990s) {
            return W0(AbstractC0960V.g(this), ((C1166s) H.a(this.f9762r)).D(j4));
        }
        AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // p0.InterfaceC0980p
    public final Y.d n(InterfaceC0980p interfaceC0980p, boolean z4) {
        if (!O0().f3990s) {
            AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC0980p.p()) {
            AbstractC0864b.D("LayoutCoordinates " + interfaceC0980p + " is not attached!");
            throw null;
        }
        a0 f12 = f1(interfaceC0980p);
        f12.X0();
        a0 K02 = K0(f12);
        Y.b bVar = this.f9756E;
        if (bVar == null) {
            bVar = new Y.b();
            bVar.f4368a = 0.0f;
            bVar.f4369b = 0.0f;
            bVar.f4370c = 0.0f;
            bVar.f4371d = 0.0f;
            this.f9756E = bVar;
        }
        bVar.f4368a = 0.0f;
        bVar.f4369b = 0.0f;
        bVar.f4370c = (int) (interfaceC0980p.K() >> 32);
        bVar.f4371d = (int) (interfaceC0980p.K() & 4294967295L);
        while (f12 != K02) {
            f12.c1(bVar, z4, false);
            if (bVar.b()) {
                return Y.d.f4373e;
            }
            f12 = f12.f9764t;
            Intrinsics.c(f12);
        }
        C0(K02, bVar, z4);
        return new Y.d(bVar.f4368a, bVar.f4369b, bVar.f4370c, bVar.f4371d);
    }

    @Override // p0.InterfaceC0980p
    public final boolean p() {
        return O0().f3990s;
    }

    @Override // M0.b
    public final float q() {
        return this.f9762r.f9610w.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p0.AbstractC0954O, p0.InterfaceC0944E
    public final Object r() {
        E e4 = this.f9762r;
        if (!e4.B.f(64)) {
            return null;
        }
        O0();
        M2.E e5 = new M2.E();
        for (S.n nVar = (o0) e4.B.f2911e; nVar != null; nVar = nVar.f3982k) {
            if ((nVar.f3980i & 64) != 0) {
                AbstractC1073n abstractC1073n = nVar;
                ?? r5 = 0;
                while (abstractC1073n != 0) {
                    if (abstractC1073n instanceof j0) {
                        e5.f3580d = ((j0) abstractC1073n).e0(e5.f3580d);
                    } else if ((abstractC1073n.f3980i & 64) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                        S.n nVar2 = abstractC1073n.f9826u;
                        int i2 = 0;
                        abstractC1073n = abstractC1073n;
                        r5 = r5;
                        while (nVar2 != null) {
                            if ((nVar2.f3980i & 64) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    abstractC1073n = nVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new I.d(new S.n[16]);
                                    }
                                    if (abstractC1073n != 0) {
                                        r5.b(abstractC1073n);
                                        abstractC1073n = 0;
                                    }
                                    r5.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f3983l;
                            abstractC1073n = abstractC1073n;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC1073n = AbstractC1065f.f(r5);
                }
            }
        }
        return e5.f3580d;
    }

    @Override // r0.O
    public final O t0() {
        return this.f9763s;
    }

    @Override // p0.InterfaceC0980p
    public final void u(float[] fArr) {
        g0 a4 = H.a(this.f9762r);
        i1(f1(AbstractC0960V.g(this)), fArr);
        C1166s c1166s = (C1166s) a4;
        c1166s.A();
        Z.E.g(fArr, c1166s.f10335R);
        float d4 = Y.c.d(c1166s.f10339V);
        float e4 = Y.c.e(c1166s.f10339V);
        float[] fArr2 = c1166s.f10334Q;
        Z.E.d(fArr2);
        Z.E.h(fArr2, d4, e4, 0.0f);
        AbstractC1125K.m(fArr, fArr2);
    }

    @Override // r0.O
    public final InterfaceC0980p u0() {
        return this;
    }

    @Override // r0.O
    public final boolean v0() {
        return this.f9753A != null;
    }

    @Override // r0.O
    public final E w0() {
        return this.f9762r;
    }

    @Override // p0.InterfaceC0980p
    public final InterfaceC0980p x() {
        if (O0().f3990s) {
            X0();
            return ((a0) this.f9762r.B.f2910d).f9764t;
        }
        AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // r0.O
    public final InterfaceC0946G x0() {
        InterfaceC0946G interfaceC0946G = this.f9753A;
        if (interfaceC0946G != null) {
            return interfaceC0946G;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p0.InterfaceC0980p
    public final long y(InterfaceC0980p interfaceC0980p, long j4) {
        return W0(interfaceC0980p, j4);
    }

    @Override // r0.O
    public final O y0() {
        return this.f9764t;
    }

    @Override // r0.O
    public final long z0() {
        return this.f9754C;
    }
}
