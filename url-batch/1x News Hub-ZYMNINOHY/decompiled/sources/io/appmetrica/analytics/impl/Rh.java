package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6560b;

    public Rh(C0651li c0651li, String str) {
        this.f6560b = c0651li;
        this.f6559a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6560b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).setUserProfileID(this.f6559a);
    }
}
