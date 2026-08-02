package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f3652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc f3653b;

    public cc(dc dcVar, Runnable runnable) {
        this.f3653b = dcVar;
        this.f3652a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3653b.a(this.f3652a);
        synchronized (this.f3653b) {
            this.f3653b.f3691c = null;
        }
    }
}
