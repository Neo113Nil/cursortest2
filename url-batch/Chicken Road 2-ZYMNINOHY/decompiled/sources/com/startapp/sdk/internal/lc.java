package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class lc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f7216a;

    public lc(mc mcVar) {
        this.f7216a = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7216a.c();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
