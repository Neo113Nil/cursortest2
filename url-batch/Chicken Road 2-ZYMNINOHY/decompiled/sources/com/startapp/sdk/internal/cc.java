package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc f6764b;

    public cc(dc dcVar, Runnable runnable) {
        this.f6764b = dcVar;
        this.f6763a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6764b.a(this.f6763a);
        synchronized (this.f6764b) {
            this.f6764b.f6804c = null;
        }
    }
}
