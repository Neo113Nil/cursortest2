package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0531h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f7422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f7423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7424d;

    public RunnableC0531h1(C0815s1 c0815s1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f7424d = c0815s1;
        this.f7421a = context;
        this.f7422b = startupParamsCallback;
        this.f7423c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f7424d.f8278a;
        Context applicationContext = this.f7421a.getApplicationContext();
        c0944x0.getClass();
        C0918w0 a3 = C0918w0.a(applicationContext);
        a3.f().a(this.f7422b, this.f7423c);
    }
}
