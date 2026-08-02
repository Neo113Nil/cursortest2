package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0350a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6969c;

    public RunnableC0350a1(C0815s1 c0815s1, String str, String str2) {
        this.f6969c = c0815s1;
        this.f6967a = str;
        this.f6968b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f6969c.f8278a;
        String str = this.f6967a;
        String str2 = this.f6968b;
        c0944x0.getClass();
        C0918w0.c().a(str, str2);
    }
}
