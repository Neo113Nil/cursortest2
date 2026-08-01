package k2;

import a2.a0;
import b1.c0;
import c2.b1;
import c2.g0;
import c2.i1;
import c2.o1;
import c2.q;
import c2.w0;
import d2.v;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import o0.e;
import s.d0;
import s.w;
import x2.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final v f5361a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f5362b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5363c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f5364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5365e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5366f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public a3.a f5367h;

    /* renamed from: i, reason: collision with root package name */
    public long f5368i;
    public final a0 j;

    /* renamed from: k, reason: collision with root package name */
    public final j1.a f5369k;

    public b(v vVar) {
        this.f5361a = vVar;
        c0 c0Var = new c0();
        c0Var.f954b = new long[192];
        c0Var.f955c = new long[192];
        this.f5362b = c0Var;
        this.f5363c = new c();
        this.f5364d = new d0();
        this.f5368i = -1L;
        this.j = new a0(8, this);
        this.f5369k = new j1.a();
    }

    public static boolean c(i1 i1Var) {
        o1 o1Var = i1Var.Y;
        return (o1Var == null || k1.v.l(((d2.i1) o1Var).b())) ? false : true;
    }

    public static long e(g0 g0Var) {
        b1 b1Var = g0Var.S;
        i1 i1Var = (i1) b1Var.f1494e;
        long j = 0;
        for (i1 i1Var2 = (q) b1Var.f1493d; i1Var2 != null && i1Var2 != i1Var; i1Var2 = i1Var2.D) {
            if (c(i1Var2)) {
                return 9223372034707292159L;
            }
            j = i.c(j, i1Var2.M);
        }
        return j;
    }

    public static void h(g0 g0Var) {
        if (!g0Var.f1551i || c((i1) g0Var.S.f1494e)) {
            return;
        }
        g0Var.f1551i = false;
        if (g0Var.f1553s) {
            g0Var.f1552r = e(g0Var);
            g0Var.f1553s = false;
        }
        if (i.a(g0Var.f1552r, 9223372034707292159L)) {
            return;
        }
        e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            h((g0) objArr[i10]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        char c10;
        long j;
        long j3;
        long j10;
        a3.a aVar = this.f5367h;
        if (aVar != null) {
            this.f5361a.removeCallbacks(aVar);
            this.f5367h = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f5365e;
        boolean z11 = z10 || this.f5366f;
        c0 c0Var = this.f5362b;
        c cVar = this.f5363c;
        if (z10) {
            this.f5365e = false;
            d0 d0Var = this.f5364d;
            Object[] objArr = d0Var.f8284a;
            int i3 = d0Var.f8285b;
            for (int i10 = 0; i10 < i3; i10++) {
                ((Function0) objArr[i10]).invoke();
            }
            long[] jArr = (long[]) c0Var.f954b;
            int i11 = c0Var.f953a;
            for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
                long j11 = jArr[i12 + 2];
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr[i12];
                    long j13 = jArr[i12 + 1];
                    if (cVar.f5370a.b(((int) j11) & 33554431) != null) {
                        i0.j();
                        return;
                    }
                }
            }
            long[] jArr2 = (long[]) c0Var.f954b;
            int i13 = c0Var.f953a;
            for (int i14 = 0; i14 < jArr2.length - 2 && i14 < i13; i14 += 3) {
                int i15 = i14 + 2;
                jArr2[i15] = jArr2[i15] & (-1152921504606846977L);
            }
        }
        if (this.f5366f) {
            this.f5366f = false;
            w wVar = cVar.f5370a;
            c10 = 7;
            Object[] objArr2 = wVar.f8338c;
            long[] jArr3 = wVar.f8336a;
            j = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                j3 = 255;
                while (true) {
                    long j14 = jArr3[i16];
                    j10 = -9187201950435737472L;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        for (int i18 = 0; i18 < i17; i18++) {
                            if ((j14 & 255) < 128 && objArr2[(i16 << 3) + i18] != null) {
                                i0.j();
                                return;
                            }
                            j14 >>= 8;
                        }
                        if (i17 != 8) {
                            break;
                        }
                    }
                    if (i16 == length) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (z11) {
                    cVar.getClass();
                }
                if (this.g) {
                    this.g = false;
                    long[] jArr4 = (long[]) c0Var.f954b;
                    int i19 = c0Var.f953a;
                    long[] jArr5 = (long[]) c0Var.f955c;
                    int i20 = 0;
                    for (int i21 = 0; i21 < jArr4.length - 2 && i20 < jArr5.length - 2 && i21 < i19; i21 += 3) {
                        int i22 = i21 + 2;
                        if (jArr4[i22] != a.f5360c) {
                            jArr5[i20] = jArr4[i21];
                            jArr5[i20 + 1] = jArr4[i21 + 1];
                            jArr5[i20 + 2] = jArr4[i22];
                            i20 += 3;
                        }
                    }
                    c0Var.f953a = i20;
                    c0Var.f954b = jArr5;
                    c0Var.f955c = jArr4;
                }
                if (cVar.f5371b <= currentTimeMillis) {
                    w wVar2 = cVar.f5370a;
                    Object[] objArr3 = wVar2.f8338c;
                    long[] jArr6 = wVar2.f8336a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i23 = 0;
                        while (true) {
                            long j15 = jArr6[i23];
                            if ((((~j15) << c10) & j15 & j10) != j10) {
                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                for (int i25 = 0; i25 < i24; i25++) {
                                    if ((j15 & j3) < j && objArr3[(i23 << 3) + i25] != null) {
                                        i0.j();
                                        return;
                                    }
                                    j15 >>= 8;
                                }
                                if (i24 != 8) {
                                    break;
                                }
                            }
                            if (i23 == length2) {
                                break;
                            } else {
                                i23++;
                            }
                        }
                    }
                    cVar.f5371b = -1L;
                }
                if (cVar.f5371b <= 0) {
                    i();
                    return;
                }
                return;
            }
        } else {
            c10 = 7;
            j = 128;
        }
        j3 = 255;
        j10 = -9187201950435737472L;
        if (z11) {
        }
        if (this.g) {
        }
        if (cVar.f5371b <= currentTimeMillis) {
        }
        if (cVar.f5371b <= 0) {
        }
    }

    public final long b(g0 g0Var) {
        long j;
        int i3 = g0Var.f1550e & 33554431;
        c0 c0Var = this.f5362b;
        long[] jArr = (long[]) c0Var.f954b;
        int i10 = c0Var.f953a;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 33554431) == i3) {
                j = jArr[i11];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    public final void d(g0 g0Var) {
        boolean z10;
        boolean z11 = true;
        g0Var.f1551i = true;
        b1 b1Var = g0Var.S;
        i1 i1Var = (i1) b1Var.f1494e;
        w0 w0Var = g0Var.T.f1606p;
        int X = w0Var.X();
        float W = w0Var.W();
        j1.a aVar = this.f5369k;
        aVar.f4910a = 0.0f;
        aVar.f4911b = 0.0f;
        aVar.f4912c = X;
        aVar.f4913d = W;
        while (true) {
            if (i1Var == null) {
                break;
            }
            g0 g0Var2 = i1Var.B;
            if (i1Var == ((i1) g0Var2.S.f1494e) && !g0Var2.f1551i) {
                if (!i.a(b(g0Var2), 9223372034707292159L)) {
                    aVar.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            o1 o1Var = i1Var.Y;
            if (o1Var != null) {
                float[] b10 = ((d2.i1) o1Var).b();
                if (!k1.v.l(b10)) {
                    k1.v.n(b10, aVar);
                }
            }
            long j = i1Var.M;
            aVar.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            i1Var = i1Var.D;
        }
        int i3 = (int) aVar.f4910a;
        int i10 = (int) aVar.f4911b;
        int i11 = (int) aVar.f4912c;
        int i12 = (int) aVar.f4913d;
        int i13 = g0Var.f1550e;
        boolean z12 = g0Var.f1555u;
        g0Var.f1555u = true;
        c0 c0Var = this.f5362b;
        if (z12) {
            int i14 = i13 & 33554431;
            long[] jArr = (long[]) c0Var.f954b;
            int i15 = c0Var.f953a;
            int i16 = 0;
            while (i16 < jArr.length - 2 && i16 < i15) {
                int i17 = i16 + 2;
                long j3 = jArr[i17];
                z10 = z11;
                if ((((int) j3) & 33554431) == i14) {
                    jArr[i16] = (i3 << 32) | (i10 & 4294967295L);
                    jArr[i16 + 1] = (i11 << 32) | (i12 & 4294967295L);
                    jArr[i17] = (((j3 >> 63) & 1) << 60) | j3;
                    break;
                }
                i16 += 3;
                z11 = z10;
            }
        }
        z10 = z11;
        g0 s3 = g0Var.s();
        c0Var.d(i13, i3, i10, i11, i12, (r22 & 32) != 0 ? -1 : s3 != null ? s3.f1550e : -1, b1Var.d(1024), b1Var.d(16), this.f5363c.f5370a.a(i13), -1);
        g0Var.f1554t = false;
        this.f5365e = z10;
        e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i18 = w6.f7319i;
        for (int i19 = 0; i19 < i18; i19++) {
            g0 g0Var3 = (g0) objArr[i19];
            if (g0Var3.F()) {
                d(g0Var3);
            }
        }
    }

    public final void f(g0 g0Var) {
        long j;
        int i3;
        boolean F = g0Var.F();
        b1 b1Var = g0Var.S;
        if (F && g0Var.f1554t) {
            g0 s3 = g0Var.s();
            if (s3 == null || s3.f1551i) {
                j = s3 == null ? 0L : 9223372034707292159L;
            } else {
                if (s3.f1553s) {
                    s3.f1553s = false;
                    s3.f1552r = e(s3);
                }
                j = s3.f1552r;
            }
            i1 i1Var = (i1) b1Var.f1494e;
            if (i.a(j, 9223372034707292159L) || c(i1Var)) {
                d(g0Var);
            } else if (g0Var.f1551i) {
                d(g0Var);
                h(g0Var);
            } else {
                long c10 = i.c(j, i1Var.M);
                w0 w0Var = g0Var.T.f1606p;
                int X = w0Var.X();
                int W = w0Var.W();
                int i10 = g0Var.f1550e;
                boolean z10 = g0Var.f1555u;
                c0 c0Var = this.f5362b;
                long j3 = 4294967295L;
                if (!z10) {
                    g0Var.f1555u = true;
                    boolean d10 = b1Var.d(1024);
                    boolean d11 = b1Var.d(16);
                    boolean a9 = this.f5363c.f5370a.a(i10);
                    if (s3 != null) {
                        int i11 = s3.f1550e;
                        int i12 = (int) (c10 >> 32);
                        int i13 = (int) (c10 & 4294967295L);
                        int i14 = i10 & 33554431;
                        long[] jArr = (long[]) c0Var.f954b;
                        i3 = c0Var.f953a - 3;
                        while (true) {
                            if (i3 < 0) {
                                break;
                            }
                            if ((((int) jArr[i3 + 2]) & 33554431) == i11) {
                                long j10 = jArr[i3];
                                int i15 = ((int) (j10 >> 32)) + i12;
                                int i16 = ((int) j10) + i13;
                                c0Var.d(i14, i15, i16, i15 + X, i16 + W, i11, d10, d11, a9, i3);
                                break;
                            }
                            i3 -= 3;
                        }
                    } else {
                        int i17 = (int) (c10 >> 32);
                        int i18 = (int) (c10 & 4294967295L);
                        c0Var.d(i10, i17, i18, i17 + X, i18 + W, (r22 & 32) != 0 ? -1 : 0, d10, d11, a9, -1);
                    }
                } else if (s3 == null) {
                    int i19 = (int) (c10 >> 32);
                    int i20 = (int) (c10 & 4294967295L);
                    int i21 = X + i19;
                    int i22 = i20 + W;
                    int i23 = i10 & 33554431;
                    long[] jArr2 = (long[]) c0Var.f954b;
                    int i24 = c0Var.f953a;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= jArr2.length - 2 || i25 >= i24) {
                            break;
                        }
                        int i26 = i25 + 2;
                        long j11 = jArr2[i26];
                        if ((((int) j11) & 33554431) == i23) {
                            long j12 = jArr2[i25];
                            int i27 = i25;
                            jArr2[i27] = (i19 << 32) | (i20 & 4294967295L);
                            jArr2[i27 + 1] = (i21 << 32) | (i22 & 4294967295L);
                            jArr2[i26] = (((j11 >> 63) & 1) << 60) | j11;
                            int i28 = i19 - ((int) (j12 >> 32));
                            int i29 = i20 - ((int) j12);
                            if ((i28 != 0) | (i29 != 0)) {
                                c0Var.i(i28, i29, (a.f5359b & j11) | (((i27 + 3) & 33554431) << 25));
                            }
                        } else {
                            i25 += 3;
                        }
                    }
                } else {
                    int i30 = s3.f1550e;
                    int i31 = (int) (c10 >> 32);
                    int i32 = (int) (c10 & 4294967295L);
                    int i33 = i10 & 33554431;
                    long[] jArr3 = (long[]) c0Var.f954b;
                    int i34 = c0Var.f953a;
                    int i35 = 0;
                    while (true) {
                        if (i35 >= jArr3.length - 2 || i35 >= i34) {
                            break;
                        }
                        long j13 = j3;
                        if ((((int) jArr3[i35 + 2]) & 33554431) == i30) {
                            long j14 = jArr3[i35];
                            int i36 = ((int) (j14 >> 32)) + i31;
                            int i37 = ((int) j14) + i32;
                            int i38 = i36 + X;
                            int i39 = i37 + W;
                            i35 += 3;
                            while (i35 < jArr3.length - 2 && i35 < i34) {
                                int i40 = i35 + 2;
                                int i41 = i30;
                                int i42 = i31;
                                long j15 = jArr3[i40];
                                int i43 = i32;
                                if ((((int) j15) & 33554431) == i33) {
                                    long j16 = jArr3[i35];
                                    long[] jArr4 = jArr3;
                                    int i44 = i36 - ((int) (j16 >> 32));
                                    int i45 = i37 - ((int) j16);
                                    jArr4[i35] = (i37 & j13) | (i36 << 32);
                                    jArr4[i35 + 1] = (i38 << 32) | (i39 & j13);
                                    jArr4[i40] = j15 | (((j15 >> 63) & 1) << 60);
                                    if (i44 != 0 || i45 != 0) {
                                        c0Var.i(i44, i45, (j15 & a.f5359b) | (((i35 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i35 += 3;
                                    i30 = i41;
                                    i31 = i42;
                                    i32 = i43;
                                }
                            }
                        }
                        i35 += 3;
                        jArr3 = jArr3;
                        j3 = j13;
                        i30 = i30;
                        i31 = i31;
                        i32 = i32;
                    }
                }
            }
            g0Var.f1554t = false;
            this.f5365e = true;
            i();
        }
    }

    public final void g(g0 g0Var) {
        if (g0Var.f1555u) {
            int i3 = g0Var.f1550e & 33554431;
            c0 c0Var = this.f5362b;
            long[] jArr = (long[]) c0Var.f954b;
            int i10 = c0Var.f953a;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                if ((((int) jArr[i12]) & 33554431) == i3) {
                    jArr[i11] = -1;
                    jArr[i11 + 1] = -1;
                    jArr[i12] = a.f5360c;
                    break;
                }
                i11 += 3;
            }
            g0Var.f1555u = false;
            g0Var.f1554t = true;
            this.f5365e = true;
            this.g = true;
        }
    }

    public final void i() {
        a3.a aVar = this.f5367h;
        boolean z10 = aVar != null;
        long j = this.f5363c.f5371b;
        if (j >= 0 || !z10) {
            if (this.f5368i == j && z10) {
                return;
            }
            v vVar = this.f5361a;
            if (aVar != null) {
                vVar.removeCallbacks(aVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.f5368i = max;
            a3.a aVar2 = new a3.a(2, this.j);
            vVar.postDelayed(aVar2, max - currentTimeMillis);
            this.f5367h = aVar2;
        }
    }
}
