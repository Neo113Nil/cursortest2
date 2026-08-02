package R0;

import W.J;
import y0.x;
import y0.z;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long f2319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2321c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2322d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2323e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2324f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f2325g;

    public j(long j4, int i4, long j5, int i5, long j6, long[] jArr) {
        this.f2319a = j4;
        this.f2320b = i4;
        this.f2321c = j5;
        this.f2322d = i5;
        this.f2323e = j6;
        this.f2325g = jArr;
        this.f2324f = j6 != -1 ? j4 + j6 : -1L;
    }

    @Override // R0.h
    public final long a(long j4) {
        long j5 = j4 - this.f2319a;
        if (!c() || j5 <= this.f2320b) {
            return 0L;
        }
        long[] jArr = this.f2325g;
        jArr.getClass();
        double d4 = (j5 * 256.0d) / this.f2323e;
        int f4 = J.f(jArr, (long) d4, true);
        long j6 = this.f2321c;
        long j7 = (f4 * j6) / 100;
        long j8 = jArr[f4];
        int i4 = f4 + 1;
        long j9 = (j6 * i4) / 100;
        return Math.round((j8 == (f4 == 99 ? 256L : jArr[i4]) ? 0.0d : (d4 - j8) / (r0 - j8)) * (j9 - j7)) + j7;
    }

    @Override // R0.h
    public final long b() {
        return this.f2324f;
    }

    @Override // y0.y
    public final boolean c() {
        return this.f2325g != null;
    }

    @Override // y0.y
    public final x e(long j4) {
        double d4;
        double d5;
        boolean c4 = c();
        int i4 = this.f2320b;
        long j5 = this.f2319a;
        if (!c4) {
            z zVar = new z(0L, j5 + i4);
            return new x(zVar, zVar);
        }
        long k4 = J.k(j4, 0L, this.f2321c);
        double d6 = (k4 * 100.0d) / this.f2321c;
        double d7 = 0.0d;
        if (d6 <= 0.0d) {
            d4 = 256.0d;
        } else if (d6 >= 100.0d) {
            d4 = 256.0d;
            d7 = 256.0d;
        } else {
            int i5 = (int) d6;
            long[] jArr = this.f2325g;
            jArr.getClass();
            double d8 = jArr[i5];
            if (i5 == 99) {
                d4 = 256.0d;
                d5 = 256.0d;
            } else {
                d4 = 256.0d;
                d5 = jArr[i5 + 1];
            }
            d7 = ((d5 - d8) * (d6 - i5)) + d8;
        }
        long j6 = this.f2323e;
        z zVar2 = new z(k4, j5 + J.k(Math.round((d7 / d4) * j6), i4, j6 - 1));
        return new x(zVar2, zVar2);
    }

    @Override // R0.h
    public final int f() {
        return this.f2322d;
    }

    @Override // y0.y
    public final long g() {
        return this.f2321c;
    }
}
