package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class se4 extends ed4 {

    /* renamed from: b, reason: collision with root package name */
    private final long f11801b;

    public se4(pc4 pc4Var, long j7) {
        super(pc4Var);
        wu1.d(pc4Var.b() >= j7);
        this.f11801b = j7;
    }

    @Override // com.google.android.gms.internal.ads.ed4, com.google.android.gms.internal.ads.pc4
    public final long b() {
        return super.b() - this.f11801b;
    }

    @Override // com.google.android.gms.internal.ads.ed4, com.google.android.gms.internal.ads.pc4
    public final long c() {
        return super.c() - this.f11801b;
    }

    @Override // com.google.android.gms.internal.ads.ed4, com.google.android.gms.internal.ads.pc4
    public final long g() {
        return super.g() - this.f11801b;
    }
}
