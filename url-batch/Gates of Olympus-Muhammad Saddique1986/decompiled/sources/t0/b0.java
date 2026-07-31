package t0;

import C0.C0025a;
import I.C0174t;
import a.AbstractC0235a;
import a0.C0237b;
import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import android.os.Build;
import android.view.View;
import b0.C0339h;
import e0.C0416b;
import e2.InterfaceC0424c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import n.z0;
import r0.AbstractC0898U;
import r0.C0883E;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0919p;
import u0.C1113m0;
import u0.C1119p0;
import u0.C1123s;
import u0.E0;
import u0.Q0;
import u0.R0;
import z.C1256t;

/* loaded from: classes.dex */
public abstract class b0 extends P implements InterfaceC0884F, InterfaceC0919p, i0 {

    /* renamed from: H, reason: collision with root package name */
    public static final b0.O f8701H;

    /* renamed from: I, reason: collision with root package name */
    public static final C1007u f8702I;

    /* renamed from: J, reason: collision with root package name */
    public static final float[] f8703J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0991d f8704K;

    /* renamed from: L, reason: collision with root package name */
    public static final C0991d f8705L;

    /* renamed from: A, reason: collision with root package name */
    public float f8706A;

    /* renamed from: B, reason: collision with root package name */
    public C0237b f8707B;
    public C1007u C;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8709F;

    /* renamed from: G, reason: collision with root package name */
    public g0 f8710G;

    /* renamed from: o, reason: collision with root package name */
    public final E f8711o;

    /* renamed from: p, reason: collision with root package name */
    public b0 f8712p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f8713q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8714r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8715s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0424c f8716t;

    /* renamed from: u, reason: collision with root package name */
    public O0.b f8717u;

    /* renamed from: v, reason: collision with root package name */
    public O0.k f8718v;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0886H f8720x;

    /* renamed from: y, reason: collision with root package name */
    public LinkedHashMap f8721y;

    /* renamed from: w, reason: collision with root package name */
    public float f8719w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    public long f8722z = 0;
    public final C0025a D = new C0025a(11, this);

    /* renamed from: E, reason: collision with root package name */
    public final D f8708E = new D(3, this);

    static {
        b0.O o3 = new b0.O();
        o3.f5360e = 1.0f;
        o3.f5361f = 1.0f;
        o3.f5362g = 1.0f;
        long j3 = b0.E.f5348a;
        o3.f5366k = j3;
        o3.f5367l = j3;
        o3.f5371p = 8.0f;
        o3.f5372q = b0.U.f5400b;
        o3.f5373r = b0.M.f5355a;
        o3.f5375t = 0;
        o3.f5376u = 9205357640488583168L;
        o3.f5377v = O2.l.G();
        o3.f5378w = O0.k.f3741d;
        f8701H = o3;
        f8702I = new C1007u();
        f8703J = b0.G.a();
        f8704K = new C0991d(1);
        f8705L = new C0991d(2);
    }

    public b0(E e3) {
        this.f8711o = e3;
        this.f8717u = e3.f8556t;
        this.f8718v = e3.f8557u;
    }

    public static b0 b1(InterfaceC0919p interfaceC0919p) {
        b0 b0Var;
        C0883E c0883e = interfaceC0919p instanceof C0883E ? (C0883E) interfaceC0919p : null;
        if (c0883e != null && (b0Var = c0883e.f8118d.f8658o) != null) {
            return b0Var;
        }
        f2.j.d(interfaceC0919p, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (b0) interfaceC0919p;
    }

    public final long A0(long j3) {
        return AbstractC0235a.e(Math.max(0.0f, (C0241f.d(j3) - c0()) / 2.0f), Math.max(0.0f, (C0241f.b(j3) - ((int) (this.f8128f & 4294967295L))) / 2.0f));
    }

    @Override // r0.InterfaceC0919p
    public final C0239d B(InterfaceC0919p interfaceC0919p, boolean z3) {
        if (!K0().f4501p) {
            z0.o("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC0919p.o()) {
            z0.o("LayoutCoordinates " + interfaceC0919p + " is not attached!");
            throw null;
        }
        b0 b12 = b1(interfaceC0919p);
        b12.T0();
        b0 G02 = G0(b12);
        C0237b c0237b = this.f8707B;
        if (c0237b == null) {
            c0237b = new C0237b();
            c0237b.f4718a = 0.0f;
            c0237b.f4719b = 0.0f;
            c0237b.f4720c = 0.0f;
            c0237b.f4721d = 0.0f;
            this.f8707B = c0237b;
        }
        c0237b.f4718a = 0.0f;
        c0237b.f4719b = 0.0f;
        c0237b.f4720c = (int) (interfaceC0919p.I() >> 32);
        c0237b.f4721d = (int) (interfaceC0919p.I() & 4294967295L);
        while (b12 != G02) {
            b12.Y0(c0237b, z3, false);
            if (c0237b.b()) {
                return C0239d.f4723e;
            }
            b12 = b12.f8713q;
            f2.j.c(b12);
        }
        y0(G02, c0237b, z3);
        return new C0239d(c0237b.f4718a, c0237b.f4719b, c0237b.f4720c, c0237b.f4721d);
    }

    public final float B0(long j3, long j4) {
        if (c0() >= C0241f.d(j4) && ((int) (this.f8128f & 4294967295L)) >= C0241f.b(j4)) {
            return Float.POSITIVE_INFINITY;
        }
        long A02 = A0(j4);
        float d3 = C0241f.d(A02);
        float b3 = C0241f.b(A02);
        float d4 = C0238c.d(j3);
        float max = Math.max(0.0f, d4 < 0.0f ? -d4 : d4 - c0());
        float e3 = C0238c.e(j3);
        long e4 = l0.c.e(max, Math.max(0.0f, e3 < 0.0f ? -e3 : e3 - ((int) (this.f8128f & 4294967295L))));
        if ((d3 <= 0.0f && b3 <= 0.0f) || C0238c.d(e4) > d3 || C0238c.e(e4) > b3) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (e4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e4 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void C0(b0.r rVar, C0416b c0416b) {
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            g0Var.h(rVar, c0416b);
            return;
        }
        long j3 = this.f8722z;
        float f3 = (int) (j3 >> 32);
        float f4 = (int) (j3 & 4294967295L);
        rVar.s(f3, f4);
        E0(rVar, c0416b);
        rVar.s(-f3, -f4);
    }

    public final void D0(b0.r rVar, C0339h c0339h) {
        long j3 = this.f8128f;
        rVar.getClass();
        rVar.b(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, c0339h);
    }

    public final void E0(b0.r rVar, C0416b c0416b) {
        U.p L02 = L0(4);
        if (L02 == null) {
            W0(rVar, c0416b);
            return;
        }
        E e3 = this.f8711o;
        e3.getClass();
        G sharedDrawScope = ((C1123s) H.a(e3)).getSharedDrawScope();
        long f02 = O2.d.f0(this.f8128f);
        sharedDrawScope.getClass();
        K.d dVar = null;
        while (L02 != null) {
            if (L02 instanceof InterfaceC1002o) {
                sharedDrawScope.c(rVar, f02, this, (InterfaceC1002o) L02, c0416b);
            } else if ((L02.f4491f & 4) != 0 && (L02 instanceof AbstractC1000m)) {
                int i3 = 0;
                for (U.p pVar = ((AbstractC1000m) L02).f8771r; pVar != null; pVar = pVar.f4494i) {
                    if ((pVar.f4491f & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            L02 = pVar;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.p[16]);
                            }
                            if (L02 != null) {
                                dVar.b(L02);
                                L02 = null;
                            }
                            dVar.b(pVar);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            L02 = AbstractC0993f.f(dVar);
        }
    }

    public abstract void F0();

    public final b0 G0(b0 b0Var) {
        E e3 = b0Var.f8711o;
        E e4 = this.f8711o;
        if (e3 == e4) {
            U.p K02 = b0Var.K0();
            U.p pVar = K0().f4489d;
            if (!pVar.f4501p) {
                z0.o("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (U.p pVar2 = pVar.f4493h; pVar2 != null; pVar2 = pVar2.f4493h) {
                if ((pVar2.f4491f & 2) != 0 && pVar2 == K02) {
                    return b0Var;
                }
            }
            return this;
        }
        while (e3.f8549m > e4.f8549m) {
            e3 = e3.s();
            f2.j.c(e3);
        }
        E e5 = e4;
        while (e5.f8549m > e3.f8549m) {
            e5 = e5.s();
            f2.j.c(e5);
        }
        while (e3 != e5) {
            e3 = e3.s();
            e5 = e5.s();
            if (e3 == null || e5 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return e5 == e4 ? this : e3 == b0Var.f8711o ? b0Var : (C1006t) e3.f8561y.f2912c;
    }

    public final long H0(long j3, boolean z3) {
        if (z3 || !this.f8652i) {
            long j4 = this.f8722z;
            j3 = l0.c.e(C0238c.d(j3) - ((int) (j4 >> 32)), C0238c.e(j3) - ((int) (j4 & 4294967295L)));
        }
        g0 g0Var = this.f8710G;
        return g0Var != null ? g0Var.d(j3, true) : j3;
    }

    @Override // r0.InterfaceC0919p
    public final long I() {
        return this.f8128f;
    }

    public abstract Q I0();

    public final long J0() {
        return this.f8717u.E(this.f8711o.f8558v.g());
    }

    public abstract U.p K0();

    @Override // t0.i0
    public final boolean L() {
        return (this.f8710G == null || this.f8714r || !this.f8711o.D()) ? false : true;
    }

    public final U.p L0(int i3) {
        boolean h3 = c0.h(i3);
        U.p K02 = K0();
        if (!h3 && (K02 = K02.f4493h) == null) {
            return null;
        }
        for (U.p M02 = M0(h3); M02 != null && (M02.f4492g & i3) != 0; M02 = M02.f4494i) {
            if ((M02.f4491f & i3) != 0) {
                return M02;
            }
            if (M02 == K02) {
                return null;
            }
        }
        return null;
    }

    public final U.p M0(boolean z3) {
        U.p K02;
        C0174t c0174t = this.f8711o.f8561y;
        if (((b0) c0174t.f2913d) == this) {
            return (U.p) c0174t.f2915f;
        }
        if (z3) {
            b0 b0Var = this.f8713q;
            if (b0Var != null && (K02 = b0Var.K0()) != null) {
                return K02.f4494i;
            }
        } else {
            b0 b0Var2 = this.f8713q;
            if (b0Var2 != null) {
                return b0Var2.K0();
            }
        }
        return null;
    }

    @Override // r0.InterfaceC0919p
    public final long N(long j3) {
        if (!K0().f4501p) {
            z0.o("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        T0();
        for (b0 b0Var = this; b0Var != null; b0Var = b0Var.f8713q) {
            j3 = b0Var.c1(j3, true);
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [U.p] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void N0(U.p pVar, C0991d c0991d, long j3, r rVar, boolean z3, boolean z4) {
        if (pVar == null) {
            P0(c0991d, j3, rVar, z3, z4);
            return;
        }
        rVar.c(pVar, -1.0f, z4, new Z(this, pVar, c0991d, j3, rVar, z3, z4));
        b0 b0Var = pVar.f4496k;
        if (b0Var != null) {
            U.p M02 = b0Var.M0(c0.h(16));
            if (M02 != null && M02.f4501p) {
                U.p pVar2 = M02.f4489d;
                if (!pVar2.f4501p) {
                    z0.o("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((pVar2.f4492g & 16) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f4491f & 16) != 0) {
                            AbstractC1000m abstractC1000m = pVar2;
                            ?? r5 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof m0) {
                                    if (((m0) abstractC1000m).B()) {
                                        return;
                                    }
                                } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar3 = abstractC1000m.f8771r;
                                    int i3 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r5 = r5;
                                    while (pVar3 != null) {
                                        if ((pVar3.f4491f & 16) != 0) {
                                            i3++;
                                            r5 = r5;
                                            if (i3 == 1) {
                                                abstractC1000m = pVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r5.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r5.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r5 = r5;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r5);
                            }
                        }
                        pVar2 = pVar2.f4494i;
                    }
                }
            }
            rVar.f8787h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (t0.AbstractC0993f.h(r21.b(), t0.AbstractC0993f.a(r15, r23)) > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(C0991d c0991d, long j3, r rVar, boolean z3, boolean z4) {
        b0 b0Var;
        U.p L02 = L0(c0991d.a());
        if (!h1(j3)) {
            if (z3) {
                float B02 = B0(j3, J0());
                if (Float.isInfinite(B02) || Float.isNaN(B02)) {
                    return;
                }
                if (rVar.f8785f != S1.m.z0(rVar)) {
                    if (AbstractC0993f.h(rVar.b(), AbstractC0993f.a(B02, false)) <= 0) {
                        return;
                    }
                }
                boolean z5 = false;
                if (L02 == null) {
                    P0(c0991d, j3, rVar, z3, false);
                    return;
                } else {
                    rVar.c(L02, B02, false, new a0(this, L02, c0991d, j3, rVar, z3, z5, B02, 0));
                    return;
                }
            }
            return;
        }
        if (L02 == null) {
            P0(c0991d, j3, rVar, z3, z4);
            return;
        }
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        if (d3 < 0.0f || e3 < 0.0f || d3 >= c0()) {
            b0Var = this;
        } else {
            b0Var = this;
            if (e3 < ((int) (b0Var.f8128f & 4294967295L))) {
                N0(L02, c0991d, j3, rVar, z3, z4);
                return;
            }
        }
        float B03 = !z3 ? Float.POSITIVE_INFINITY : b0Var.B0(j3, J0());
        if (!Float.isInfinite(B03) && !Float.isNaN(B03)) {
            if (rVar.f8785f != S1.m.z0(rVar)) {
            }
            rVar.c(L02, B03, z4, new a0(this, L02, c0991d, j3, rVar, z3, z4, B03, 0));
            return;
        }
        a1(L02, c0991d, j3, rVar, z3, z4, B03);
    }

    @Override // r0.InterfaceC0919p
    public final long P(InterfaceC0919p interfaceC0919p, long j3) {
        return S0(interfaceC0919p, j3);
    }

    public void P0(C0991d c0991d, long j3, r rVar, boolean z3, boolean z4) {
        b0 b0Var = this.f8712p;
        if (b0Var != null) {
            b0Var.O0(c0991d, b0Var.H0(j3, true), rVar, z3, z4);
        }
    }

    public final void Q0() {
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            g0Var.invalidate();
            return;
        }
        b0 b0Var = this.f8713q;
        if (b0Var != null) {
            b0Var.Q0();
        }
    }

    public final boolean R0() {
        if (this.f8710G != null && this.f8719w <= 0.0f) {
            return true;
        }
        b0 b0Var = this.f8713q;
        if (b0Var != null) {
            return b0Var.R0();
        }
        return false;
    }

    public final long S0(InterfaceC0919p interfaceC0919p, long j3) {
        if (interfaceC0919p instanceof C0883E) {
            ((C0883E) interfaceC0919p).f8118d.f8658o.T0();
            return ((C0883E) interfaceC0919p).b(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        b0 b12 = b1(interfaceC0919p);
        b12.T0();
        b0 G02 = G0(b12);
        while (b12 != G02) {
            j3 = b12.c1(j3, true);
            b12 = b12.f8713q;
            f2.j.c(b12);
        }
        return z0(G02, j3);
    }

    public final void T0() {
        M m3 = this.f8711o.f8562z;
        int i3 = m3.f8625a.f8562z.f8627c;
        if (i3 == 3 || i3 == 4) {
            if (m3.f8642r.f8622z) {
                m3.e(true);
            } else {
                m3.d(true);
            }
        }
        if (i3 == 4) {
            J j3 = m3.f8643s;
            if (j3 == null || !j3.f8594w) {
                m3.f(true);
            } else {
                m3.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void U0() {
        U.p pVar;
        U.p M02 = M0(c0.h(128));
        if (M02 == null || (M02.f4489d.f4492g & 128) == 0) {
            return;
        }
        S.i c2 = S.u.c();
        InterfaceC0424c f3 = c2 != null ? c2.f() : null;
        S.i d3 = S.u.d(c2);
        try {
            boolean h3 = c0.h(128);
            if (h3) {
                pVar = K0();
            } else {
                pVar = K0().f4493h;
                if (pVar == null) {
                }
            }
            for (U.p M03 = M0(h3); M03 != null; M03 = M03.f4494i) {
                if ((M03.f4492g & 128) == 0) {
                    break;
                }
                if ((M03.f4491f & 128) != 0) {
                    ?? r8 = 0;
                    AbstractC1000m abstractC1000m = M03;
                    while (abstractC1000m != 0) {
                        if (abstractC1000m instanceof InterfaceC1008v) {
                            ((InterfaceC1008v) abstractC1000m).C(this.f8128f);
                        } else if ((abstractC1000m.f4491f & 128) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                            U.p pVar2 = abstractC1000m.f8771r;
                            int i3 = 0;
                            abstractC1000m = abstractC1000m;
                            r8 = r8;
                            while (pVar2 != null) {
                                if ((pVar2.f4491f & 128) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        abstractC1000m = pVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new K.d(new U.p[16]);
                                        }
                                        if (abstractC1000m != 0) {
                                            r8.b(abstractC1000m);
                                            abstractC1000m = 0;
                                        }
                                        r8.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f4494i;
                                abstractC1000m = abstractC1000m;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC1000m = AbstractC0993f.f(r8);
                    }
                }
                if (M03 == pVar) {
                    break;
                }
            }
        } finally {
            S.u.f(c2, d3, f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void V0() {
        boolean h3 = c0.h(128);
        U.p K02 = K0();
        if (!h3 && (K02 = K02.f4493h) == null) {
            return;
        }
        for (U.p M02 = M0(h3); M02 != null && (M02.f4492g & 128) != 0; M02 = M02.f4494i) {
            if ((M02.f4491f & 128) != 0) {
                AbstractC1000m abstractC1000m = M02;
                ?? r5 = 0;
                while (abstractC1000m != 0) {
                    if (abstractC1000m instanceof InterfaceC1008v) {
                        ((InterfaceC1008v) abstractC1000m).v(this);
                    } else if ((abstractC1000m.f4491f & 128) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                        U.p pVar = abstractC1000m.f8771r;
                        int i3 = 0;
                        abstractC1000m = abstractC1000m;
                        r5 = r5;
                        while (pVar != null) {
                            if ((pVar.f4491f & 128) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC1000m = pVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new K.d(new U.p[16]);
                                    }
                                    if (abstractC1000m != 0) {
                                        r5.b(abstractC1000m);
                                        abstractC1000m = 0;
                                    }
                                    r5.b(pVar);
                                }
                            }
                            pVar = pVar.f4494i;
                            abstractC1000m = abstractC1000m;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC1000m = AbstractC0993f.f(r5);
                }
            }
            if (M02 == K02) {
                return;
            }
        }
    }

    public abstract void W0(b0.r rVar, C0416b c0416b);

    public final void X0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        f1(interfaceC0424c, false);
        if (!O0.h.a(this.f8722z, j3)) {
            this.f8722z = j3;
            E e3 = this.f8711o;
            e3.f8562z.f8642r.q0();
            g0 g0Var = this.f8710G;
            if (g0Var != null) {
                g0Var.e(j3);
            } else {
                b0 b0Var = this.f8713q;
                if (b0Var != null) {
                    b0Var.Q0();
                }
            }
            P.w0(this);
            C1123s c1123s = e3.f8548l;
            if (c1123s != null) {
                c1123s.x(e3);
            }
        }
        this.f8706A = f3;
        if (this.f8654k) {
            return;
        }
        o0(new l0(t0(), this));
    }

    public final void Y0(C0237b c0237b, boolean z3, boolean z4) {
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            if (this.f8715s) {
                if (z4) {
                    long J02 = J0();
                    float d3 = C0241f.d(J02) / 2.0f;
                    float b3 = C0241f.b(J02) / 2.0f;
                    long j3 = this.f8128f;
                    c0237b.a(-d3, -b3, ((int) (j3 >> 32)) + d3, ((int) (j3 & 4294967295L)) + b3);
                } else if (z3) {
                    long j4 = this.f8128f;
                    c0237b.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (c0237b.b()) {
                    return;
                }
            }
            g0Var.b(c0237b, false);
        }
        long j5 = this.f8722z;
        float f3 = (int) (j5 >> 32);
        c0237b.f4718a += f3;
        c0237b.f4720c += f3;
        float f4 = (int) (j5 & 4294967295L);
        c0237b.f4719b += f4;
        c0237b.f4721d += f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r7v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void Z0(InterfaceC0886H interfaceC0886H) {
        b0 b0Var;
        InterfaceC0886H interfaceC0886H2 = this.f8720x;
        if (interfaceC0886H != interfaceC0886H2) {
            this.f8720x = interfaceC0886H;
            E e3 = this.f8711o;
            if (interfaceC0886H2 == null || interfaceC0886H.f() != interfaceC0886H2.f() || interfaceC0886H.h() != interfaceC0886H2.h()) {
                int f3 = interfaceC0886H.f();
                int h3 = interfaceC0886H.h();
                g0 g0Var = this.f8710G;
                if (g0Var != null) {
                    g0Var.g(O2.d.d(f3, h3));
                } else if (e3.E() && (b0Var = this.f8713q) != null) {
                    b0Var.Q0();
                }
                g0(O2.d.d(f3, h3));
                if (this.f8716t != null) {
                    g1(false);
                }
                boolean h4 = c0.h(4);
                U.p K02 = K0();
                if (h4 || (K02 = K02.f4493h) != null) {
                    for (U.p M02 = M0(h4); M02 != null && (M02.f4492g & 4) != 0; M02 = M02.f4494i) {
                        if ((M02.f4491f & 4) != 0) {
                            AbstractC1000m abstractC1000m = M02;
                            ?? r7 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof InterfaceC1002o) {
                                    ((InterfaceC1002o) abstractC1000m).V();
                                } else if ((abstractC1000m.f4491f & 4) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar = abstractC1000m.f8771r;
                                    int i3 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r7 = r7;
                                    while (pVar != null) {
                                        if ((pVar.f4491f & 4) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                abstractC1000m = pVar;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r7.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r7.b(pVar);
                                            }
                                        }
                                        pVar = pVar.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r7);
                            }
                        }
                        if (M02 == K02) {
                            break;
                        }
                    }
                }
                C1123s c1123s = e3.f8548l;
                if (c1123s != null) {
                    c1123s.x(e3);
                }
            }
            LinkedHashMap linkedHashMap = this.f8721y;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && interfaceC0886H.i().isEmpty()) || f2.j.a(interfaceC0886H.i(), this.f8721y)) {
                return;
            }
            e3.f8562z.f8642r.f8619w.f();
            LinkedHashMap linkedHashMap2 = this.f8721y;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f8721y = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0886H.i());
        }
    }

    @Override // O0.b
    public final float a() {
        return this.f8711o.f8556t.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r2v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [K.d] */
    public final void a1(U.p pVar, C0991d c0991d, long j3, r rVar, boolean z3, boolean z4, float f3) {
        boolean z5;
        if (pVar == null) {
            P0(c0991d, j3, rVar, z3, z4);
            return;
        }
        switch (c0991d.f8727d) {
            case 1:
                ?? r22 = 0;
                AbstractC1000m abstractC1000m = pVar;
                while (true) {
                    int i3 = 0;
                    if (abstractC1000m == 0) {
                        z5 = false;
                        break;
                    } else {
                        if (abstractC1000m instanceof m0) {
                            if (((m0) abstractC1000m).W()) {
                                z5 = true;
                                break;
                            }
                        } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                            U.p pVar2 = abstractC1000m.f8771r;
                            abstractC1000m = abstractC1000m;
                            r22 = r22;
                            while (pVar2 != null) {
                                if ((pVar2.f4491f & 16) != 0) {
                                    i3++;
                                    r22 = r22;
                                    if (i3 == 1) {
                                        abstractC1000m = pVar2;
                                    } else {
                                        if (r22 == 0) {
                                            r22 = new K.d(new U.p[16]);
                                        }
                                        if (abstractC1000m != 0) {
                                            r22.b(abstractC1000m);
                                            abstractC1000m = 0;
                                        }
                                        r22.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f4494i;
                                abstractC1000m = abstractC1000m;
                                r22 = r22;
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC1000m = AbstractC0993f.f(r22);
                    }
                }
                break;
            default:
                z5 = false;
                break;
        }
        if (!z5) {
            a1(AbstractC0993f.e(pVar, c0991d.a()), c0991d, j3, rVar, z3, z4, f3);
            return;
        }
        a0 a0Var = new a0(this, pVar, c0991d, j3, rVar, z3, z4, f3, 1);
        if (rVar.f8785f == S1.m.z0(rVar)) {
            rVar.c(pVar, f3, z4, a0Var);
            if (rVar.f8785f + 1 == S1.m.z0(rVar)) {
                rVar.d();
                return;
            }
            return;
        }
        long b3 = rVar.b();
        int i4 = rVar.f8785f;
        rVar.f8785f = S1.m.z0(rVar);
        rVar.c(pVar, f3, z4, a0Var);
        if (rVar.f8785f + 1 < S1.m.z0(rVar) && AbstractC0993f.h(b3, rVar.b()) > 0) {
            int i5 = rVar.f8785f + 1;
            int i6 = i4 + 1;
            Object[] objArr = rVar.f8783d;
            S1.k.m0(objArr, objArr, i6, i5, rVar.f8786g);
            long[] jArr = rVar.f8784e;
            System.arraycopy(jArr, i5, jArr, i6, rVar.f8786g - i5);
            rVar.f8785f = ((rVar.f8786g + i4) - rVar.f8785f) - 1;
        }
        rVar.d();
        rVar.f8785f = i4;
    }

    public final long c1(long j3, boolean z3) {
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            j3 = g0Var.d(j3, false);
        }
        if (!z3 && this.f8652i) {
            return j3;
        }
        long j4 = this.f8722z;
        return l0.c.e(C0238c.d(j3) + ((int) (j4 >> 32)), C0238c.e(j3) + ((int) (j4 & 4294967295L)));
    }

    public final void d1(b0 b0Var, float[] fArr) {
        if (f2.j.a(b0Var, this)) {
            return;
        }
        b0 b0Var2 = this.f8713q;
        f2.j.c(b0Var2);
        b0Var2.d1(b0Var, fArr);
        if (!O0.h.a(this.f8722z, 0L)) {
            float[] fArr2 = f8703J;
            b0.G.d(fArr2);
            long j3 = this.f8722z;
            b0.G.h(fArr2, -((int) (j3 >> 32)), -((int) (j3 & 4294967295L)), 0.0f);
            b0.G.g(fArr, fArr2);
        }
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            g0Var.a(fArr);
        }
    }

    public final void e1(b0 b0Var, float[] fArr) {
        b0 b0Var2 = this;
        while (!b0Var2.equals(b0Var)) {
            g0 g0Var = b0Var2.f8710G;
            if (g0Var != null) {
                g0Var.i(fArr);
            }
            if (!O0.h.a(b0Var2.f8722z, 0L)) {
                float[] fArr2 = f8703J;
                b0.G.d(fArr2);
                b0.G.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L), 0.0f);
                b0.G.g(fArr, fArr2);
            }
            b0Var2 = b0Var2.f8713q;
            f2.j.c(b0Var2);
        }
    }

    @Override // r0.InterfaceC0919p
    public final long f(long j3) {
        if (!K0().f4501p) {
            z0.o("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        InterfaceC0919p g3 = AbstractC0898U.g(this);
        C1123s c1123s = (C1123s) H.a(this.f8711o);
        c1123s.B();
        return S0(g3, C0238c.g(b0.G.b(j3, c1123s.f9466P), g3.N(0L)));
    }

    public final void f1(InterfaceC0424c interfaceC0424c, boolean z3) {
        C1123s c1123s;
        Reference poll;
        K.d dVar;
        Object obj;
        E e3 = this.f8711o;
        boolean z4 = (!z3 && this.f8716t == interfaceC0424c && f2.j.a(this.f8717u, e3.f8556t) && this.f8718v == e3.f8557u) ? false : true;
        this.f8717u = e3.f8556t;
        this.f8718v = e3.f8557u;
        boolean D = e3.D();
        D d3 = this.f8708E;
        if (!D || interfaceC0424c == null) {
            this.f8716t = null;
            g0 g0Var = this.f8710G;
            if (g0Var != null) {
                g0Var.c();
                e3.C = true;
                d3.b();
                if (K0().f4501p && (c1123s = e3.f8548l) != null) {
                    c1123s.x(e3);
                }
            }
            this.f8710G = null;
            this.f8709F = false;
            return;
        }
        this.f8716t = interfaceC0424c;
        if (this.f8710G != null) {
            if (z4) {
                g1(true);
                return;
            }
            return;
        }
        C1123s c1123s2 = (C1123s) H.a(e3);
        C0025a c0025a = this.D;
        do {
            C1256t c1256t = c1123s2.f9505r0;
            poll = ((ReferenceQueue) c1256t.f10467f).poll();
            dVar = (K.d) c1256t.f10466e;
            if (poll != null) {
                dVar.n(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.m()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.o(dVar.f3216f - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        g0 g0Var2 = (g0) obj;
        if (g0Var2 != null) {
            g0Var2.j(c0025a, d3);
        } else if (!c1123s2.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (c1123s2.isHardwareAccelerated() && c1123s2.f9470T) {
                try {
                    g0Var2 = new E0(c1123s2, c0025a, d3);
                } catch (Throwable unused) {
                    c1123s2.f9470T = false;
                }
            }
            if (c1123s2.f9457G == null) {
                if (!Q0.f9248v) {
                    u0.L.B(new View(c1123s2.getContext()));
                }
                C1113m0 c1113m0 = Q0.f9249w ? new C1113m0(c1123s2.getContext()) : new R0(c1123s2.getContext());
                c1123s2.f9457G = c1113m0;
                c1123s2.addView(c1113m0, -1);
            }
            C1113m0 c1113m02 = c1123s2.f9457G;
            f2.j.c(c1113m02);
            g0Var2 = new Q0(c1123s2, c1113m02, c0025a, d3);
        } else {
            g0Var2 = new C1119p0(c1123s2.getGraphicsContext().b(), c1123s2.getGraphicsContext(), c1123s2, c0025a, d3);
        }
        g0Var2.g(this.f8128f);
        g0Var2.e(this.f8722z);
        this.f8710G = g0Var2;
        g1(true);
        e3.C = true;
        d3.b();
    }

    public final void g1(boolean z3) {
        C1123s c1123s;
        g0 g0Var = this.f8710G;
        if (g0Var == null) {
            if (this.f8716t == null) {
                return;
            }
            z0.o("null layer with a non-null layerBlock");
            throw null;
        }
        InterfaceC0424c interfaceC0424c = this.f8716t;
        if (interfaceC0424c == null) {
            z0.p("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        b0.O o3 = f8701H;
        o3.f(1.0f);
        o3.g(1.0f);
        o3.b(1.0f);
        if (o3.f5363h != 0.0f) {
            o3.f5359d |= 8;
            o3.f5363h = 0.0f;
        }
        if (o3.f5364i != 0.0f) {
            o3.f5359d |= 16;
            o3.f5364i = 0.0f;
        }
        o3.h(0.0f);
        long j3 = b0.E.f5348a;
        o3.c(j3);
        o3.j(j3);
        if (o3.f5368m != 0.0f) {
            o3.f5359d |= 256;
            o3.f5368m = 0.0f;
        }
        if (o3.f5369n != 0.0f) {
            o3.f5359d |= 512;
            o3.f5369n = 0.0f;
        }
        if (o3.f5370o != 0.0f) {
            o3.f5359d |= 1024;
            o3.f5370o = 0.0f;
        }
        if (o3.f5371p != 8.0f) {
            o3.f5359d |= 2048;
            o3.f5371p = 8.0f;
        }
        o3.m(b0.U.f5400b);
        o3.i(b0.M.f5355a);
        o3.e(false);
        if (!f2.j.a(null, null)) {
            o3.f5359d |= 131072;
        }
        if (!b0.M.q(o3.f5375t, 0)) {
            o3.f5359d |= 32768;
            o3.f5375t = 0;
        }
        o3.f5376u = 9205357640488583168L;
        o3.f5379x = null;
        o3.f5359d = 0;
        E e3 = this.f8711o;
        o3.f5377v = e3.f8556t;
        o3.f5378w = e3.f8557u;
        o3.f5376u = O2.d.f0(this.f8128f);
        ((C1123s) H.a(e3)).getSnapshotObserver().a(this, C0992e.f8731i, new D(4, interfaceC0424c));
        C1007u c1007u = this.C;
        if (c1007u == null) {
            c1007u = new C1007u();
            this.C = c1007u;
        }
        c1007u.f8791a = o3.f5360e;
        c1007u.f8792b = o3.f5361f;
        c1007u.f8793c = o3.f5363h;
        c1007u.f8794d = o3.f5364i;
        c1007u.f8795e = o3.f5368m;
        c1007u.f8796f = o3.f5369n;
        c1007u.f8797g = o3.f5370o;
        c1007u.f8798h = o3.f5371p;
        c1007u.f8799i = o3.f5372q;
        g0Var.l(o3);
        this.f8715s = o3.f5374s;
        this.f8719w = o3.f5362g;
        if (!z3 || (c1123s = e3.f8548l) == null) {
            return;
        }
        c1123s.x(e3);
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8711o.f8557u;
    }

    public final boolean h1(long j3) {
        long j4 = 9187343241974906880L ^ (j3 & 9187343241974906880L);
        if (((~j4) & (j4 - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        g0 g0Var = this.f8710G;
        return g0Var == null || !this.f8715s || g0Var.k(j3);
    }

    @Override // r0.InterfaceC0919p
    public final long m(long j3) {
        long N3 = N(j3);
        C1123s c1123s = (C1123s) H.a(this.f8711o);
        c1123s.B();
        return b0.G.b(N3, c1123s.f9465O);
    }

    @Override // r0.InterfaceC0919p
    public final long n(long j3) {
        if (K0().f4501p) {
            return S0(AbstractC0898U.g(this), ((C1123s) H.a(this.f8711o)).E(j3));
        }
        z0.o("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // r0.InterfaceC0919p
    public final boolean o() {
        return K0().f4501p;
    }

    @Override // t0.P
    public final P p0() {
        return this.f8712p;
    }

    @Override // O0.b
    public final float r() {
        return this.f8711o.f8556t.r();
    }

    @Override // t0.P
    public final boolean r0() {
        return this.f8720x != null;
    }

    @Override // t0.P
    public final E s0() {
        return this.f8711o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U.p] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U.p] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // r0.AbstractC0893O, r0.InterfaceC0884F
    public final Object t() {
        E e3 = this.f8711o;
        if (!e3.f8561y.f(64)) {
            return null;
        }
        K0();
        Object obj = null;
        for (U.p pVar = (p0) e3.f8561y.f2914e; pVar != null; pVar = pVar.f4493h) {
            if ((pVar.f4491f & 64) != 0) {
                AbstractC1000m abstractC1000m = pVar;
                ?? r5 = 0;
                while (abstractC1000m != 0) {
                    if (abstractC1000m instanceof k0) {
                        obj = ((k0) abstractC1000m).U(obj);
                    } else if ((abstractC1000m.f4491f & 64) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                        U.p pVar2 = abstractC1000m.f8771r;
                        int i3 = 0;
                        abstractC1000m = abstractC1000m;
                        r5 = r5;
                        while (pVar2 != null) {
                            if ((pVar2.f4491f & 64) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC1000m = pVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new K.d(new U.p[16]);
                                    }
                                    if (abstractC1000m != 0) {
                                        r5.b(abstractC1000m);
                                        abstractC1000m = 0;
                                    }
                                    r5.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f4494i;
                            abstractC1000m = abstractC1000m;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC1000m = AbstractC0993f.f(r5);
                }
            }
        }
        return obj;
    }

    @Override // t0.P
    public final InterfaceC0886H t0() {
        InterfaceC0886H interfaceC0886H = this.f8720x;
        if (interfaceC0886H != null) {
            return interfaceC0886H;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // r0.InterfaceC0919p
    public final void u(float[] fArr) {
        h0 a3 = H.a(this.f8711o);
        e1(b1(AbstractC0898U.g(this)), fArr);
        C1123s c1123s = (C1123s) a3;
        c1123s.B();
        b0.G.g(fArr, c1123s.f9465O);
        float d3 = C0238c.d(c1123s.f9469S);
        float e3 = C0238c.e(c1123s.f9469S);
        float[] fArr2 = c1123s.f9464N;
        b0.G.d(fArr2);
        b0.G.h(fArr2, d3, e3, 0.0f);
        u0.L.x(fArr, fArr2);
    }

    @Override // t0.P
    public final P u0() {
        return this.f8713q;
    }

    @Override // r0.InterfaceC0919p
    public final InterfaceC0919p v() {
        if (K0().f4501p) {
            T0();
            return ((b0) this.f8711o.f8561y.f2913d).f8713q;
        }
        z0.o("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // t0.P
    public final long v0() {
        return this.f8722z;
    }

    @Override // r0.InterfaceC0919p
    public final void w(InterfaceC0919p interfaceC0919p, float[] fArr) {
        b0 b12 = b1(interfaceC0919p);
        b12.T0();
        b0 G02 = G0(b12);
        b0.G.d(fArr);
        b12.e1(G02, fArr);
        d1(G02, fArr);
    }

    @Override // t0.P
    public final void x0() {
        f0(this.f8722z, this.f8706A, this.f8716t);
    }

    public final void y0(b0 b0Var, C0237b c0237b, boolean z3) {
        if (b0Var == this) {
            return;
        }
        b0 b0Var2 = this.f8713q;
        if (b0Var2 != null) {
            b0Var2.y0(b0Var, c0237b, z3);
        }
        long j3 = this.f8722z;
        float f3 = (int) (j3 >> 32);
        c0237b.f4718a -= f3;
        c0237b.f4720c -= f3;
        float f4 = (int) (j3 & 4294967295L);
        c0237b.f4719b -= f4;
        c0237b.f4721d -= f4;
        g0 g0Var = this.f8710G;
        if (g0Var != null) {
            g0Var.b(c0237b, true);
            if (this.f8715s && z3) {
                long j4 = this.f8128f;
                c0237b.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    public final long z0(b0 b0Var, long j3) {
        if (b0Var == this) {
            return j3;
        }
        b0 b0Var2 = this.f8713q;
        return (b0Var2 == null || f2.j.a(b0Var, b0Var2)) ? H0(j3, true) : H0(b0Var2.z0(b0Var, j3), true);
    }

    @Override // t0.P
    public final InterfaceC0919p q0() {
        return this;
    }
}
