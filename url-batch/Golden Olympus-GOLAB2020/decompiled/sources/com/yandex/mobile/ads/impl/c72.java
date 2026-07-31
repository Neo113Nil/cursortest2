package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class c72 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f24084d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24085e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24086f;

    /* renamed from: a, reason: collision with root package name */
    private final int f24081a = 112800;

    /* renamed from: b, reason: collision with root package name */
    private final e52 f24082b = new e52(0);

    /* renamed from: g, reason: collision with root package name */
    private long f24087g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f24088h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f24089i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f24083c = new sf1();

    c72() {
    }

    public final long a() {
        return this.f24089i;
    }

    public final e52 b() {
        return this.f24082b;
    }

    public final boolean c() {
        return this.f24084d;
    }

    public final int a(lz lzVar, hj1 hj1Var, int i4) {
        if (i4 <= 0) {
            this.f24083c.a(u82.f32878f);
            this.f24084d = true;
            lzVar.c();
            return 0;
        }
        long j4 = -9223372036854775807L;
        if (!this.f24086f) {
            long b4 = lzVar.b();
            int min = (int) Math.min(this.f24081a, b4);
            long j5 = b4 - min;
            if (lzVar.a() != j5) {
                hj1Var.f26771a = j5;
                return 1;
            }
            this.f24083c.c(min);
            lzVar.c();
            lzVar.b(this.f24083c.c(), 0, min, false);
            sf1 sf1Var = this.f24083c;
            int d4 = sf1Var.d();
            int e4 = sf1Var.e();
            int i5 = e4 - 188;
            while (true) {
                if (i5 < d4) {
                    break;
                }
                byte[] c4 = sf1Var.c();
                int i6 = -4;
                int i7 = 0;
                while (true) {
                    if (i6 > 4) {
                        break;
                    }
                    int i8 = (i6 * 188) + i5;
                    if (i8 < d4 || i8 >= e4 || c4[i8] != 71) {
                        i7 = 0;
                    } else {
                        i7++;
                        if (i7 == 5) {
                            long a4 = f72.a(i5, i4, sf1Var);
                            if (a4 != -9223372036854775807L) {
                                j4 = a4;
                                break;
                            }
                        }
                    }
                    i6++;
                }
                i5--;
            }
            this.f24088h = j4;
            this.f24086f = true;
            return 0;
        }
        if (this.f24088h == -9223372036854775807L) {
            this.f24083c.a(u82.f32878f);
            this.f24084d = true;
            lzVar.c();
            return 0;
        }
        if (this.f24085e) {
            long j6 = this.f24087g;
            if (j6 == -9223372036854775807L) {
                this.f24083c.a(u82.f32878f);
                this.f24084d = true;
                lzVar.c();
                return 0;
            }
            long b5 = this.f24082b.b(this.f24088h) - this.f24082b.b(j6);
            this.f24089i = b5;
            if (b5 < 0) {
                ms0.d("TsDurationReader", "Invalid duration: " + this.f24089i + ". Using TIME_UNSET instead.");
                this.f24089i = -9223372036854775807L;
            }
            this.f24083c.a(u82.f32878f);
            this.f24084d = true;
            lzVar.c();
            return 0;
        }
        int min2 = (int) Math.min(this.f24081a, lzVar.b());
        long j7 = 0;
        if (lzVar.a() != j7) {
            hj1Var.f26771a = j7;
            return 1;
        }
        this.f24083c.c(min2);
        lzVar.c();
        lzVar.b(this.f24083c.c(), 0, min2, false);
        sf1 sf1Var2 = this.f24083c;
        int d5 = sf1Var2.d();
        int e5 = sf1Var2.e();
        while (true) {
            if (d5 >= e5) {
                break;
            }
            if (sf1Var2.c()[d5] == 71) {
                long a5 = f72.a(d5, i4, sf1Var2);
                if (a5 != -9223372036854775807L) {
                    j4 = a5;
                    break;
                }
            }
            d5++;
        }
        this.f24087g = j4;
        this.f24085e = true;
        return 0;
    }
}
