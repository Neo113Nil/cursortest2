package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0618fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11853c;

    public RunnableC0618fi(C0644gi c0644gi, String str, String str2) {
        this.f11853c = c0644gi;
        this.f11851a = str;
        this.f11852b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11853c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportEvent(this.f11851a, this.f11852b);
    }
}
