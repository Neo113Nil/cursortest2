package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class q64 implements i74 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t64 f10599b;

    public q64(t64 t64Var, int i7) {
        this.f10599b = t64Var;
        this.f10598a = i7;
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int a(long j7) {
        return this.f10599b.O(this.f10598a, j7);
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final boolean b() {
        return this.f10599b.z(this.f10598a);
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int c(cx3 cx3Var, z51 z51Var, int i7) {
        return this.f10599b.N(this.f10598a, cx3Var, z51Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final void g() {
        this.f10599b.x(this.f10598a);
    }
}
