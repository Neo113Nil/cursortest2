package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1067a;
    public final /* synthetic */ C0541u1 b;

    public U0(C0541u1 c0541u1, String str) {
        this.b = c0541u1;
        this.f1067a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.b.f1507a;
        String str = this.f1067a;
        c0665z0.getClass();
        C0640y0.c().setUserProfileID(str);
    }
}
