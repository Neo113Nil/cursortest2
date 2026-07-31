package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0085c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1188a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0541u1 c;

    public RunnableC0085c1(C0541u1 c0541u1, String str, String str2) {
        this.c = c0541u1;
        this.f1188a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.c.f1507a;
        String str = this.f1188a;
        String str2 = this.b;
        c0665z0.getClass();
        C0640y0.c().a(str, str2);
    }
}
