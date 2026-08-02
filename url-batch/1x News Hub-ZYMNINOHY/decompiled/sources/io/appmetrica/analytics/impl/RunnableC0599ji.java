package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0599ji implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f7652b;

    public RunnableC0599ji(C0651li c0651li, String str) {
        this.f7652b = c0651li;
        this.f7651a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7652b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportEvent(this.f7651a);
    }
}
