package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0453e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7211c;

    public RunnableC0453e1(C0815s1 c0815s1, String str, String str2) {
        this.f7211c = c0815s1;
        this.f7209a = str;
        this.f7210b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f7211c.f8278a;
        String str = this.f7209a;
        String str2 = this.f7210b;
        c0944x0.getClass();
        C0918w0.c().putAppEnvironmentValue(str, str2);
    }
}
