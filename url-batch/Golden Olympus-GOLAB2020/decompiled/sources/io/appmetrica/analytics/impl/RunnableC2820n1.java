package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2820n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f39473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39474d;

    public RunnableC2820n1(C2872p1 c2872p1, String str, String str2, Throwable th) {
        this.f39474d = c2872p1;
        this.f39471a = str;
        this.f39472b = str2;
        this.f39473c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39474d).reportError(this.f39471a, this.f39472b, this.f39473c);
    }
}
