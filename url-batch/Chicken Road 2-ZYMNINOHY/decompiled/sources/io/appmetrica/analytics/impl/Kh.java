package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10532a;

    public Kh(C0644gi c0644gi) {
        this.f10532a = c0644gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10532a;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).resumeSession();
    }
}
