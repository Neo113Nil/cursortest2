package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0937s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f12710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12711b;

    public RunnableC0937s1(C0963t1 c0963t1, Throwable th) {
        this.f12711b = c0963t1;
        this.f12710a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12711b).reportUnhandledException(this.f12710a);
    }
}
