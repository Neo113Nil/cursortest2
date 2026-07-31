package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.rv0;

/* loaded from: classes3.dex */
public final class qz implements jr0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f30938a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30939b;

    /* renamed from: c, reason: collision with root package name */
    private final float f30940c;

    /* renamed from: d, reason: collision with root package name */
    private long f30941d;

    /* renamed from: e, reason: collision with root package name */
    private long f30942e;

    /* renamed from: f, reason: collision with root package name */
    private long f30943f;

    /* renamed from: g, reason: collision with root package name */
    private long f30944g;

    /* renamed from: h, reason: collision with root package name */
    private long f30945h;

    /* renamed from: i, reason: collision with root package name */
    private long f30946i;

    /* renamed from: j, reason: collision with root package name */
    private float f30947j;

    /* renamed from: k, reason: collision with root package name */
    private float f30948k;

    /* renamed from: l, reason: collision with root package name */
    private float f30949l;

    /* renamed from: m, reason: collision with root package name */
    private long f30950m;

    /* renamed from: n, reason: collision with root package name */
    private long f30951n;

    /* renamed from: o, reason: collision with root package name */
    private long f30952o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f30953a = u82.a(20L);

        /* renamed from: b, reason: collision with root package name */
        private long f30954b = u82.a(500L);

        /* renamed from: c, reason: collision with root package name */
        private float f30955c = 0.999f;

        public final qz a() {
            return new qz(this.f30953a, this.f30954b, this.f30955c);
        }
    }

    private void b() {
        long j4 = this.f30941d;
        if (j4 != -9223372036854775807L) {
            long j5 = this.f30942e;
            if (j5 != -9223372036854775807L) {
                j4 = j5;
            }
            long j6 = this.f30944g;
            if (j6 != -9223372036854775807L && j4 < j6) {
                j4 = j6;
            }
            long j7 = this.f30945h;
            if (j7 != -9223372036854775807L && j4 > j7) {
                j4 = j7;
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f30943f == j4) {
            return;
        }
        this.f30943f = j4;
        this.f30946i = j4;
        this.f30951n = -9223372036854775807L;
        this.f30952o = -9223372036854775807L;
        this.f30950m = -9223372036854775807L;
    }

    public final float a(long j4, long j5) {
        if (this.f30941d == -9223372036854775807L) {
            return 1.0f;
        }
        long j6 = j4 - j5;
        long j7 = this.f30951n;
        if (j7 == -9223372036854775807L) {
            this.f30951n = j6;
            this.f30952o = 0L;
        } else {
            float f4 = this.f30940c;
            long max = Math.max(j6, (long) (((1.0f - f4) * j6) + (j7 * f4)));
            this.f30951n = max;
            long abs = Math.abs(j6 - max);
            long j8 = this.f30952o;
            float f5 = this.f30940c;
            this.f30952o = (long) (((1.0f - f5) * abs) + (j8 * f5));
        }
        if (this.f30950m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f30950m < 1000) {
            return this.f30949l;
        }
        this.f30950m = SystemClock.elapsedRealtime();
        long j9 = (this.f30952o * 3) + this.f30951n;
        if (this.f30946i > j9) {
            float a4 = u82.a(1000L);
            long[] jArr = {j9, this.f30943f, this.f30946i - (((long) ((this.f30949l - 1.0f) * a4)) + ((long) ((this.f30947j - 1.0f) * a4)))};
            long j10 = jArr[0];
            for (int i4 = 1; i4 < 3; i4++) {
                long j11 = jArr[i4];
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            this.f30946i = j10;
        } else {
            long max2 = j4 - ((long) (Math.max(0.0f, this.f30949l - 1.0f) / 1.0E-7f));
            long j12 = this.f30946i;
            int i5 = u82.f32873a;
            long max3 = Math.max(j12, Math.min(max2, j9));
            this.f30946i = max3;
            long j13 = this.f30945h;
            if (j13 != -9223372036854775807L && max3 > j13) {
                this.f30946i = j13;
            }
        }
        long j14 = j4 - this.f30946i;
        if (Math.abs(j14) < this.f30938a) {
            this.f30949l = 1.0f;
        } else {
            float f6 = this.f30948k;
            float f7 = this.f30947j;
            int i6 = u82.f32873a;
            this.f30949l = Math.max(f6, Math.min((j14 * 1.0E-7f) + 1.0f, f7));
        }
        return this.f30949l;
    }

    public final void c() {
        long j4 = this.f30946i;
        if (j4 == -9223372036854775807L) {
            return;
        }
        long j5 = j4 + this.f30939b;
        this.f30946i = j5;
        long j6 = this.f30945h;
        if (j6 != -9223372036854775807L && j5 > j6) {
            this.f30946i = j6;
        }
        this.f30950m = -9223372036854775807L;
    }

    private qz(long j4, long j5, float f4) {
        this.f30938a = j4;
        this.f30939b = j5;
        this.f30940c = f4;
        this.f30941d = -9223372036854775807L;
        this.f30942e = -9223372036854775807L;
        this.f30944g = -9223372036854775807L;
        this.f30945h = -9223372036854775807L;
        this.f30948k = 0.97f;
        this.f30947j = 1.03f;
        this.f30949l = 1.0f;
        this.f30950m = -9223372036854775807L;
        this.f30943f = -9223372036854775807L;
        this.f30946i = -9223372036854775807L;
        this.f30951n = -9223372036854775807L;
        this.f30952o = -9223372036854775807L;
    }

    public final long a() {
        return this.f30946i;
    }

    public final void a(rv0.e eVar) {
        this.f30941d = u82.a(eVar.f31417b);
        this.f30944g = u82.a(eVar.f31418c);
        this.f30945h = u82.a(eVar.f31419d);
        float f4 = eVar.f31420e;
        if (f4 == -3.4028235E38f) {
            f4 = 0.97f;
        }
        this.f30948k = f4;
        float f5 = eVar.f31421f;
        if (f5 == -3.4028235E38f) {
            f5 = 1.03f;
        }
        this.f30947j = f5;
        if (f4 == 1.0f && f5 == 1.0f) {
            this.f30941d = -9223372036854775807L;
        }
        b();
    }

    public final void a(long j4) {
        this.f30942e = j4;
        b();
    }
}
