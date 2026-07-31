package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2742k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39326c;

    public RunnableC2742k1(C2872p1 c2872p1, String str, String str2) {
        this.f39326c = c2872p1;
        this.f39324a = str;
        this.f39325b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39326c).reportEvent(this.f39324a, this.f39325b);
    }
}
