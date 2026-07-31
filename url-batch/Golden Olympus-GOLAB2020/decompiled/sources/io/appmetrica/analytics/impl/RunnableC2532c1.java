package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2532c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f38758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38759b;

    public RunnableC2532c1(C2872p1 c2872p1, Activity activity) {
        this.f38759b = c2872p1;
        this.f38758a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1 c2872p1 = this.f38759b;
        Xk xk = c2872p1.f39600h;
        Activity activity = this.f38758a;
        InterfaceC2569db interfaceC2569db = c2872p1.d().f37439a;
        if (activity != null) {
            xk.f38537f.a(activity);
        }
        if (xk.f38536e.a(activity, EnumC2844o.RESUMED)) {
            interfaceC2569db.a(activity);
        }
    }
}
