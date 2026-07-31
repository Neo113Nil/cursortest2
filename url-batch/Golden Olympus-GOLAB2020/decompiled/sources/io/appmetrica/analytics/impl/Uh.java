package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f38372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38373c;

    public Uh(C2992ti c2992ti, String str, Throwable th) {
        this.f38373c = c2992ti;
        this.f38371a = str;
        this.f38372b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38373c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportError(this.f38371a, this.f38372b);
    }
}
