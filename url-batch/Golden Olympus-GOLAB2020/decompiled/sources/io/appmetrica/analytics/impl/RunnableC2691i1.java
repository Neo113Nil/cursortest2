package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2691i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f39167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39168b;

    public RunnableC2691i1(C2872p1 c2872p1, Activity activity) {
        this.f39168b = c2872p1;
        this.f39167a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1 c2872p1 = this.f39168b;
        Xk xk = c2872p1.f39600h;
        Activity activity = this.f39167a;
        InterfaceC2569db interfaceC2569db = c2872p1.d().f37439a;
        if (activity != null) {
            xk.f38537f.a(activity);
        }
        if (xk.f38536e.a(activity, EnumC2844o.PAUSED)) {
            interfaceC2569db.b(activity);
        }
    }
}
