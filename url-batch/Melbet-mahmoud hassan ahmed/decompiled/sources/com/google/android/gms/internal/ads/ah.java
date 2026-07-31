package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ah implements jh {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2768b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2769c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2770d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2771e;

    public ah(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2767a = iArr;
        this.f2768b = jArr;
        this.f2769c = jArr2;
        this.f2770d = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f2771e = 0L;
        } else {
            int i7 = length - 1;
            this.f2771e = jArr2[i7] + jArr3[i7];
        }
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final long a(long j7) {
        return this.f2768b[zm.c(this.f2770d, j7, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final long zza() {
        return this.f2771e;
    }
}
