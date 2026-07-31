package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2716j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39250b;

    public RunnableC2716j1(C2872p1 c2872p1, String str) {
        this.f39250b = c2872p1;
        this.f39249a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39250b).reportEvent(this.f39249a);
    }
}
