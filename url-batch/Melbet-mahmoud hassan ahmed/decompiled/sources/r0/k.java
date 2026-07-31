package r0;

import android.os.SystemClock;
import r0.a2;

/* loaded from: classes.dex */
public final class k implements x1 {

    /* renamed from: a, reason: collision with root package name */
    private final float f20710a;

    /* renamed from: b, reason: collision with root package name */
    private final float f20711b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20712c;

    /* renamed from: d, reason: collision with root package name */
    private final float f20713d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20714e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20715f;

    /* renamed from: g, reason: collision with root package name */
    private final float f20716g;

    /* renamed from: h, reason: collision with root package name */
    private long f20717h;

    /* renamed from: i, reason: collision with root package name */
    private long f20718i;

    /* renamed from: j, reason: collision with root package name */
    private long f20719j;

    /* renamed from: k, reason: collision with root package name */
    private long f20720k;

    /* renamed from: l, reason: collision with root package name */
    private long f20721l;

    /* renamed from: m, reason: collision with root package name */
    private long f20722m;

    /* renamed from: n, reason: collision with root package name */
    private float f20723n;

    /* renamed from: o, reason: collision with root package name */
    private float f20724o;

    /* renamed from: p, reason: collision with root package name */
    private float f20725p;

    /* renamed from: q, reason: collision with root package name */
    private long f20726q;

    /* renamed from: r, reason: collision with root package name */
    private long f20727r;

    /* renamed from: s, reason: collision with root package name */
    private long f20728s;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f20729a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f20730b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f20731c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f20732d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f20733e = o2.m0.B0(20);

        /* renamed from: f, reason: collision with root package name */
        private long f20734f = o2.m0.B0(500);

        /* renamed from: g, reason: collision with root package name */
        private float f20735g = 0.999f;

        public k a() {
            return new k(this.f20729a, this.f20730b, this.f20731c, this.f20732d, this.f20733e, this.f20734f, this.f20735g);
        }

        public b b(float f7) {
            o2.a.a(f7 >= 1.0f);
            this.f20730b = f7;
            return this;
        }

        public b c(float f7) {
            o2.a.a(0.0f < f7 && f7 <= 1.0f);
            this.f20729a = f7;
            return this;
        }

        public b d(long j7) {
            o2.a.a(j7 > 0);
            this.f20733e = o2.m0.B0(j7);
            return this;
        }

        public b e(float f7) {
            o2.a.a(f7 >= 0.0f && f7 < 1.0f);
            this.f20735g = f7;
            return this;
        }

        public b f(long j7) {
            o2.a.a(j7 > 0);
            this.f20731c = j7;
            return this;
        }

        public b g(float f7) {
            o2.a.a(f7 > 0.0f);
            this.f20732d = f7 / 1000000.0f;
            return this;
        }

        public b h(long j7) {
            o2.a.a(j7 >= 0);
            this.f20734f = o2.m0.B0(j7);
            return this;
        }
    }

    private k(float f7, float f8, long j7, float f9, long j8, long j9, float f10) {
        this.f20710a = f7;
        this.f20711b = f8;
        this.f20712c = j7;
        this.f20713d = f9;
        this.f20714e = j8;
        this.f20715f = j9;
        this.f20716g = f10;
        this.f20717h = -9223372036854775807L;
        this.f20718i = -9223372036854775807L;
        this.f20720k = -9223372036854775807L;
        this.f20721l = -9223372036854775807L;
        this.f20724o = f7;
        this.f20723n = f8;
        this.f20725p = 1.0f;
        this.f20726q = -9223372036854775807L;
        this.f20719j = -9223372036854775807L;
        this.f20722m = -9223372036854775807L;
        this.f20727r = -9223372036854775807L;
        this.f20728s = -9223372036854775807L;
    }

    private void f(long j7) {
        long j8 = this.f20727r + (this.f20728s * 3);
        if (this.f20722m > j8) {
            float B0 = o2.m0.B0(this.f20712c);
            this.f20722m = o4.f.c(j8, this.f20719j, this.f20722m - (((long) ((this.f20725p - 1.0f) * B0)) + ((long) ((this.f20723n - 1.0f) * B0))));
            return;
        }
        long r7 = o2.m0.r(j7 - ((long) (Math.max(0.0f, this.f20725p - 1.0f) / this.f20713d)), this.f20722m, j8);
        this.f20722m = r7;
        long j9 = this.f20721l;
        if (j9 == -9223372036854775807L || r7 <= j9) {
            return;
        }
        this.f20722m = j9;
    }

    private void g() {
        long j7 = this.f20717h;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f20718i;
            if (j8 != -9223372036854775807L) {
                j7 = j8;
            }
            long j9 = this.f20720k;
            if (j9 != -9223372036854775807L && j7 < j9) {
                j7 = j9;
            }
            long j10 = this.f20721l;
            if (j10 != -9223372036854775807L && j7 > j10) {
                j7 = j10;
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f20719j == j7) {
            return;
        }
        this.f20719j = j7;
        this.f20722m = j7;
        this.f20727r = -9223372036854775807L;
        this.f20728s = -9223372036854775807L;
        this.f20726q = -9223372036854775807L;
    }

    private static long h(long j7, long j8, float f7) {
        return (long) ((j7 * f7) + ((1.0f - f7) * j8));
    }

    private void i(long j7, long j8) {
        long h7;
        long j9 = j7 - j8;
        long j10 = this.f20727r;
        if (j10 == -9223372036854775807L) {
            this.f20727r = j9;
            h7 = 0;
        } else {
            long max = Math.max(j9, h(j10, j9, this.f20716g));
            this.f20727r = max;
            h7 = h(this.f20728s, Math.abs(j9 - max), this.f20716g);
        }
        this.f20728s = h7;
    }

    @Override // r0.x1
    public void a() {
        long j7 = this.f20722m;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.f20715f;
        this.f20722m = j8;
        long j9 = this.f20721l;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f20722m = j9;
        }
        this.f20726q = -9223372036854775807L;
    }

    @Override // r0.x1
    public float b(long j7, long j8) {
        if (this.f20717h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j7, j8);
        if (this.f20726q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f20726q < this.f20712c) {
            return this.f20725p;
        }
        this.f20726q = SystemClock.elapsedRealtime();
        f(j7);
        long j9 = j7 - this.f20722m;
        if (Math.abs(j9) < this.f20714e) {
            this.f20725p = 1.0f;
        } else {
            this.f20725p = o2.m0.p((this.f20713d * j9) + 1.0f, this.f20724o, this.f20723n);
        }
        return this.f20725p;
    }

    @Override // r0.x1
    public void c(a2.g gVar) {
        this.f20717h = o2.m0.B0(gVar.f20447f);
        this.f20720k = o2.m0.B0(gVar.f20448g);
        this.f20721l = o2.m0.B0(gVar.f20449h);
        float f7 = gVar.f20450i;
        if (f7 == -3.4028235E38f) {
            f7 = this.f20710a;
        }
        this.f20724o = f7;
        float f8 = gVar.f20451j;
        if (f8 == -3.4028235E38f) {
            f8 = this.f20711b;
        }
        this.f20723n = f8;
        if (f7 == 1.0f && f8 == 1.0f) {
            this.f20717h = -9223372036854775807L;
        }
        g();
    }

    @Override // r0.x1
    public void d(long j7) {
        this.f20718i = j7;
        g();
    }

    @Override // r0.x1
    public long e() {
        return this.f20722m;
    }
}
