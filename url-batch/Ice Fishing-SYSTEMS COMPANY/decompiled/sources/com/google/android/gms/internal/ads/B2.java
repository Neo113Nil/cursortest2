package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class B2 implements InterfaceC4204y2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23956b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23957c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23958d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23959e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23960f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f23961g;

    public B2(long j9, int i, long j10, int i4, long j11, long[] jArr) {
        this.f23955a = j9;
        this.f23956b = i;
        this.f23957c = j10;
        this.f23958d = i4;
        this.f23959e = j11;
        this.f23961g = jArr;
        this.f23960f = j11 != -1 ? j9 + j11 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f23957c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        double d2;
        double d3;
        boolean d9 = d();
        int i = this.f23956b;
        long j10 = this.f23955a;
        if (!d9) {
            C3070d1 c3070d1 = new C3070d1(0L, j10 + i);
            return new C2961b1(c3070d1, c3070d1);
        }
        String str = AbstractC3548lu.f32613a;
        long j11 = this.f23957c;
        long max = Math.max(0L, Math.min(j9, j11));
        double d10 = (max * 100.0d) / j11;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d2 = 256.0d;
        } else if (d10 >= 100.0d) {
            d2 = 256.0d;
            d11 = 256.0d;
        } else {
            int i4 = (int) d10;
            long[] jArr = this.f23961g;
            jArr.getClass();
            double d12 = jArr[i4];
            if (i4 == 99) {
                d2 = 256.0d;
                d3 = 256.0d;
            } else {
                d2 = 256.0d;
                d3 = jArr[i4 + 1];
            }
            d11 = ((d3 - d12) * (d10 - i4)) + d12;
        }
        long j12 = this.f23959e;
        C3070d1 c3070d12 = new C3070d1(max, j10 + Math.max(i, Math.min(Math.round((d11 / d2) * j12), j12 - 1)));
        return new C2961b1(c3070d12, c3070d12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return this.f23961g != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long e() {
        return this.f23960f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long f(long j9) {
        if (!d()) {
            return 0L;
        }
        long j10 = j9 - this.f23955a;
        if (j10 <= this.f23956b) {
            return 0L;
        }
        long[] jArr = this.f23961g;
        jArr.getClass();
        double d2 = (j10 * 256.0d) / this.f23959e;
        int s3 = AbstractC3548lu.s(jArr, (long) d2, true);
        long j11 = this.f23957c;
        long j12 = (s3 * j11) / 100;
        long j13 = jArr[s3];
        int i = s3 + 1;
        long j14 = (j11 * i) / 100;
        return Math.round((j13 == (s3 == 99 ? 256L : jArr[i]) ? 0.0d : (d2 - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final int g() {
        return this.f23958d;
    }
}
