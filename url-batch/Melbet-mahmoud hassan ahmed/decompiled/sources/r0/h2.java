package r0;

import t1.x;

/* loaded from: classes.dex */
final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f20667a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20668b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20669c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20670d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20671e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20673g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20674h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20675i;

    h2(x.b bVar, long j7, long j8, long j9, long j10, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = false;
        o2.a.a(!z9 || z7);
        o2.a.a(!z8 || z7);
        if (!z6 || (!z7 && !z8 && !z9)) {
            z10 = true;
        }
        o2.a.a(z10);
        this.f20667a = bVar;
        this.f20668b = j7;
        this.f20669c = j8;
        this.f20670d = j9;
        this.f20671e = j10;
        this.f20672f = z6;
        this.f20673g = z7;
        this.f20674h = z8;
        this.f20675i = z9;
    }

    public h2 a(long j7) {
        return j7 == this.f20669c ? this : new h2(this.f20667a, this.f20668b, j7, this.f20670d, this.f20671e, this.f20672f, this.f20673g, this.f20674h, this.f20675i);
    }

    public h2 b(long j7) {
        return j7 == this.f20668b ? this : new h2(this.f20667a, j7, this.f20669c, this.f20670d, this.f20671e, this.f20672f, this.f20673g, this.f20674h, this.f20675i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f20668b == h2Var.f20668b && this.f20669c == h2Var.f20669c && this.f20670d == h2Var.f20670d && this.f20671e == h2Var.f20671e && this.f20672f == h2Var.f20672f && this.f20673g == h2Var.f20673g && this.f20674h == h2Var.f20674h && this.f20675i == h2Var.f20675i && o2.m0.c(this.f20667a, h2Var.f20667a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f20667a.hashCode()) * 31) + ((int) this.f20668b)) * 31) + ((int) this.f20669c)) * 31) + ((int) this.f20670d)) * 31) + ((int) this.f20671e)) * 31) + (this.f20672f ? 1 : 0)) * 31) + (this.f20673g ? 1 : 0)) * 31) + (this.f20674h ? 1 : 0)) * 31) + (this.f20675i ? 1 : 0);
    }
}
