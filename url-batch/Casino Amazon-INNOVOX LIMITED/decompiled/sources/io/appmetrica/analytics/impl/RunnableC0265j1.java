package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0265j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1314a;
    public final /* synthetic */ StartupParamsCallback b;
    public final /* synthetic */ List c;
    public final /* synthetic */ C0541u1 d;

    public RunnableC0265j1(C0541u1 c0541u1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.d = c0541u1;
        this.f1314a = context;
        this.b = startupParamsCallback;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.d.f1507a;
        Context applicationContext = this.f1314a.getApplicationContext();
        c0665z0.getClass();
        C0640y0 a2 = C0640y0.a(applicationContext);
        a2.f().a(this.b, this.c);
    }
}
