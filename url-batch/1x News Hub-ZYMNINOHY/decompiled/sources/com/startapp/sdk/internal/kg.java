package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg f4063b;

    public kg(lg lgVar, Runnable runnable) {
        this.f4063b = lgVar;
        this.f4062a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4062a.run();
        } finally {
            this.f4063b.a();
        }
    }
}
