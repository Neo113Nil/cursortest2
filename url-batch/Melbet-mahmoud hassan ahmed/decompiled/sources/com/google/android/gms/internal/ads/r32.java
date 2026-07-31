package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r32 {

    /* renamed from: a, reason: collision with root package name */
    private int f11006a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f11007b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f11008c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f11009d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Object f11010e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f11011f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f11012g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f11013h = new Object();

    public final int a() {
        int i7;
        synchronized (this.f11010e) {
            i7 = this.f11006a;
        }
        return i7;
    }

    public final synchronized long b() {
        long j7;
        synchronized (this.f11013h) {
            j7 = this.f11009d;
        }
        return j7;
    }

    public final synchronized long c() {
        long j7;
        synchronized (this.f11012g) {
            j7 = this.f11008c;
        }
        return j7;
    }

    public final long d() {
        long j7;
        synchronized (this.f11011f) {
            j7 = this.f11007b;
        }
        return j7;
    }

    public final synchronized void e(long j7) {
        synchronized (this.f11013h) {
            this.f11009d = j7;
        }
    }

    public final synchronized void f(long j7) {
        synchronized (this.f11012g) {
            this.f11008c = j7;
        }
    }

    public final void g(int i7) {
        synchronized (this.f11010e) {
            this.f11006a = i7;
        }
    }

    public final void h(long j7) {
        synchronized (this.f11011f) {
            this.f11007b = j7;
        }
    }
}
