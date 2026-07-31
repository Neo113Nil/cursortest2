package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2794m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f39432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39433c;

    public RunnableC2794m1(C2872p1 c2872p1, String str, Throwable th) {
        this.f39433c = c2872p1;
        this.f39431a = str;
        this.f39432b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39433c).reportError(this.f39431a, this.f39432b);
    }
}
