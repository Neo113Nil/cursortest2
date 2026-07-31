package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f443a;
    public final /* synthetic */ uf b;

    public tf(uf ufVar, Runnable runnable) {
        this.b = ufVar;
        this.f443a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f443a.run();
        } finally {
            this.b.a();
        }
    }
}
