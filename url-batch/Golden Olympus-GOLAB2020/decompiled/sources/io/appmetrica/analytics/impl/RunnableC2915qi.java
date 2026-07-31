package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2915qi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39663a;

    public RunnableC2915qi(C2992ti c2992ti) {
        this.f39663a = c2992ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39663a;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).clearAppEnvironment();
    }
}
