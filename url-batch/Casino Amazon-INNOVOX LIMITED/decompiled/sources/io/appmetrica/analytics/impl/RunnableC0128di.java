package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0128di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1219a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0231hi c;

    public RunnableC0128di(C0231hi c0231hi, String str, String str2) {
        this.c = c0231hi;
        this.f1219a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).putAppEnvironmentValue(this.f1219a, this.b);
    }
}
