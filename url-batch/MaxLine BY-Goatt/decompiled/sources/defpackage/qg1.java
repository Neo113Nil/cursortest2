package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class qg1 extends n12 implements jm1, qj1 {
    public ng1 r;
    public Function1 s;
    public p12 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final rg1 x = new rg1(0, this);
    public te y;
    public tn1 z;

    public static void C0(ks1 ks1Var) {
        j91 j91Var;
        ks1 ks1Var2 = ks1Var.B;
        i91 i91Var = ks1Var.A;
        if (!Intrinsics.b(ks1Var2 != null ? ks1Var2.A : null, i91Var)) {
            i91Var.Q.p.I.f();
            return;
        }
        k6 o = i91Var.Q.p.o();
        if (o == null || (j91Var = ((nj1) o).I) == null) {
            return;
        }
        j91Var.f();
    }

    public abstract long A0();

    public final ng1 B0() {
        ng1 ng1Var = this.r;
        if (ng1Var != null) {
            return ng1Var;
        }
        ng1 ng1Var2 = new ng1(this);
        this.r = ng1Var2;
        return ng1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(un1 un1Var) {
        i91 i91Var;
        Object[] objArr = un1Var.b;
        long[] jArr = un1Var.a;
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
                    if ((255 & j) < 128 && (i91Var = (i91) ((k63) objArr[(i << 3) + i3]).get()) != null) {
                        if (w()) {
                            i91Var.T(false);
                        } else {
                            i91Var.V(false);
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

    public abstract void E0();

    @Override // defpackage.qj1
    public final pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            h21.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pg1(i, i2, map, function1, function12, this);
    }

    @Override // defpackage.jm1
    public final void m(boolean z) {
        qg1 z0 = z0();
        i91 x0 = z0 != null ? z0.x0() : null;
        if (Intrinsics.b(x0, x0())) {
            this.u = z;
            return;
        }
        if ((x0 != null ? x0.Q.d : null) != e91.o) {
            if ((x0 != null ? x0.Q.d : null) != e91.p) {
                return;
            }
        }
        this.u = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(i91 i91Var, ay0 ay0Var) {
        char c;
        long j;
        long j2;
        long j3;
        tn1 tn1Var;
        tn1 tn1Var2;
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
        tn1 tn1Var3 = this.z;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (tn1Var3 != null) {
            Object[] objArr = tn1Var3.c;
            long[] jArr3 = tn1Var3.a;
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
                                un1 un1Var = (un1) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = un1Var.b;
                                long[] jArr4 = un1Var.a;
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
                                                    i91 i91Var2 = (i91) ((k63) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (i91Var2 != null) {
                                                        boolean I = i91Var2.I();
                                                        i4 = i8;
                                                        if (I) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    un1Var.l(i14);
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
                tn1Var = this.z;
                if (tn1Var != null) {
                    long[] jArr5 = tn1Var.a;
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
                                        if (((un1) tn1Var.c[i18]).g()) {
                                            tn1Var.l(i18);
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
                tn1Var2 = this.z;
                if (tn1Var2 == null) {
                    tn1Var2 = new tn1();
                    this.z = tn1Var2;
                }
                g = tn1Var2.g(ay0Var);
                if (g == null) {
                    g = new un1();
                    tn1Var2.m(ay0Var, g);
                }
                ((un1) g).j(new k63(i91Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        tn1Var = this.z;
        if (tn1Var != null) {
        }
        tn1Var2 = this.z;
        if (tn1Var2 == null) {
        }
        g = tn1Var2.g(ay0Var);
        if (g == null) {
        }
        ((un1) g).j(new k63(i91Var));
    }

    public abstract int n0(xx0 xx0Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(p12 p12Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        i91 i91Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        tx1 snapshotObserver;
        tn1 tn1Var = this.z;
        te teVar = this.y;
        if (teVar == null) {
            teVar = new te();
            this.y = teVar;
        }
        te teVar2 = teVar;
        rx1 rx1Var = x0().y;
        if (rx1Var != null && (snapshotObserver = ((t7) rx1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(p12Var, bl0.D, new og1(this, j, j2, p12Var));
        }
        boolean w = w();
        un1 un1Var = (un1) teVar2.e;
        un1 un1Var2 = (un1) teVar2.f;
        int i2 = teVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) teVar2.d)[i3];
            if (b == 3) {
                ay0 ay0Var = ((ay0[]) teVar2.b)[i3];
                ay0Var.getClass();
                un1Var2.j(ay0Var);
            } else if (b != 0 && tn1Var != null) {
                ay0 ay0Var2 = ((ay0[]) teVar2.b)[i3];
                ay0Var2.getClass();
                un1 un1Var3 = (un1) tn1Var.k(ay0Var2);
                if (un1Var3 != null) {
                    un1Var.i(un1Var3);
                }
            }
        }
        int i4 = teVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) teVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                ay0[] ay0VarArr = (ay0[]) teVar2.b;
                ay0VarArr[i6 - i5] = ay0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = teVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((ay0[]) teVar2.b)[i8] = null;
        }
        teVar2.a -= i5;
        qg1 z0 = z0();
        Object[] objArr = un1Var2.b;
        long[] jArr = un1Var2.a;
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
                            ay0 ay0Var3 = (ay0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            qg1 qg1Var = z0 == null ? this : z0;
                            i = i9;
                            qg1 qg1Var2 = qg1Var;
                            while (true) {
                                te teVar3 = qg1Var2.y;
                                if (teVar3 != null) {
                                    z2 = w;
                                    if (oi.o((ay0[]) teVar3.b, ay0Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = w;
                                }
                                qg1 z02 = qg1Var2.z0();
                                if (z02 == null) {
                                    break;
                                }
                                qg1Var2 = z02;
                                w = z2;
                            }
                            tn1 tn1Var2 = qg1Var2.z;
                            un1 un1Var4 = tn1Var2 != null ? (un1) tn1Var2.k(ay0Var3) : null;
                            if (un1Var4 != null) {
                                qg1Var.D0(un1Var4);
                            }
                        } else {
                            z2 = w;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        w = z2;
                    }
                    z = w;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = w;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                w = z;
                i9 = 8;
            }
        } else {
            z = w;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        un1Var2.b();
        Object[] objArr2 = un1Var.b;
        long[] jArr2 = un1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (i91Var = (i91) ((k63) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                i91Var.T(false);
                            } else {
                                i91Var.V(false);
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
        un1Var.b();
    }

    public final void q0(pj1 pj1Var) {
        long j;
        long j2;
        tn1 tn1Var = this.z;
        if (this.w) {
            return;
        }
        Function1 d = pj1Var.d();
        if (d != null) {
            boolean z = this.s != d;
            if (z || !B0().m) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                t81 v0 = v0();
                long R = yk3.R(v0.b(0L));
                long N = v0.N();
                j2 = R;
                j = N;
                z = (s31.a(R, B0().n) && x31.a(N, B0().o)) ? false : true;
            }
            if (z) {
                p12 p12Var = this.t;
                if (p12Var != null) {
                    p12Var.m = pj1Var;
                } else {
                    p12Var = new p12(pj1Var, this);
                    this.t = p12Var;
                }
                o0(p12Var, j2, j);
                this.s = pj1Var.d();
                return;
            }
            return;
        }
        if (tn1Var != null) {
            Object[] objArr = tn1Var.c;
            long[] jArr = tn1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                D0((un1) objArr[(i << 3) + i3]);
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
            tn1Var.a();
        }
    }

    public final int t0(xx0 xx0Var) {
        int n0;
        if (w0() && (n0 = n0(xx0Var)) != Integer.MIN_VALUE) {
            return n0 + ((int) (this.q & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract qg1 u0();

    public abstract t81 v0();

    @Override // defpackage.h41
    public boolean w() {
        return false;
    }

    public abstract boolean w0();

    public abstract i91 x0();

    public abstract pj1 y0();

    public abstract qg1 z0();
}
