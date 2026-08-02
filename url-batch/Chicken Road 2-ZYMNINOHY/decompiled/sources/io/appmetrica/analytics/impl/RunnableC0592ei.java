package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0592ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11802b;

    public RunnableC0592ei(C0644gi c0644gi, String str) {
        this.f11802b = c0644gi;
        this.f11801a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11802b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportEvent(this.f11801a);
    }
}
