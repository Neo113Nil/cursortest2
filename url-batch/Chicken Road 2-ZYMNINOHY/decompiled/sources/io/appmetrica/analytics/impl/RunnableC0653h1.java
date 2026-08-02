package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0653h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f11961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11962b;

    public RunnableC0653h1(C0963t1 c0963t1, Activity activity) {
        this.f11962b = c0963t1;
        this.f11961a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1 c0963t1 = this.f11962b;
        Wk wk = c0963t1.f12763h;
        Activity activity = this.f11961a;
        Ia ia = c0963t1.d().f12127a;
        if (activity != null) {
            wk.f11199f.a(activity);
        }
        if (wk.f11198e.a(activity, EnumC0858p.RESUMED)) {
            ia.a(activity);
        }
    }
}
