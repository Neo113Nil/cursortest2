package R0;

import W.J;
import y0.x;
import y0.z;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2314a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2315b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2316c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2317d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2318e;

    public i(long[] jArr, long[] jArr2, long j4, long j5, long j6, int i4) {
        this.f2314a = jArr;
        this.f2315b = jArr2;
        this.f2316c = j4;
        this.f2317d = j6;
        this.f2318e = i4;
    }

    @Override // R0.h
    public final long a(long j4) {
        return this.f2314a[J.f(this.f2315b, j4, true)];
    }

    @Override // R0.h
    public final long b() {
        return this.f2317d;
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        long[] jArr = this.f2314a;
        int f4 = J.f(jArr, j4, true);
        long j5 = jArr[f4];
        long[] jArr2 = this.f2315b;
        z zVar = new z(j5, jArr2[f4]);
        if (j5 >= j4 || f4 == jArr.length - 1) {
            return new x(zVar, zVar);
        }
        int i4 = f4 + 1;
        return new x(zVar, new z(jArr[i4], jArr2[i4]));
    }

    @Override // R0.h
    public final int f() {
        return this.f2318e;
    }

    @Override // y0.y
    public final long g() {
        return this.f2316c;
    }
}
