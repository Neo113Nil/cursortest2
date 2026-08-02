package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6587b;

    public S0(C0815s1 c0815s1, String str) {
        this.f6587b = c0815s1;
        this.f6586a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f6587b.f8278a;
        String str = this.f6586a;
        c0944x0.getClass();
        C0918w0.c().setUserProfileID(str);
    }
}
