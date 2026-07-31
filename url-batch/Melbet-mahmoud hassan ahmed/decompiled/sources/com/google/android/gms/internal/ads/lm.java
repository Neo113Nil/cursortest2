package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8016a;

    public final synchronized void a() {
        while (!this.f8016a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        boolean z6;
        z6 = this.f8016a;
        this.f8016a = false;
        return z6;
    }

    public final synchronized boolean c() {
        if (this.f8016a) {
            return false;
        }
        this.f8016a = true;
        notifyAll();
        return true;
    }
}
