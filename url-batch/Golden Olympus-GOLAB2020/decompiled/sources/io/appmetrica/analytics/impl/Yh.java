package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38562a;

    public Yh(C2992ti c2992ti) {
        this.f38562a = c2992ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38562a;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).pauseSession();
    }
}
