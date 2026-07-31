package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class I0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f37687b;

    public I0(C2872p1 c2872p1, String str) {
        this.f37687b = c2872p1;
        this.f37686a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37687b.d().f37440b.a(this.f37686a, false);
    }
}
