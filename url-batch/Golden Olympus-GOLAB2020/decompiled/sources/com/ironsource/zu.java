package com.ironsource;

/* loaded from: classes2.dex */
public class zu {

    /* renamed from: a, reason: collision with root package name */
    protected long f20591a;

    /* renamed from: b, reason: collision with root package name */
    protected long f20592b;

    /* renamed from: c, reason: collision with root package name */
    protected long f20593c;

    public long a() {
        return Math.max(0L, this.f20591a - System.currentTimeMillis());
    }

    public void b() {
        this.f20591a = 0L;
        this.f20592b = 0L;
        this.f20593c = 0L;
    }

    public void c(long j4) {
        this.f20592b = j4;
        this.f20593c = 0L;
    }

    public void a(long j4) {
        this.f20591a = System.currentTimeMillis() + j4;
    }

    public void b(long j4) {
        this.f20593c = j4;
        this.f20591a += j4 - this.f20592b;
    }
}
