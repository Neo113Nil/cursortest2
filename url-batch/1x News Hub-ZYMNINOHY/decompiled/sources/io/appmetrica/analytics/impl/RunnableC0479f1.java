package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0479f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7297b;

    public RunnableC0479f1(C0815s1 c0815s1, Activity activity) {
        this.f7297b = c0815s1;
        this.f7296a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1 c0815s1 = this.f7297b;
        C0396bl c0396bl = c0815s1.f8284h;
        Activity activity = this.f7296a;
        Pa pa = c0815s1.d().f8159a;
        if (activity != null) {
            c0396bl.f.a(activity);
        }
        if (c0396bl.f7101e.a(activity, EnumC0736p.RESUMED)) {
            pa.a(activity);
        }
    }
}
