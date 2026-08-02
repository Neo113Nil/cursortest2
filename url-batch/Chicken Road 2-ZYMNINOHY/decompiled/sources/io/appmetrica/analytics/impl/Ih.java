package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ih implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f10440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10441d;

    public Ih(C0644gi c0644gi, String str, String str2, Throwable th) {
        this.f10441d = c0644gi;
        this.f10438a = str;
        this.f10439b = str2;
        this.f10440c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10441d;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportError(this.f10438a, this.f10439b, this.f10440c);
    }
}
