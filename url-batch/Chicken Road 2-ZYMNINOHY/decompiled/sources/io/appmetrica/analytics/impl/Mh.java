package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10659b;

    public Mh(C0644gi c0644gi, String str) {
        this.f10659b = c0644gi;
        this.f10658a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10659b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).setUserProfileID(this.f10658a);
    }
}
