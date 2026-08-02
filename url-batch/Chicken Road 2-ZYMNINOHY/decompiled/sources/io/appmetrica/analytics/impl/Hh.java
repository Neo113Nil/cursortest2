package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10375c;

    public Hh(C0644gi c0644gi, String str, Throwable th) {
        this.f10375c = c0644gi;
        this.f10373a = str;
        this.f10374b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10375c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportError(this.f10373a, this.f10374b);
    }
}
