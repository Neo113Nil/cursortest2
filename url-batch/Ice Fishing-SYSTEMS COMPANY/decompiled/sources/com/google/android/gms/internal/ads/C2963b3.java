package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2963b3 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3017c3 f29386a;

    public /* synthetic */ C2963b3(C3017c3 c3017c3) {
        Objects.requireNonNull(c3017c3);
        this.f29386a = c3017c3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        C3017c3 c3017c3 = this.f29386a;
        AbstractC3450k3 abstractC3450k3 = c3017c3.f29631w;
        return (c3017c3.f29633y * 1000000) / abstractC3450k3.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        C3017c3 c3017c3 = this.f29386a;
        BigInteger valueOf = BigInteger.valueOf((c3017c3.f29631w.i * j9) / 1000000);
        long j10 = c3017c3.f29630v;
        long j11 = c3017c3.f29629u;
        long longValue = valueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(c3017c3.f29633y)).longValue() + j11;
        String str = AbstractC3548lu.f32613a;
        C3070d1 c3070d1 = new C3070d1(j9, Math.max(j11, Math.min(longValue - 30000, j10 - 1)));
        return new C2961b1(c3070d1, c3070d1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return true;
    }
}
