package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0604e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8070c;

    public RunnableC0604e1(C0966s1 c0966s1, String str, String str2) {
        this.f8070c = c0966s1;
        this.f8068a = str;
        this.f8069b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f8070c.f9216a;
        String str = this.f8068a;
        String str2 = this.f8069b;
        c1095x0.getClass();
        C1069w0.c().putAppEnvironmentValue(str, str2);
    }
}
