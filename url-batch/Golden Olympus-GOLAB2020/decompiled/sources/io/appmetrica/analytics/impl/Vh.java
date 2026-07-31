package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f38428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38429d;

    public Vh(C2992ti c2992ti, String str, String str2, Throwable th) {
        this.f38429d = c2992ti;
        this.f38426a = str;
        this.f38427b = str2;
        this.f38428c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38429d;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportError(this.f38426a, this.f38427b, this.f38428c);
    }
}
