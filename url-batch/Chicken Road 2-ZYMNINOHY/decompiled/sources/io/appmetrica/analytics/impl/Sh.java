package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10950b;

    public Sh(C0644gi c0644gi, boolean z) {
        this.f10950b = c0644gi;
        this.f10949a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10950b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).setDataSendingEnabled(this.f10949a);
    }
}
