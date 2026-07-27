package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0682h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f8298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8300d;

    public RunnableC0682h1(C0966s1 c0966s1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f8300d = c0966s1;
        this.f8297a = context;
        this.f8298b = startupParamsCallback;
        this.f8299c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f8300d.f9216a;
        Context applicationContext = this.f8297a.getApplicationContext();
        c1095x0.getClass();
        C1069w0 a6 = C1069w0.a(applicationContext);
        a6.f().a(this.f8298b, this.f8299c);
    }
}
