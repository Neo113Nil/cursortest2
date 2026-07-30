package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3934t2 implements InterfaceC4204y2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f34336a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f34337b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34338c;

    public C3934t2(long j9, long[] jArr, long[] jArr2) {
        this.f34336a = jArr;
        this.f34337b = jArr2;
        this.f34338c = j9 == com.anythink.basead.exoplayer.b.f6539b ? AbstractC3548lu.u(jArr2[jArr2.length - 1]) : j9;
    }

    public static Pair b(long j9, long[] jArr, long[] jArr2) {
        int s3 = AbstractC3548lu.s(jArr, j9, true);
        long j10 = jArr[s3];
        long j11 = jArr2[s3];
        int i = s3 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j9), Long.valueOf(((long) ((jArr[i] == j10 ? 0.0d : (j9 - j10) / (r6 - j10)) * (jArr2[i] - j11))) + j11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f34338c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        String str = AbstractC3548lu.f32613a;
        Pair b9 = b(AbstractC3548lu.t(Math.max(0L, Math.min(j9, this.f34338c))), this.f34337b, this.f34336a);
        C3070d1 c3070d1 = new C3070d1(AbstractC3548lu.u(((Long) b9.first).longValue()), ((Long) b9.second).longValue());
        return new C2961b1(c3070d1, c3070d1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long e() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long f(long j9) {
        return AbstractC3548lu.u(((Long) b(j9, this.f34336a, this.f34337b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final int g() {
        return -2147483647;
    }
}
