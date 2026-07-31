package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gx3 {

    /* renamed from: a, reason: collision with root package name */
    public final s54 f5926a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5927b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5928c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5929d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5930e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5931f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5932g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5933h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5934i;

    gx3(s54 s54Var, long j7, long j8, long j9, long j10, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = true;
        wu1.d(!z9 || z7);
        if (z8 && !z7) {
            z10 = false;
        }
        wu1.d(z10);
        this.f5926a = s54Var;
        this.f5927b = j7;
        this.f5928c = j8;
        this.f5929d = j9;
        this.f5930e = j10;
        this.f5931f = false;
        this.f5932g = z7;
        this.f5933h = z8;
        this.f5934i = z9;
    }

    public final gx3 a(long j7) {
        return j7 == this.f5928c ? this : new gx3(this.f5926a, this.f5927b, j7, this.f5929d, this.f5930e, false, this.f5932g, this.f5933h, this.f5934i);
    }

    public final gx3 b(long j7) {
        return j7 == this.f5927b ? this : new gx3(this.f5926a, j7, this.f5928c, this.f5929d, this.f5930e, false, this.f5932g, this.f5933h, this.f5934i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gx3.class == obj.getClass()) {
            gx3 gx3Var = (gx3) obj;
            if (this.f5927b == gx3Var.f5927b && this.f5928c == gx3Var.f5928c && this.f5929d == gx3Var.f5929d && this.f5930e == gx3Var.f5930e && this.f5932g == gx3Var.f5932g && this.f5933h == gx3Var.f5933h && this.f5934i == gx3Var.f5934i && n13.p(this.f5926a, gx3Var.f5926a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f5926a.hashCode() + 527) * 31) + ((int) this.f5927b)) * 31) + ((int) this.f5928c)) * 31) + ((int) this.f5929d)) * 31) + ((int) this.f5930e)) * 961) + (this.f5932g ? 1 : 0)) * 31) + (this.f5933h ? 1 : 0)) * 31) + (this.f5934i ? 1 : 0);
    }
}
