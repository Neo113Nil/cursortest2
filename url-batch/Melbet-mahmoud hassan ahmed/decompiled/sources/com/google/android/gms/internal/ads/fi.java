package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fi implements ci {

    /* renamed from: a, reason: collision with root package name */
    private final rm f5112a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5113b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5114c;

    /* renamed from: d, reason: collision with root package name */
    private int f5115d;

    /* renamed from: e, reason: collision with root package name */
    private int f5116e;

    public fi(zh zhVar) {
        rm rmVar = zhVar.P0;
        this.f5112a = rmVar;
        rmVar.v(12);
        this.f5114c = rmVar.i() & 255;
        this.f5113b = rmVar.i();
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        int i7 = this.f5114c;
        if (i7 == 8) {
            return this.f5112a.g();
        }
        if (i7 == 16) {
            return this.f5112a.j();
        }
        int i8 = this.f5115d;
        this.f5115d = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f5116e & 15;
        }
        int g7 = this.f5112a.g();
        this.f5116e = g7;
        return (g7 & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int zza() {
        return this.f5113b;
    }
}
