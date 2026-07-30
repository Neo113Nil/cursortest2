package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class L4 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final J4 f26101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26102b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26103c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26104d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26105e;

    public L4(J4 j42, int i, long j9, long j10) {
        this.f26101a = j42;
        this.f26102b = i;
        this.f26103c = j9;
        long j11 = (j10 - j9) / j42.f25730c;
        this.f26104d = j11;
        this.f26105e = b(j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f26105e;
    }

    public final long b(long j9) {
        return AbstractC3548lu.w(j9 * this.f26102b, 1000000L, this.f26101a.f25729b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        long j10 = this.f26102b;
        J4 j42 = this.f26101a;
        long j11 = (j42.f25729b * j9) / (j10 * 1000000);
        String str = AbstractC3548lu.f32613a;
        long j12 = this.f26104d - 1;
        long max = Math.max(0L, Math.min(j11, j12));
        long j13 = j42.f25730c;
        long b9 = b(max);
        long j14 = this.f26103c;
        C3070d1 c3070d1 = new C3070d1(b9, (max * j13) + j14);
        if (b9 >= j9 || max == j12) {
            return new C2961b1(c3070d1, c3070d1);
        }
        long j15 = max + 1;
        return new C2961b1(c3070d1, new C3070d1(b(j15), (j13 * j15) + j14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }
}
