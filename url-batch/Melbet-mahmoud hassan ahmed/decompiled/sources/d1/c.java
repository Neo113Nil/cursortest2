package d1;

import android.util.Pair;
import o1.k;
import o2.m0;
import w0.b0;
import w0.c0;

/* loaded from: classes.dex */
final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f15516a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15517b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15518c;

    private c(long[] jArr, long[] jArr2, long j7) {
        this.f15516a = jArr;
        this.f15517b = jArr2;
        this.f15518c = j7 == -9223372036854775807L ? m0.B0(jArr2[jArr2.length - 1]) : j7;
    }

    public static c a(long j7, k kVar, long j8) {
        int length = kVar.f19680j.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += kVar.f19678h + kVar.f19680j[i9];
            j9 += kVar.f19679i + kVar.f19681k[i9];
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new c(jArr, jArr2, j8);
    }

    private static Pair<Long, Long> b(long j7, long[] jArr, long[] jArr2) {
        double d7;
        Long valueOf;
        Long valueOf2;
        int i7 = m0.i(jArr, j7, true, true);
        long j8 = jArr[i7];
        long j9 = jArr2[i7];
        int i8 = i7 + 1;
        if (i8 == jArr.length) {
            valueOf = Long.valueOf(j8);
            valueOf2 = Long.valueOf(j9);
        } else {
            long j10 = jArr[i8];
            long j11 = jArr2[i8];
            if (j10 == j8) {
                d7 = 0.0d;
            } else {
                double d8 = j7;
                double d9 = j8;
                Double.isNaN(d8);
                Double.isNaN(d9);
                double d10 = j10 - j8;
                Double.isNaN(d10);
                d7 = (d8 - d9) / d10;
            }
            double d11 = j11 - j9;
            Double.isNaN(d11);
            valueOf = Long.valueOf(j7);
            valueOf2 = Long.valueOf(((long) (d7 * d11)) + j9);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // d1.g
    public long c(long j7) {
        return m0.B0(((Long) b(j7, this.f15516a, this.f15517b).second).longValue());
    }

    @Override // d1.g
    public long f() {
        return -1L;
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        Pair<Long, Long> b7 = b(m0.Y0(m0.r(j7, 0L, this.f15518c)), this.f15517b, this.f15516a);
        return new b0.a(new c0(m0.B0(((Long) b7.first).longValue()), ((Long) b7.second).longValue()));
    }

    @Override // w0.b0
    public long j() {
        return this.f15518c;
    }
}
