package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0188g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1265a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0541u1 c;

    public RunnableC0188g1(C0541u1 c0541u1, String str, String str2) {
        this.c = c0541u1;
        this.f1265a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.c.f1507a;
        String str = this.f1265a;
        String str2 = this.b;
        c0665z0.getClass();
        C0640y0.c().putAppEnvironmentValue(str, str2);
    }
}
