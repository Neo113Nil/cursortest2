package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0541ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11618c;

    public RunnableC0541ci(C0644gi c0644gi, String str, String str2) {
        this.f11618c = c0644gi;
        this.f11616a = str;
        this.f11617b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11618c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).putAppEnvironmentValue(this.f11616a, this.f11617b);
    }
}
