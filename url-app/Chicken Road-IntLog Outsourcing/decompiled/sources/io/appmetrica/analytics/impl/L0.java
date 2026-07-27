package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7055b;

    public L0(C0966s1 c0966s1, String str) {
        this.f7055b = c0966s1;
        this.f7054a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7055b.d().f9093b.a(this.f7054a, false);
    }
}
