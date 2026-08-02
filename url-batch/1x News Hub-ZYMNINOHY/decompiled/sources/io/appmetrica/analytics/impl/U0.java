package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6743a;

    public U0(C0815s1 c0815s1) {
        this.f6743a = c0815s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6743a).sendEventsBuffer();
    }
}
