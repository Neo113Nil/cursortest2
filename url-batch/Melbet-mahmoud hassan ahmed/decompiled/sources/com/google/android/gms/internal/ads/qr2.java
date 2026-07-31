package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qr2 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f10812a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f10813b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile int f10815d = 1;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f10814c = 0;

    public qr2(v3.d dVar) {
        this.f10812a = dVar;
    }

    private final void e() {
        long b7 = this.f10812a.b();
        synchronized (this.f10813b) {
            if (this.f10815d == 3) {
                if (this.f10814c + ((Long) sw.c().b(m10.f8301s4)).longValue() <= b7) {
                    this.f10815d = 1;
                }
            }
        }
    }

    private final void f(int i7, int i8) {
        e();
        long b7 = this.f10812a.b();
        synchronized (this.f10813b) {
            if (this.f10815d != i7) {
                return;
            }
            this.f10815d = i8;
            if (this.f10815d == 3) {
                this.f10814c = b7;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z6) {
        if (z6) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f10813b) {
            e();
            z6 = this.f10815d == 3;
        }
        return z6;
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f10813b) {
            e();
            z6 = this.f10815d == 2;
        }
        return z6;
    }
}
