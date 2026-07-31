package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ei implements ci {

    /* renamed from: a, reason: collision with root package name */
    private final int f4611a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4612b;

    /* renamed from: c, reason: collision with root package name */
    private final rm f4613c;

    public ei(zh zhVar) {
        rm rmVar = zhVar.P0;
        this.f4613c = rmVar;
        rmVar.v(12);
        this.f4611a = rmVar.i();
        this.f4612b = rmVar.i();
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        int i7 = this.f4611a;
        return i7 == 0 ? this.f4613c.i() : i7;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final boolean c() {
        return this.f4611a != 0;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int zza() {
        return this.f4612b;
    }
}
