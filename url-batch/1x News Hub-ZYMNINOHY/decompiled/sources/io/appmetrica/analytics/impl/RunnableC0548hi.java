package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0548hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f7449c;

    public RunnableC0548hi(C0651li c0651li, String str, String str2) {
        this.f7449c = c0651li;
        this.f7447a = str;
        this.f7448b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7449c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).putAppEnvironmentValue(this.f7447a, this.f7448b);
    }
}
