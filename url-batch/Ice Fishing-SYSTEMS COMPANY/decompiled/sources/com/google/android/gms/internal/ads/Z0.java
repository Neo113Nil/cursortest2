package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Z0 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f28939a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.a f28940b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28941c;

    public Z0(long j9, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        PA.n(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f28939a = new G1.a(length2, 10);
            this.f28940b = new G1.a(length2, 10);
        } else {
            int i = length2 + 1;
            G1.a aVar = new G1.a(i, 10);
            this.f28939a = aVar;
            G1.a aVar2 = new G1.a(i, 10);
            this.f28940b = aVar2;
            aVar.r();
            aVar2.r();
        }
        this.f28939a.w(jArr);
        this.f28940b.w(jArr2);
        this.f28941c = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f28941c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        G1.a aVar = this.f28940b;
        int i = aVar.f1194u;
        if (i == 0) {
            C3070d1 c3070d1 = C3070d1.f29773c;
            return new C2961b1(c3070d1, c3070d1);
        }
        String str = AbstractC3548lu.f32613a;
        int i4 = i - 1;
        int i9 = 0;
        int i10 = 0;
        while (i10 <= i4) {
            int i11 = (i10 + i4) >>> 1;
            if (aVar.x(i11) < j9) {
                i10 = i11 + 1;
            } else {
                i4 = i11 - 1;
            }
        }
        int i12 = i4 + 1;
        if (i12 < aVar.f1194u && aVar.x(i12) == j9) {
            i9 = i12;
        } else if (i4 != -1) {
            i9 = i4;
        }
        long x3 = aVar.x(i9);
        G1.a aVar2 = this.f28939a;
        C3070d1 c3070d12 = new C3070d1(x3, aVar2.x(i9));
        if (x3 == j9 || i9 == aVar.f1194u - 1) {
            return new C2961b1(c3070d12, c3070d12);
        }
        int i13 = i9 + 1;
        return new C2961b1(c3070d12, new C3070d1(aVar.x(i13), aVar2.x(i13)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return this.f28940b.f1194u > 0;
    }
}
