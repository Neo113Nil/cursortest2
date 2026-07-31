package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class g64 implements i74 {

    /* renamed from: a, reason: collision with root package name */
    private final i74 f5471a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5472b;

    public g64(i74 i74Var, long j7) {
        this.f5471a = i74Var;
        this.f5472b = j7;
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int a(long j7) {
        return this.f5471a.a(j7 - this.f5472b);
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final boolean b() {
        return this.f5471a.b();
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int c(cx3 cx3Var, z51 z51Var, int i7) {
        int c7 = this.f5471a.c(cx3Var, z51Var, i7);
        if (c7 != -4) {
            return c7;
        }
        z51Var.f14954e = Math.max(0L, z51Var.f14954e + this.f5472b);
        return -4;
    }

    public final i74 d() {
        return this.f5471a;
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final void g() {
        this.f5471a.g();
    }
}
