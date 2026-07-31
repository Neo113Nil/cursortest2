package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class l01 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f28377a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f28378b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28379c;

    private l01(long j4, long[] jArr, long[] jArr2) {
        this.f28377a = jArr;
        this.f28378b = jArr2;
        this.f28379c = j4 == -9223372036854775807L ? u82.a(jArr2[jArr2.length - 1]) : j4;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f28379c;
    }

    public static l01 a(long j4, k01 k01Var, long j5) {
        int length = k01Var.f27964f.length;
        int i4 = length + 1;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        jArr[0] = j4;
        long j6 = 0;
        jArr2[0] = 0;
        for (int i5 = 1; i5 <= length; i5++) {
            int i6 = i5 - 1;
            j4 += k01Var.f27962d + k01Var.f27964f[i6];
            j6 += k01Var.f27963e + k01Var.f27965g[i6];
            jArr[i5] = j4;
            jArr2[i5] = j6;
        }
        return new l01(j5, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j5 = this.f28379c;
        int i4 = u82.f32873a;
        Pair<Long, Long> a4 = a(u82.b(Math.max(0L, Math.min(j4, j5))), this.f28378b, this.f28377a);
        vw1 vw1Var = new vw1(u82.a(((Long) a4.first).longValue()), ((Long) a4.second).longValue());
        return new tw1.a(vw1Var, vw1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return u82.a(((Long) a(j4, this.f28377a, this.f28378b).second).longValue());
    }

    private static Pair<Long, Long> a(long j4, long[] jArr, long[] jArr2) {
        int b4 = u82.b(jArr, j4, true);
        long j5 = jArr[b4];
        long j6 = jArr2[b4];
        int i4 = b4 + 1;
        if (i4 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j6));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i4] == j5 ? 0.0d : (j4 - j5) / (r6 - j5)) * (jArr2[i4] - j6))) + j6));
    }
}
