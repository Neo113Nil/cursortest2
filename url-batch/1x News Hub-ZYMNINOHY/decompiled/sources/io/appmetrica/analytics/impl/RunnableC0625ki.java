package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0625ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f7733c;

    public RunnableC0625ki(C0651li c0651li, String str, String str2) {
        this.f7733c = c0651li;
        this.f7731a = str;
        this.f7732b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7733c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportEvent(this.f7731a, this.f7732b);
    }
}
