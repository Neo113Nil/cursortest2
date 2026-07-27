package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0501a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7810c;

    public RunnableC0501a1(C0966s1 c0966s1, String str, String str2) {
        this.f7810c = c0966s1;
        this.f7808a = str;
        this.f7809b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f7810c.f9216a;
        String str = this.f7808a;
        String str2 = this.f7809b;
        c1095x0.getClass();
        C1069w0.c().a(str, str2);
    }
}
