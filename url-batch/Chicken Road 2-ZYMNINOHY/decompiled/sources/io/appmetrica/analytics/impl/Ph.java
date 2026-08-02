package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f10822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10823b;

    public Ph(C0644gi c0644gi, AdRevenue adRevenue) {
        this.f10823b = c0644gi;
        this.f10822a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10823b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportAdRevenue(this.f10822a);
    }
}
