package R0;

import y0.x;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class a implements h, y {

    /* renamed from: a, reason: collision with root package name */
    public final long f2273a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2275c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2277e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2278f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2279g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2280h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2281i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2282j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2283k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2284l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2285m;

    public a(long j4, long j5, int i4, int i5, boolean z, boolean z4) {
        this.f2273a = j4;
        this.f2274b = j5;
        this.f2275c = i5 == -1 ? 1 : i5;
        this.f2277e = i4;
        this.f2279g = z;
        this.f2280h = z4;
        if (j4 == -1) {
            this.f2276d = -1L;
            this.f2278f = -9223372036854775807L;
        } else {
            long j6 = j4 - j5;
            this.f2276d = j6;
            this.f2278f = (Math.max(0L, j6) * 8000000) / i4;
        }
        this.f2281i = j5;
        this.f2282j = i4;
        this.f2283k = i5;
        this.f2284l = z;
        this.f2285m = j4 == -1 ? -1L : j4;
    }

    @Override // R0.h
    public final long a(long j4) {
        return (Math.max(0L, j4 - this.f2274b) * 8000000) / this.f2277e;
    }

    @Override // R0.h
    public final long b() {
        return this.f2285m;
    }

    @Override // y0.y
    public final boolean c() {
        return this.f2276d != -1 || this.f2279g;
    }

    @Override // y0.y
    public final boolean d() {
        return this.f2280h;
    }

    @Override // y0.y
    public final x e(long j4) {
        long j5 = this.f2276d;
        long j6 = this.f2274b;
        if (j5 == -1 && !this.f2279g) {
            z zVar = new z(0L, j6);
            return new x(zVar, zVar);
        }
        int i4 = this.f2277e;
        long j7 = this.f2275c;
        long j8 = (((i4 * j4) / 8000000) / j7) * j7;
        if (j5 != -1) {
            j8 = Math.min(j8, j5 - j7);
        }
        long max = Math.max(j8, 0L) + j6;
        long max2 = (Math.max(0L, max - j6) * 8000000) / i4;
        z zVar2 = new z(max2, max);
        if (j5 != -1 && max2 < j4) {
            long j9 = max + j7;
            if (j9 < this.f2273a) {
                return new x(zVar2, new z((Math.max(0L, j9 - j6) * 8000000) / i4, j9));
            }
        }
        return new x(zVar2, zVar2);
    }

    @Override // R0.h
    public final int f() {
        return this.f2282j;
    }

    @Override // y0.y
    public final long g() {
        return this.f2278f;
    }
}
