package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ej0 extends zw0 implements xk0, nm0 {
    public bj0 j;
    public Function1 k;
    public bx0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final fj0 p = new fj0(0, this);
    public u41 q;
    public vn0 r;

    public static void v0(qp0 qp0Var) {
        kd0 kd0Var;
        qp0 qp0Var2 = qp0Var.t;
        jd0 jd0Var = qp0Var.s;
        if (!Intrinsics.a(qp0Var2 != null ? qp0Var2.s : null, jd0Var)) {
            jd0Var.K.p.A.f();
            return;
        }
        b3 z = jd0Var.K.p.z();
        if (z == null || (kd0Var = ((uk0) z).A) == null) {
            return;
        }
        kd0Var.f();
    }

    @Override // defpackage.xk0
    public final wk0 D(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            o80.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dj0(i, i2, map, function1, function12, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(jd0 jd0Var, o60 o60Var) {
        char c;
        long j;
        long j2;
        long j3;
        vn0 vn0Var;
        vn0 vn0Var2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        vn0 vn0Var3 = this.r;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (vn0Var3 != null) {
            Object[] objArr = vn0Var3.c;
            long[] jArr3 = vn0Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                wn0 wn0Var = (wn0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = wn0Var.b;
                                long[] jArr4 = wn0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    jd0 jd0Var2 = (jd0) ((bo1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (jd0Var2 != null) {
                                                        boolean F = jd0Var2.F();
                                                        i4 = i8;
                                                        if (F) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    wn0Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                vn0Var = this.r;
                if (vn0Var != null) {
                    long[] jArr5 = vn0Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((wn0) vn0Var.c[i18]).g()) {
                                            vn0Var.l(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                vn0Var2 = this.r;
                if (vn0Var2 == null) {
                    vn0Var2 = new vn0();
                    this.r = vn0Var2;
                }
                g = vn0Var2.g(o60Var);
                if (g == null) {
                    g = new wn0();
                    vn0Var2.m(o60Var, g);
                }
                ((wn0) g).k(new bo1(jd0Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        vn0Var = this.r;
        if (vn0Var != null) {
        }
        vn0Var2 = this.r;
        if (vn0Var2 == null) {
        }
        g = vn0Var2.g(o60Var);
        if (g == null) {
        }
        ((wn0) g).k(new bo1(jd0Var));
    }

    public abstract int e0(m60 m60Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(bx0 bx0Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        jd0 jd0Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        gu0 snapshotObserver;
        vn0 vn0Var = this.r;
        u41 u41Var = this.q;
        if (u41Var == null) {
            u41Var = new u41();
            this.q = u41Var;
        }
        u41 u41Var2 = u41Var;
        eu0 eu0Var = q0().s;
        if (eu0Var != null && (snapshotObserver = ((d4) eu0Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.b(bx0Var, y3.v, new cj0(this, j, j2, bx0Var));
        }
        boolean m = m();
        wn0 wn0Var = u41Var2.e;
        wn0 wn0Var2 = u41Var2.f;
        int i2 = u41Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = u41Var2.d[i3];
            if (b == 3) {
                o60 o60Var = u41Var2.b[i3];
                o60Var.getClass();
                wn0Var2.k(o60Var);
            } else if (b != 0 && vn0Var != null) {
                o60 o60Var2 = u41Var2.b[i3];
                o60Var2.getClass();
                wn0 wn0Var3 = (wn0) vn0Var.k(o60Var2);
                if (wn0Var3 != null) {
                    wn0Var.j(wn0Var3);
                }
            }
        }
        int i4 = u41Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = u41Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                o60[] o60VarArr = u41Var2.b;
                o60VarArr[i6 - i5] = o60VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = u41Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            u41Var2.b[i8] = null;
        }
        u41Var2.a -= i5;
        ej0 s0 = s0();
        Object[] objArr = wn0Var2.b;
        long[] jArr = wn0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            o60 o60Var3 = (o60) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            ej0 ej0Var = s0 == null ? this : s0;
                            i = i9;
                            ej0 ej0Var2 = ej0Var;
                            while (true) {
                                u41 u41Var3 = ej0Var2.q;
                                if (u41Var3 != null) {
                                    z2 = m;
                                    if (y9.i(u41Var3.b, o60Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = m;
                                }
                                ej0 s02 = ej0Var2.s0();
                                if (s02 == null) {
                                    break;
                                }
                                ej0Var2 = s02;
                                m = z2;
                            }
                            vn0 vn0Var2 = ej0Var2.r;
                            wn0 wn0Var4 = vn0Var2 != null ? (wn0) vn0Var2.k(o60Var3) : null;
                            if (wn0Var4 != null) {
                                ej0Var.w0(wn0Var4);
                            }
                        } else {
                            z2 = m;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        m = z2;
                    }
                    z = m;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = m;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                m = z;
                i9 = 8;
            }
        } else {
            z = m;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        wn0Var2.b();
        Object[] objArr2 = wn0Var.b;
        long[] jArr2 = wn0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (jd0Var = (jd0) ((bo1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                jd0Var.Q(false);
                            } else {
                                jd0Var.S(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        wn0Var.b();
    }

    public final void h0(wk0 wk0Var) {
        long j;
        long j2;
        vn0 vn0Var = this.r;
        if (this.o) {
            return;
        }
        Function1 d = wk0Var.d();
        if (d != null) {
            boolean z = this.k != d;
            if (z || !u0().d) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                uc0 o0 = o0();
                long C = t90.C(o0.b(0L));
                long K = o0.K();
                j2 = C;
                j = K;
                z = (s90.a(C, u0().e) && ba0.a(K, u0().g)) ? false : true;
            }
            if (z) {
                bx0 bx0Var = this.l;
                if (bx0Var != null) {
                    bx0Var.d = wk0Var;
                } else {
                    bx0Var = new bx0(wk0Var, this);
                    this.l = bx0Var;
                }
                f0(bx0Var, j2, j);
                this.k = wk0Var.d();
                return;
            }
            return;
        }
        if (vn0Var != null) {
            Object[] objArr = vn0Var.c;
            long[] jArr = vn0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                w0((wn0) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            vn0Var.a();
        }
    }

    public final int j0(m60 m60Var) {
        int e0;
        if (p0() && (e0 = e0(m60Var)) != Integer.MIN_VALUE) {
            return e0 + ((int) (this.i & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.xk0
    public boolean m() {
        return false;
    }

    public abstract ej0 n0();

    public abstract uc0 o0();

    public abstract boolean p0();

    public abstract jd0 q0();

    @Override // defpackage.nm0
    public final void r(boolean z) {
        ej0 s0 = s0();
        jd0 q0 = s0 != null ? s0.q0() : null;
        if (Intrinsics.a(q0, q0())) {
            this.m = z;
            return;
        }
        if ((q0 != null ? q0.K.d : null) != fd0.g) {
            if ((q0 != null ? q0.K.d : null) != fd0.h) {
                return;
            }
        }
        this.m = z;
    }

    public abstract wk0 r0();

    public abstract ej0 s0();

    public abstract long t0();

    public final bj0 u0() {
        bj0 bj0Var = this.j;
        if (bj0Var != null) {
            return bj0Var;
        }
        bj0 bj0Var2 = new bj0(this);
        this.j = bj0Var2;
        return bj0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(wn0 wn0Var) {
        jd0 jd0Var;
        Object[] objArr = wn0Var.b;
        long[] jArr = wn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (jd0Var = (jd0) ((bo1) objArr[(i << 3) + i3]).get()) != null) {
                        if (m()) {
                            jd0Var.Q(false);
                        } else {
                            jd0Var.S(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void x0();
}
