package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v1 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    private final dd4 f13062a;

    /* renamed from: b, reason: collision with root package name */
    private final cd4 f13063b;

    /* renamed from: c, reason: collision with root package name */
    private long f13064c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f13065d = -1;

    public v1(dd4 dd4Var, cd4 cd4Var) {
        this.f13062a = dd4Var;
        this.f13063b = cd4Var;
    }

    public final void a(long j7) {
        this.f13064c = j7;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final pd4 b() {
        wu1.f(this.f13064c != -1);
        return new bd4(this.f13062a, this.f13064c);
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final long c(pc4 pc4Var) {
        long j7 = this.f13065d;
        if (j7 < 0) {
            return -1L;
        }
        this.f13065d = -1L;
        return -(j7 + 2);
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final void d(long j7) {
        long[] jArr = this.f13063b.f3818a;
        this.f13065d = jArr[n13.J(jArr, j7, true, true)];
    }
}
