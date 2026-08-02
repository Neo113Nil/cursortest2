package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f6341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f6342c;

    public Mh(C0651li c0651li, String str, Throwable th) {
        this.f6342c = c0651li;
        this.f6340a = str;
        this.f6341b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6342c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportError(this.f6340a, this.f6341b);
    }
}
