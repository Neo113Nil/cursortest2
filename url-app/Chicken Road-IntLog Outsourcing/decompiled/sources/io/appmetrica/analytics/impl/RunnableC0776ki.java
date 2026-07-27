package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0776ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f8634c;

    public RunnableC0776ki(C0802li c0802li, String str, String str2) {
        this.f8634c = c0802li;
        this.f8632a = str;
        this.f8633b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8634c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportEvent(this.f8632a, this.f8633b);
    }
}
