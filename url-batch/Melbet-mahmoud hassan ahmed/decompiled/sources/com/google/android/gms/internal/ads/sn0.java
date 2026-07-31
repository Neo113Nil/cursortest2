package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sn0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11880a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f11882c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f11881b = 0;

    /* synthetic */ sn0(rn0 rn0Var) {
    }

    public final void a() {
        long b7 = y2.t.a().b();
        synchronized (this.f11880a) {
            if (this.f11882c == 3) {
                if (this.f11881b + ((Long) sw.c().b(m10.f8301s4)).longValue() <= b7) {
                    this.f11882c = 1;
                }
            }
        }
        long b8 = y2.t.a().b();
        synchronized (this.f11880a) {
            if (this.f11882c != 2) {
                return;
            }
            this.f11882c = 3;
            if (this.f11882c == 3) {
                this.f11881b = b8;
            }
        }
    }
}
