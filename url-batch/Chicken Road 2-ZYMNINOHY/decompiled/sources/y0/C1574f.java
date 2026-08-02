package y0;

import W.J;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574f {

    /* renamed from: a, reason: collision with root package name */
    public final long f16148a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16150c;

    /* renamed from: d, reason: collision with root package name */
    public long f16151d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f16152e;

    /* renamed from: f, reason: collision with root package name */
    public long f16153f;

    /* renamed from: g, reason: collision with root package name */
    public long f16154g;

    /* renamed from: h, reason: collision with root package name */
    public long f16155h;

    public C1574f(long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f16148a = j4;
        this.f16149b = j5;
        this.f16152e = j6;
        this.f16153f = j7;
        this.f16154g = j8;
        this.f16150c = j9;
        this.f16155h = a(j5, 0L, j6, j7, j8, j9);
    }

    public static long a(long j4, long j5, long j6, long j7, long j8, long j9) {
        if (j7 + 1 >= j8 || j5 + 1 >= j6) {
            return j7;
        }
        long j10 = (long) ((j4 - j5) * ((j8 - j7) / (j6 - j5)));
        return J.k(((j10 + j7) - j9) - (j10 / 20), j7, j8 - 1);
    }
}
