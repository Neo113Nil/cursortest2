package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ay1 {

    /* renamed from: a, reason: collision with root package name */
    private final xv1 f3018a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3019b;

    public ay1(xv1 xv1Var) {
        this.f3018a = xv1Var;
    }

    public final synchronized void a() {
        while (!this.f3019b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z6 = false;
        while (!this.f3019b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z6;
        z6 = this.f3019b;
        this.f3019b = false;
        return z6;
    }

    public final synchronized boolean d() {
        return this.f3019b;
    }

    public final synchronized boolean e() {
        if (this.f3019b) {
            return false;
        }
        this.f3019b = true;
        notifyAll();
        return true;
    }
}
