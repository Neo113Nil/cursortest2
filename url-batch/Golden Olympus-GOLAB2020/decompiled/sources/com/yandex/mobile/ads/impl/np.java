package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class np implements b52 {

    /* renamed from: a, reason: collision with root package name */
    private long f29719a;

    /* renamed from: b, reason: collision with root package name */
    private long f29720b;

    public final long a() {
        return this.f29719a;
    }

    public final void b() {
        this.f29719a += this.f29720b;
        this.f29720b = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.b52
    public final void a(long j4, long j5) {
        this.f29720b = j5;
    }
}
