package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f38472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38473b;

    public Wh(C2992ti c2992ti, Throwable th) {
        this.f38473b = c2992ti;
        this.f38472a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38473b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportUnhandledException(this.f38472a);
    }
}
