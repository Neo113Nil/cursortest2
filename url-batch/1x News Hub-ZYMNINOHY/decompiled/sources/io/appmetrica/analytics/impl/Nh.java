package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f6376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0651li f6377d;

    public Nh(C0651li c0651li, String str, String str2, Throwable th) {
        this.f6377d = c0651li;
        this.f6374a = str;
        this.f6375b = str2;
        this.f6376c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6377d;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportError(this.f6374a, this.f6375b, this.f6376c);
    }
}
