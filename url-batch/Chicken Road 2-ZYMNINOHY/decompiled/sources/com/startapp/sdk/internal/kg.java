package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f7190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg f7191b;

    public kg(lg lgVar, Runnable runnable) {
        this.f7191b = lgVar;
        this.f7190a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7190a.run();
        } finally {
            this.f7191b.a();
        }
    }
}
