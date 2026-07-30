package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8563a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8566d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8567e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8568f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8570h;

    private j(byte[] bArr, int i) {
        r rVar = new r(bArr);
        rVar.a(i * 8);
        this.f8563a = rVar.c(16);
        this.f8564b = rVar.c(16);
        this.f8565c = rVar.c(24);
        this.f8566d = rVar.c(24);
        this.f8567e = rVar.c(20);
        this.f8568f = rVar.c(3) + 1;
        this.f8569g = rVar.c(5) + 1;
        this.f8570h = ((rVar.c(4) & 15) << 32) | (rVar.c(32) & 4294967295L);
    }

    private int a() {
        return (this.f8569g / 8) * this.f8564b * this.f8568f;
    }

    private int b() {
        return this.f8569g * this.f8567e;
    }

    private long c() {
        return (this.f8570h * 1000000) / this.f8567e;
    }

    private long d() {
        long j9;
        long j10;
        int i = this.f8566d;
        if (i > 0) {
            j9 = (i + this.f8565c) / 2;
            j10 = 1;
        } else {
            int i4 = this.f8563a;
            j9 = ((((i4 != this.f8564b || i4 <= 0) ? 4096L : i4) * this.f8568f) * this.f8569g) / 8;
            j10 = 64;
        }
        return j9 + j10;
    }

    private long a(long j9) {
        return af.a((j9 * this.f8567e) / 1000000, this.f8570h - 1);
    }

    private j(int i, int i4, int i9, int i10, int i11, int i12, int i13, long j9) {
        this.f8563a = i;
        this.f8564b = i4;
        this.f8565c = i9;
        this.f8566d = i10;
        this.f8567e = i11;
        this.f8568f = i12;
        this.f8569g = i13;
        this.f8570h = j9;
    }
}
