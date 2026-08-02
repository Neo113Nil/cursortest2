package R0;

import W.J;
import android.util.Pair;
import y0.x;
import y0.z;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2286a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2287b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2288c;

    public c(long j4, long[] jArr, long[] jArr2) {
        this.f2286a = jArr;
        this.f2287b = jArr2;
        this.f2288c = j4 == -9223372036854775807L ? J.M(jArr2[jArr2.length - 1]) : j4;
    }

    public static Pair h(long j4, long[] jArr, long[] jArr2) {
        int f4 = J.f(jArr, j4, true);
        long j5 = jArr[f4];
        long j6 = jArr2[f4];
        int i4 = f4 + 1;
        if (i4 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j6));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i4] == j5 ? 0.0d : (j4 - j5) / (r6 - j5)) * (jArr2[i4] - j6))) + j6));
    }

    @Override // R0.h
    public final long a(long j4) {
        return J.M(((Long) h(j4, this.f2286a, this.f2287b).second).longValue());
    }

    @Override // R0.h
    public final long b() {
        return -1L;
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        Pair h2 = h(J.Z(J.k(j4, 0L, this.f2288c)), this.f2287b, this.f2286a);
        z zVar = new z(J.M(((Long) h2.first).longValue()), ((Long) h2.second).longValue());
        return new x(zVar, zVar);
    }

    @Override // R0.h
    public final int f() {
        return -2147483647;
    }

    @Override // y0.y
    public final long g() {
        return this.f2288c;
    }
}
