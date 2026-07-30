package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ZQ implements VQ {

    /* renamed from: a, reason: collision with root package name */
    public final VQ f28987a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28988b;

    public ZQ(VQ vq, long j9) {
        this.f28987a = vq;
        this.f28988b = j9;
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final boolean a() {
        return this.f28987a.a();
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final int b(long j9) {
        return this.f28987a.b(j9 - this.f28988b);
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final int c(C4164xG c4164xG, IN in, int i) {
        int c4 = this.f28987a.c(c4164xG, in, i);
        if (c4 != -4) {
            return c4;
        }
        in.f25553f += this.f28988b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final void d() {
        this.f28987a.d();
    }
}
