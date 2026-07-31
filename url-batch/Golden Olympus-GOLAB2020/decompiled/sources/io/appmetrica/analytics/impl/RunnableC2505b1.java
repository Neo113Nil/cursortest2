package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2505b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38693c;

    public RunnableC2505b1(C2872p1 c2872p1, String str, String str2) {
        this.f38693c = c2872p1;
        this.f38691a = str;
        this.f38692b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3000u0 c3000u0 = this.f38693c.f39593a;
        String str = this.f38691a;
        String str2 = this.f38692b;
        c3000u0.getClass();
        C2974t0.c().putAppEnvironmentValue(str, str2);
    }
}
