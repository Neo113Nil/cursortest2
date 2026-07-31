package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class k3 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7341a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f7342b;

    /* renamed from: c, reason: collision with root package name */
    private final cq2 f7343c;

    /* renamed from: d, reason: collision with root package name */
    private td4 f7344d;

    /* renamed from: e, reason: collision with root package name */
    private String f7345e;

    /* renamed from: f, reason: collision with root package name */
    private c0 f7346f;

    /* renamed from: g, reason: collision with root package name */
    private int f7347g;

    /* renamed from: h, reason: collision with root package name */
    private int f7348h;

    /* renamed from: i, reason: collision with root package name */
    private int f7349i;

    /* renamed from: j, reason: collision with root package name */
    private int f7350j;

    /* renamed from: k, reason: collision with root package name */
    private long f7351k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7352l;

    /* renamed from: m, reason: collision with root package name */
    private int f7353m;

    /* renamed from: n, reason: collision with root package name */
    private int f7354n;

    /* renamed from: o, reason: collision with root package name */
    private int f7355o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7356p;

    /* renamed from: q, reason: collision with root package name */
    private long f7357q;

    /* renamed from: r, reason: collision with root package name */
    private int f7358r;

    /* renamed from: s, reason: collision with root package name */
    private long f7359s;

    /* renamed from: t, reason: collision with root package name */
    private int f7360t;

    /* renamed from: u, reason: collision with root package name */
    private String f7361u;

    public k3(String str) {
        this.f7341a = str;
        dr2 dr2Var = new dr2(1024);
        this.f7342b = dr2Var;
        byte[] h7 = dr2Var.h();
        this.f7343c = new cq2(h7, h7.length);
        this.f7351k = -9223372036854775807L;
    }

    private final int f(cq2 cq2Var) {
        int a7 = cq2Var.a();
        pb4 b7 = qb4.b(cq2Var, true);
        this.f7361u = b7.f10171c;
        this.f7358r = b7.f10169a;
        this.f7360t = b7.f10170b;
        return a7 - cq2Var.a();
    }

    private static long g(cq2 cq2Var) {
        return cq2Var.c((cq2Var.c(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        if (r14.f7352l == false) goto L103;
     */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        int i7;
        int i8;
        int i9;
        boolean l7;
        wu1.b(this.f7344d);
        while (dr2Var.i() > 0) {
            int i10 = this.f7347g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int s7 = dr2Var.s();
                    if ((s7 & 224) == 224) {
                        this.f7350j = s7;
                        this.f7347g = 2;
                    } else if (s7 != 86) {
                        this.f7347g = 0;
                    }
                } else if (i10 != 2) {
                    int min = Math.min(dr2Var.i(), this.f7349i - this.f7348h);
                    dr2Var.b(this.f7343c.f3919a, this.f7348h, min);
                    int i11 = this.f7348h + min;
                    this.f7348h = i11;
                    if (i11 == this.f7349i) {
                        this.f7343c.h(0);
                        cq2 cq2Var = this.f7343c;
                        if (!cq2Var.l()) {
                            this.f7352l = true;
                            int c7 = cq2Var.c(1);
                            if (c7 == 1) {
                                i9 = cq2Var.c(1);
                                i8 = 1;
                            } else {
                                i8 = c7;
                                i9 = 0;
                            }
                            this.f7353m = i9;
                            if (i9 != 0) {
                                throw dz.a(null, null);
                            }
                            if (i8 == 1) {
                                g(cq2Var);
                                i8 = 1;
                            }
                            if (!cq2Var.l()) {
                                throw dz.a(null, null);
                            }
                            this.f7354n = cq2Var.c(6);
                            int c8 = cq2Var.c(4);
                            int c9 = cq2Var.c(3);
                            if (c8 != 0 || c9 != 0) {
                                throw dz.a(null, null);
                            }
                            if (i8 == 0) {
                                int b7 = cq2Var.b();
                                int f7 = f(cq2Var);
                                cq2Var.h(b7);
                                byte[] bArr = new byte[(f7 + 7) / 8];
                                cq2Var.f(bArr, 0, f7);
                                bf4 bf4Var = new bf4();
                                bf4Var.h(this.f7345e);
                                bf4Var.s("audio/mp4a-latm");
                                bf4Var.f0(this.f7361u);
                                bf4Var.e0(this.f7360t);
                                bf4Var.t(this.f7358r);
                                bf4Var.i(Collections.singletonList(bArr));
                                bf4Var.k(this.f7341a);
                                c0 y6 = bf4Var.y();
                                if (!y6.equals(this.f7346f)) {
                                    this.f7346f = y6;
                                    this.f7359s = 1024000000 / y6.f3674z;
                                    this.f7344d.b(y6);
                                }
                            } else {
                                cq2Var.j(((int) g(cq2Var)) - f(cq2Var));
                            }
                            int c10 = cq2Var.c(3);
                            this.f7355o = c10;
                            if (c10 == 0) {
                                cq2Var.j(8);
                            } else if (c10 == 1) {
                                cq2Var.j(9);
                            } else if (c10 == 3 || c10 == 4 || c10 == 5) {
                                cq2Var.j(6);
                            } else {
                                if (c10 != 6 && c10 != 7) {
                                    throw new IllegalStateException();
                                }
                                cq2Var.j(1);
                            }
                            boolean l8 = cq2Var.l();
                            this.f7356p = l8;
                            this.f7357q = 0L;
                            if (l8) {
                                if (i8 != 1) {
                                    do {
                                        l7 = cq2Var.l();
                                        this.f7357q = (this.f7357q << 8) + cq2Var.c(8);
                                    } while (l7);
                                } else {
                                    this.f7357q = g(cq2Var);
                                }
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(8);
                            }
                        }
                        if (this.f7353m != 0) {
                            throw dz.a(null, null);
                        }
                        if (this.f7354n != 0) {
                            throw dz.a(null, null);
                        }
                        if (this.f7355o != 0) {
                            throw dz.a(null, null);
                        }
                        int i12 = 0;
                        while (true) {
                            int c11 = cq2Var.c(8);
                            i7 = i12 + c11;
                            if (c11 != 255) {
                                break;
                            } else {
                                i12 = i7;
                            }
                        }
                        int b8 = cq2Var.b();
                        if ((b8 & 7) == 0) {
                            this.f7342b.f(b8 >> 3);
                        } else {
                            cq2Var.f(this.f7342b.h(), 0, i7 * 8);
                            this.f7342b.f(0);
                        }
                        rd4.b(this.f7344d, this.f7342b, i7);
                        long j7 = this.f7351k;
                        if (j7 != -9223372036854775807L) {
                            this.f7344d.a(j7, 1, i7, 0, null);
                            this.f7351k += this.f7359s;
                        }
                        if (this.f7356p) {
                            cq2Var.j((int) this.f7357q);
                        }
                        this.f7347g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int s8 = ((this.f7350j & (-225)) << 8) | dr2Var.s();
                    this.f7349i = s8;
                    if (s8 > this.f7342b.h().length) {
                        this.f7342b.c(this.f7349i);
                        cq2 cq2Var2 = this.f7343c;
                        byte[] h7 = this.f7342b.h();
                        cq2Var2.g(h7, h7.length);
                    }
                    this.f7348h = 0;
                    this.f7347g = 3;
                }
            } else if (dr2Var.s() == 86) {
                this.f7347g = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f7347g = 0;
        this.f7351k = -9223372036854775807L;
        this.f7352l = false;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f7344d = rc4Var.r(k4Var.a(), 1);
        this.f7345e = k4Var.b();
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f7351k = j7;
        }
    }
}
