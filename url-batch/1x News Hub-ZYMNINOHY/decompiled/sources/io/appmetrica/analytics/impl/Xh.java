package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6869b;

    public Xh(C0651li c0651li, boolean z) {
        this.f6869b = c0651li;
        this.f6868a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6869b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).setDataSendingEnabled(this.f6868a);
    }
}
