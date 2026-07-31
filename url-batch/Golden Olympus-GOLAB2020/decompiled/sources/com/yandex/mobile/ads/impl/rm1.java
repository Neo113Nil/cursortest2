package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class rm1 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f31290c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31291d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31292e;

    /* renamed from: a, reason: collision with root package name */
    private final e52 f31288a = new e52(0);

    /* renamed from: f, reason: collision with root package name */
    private long f31293f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f31294g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f31295h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f31289b = new sf1();

    rm1() {
    }

    public final long a() {
        return this.f31295h;
    }

    public final e52 b() {
        return this.f31288a;
    }

    public final boolean c() {
        return this.f31290c;
    }

    public final int a(lz lzVar, hj1 hj1Var) {
        long j4 = -9223372036854775807L;
        if (!this.f31292e) {
            long b4 = lzVar.b();
            int min = (int) Math.min(20000L, b4);
            long j5 = b4 - min;
            if (lzVar.a() != j5) {
                hj1Var.f26771a = j5;
                return 1;
            }
            this.f31289b.c(min);
            lzVar.c();
            lzVar.b(this.f31289b.c(), 0, min, false);
            sf1 sf1Var = this.f31289b;
            int d4 = sf1Var.d();
            int e4 = sf1Var.e() - 4;
            while (true) {
                if (e4 < d4) {
                    break;
                }
                byte[] c4 = sf1Var.c();
                if (((c4[e4 + 3] & 255) | ((c4[e4] & 255) << 24) | ((c4[e4 + 1] & 255) << 16) | ((c4[e4 + 2] & 255) << 8)) == 442) {
                    sf1Var.e(e4 + 4);
                    long a4 = a(sf1Var);
                    if (a4 != -9223372036854775807L) {
                        j4 = a4;
                        break;
                    }
                }
                e4--;
            }
            this.f31294g = j4;
            this.f31292e = true;
            return 0;
        }
        if (this.f31294g == -9223372036854775807L) {
            this.f31289b.a(u82.f32878f);
            this.f31290c = true;
            lzVar.c();
            return 0;
        }
        if (this.f31291d) {
            long j6 = this.f31293f;
            if (j6 == -9223372036854775807L) {
                this.f31289b.a(u82.f32878f);
                this.f31290c = true;
                lzVar.c();
                return 0;
            }
            long b5 = this.f31288a.b(this.f31294g) - this.f31288a.b(j6);
            this.f31295h = b5;
            if (b5 < 0) {
                ms0.d("PsDurationReader", "Invalid duration: " + this.f31295h + ". Using TIME_UNSET instead.");
                this.f31295h = -9223372036854775807L;
            }
            this.f31289b.a(u82.f32878f);
            this.f31290c = true;
            lzVar.c();
            return 0;
        }
        int min2 = (int) Math.min(20000L, lzVar.b());
        long j7 = 0;
        if (lzVar.a() != j7) {
            hj1Var.f26771a = j7;
            return 1;
        }
        this.f31289b.c(min2);
        lzVar.c();
        lzVar.b(this.f31289b.c(), 0, min2, false);
        sf1 sf1Var2 = this.f31289b;
        int d5 = sf1Var2.d();
        int e5 = sf1Var2.e();
        while (true) {
            if (d5 >= e5 - 3) {
                break;
            }
            byte[] c5 = sf1Var2.c();
            int i4 = d5 + 1;
            if (((c5[d5 + 3] & 255) | ((c5[d5] & 255) << 24) | ((c5[i4] & 255) << 16) | ((c5[d5 + 2] & 255) << 8)) == 442) {
                sf1Var2.e(d5 + 4);
                long a5 = a(sf1Var2);
                if (a5 != -9223372036854775807L) {
                    j4 = a5;
                    break;
                }
            }
            d5 = i4;
        }
        this.f31293f = j4;
        this.f31291d = true;
        return 0;
    }

    public static long a(sf1 sf1Var) {
        int d4 = sf1Var.d();
        if (sf1Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        sf1Var.a(bArr, 0, 9);
        sf1Var.e(d4);
        byte b4 = bArr[0];
        if ((b4 & 196) == 68) {
            byte b5 = bArr[2];
            if ((b5 & 4) == 4) {
                byte b6 = bArr[4];
                if ((b6 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j4 = b4;
                    long j5 = b5;
                    return ((j5 & 3) << 13) | ((j4 & 3) << 28) | (((56 & j4) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j5 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
