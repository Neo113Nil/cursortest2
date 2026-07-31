package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class gg3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f5628a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5629b;

    /* renamed from: c, reason: collision with root package name */
    private long f5630c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f5631d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f5633f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f5634g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f5637j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f5636i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f5638k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f5639l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f5632e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f5635h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f5640m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f5641n = -9223372036854775807L;

    /* synthetic */ gg3(float f7, float f8, long j7, float f9, long j8, long j9, float f10, ff3 ff3Var) {
        this.f5628a = j8;
        this.f5629b = j9;
    }

    private static long f(long j7, long j8, float f7) {
        return (long) ((j7 * 0.999f) + (j8 * 9.999871E-4f));
    }

    private final void g() {
        long j7 = this.f5630c;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f5631d;
            if (j8 != -9223372036854775807L) {
                j7 = j8;
            }
            long j9 = this.f5633f;
            if (j9 != -9223372036854775807L && j7 < j9) {
                j7 = j9;
            }
            long j10 = this.f5634g;
            if (j10 != -9223372036854775807L && j7 > j10) {
                j7 = j10;
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f5632e == j7) {
            return;
        }
        this.f5632e = j7;
        this.f5635h = j7;
        this.f5640m = -9223372036854775807L;
        this.f5641n = -9223372036854775807L;
        this.f5639l = -9223372036854775807L;
    }

    public final float a(long j7, long j8) {
        long f7;
        long U;
        if (this.f5630c == -9223372036854775807L) {
            return 1.0f;
        }
        long j9 = j7 - j8;
        long j10 = this.f5640m;
        if (j10 == -9223372036854775807L) {
            this.f5640m = j9;
            f7 = 0;
        } else {
            long max = Math.max(j9, f(j10, j9, 0.999f));
            this.f5640m = max;
            f7 = f(this.f5641n, Math.abs(j9 - max), 0.999f);
        }
        this.f5641n = f7;
        if (this.f5639l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f5639l < 1000) {
            return this.f5638k;
        }
        this.f5639l = SystemClock.elapsedRealtime();
        long j11 = this.f5640m + (this.f5641n * 3);
        if (this.f5635h > j11) {
            float c7 = nz3.c(1000L);
            long[] jArr = {j11, this.f5632e, this.f5635h - (((long) ((this.f5638k - 1.0f) * c7)) + ((long) ((this.f5636i - 1.0f) * c7)))};
            U = jArr[0];
            for (int i7 = 1; i7 < 3; i7++) {
                long j12 = jArr[i7];
                if (j12 > U) {
                    U = j12;
                }
            }
            this.f5635h = U;
        } else {
            U = n13.U(j7 - ((long) (Math.max(0.0f, this.f5638k - 1.0f) / 1.0E-7f)), this.f5635h, j11);
            this.f5635h = U;
            long j13 = this.f5634g;
            if (j13 != -9223372036854775807L && U > j13) {
                this.f5635h = j13;
                U = j13;
            }
        }
        long j14 = j7 - U;
        float A = Math.abs(j14) >= this.f5628a ? n13.A((j14 * 1.0E-7f) + 1.0f, this.f5637j, this.f5636i) : 1.0f;
        this.f5638k = A;
        return A;
    }

    public final long b() {
        return this.f5635h;
    }

    public final void c() {
        long j7 = this.f5635h;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.f5629b;
        this.f5635h = j8;
        long j9 = this.f5634g;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f5635h = j9;
        }
        this.f5639l = -9223372036854775807L;
    }

    public final void d(th thVar) {
        long j7 = thVar.f12212a;
        this.f5630c = nz3.c(-9223372036854775807L);
        this.f5633f = nz3.c(-9223372036854775807L);
        this.f5634g = nz3.c(-9223372036854775807L);
        this.f5637j = 0.97f;
        this.f5636i = 1.03f;
        g();
    }

    public final void e(long j7) {
        this.f5631d = j7;
        g();
    }
}
