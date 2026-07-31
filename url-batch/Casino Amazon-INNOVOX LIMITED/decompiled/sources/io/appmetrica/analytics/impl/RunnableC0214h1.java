package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0214h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1280a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0214h1(C0541u1 c0541u1, Activity activity) {
        this.b = c0541u1;
        this.f1280a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1 c0541u1 = this.b;
        Xk xk = c0541u1.h;
        Activity activity = this.f1280a;
        Ja ja = c0541u1.d().f1341a;
        if (activity != null) {
            xk.f.a(activity);
        }
        if (xk.e.a(activity, EnumC0415p.RESUMED)) {
            ja.a(activity);
        }
    }
}
