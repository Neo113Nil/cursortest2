package c2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o0 extends a2.o0 implements a2.i0, y0 {
    public s.h0 A;

    /* renamed from: t, reason: collision with root package name */
    public l0 f1631t;

    /* renamed from: u, reason: collision with root package name */
    public Function1 f1632u;

    /* renamed from: v, reason: collision with root package name */
    public s1 f1633v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1634w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1635x;

    /* renamed from: y, reason: collision with root package name */
    public final a2.d0 f1636y = new a2.d0(0, this);

    /* renamed from: z, reason: collision with root package name */
    public w1 f1637z;

    public static void p0(i1 i1Var) {
        h0 h0Var;
        i1 i1Var2 = i1Var.C;
        g0 g0Var = i1Var.B;
        if (!Intrinsics.a(i1Var2 != null ? i1Var2.B : null, g0Var)) {
            g0Var.T.f1606p.K.f();
            return;
        }
        a A = g0Var.T.f1606p.A();
        if (A == null || (h0Var = ((w0) A).K) == null) {
            return;
        }
        h0Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(g0 g0Var, a2.k kVar) {
        char c10;
        long j;
        long j3;
        long j10;
        s.h0 h0Var;
        s.h0 h0Var2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i3;
        char c11;
        long j12;
        long j13;
        int i10;
        int i11;
        int i12;
        s.h0 h0Var3 = this.A;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        int i13 = 8;
        if (h0Var3 != null) {
            Object[] objArr = h0Var3.f8314c;
            long[] jArr3 = h0Var3.f8312a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                long j15 = 128;
                while (true) {
                    long j16 = jArr3[i14];
                    j3 = 255;
                    if ((((~j16) << c12) & j16 & j14) != j14) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j16 & 255) < j15) {
                                c11 = c12;
                                s.i0 i0Var = (s.i0) objArr[(i14 << 3) + i16];
                                j12 = j14;
                                Object[] objArr2 = i0Var.f8320b;
                                long[] jArr4 = i0Var.f8319a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j13 = j15;
                                    int i17 = 0;
                                    int i18 = i13;
                                    while (true) {
                                        int i19 = length2;
                                        long j17 = jArr4[i17];
                                        jArr2 = jArr3;
                                        j11 = j16;
                                        if ((((~j17) << c11) & j17 & j12) != j12) {
                                            int i20 = 8 - ((~(i17 - i19)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j17 & 255) < j13) {
                                                    int i22 = (i17 << 3) + i21;
                                                    g0 g0Var2 = (g0) ((d2) objArr2[i22]).get();
                                                    i11 = i21;
                                                    if (g0Var2 != null) {
                                                        boolean E = g0Var2.E();
                                                        i12 = i16;
                                                        if (E) {
                                                        }
                                                    } else {
                                                        i12 = i16;
                                                    }
                                                    i0Var.l(i22);
                                                } else {
                                                    i11 = i21;
                                                    i12 = i16;
                                                }
                                                j17 >>= i18;
                                                i21 = i11 + 1;
                                                i16 = i12;
                                            }
                                            i3 = i16;
                                            if (i20 != i18) {
                                                break;
                                            }
                                        } else {
                                            i3 = i16;
                                        }
                                        length2 = i19;
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        jArr3 = jArr2;
                                        j16 = j11;
                                        i16 = i3;
                                        i18 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j11 = j16;
                                    i3 = i16;
                                    j13 = j15;
                                }
                                i10 = 8;
                            } else {
                                jArr2 = jArr3;
                                j11 = j16;
                                i3 = i16;
                                c11 = c12;
                                j12 = j14;
                                j13 = j15;
                                i10 = i13;
                            }
                            i13 = i10;
                            j16 = j11 >> i10;
                            c12 = c11;
                            j14 = j12;
                            j15 = j13;
                            i16 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c10 = c12;
                        j = j14;
                        j10 = j15;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c10 = c12;
                        j = j14;
                        j10 = j15;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    c12 = c10;
                    j14 = j;
                    j15 = j10;
                    jArr3 = jArr;
                    i13 = 8;
                }
                h0Var = this.A;
                if (h0Var != null) {
                    long[] jArr5 = h0Var.f8312a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i23 = 0;
                        while (true) {
                            long j18 = jArr5[i23];
                            if ((((~j18) << c10) & j18 & j) != j) {
                                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                for (int i25 = 0; i25 < i24; i25++) {
                                    if ((j18 & j3) < j10) {
                                        int i26 = (i23 << 3) + i25;
                                        if (((s.i0) h0Var.f8314c[i26]).g()) {
                                            h0Var.l(i26);
                                        }
                                    }
                                    j18 >>= 8;
                                }
                                if (i24 != 8) {
                                    break;
                                }
                            }
                            if (i23 == length3) {
                                break;
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                h0Var2 = this.A;
                if (h0Var2 == null) {
                    h0Var2 = new s.h0();
                    this.A = h0Var2;
                }
                g = h0Var2.g(kVar);
                if (g == null) {
                    g = new s.i0();
                    h0Var2.m(kVar, g);
                }
                ((s.i0) g).i(new d2(g0Var));
            }
        }
        c10 = 7;
        j = -9187201950435737472L;
        j3 = 255;
        j10 = 128;
        h0Var = this.A;
        if (h0Var != null) {
        }
        h0Var2 = this.A;
        if (h0Var2 == null) {
        }
        g = h0Var2.g(kVar);
        if (g == null) {
        }
        ((s.i0) g).i(new d2(g0Var));
    }

    public abstract int d0(a2.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(s1 s1Var, long j, long j3) {
        boolean z10;
        char c10;
        long j10;
        long j11;
        long j12;
        g0 g0Var;
        boolean z11;
        int i3;
        char c11;
        long j13;
        q1 snapshotObserver;
        s.h0 h0Var = this.A;
        w1 w1Var = this.f1637z;
        if (w1Var == null) {
            w1Var = new w1();
            this.f1637z = w1Var;
        }
        w1 w1Var2 = w1Var;
        d2.v vVar = k0().B;
        if (vVar != null && (snapshotObserver = vVar.getSnapshotObserver()) != null) {
            snapshotObserver.f1645a.c(s1Var, d.f1512i, new m0(this, j, j3, s1Var));
        }
        boolean j14 = j();
        s.i0 i0Var = (s.i0) w1Var2.f1698e;
        s.i0 i0Var2 = (s.i0) w1Var2.f1699f;
        int i10 = w1Var2.f1694a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) w1Var2.f1697d)[i11];
            if (b10 == 3) {
                a2.k kVar = ((a2.k[]) w1Var2.f1695b)[i11];
                kVar.getClass();
                i0Var2.i(kVar);
            } else if (b10 != 0 && h0Var != null) {
                a2.k kVar2 = ((a2.k[]) w1Var2.f1695b)[i11];
                kVar2.getClass();
                s.i0 i0Var3 = (s.i0) h0Var.k(kVar2);
                if (i0Var3 != null) {
                    i0Var.j(i0Var3);
                }
            }
        }
        int i12 = w1Var2.f1694a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) w1Var2.f1697d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                a2.k[] kVarArr = (a2.k[]) w1Var2.f1695b;
                kVarArr[i14 - i13] = kVarArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = w1Var2.f1694a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((a2.k[]) w1Var2.f1695b)[i16] = null;
        }
        w1Var2.f1694a -= i13;
        o0 m02 = m0();
        Object[] objArr = i0Var2.f8320b;
        long[] jArr = i0Var2.f8319a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            j11 = 128;
            int i18 = 0;
            while (true) {
                long j16 = jArr[i18];
                j12 = 255;
                if ((((~j16) << c12) & j16 & j15) != j15) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j16 & 255) < 128) {
                            c11 = c12;
                            a2.k kVar3 = (a2.k) objArr[(i18 << 3) + i20];
                            j13 = j15;
                            o0 o0Var = m02 == null ? this : m02;
                            i3 = i17;
                            o0 o0Var2 = o0Var;
                            while (true) {
                                w1 w1Var3 = o0Var2.f1637z;
                                if (w1Var3 != null) {
                                    z11 = j14;
                                    if (kotlin.collections.w.l((a2.k[]) w1Var3.f1695b, kVar3)) {
                                        break;
                                    }
                                } else {
                                    z11 = j14;
                                }
                                o0 m03 = o0Var2.m0();
                                if (m03 == null) {
                                    break;
                                }
                                o0Var2 = m03;
                                j14 = z11;
                            }
                            s.h0 h0Var2 = o0Var2.A;
                            s.i0 i0Var4 = h0Var2 != null ? (s.i0) h0Var2.k(kVar3) : null;
                            if (i0Var4 != null) {
                                o0Var.q0(i0Var4);
                            }
                        } else {
                            z11 = j14;
                            i3 = i17;
                            c11 = c12;
                            j13 = j15;
                        }
                        j16 >>= i3;
                        i20++;
                        c12 = c11;
                        j15 = j13;
                        i17 = i3;
                        j14 = z11;
                    }
                    z10 = j14;
                    c10 = c12;
                    j10 = j15;
                    if (i19 != i17) {
                        break;
                    }
                } else {
                    z10 = j14;
                    c10 = c12;
                    j10 = j15;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c12 = c10;
                j15 = j10;
                j14 = z10;
                i17 = 8;
            }
        } else {
            z10 = j14;
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        i0Var2.b();
        Object[] objArr2 = i0Var.f8320b;
        long[] jArr2 = i0Var.f8319a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j17 = jArr2[i21];
                if ((((~j17) << c10) & j17 & j10) != j10) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j17 & j12) < j11 && (g0Var = (g0) ((d2) objArr2[(i21 << 3) + i23]).get()) != null) {
                            if (z10) {
                                g0Var.O(false);
                            } else {
                                g0Var.Q(false);
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        i0Var.b();
    }

    public final void f0(a2.h0 h0Var) {
        long j;
        long j3;
        s.h0 h0Var2 = this.A;
        if (!this.f1635x) {
            Function1 d10 = h0Var.d();
            if (d10 != null) {
                boolean z10 = this.f1632u != d10;
                if (z10 || !o0().f1608d) {
                    j = 0;
                    j3 = 9223372034707292159L;
                } else {
                    a2.n i02 = i0();
                    long c10 = x3.j0.c(i02.b(0L));
                    long J = i02.J();
                    j3 = c10;
                    j = J;
                    z10 = (x2.i.a(c10, o0().f1609e) && x2.k.a(J, o0().f1610i)) ? false : true;
                }
                if (z10) {
                    s1 s1Var = this.f1633v;
                    if (s1Var != null) {
                        s1Var.f1668d = h0Var;
                    } else {
                        s1Var = new s1(h0Var, this);
                        this.f1633v = s1Var;
                    }
                    e0(s1Var, j3, j);
                    this.f1632u = h0Var.d();
                }
            } else if (h0Var2 != null) {
                Object[] objArr = h0Var2.f8314c;
                long[] jArr = h0Var2.f8312a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j10 = jArr[i3];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    q0((s.i0) objArr[(i3 << 3) + i11]);
                                }
                                j10 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                h0Var2.a();
            }
        }
    }

    public final int g0(a2.a aVar) {
        int d02;
        if (!j0() || (d02 = d0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z10 = aVar instanceof a2.c1;
        long j = this.f135s;
        return d02 + ((int) (z10 ? j >> 32 : j & 4294967295L));
    }

    public abstract o0 h0();

    public abstract a2.n i0();

    @Override // a2.i0
    public boolean j() {
        return false;
    }

    public abstract boolean j0();

    public abstract g0 k0();

    public abstract a2.h0 l0();

    public abstract o0 m0();

    public abstract long n0();

    public final l0 o0() {
        l0 l0Var = this.f1631t;
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this);
        this.f1631t = l0Var2;
        return l0Var2;
    }

    @Override // c2.y0
    public final void q() {
        o0 m02 = m0();
        g0 k02 = m02 != null ? m02.k0() : null;
        if (Intrinsics.a(k02, k0())) {
            return;
        }
        if ((k02 != null ? k02.T.f1596d : null) != c0.f1507i) {
            if (k02 != null) {
                c0 c0Var = k02.T.f1596d;
            }
            c0 c0Var2 = c0.f1505d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(s.i0 i0Var) {
        g0 g0Var;
        Object[] objArr = i0Var.f8320b;
        long[] jArr = i0Var.f8319a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128 && (g0Var = (g0) ((d2) objArr[(i3 << 3) + i11]).get()) != null) {
                        if (j()) {
                            g0Var.O(false);
                        } else {
                            g0Var.Q(false);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public abstract void r0();

    @Override // a2.i0
    public final a2.h0 x(int i3, int i10, Map map, Function1 function1, Function1 function12) {
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            z1.a.b("Size(" + i3 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new n0(i3, i10, map, function1, function12, this);
    }
}
