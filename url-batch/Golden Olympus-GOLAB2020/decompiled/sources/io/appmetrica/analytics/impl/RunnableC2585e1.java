package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2585e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f38897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38899d;

    public RunnableC2585e1(C2872p1 c2872p1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f38899d = c2872p1;
        this.f38896a = context;
        this.f38897b = startupParamsCallback;
        this.f38898c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3000u0 c3000u0 = this.f38899d.f39593a;
        Context applicationContext = this.f38896a.getApplicationContext();
        c3000u0.getClass();
        C2974t0 a4 = C2974t0.a(applicationContext);
        a4.f().a(this.f38897b, this.f38898c);
    }
}
