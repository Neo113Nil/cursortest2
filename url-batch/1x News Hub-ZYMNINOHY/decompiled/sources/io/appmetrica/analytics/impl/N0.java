package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6356b;

    public N0(C0815s1 c0815s1, String str) {
        this.f6356b = c0815s1;
        this.f6355a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6356b).c(this.f6355a);
    }
}
