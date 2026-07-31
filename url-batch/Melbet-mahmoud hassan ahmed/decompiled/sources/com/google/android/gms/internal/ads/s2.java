package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s2 implements w2 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f11600v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11601a;

    /* renamed from: b, reason: collision with root package name */
    private final cq2 f11602b = new cq2(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f11603c = new dr2(Arrays.copyOf(f11600v, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f11604d;

    /* renamed from: e, reason: collision with root package name */
    private String f11605e;

    /* renamed from: f, reason: collision with root package name */
    private td4 f11606f;

    /* renamed from: g, reason: collision with root package name */
    private td4 f11607g;

    /* renamed from: h, reason: collision with root package name */
    private int f11608h;

    /* renamed from: i, reason: collision with root package name */
    private int f11609i;

    /* renamed from: j, reason: collision with root package name */
    private int f11610j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11611k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11612l;

    /* renamed from: m, reason: collision with root package name */
    private int f11613m;

    /* renamed from: n, reason: collision with root package name */
    private int f11614n;

    /* renamed from: o, reason: collision with root package name */
    private int f11615o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11616p;

    /* renamed from: q, reason: collision with root package name */
    private long f11617q;

    /* renamed from: r, reason: collision with root package name */
    private int f11618r;

    /* renamed from: s, reason: collision with root package name */
    private long f11619s;

    /* renamed from: t, reason: collision with root package name */
    private td4 f11620t;

    /* renamed from: u, reason: collision with root package name */
    private long f11621u;

    public s2(boolean z6, String str) {
        h();
        this.f11613m = -1;
        this.f11614n = -1;
        this.f11617q = -9223372036854775807L;
        this.f11619s = -9223372036854775807L;
        this.f11601a = z6;
        this.f11604d = str;
    }

    public static boolean f(int i7) {
        return (i7 & 65526) == 65520;
    }

    private final void g() {
        this.f11612l = false;
        h();
    }

    private final void h() {
        this.f11608h = 0;
        this.f11609i = 0;
        this.f11610j = 256;
    }

    private final void i() {
        this.f11608h = 3;
        this.f11609i = 0;
    }

    private final void j(td4 td4Var, long j7, int i7, int i8) {
        this.f11608h = 4;
        this.f11609i = i7;
        this.f11620t = td4Var;
        this.f11621u = j7;
        this.f11618r = i8;
    }

    private final boolean k(dr2 dr2Var, byte[] bArr, int i7) {
        int min = Math.min(dr2Var.i(), i7 - this.f11609i);
        dr2Var.b(bArr, this.f11609i, min);
        int i8 = this.f11609i + min;
        this.f11609i = i8;
        return i8 == i7;
    }

    private static final boolean l(byte b7, byte b8) {
        return f((b8 & 255) | 65280);
    }

    private static final boolean m(dr2 dr2Var, byte[] bArr, int i7) {
        if (dr2Var.i() < i7) {
            return false;
        }
        dr2Var.b(bArr, 0, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(dr2 dr2Var) {
        int i7;
        td4 td4Var;
        long j7;
        int i8;
        int i9;
        Objects.requireNonNull(this.f11606f);
        int i10 = n13.f8865a;
        while (dr2Var.i() > 0) {
            int i11 = this.f11608h;
            int i12 = 13;
            int i13 = 2;
            if (i11 == 0) {
                byte[] h7 = dr2Var.h();
                int k7 = dr2Var.k();
                int l7 = dr2Var.l();
                while (k7 < l7) {
                    int i14 = k7 + 1;
                    int i15 = h7[k7] & 255;
                    if (this.f11610j == 512 && l((byte) -1, (byte) i15)) {
                        if (!this.f11612l) {
                            int i16 = i14 - 2;
                            dr2Var.f(i16 + 1);
                            if (m(dr2Var, this.f11602b.f3919a, 1)) {
                                this.f11602b.h(4);
                                int c7 = this.f11602b.c(1);
                                int i17 = this.f11613m;
                                if (i17 == -1 || c7 == i17) {
                                    if (this.f11614n != -1) {
                                        if (m(dr2Var, this.f11602b.f3919a, 1)) {
                                            this.f11602b.h(i13);
                                            if (this.f11602b.c(4) == this.f11614n) {
                                                dr2Var.f(i16 + 2);
                                            }
                                        }
                                    }
                                    if (m(dr2Var, this.f11602b.f3919a, 4)) {
                                        this.f11602b.h(14);
                                        int c8 = this.f11602b.c(i12);
                                        if (c8 >= 7) {
                                            byte[] h8 = dr2Var.h();
                                            int l8 = dr2Var.l();
                                            int i18 = i16 + c8;
                                            if (i18 < l8) {
                                                if ((r8 = h8[i18]) == -1) {
                                                }
                                                dr2Var.f(i14);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f11615o = (i15 & 8) >> 3;
                        this.f11611k = 1 == ((i15 & 1) ^ 1);
                        if (this.f11612l) {
                            i();
                        } else {
                            this.f11608h = 1;
                            this.f11609i = 0;
                        }
                        dr2Var.f(i14);
                        break;
                        break;
                    }
                    int i19 = this.f11610j;
                    int i20 = i19 | i15;
                    if (i20 == 329) {
                        i9 = 768;
                    } else if (i20 == 511) {
                        i9 = 512;
                    } else if (i20 == 836) {
                        i9 = 1024;
                    } else {
                        if (i20 == 1075) {
                            this.f11608h = 2;
                            this.f11609i = 3;
                            this.f11618r = 0;
                            this.f11603c.f(0);
                            dr2Var.f(i14);
                            break;
                            break;
                        }
                        if (i19 != 256) {
                            this.f11610j = 256;
                            k7 = i14 - 1;
                            i12 = 13;
                            i13 = 2;
                        } else {
                            k7 = i14;
                            i12 = 13;
                            i13 = 2;
                        }
                    }
                    this.f11610j = i9;
                    k7 = i14;
                    i12 = 13;
                    i13 = 2;
                }
                dr2Var.f(k7);
            } else if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        int min = Math.min(dr2Var.i(), this.f11618r - this.f11609i);
                        this.f11620t.e(dr2Var, min);
                        int i21 = this.f11609i + min;
                        this.f11609i = i21;
                        int i22 = this.f11618r;
                        if (i21 == i22) {
                            long j8 = this.f11619s;
                            if (j8 != -9223372036854775807L) {
                                this.f11620t.a(j8, 1, i22, 0, null);
                                this.f11619s += this.f11621u;
                            }
                            h();
                        }
                    } else {
                        if (k(dr2Var, this.f11602b.f3919a, true != this.f11611k ? 5 : 7)) {
                            this.f11602b.h(0);
                            if (this.f11616p) {
                                this.f11602b.j(10);
                            } else {
                                int c9 = this.f11602b.c(2) + 1;
                                if (c9 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c9);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f11602b.j(5);
                                int c10 = this.f11602b.c(3);
                                int i23 = this.f11614n;
                                int i24 = qb4.f10643c;
                                byte[] bArr = {(byte) (((i23 >> 1) & 7) | 16), (byte) (((c10 << 3) & 120) | ((i23 << 7) & 128))};
                                pb4 a7 = qb4.a(bArr);
                                bf4 bf4Var = new bf4();
                                bf4Var.h(this.f11605e);
                                bf4Var.s("audio/mp4a-latm");
                                bf4Var.f0(a7.f10171c);
                                bf4Var.e0(a7.f10170b);
                                bf4Var.t(a7.f10169a);
                                bf4Var.i(Collections.singletonList(bArr));
                                bf4Var.k(this.f11604d);
                                c0 y6 = bf4Var.y();
                                this.f11617q = 1024000000 / y6.f3674z;
                                this.f11606f.b(y6);
                                this.f11616p = true;
                            }
                            this.f11602b.j(4);
                            int c11 = this.f11602b.c(13) - 7;
                            if (this.f11611k) {
                                c11 -= 2;
                            }
                            i7 = c11;
                            td4Var = this.f11606f;
                            j7 = this.f11617q;
                            i8 = 0;
                            j(td4Var, j7, i8, i7);
                        }
                    }
                } else if (k(dr2Var, this.f11603c.h(), 10)) {
                    this.f11607g.e(this.f11603c, 10);
                    this.f11603c.f(6);
                    td4Var = this.f11607g;
                    j7 = 0;
                    i8 = 10;
                    i7 = 10 + this.f11603c.r();
                    j(td4Var, j7, i8, i7);
                }
            } else if (dr2Var.i() != 0) {
                this.f11602b.f3919a[0] = dr2Var.h()[dr2Var.k()];
                this.f11602b.h(2);
                int c12 = this.f11602b.c(4);
                int i25 = this.f11614n;
                if (i25 == -1 || c12 == i25) {
                    if (!this.f11612l) {
                        this.f11612l = true;
                        this.f11613m = this.f11615o;
                        this.f11614n = c12;
                    }
                    i();
                } else {
                    g();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f11619s = -9223372036854775807L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f11605e = k4Var.b();
        td4 r7 = rc4Var.r(k4Var.a(), 1);
        this.f11606f = r7;
        this.f11620t = r7;
        if (!this.f11601a) {
            this.f11607g = new nc4();
            return;
        }
        k4Var.c();
        td4 r8 = rc4Var.r(k4Var.a(), 5);
        this.f11607g = r8;
        bf4 bf4Var = new bf4();
        bf4Var.h(k4Var.b());
        bf4Var.s("application/id3");
        r8.b(bf4Var.y());
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f11619s = j7;
        }
    }
}
