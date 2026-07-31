package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38111b;

    public P0(C2872p1 c2872p1, String str) {
        this.f38111b = c2872p1;
        this.f38110a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3000u0 c3000u0 = this.f38111b.f39593a;
        String str = this.f38110a;
        c3000u0.getClass();
        C2974t0.c().setUserProfileID(str);
    }
}
