package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ft0 implements dx3 {

    /* renamed from: a, reason: collision with root package name */
    private final g94 f5194a = new g94(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f5195b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f5196c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f5197d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f5198e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f5199f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5200g;

    ft0() {
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void a() {
        i(false);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void c() {
        i(true);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void d(xx3[] xx3VarArr, hm0 hm0Var, w74[] w74VarArr) {
        this.f5199f = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            if (w74VarArr[i7] != null) {
                this.f5199f += xx3VarArr[i7].a() != 1 ? 131072000 : 13107200;
            }
        }
        this.f5194a.f(this.f5199f);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean e(long j7, float f7, boolean z6, long j8) {
        long j9 = z6 ? this.f5198e : this.f5197d;
        return j9 <= 0 || j7 >= j9;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final g94 f() {
        return this.f5194a;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final void g() {
        i(true);
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final boolean h(long j7, long j8, float f7) {
        boolean z6 = true;
        char c7 = j8 > this.f5196c ? (char) 0 : j8 < this.f5195b ? (char) 2 : (char) 1;
        int a7 = this.f5194a.a();
        int i7 = this.f5199f;
        if (c7 != 2 && (c7 != 1 || !this.f5200g || a7 >= i7)) {
            z6 = false;
        }
        this.f5200g = z6;
        return z6;
    }

    final void i(boolean z6) {
        this.f5199f = 0;
        this.f5200g = false;
        if (z6) {
            this.f5194a.e();
        }
    }

    public final synchronized void j(int i7) {
        this.f5197d = i7 * 1000;
    }

    public final synchronized void k(int i7) {
        this.f5198e = i7 * 1000;
    }

    public final synchronized void l(int i7) {
        this.f5196c = i7 * 1000;
    }

    public final synchronized void m(int i7) {
        this.f5195b = i7 * 1000;
    }

    @Override // com.google.android.gms.internal.ads.dx3
    public final long zza() {
        return 0L;
    }
}
