package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0679i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f12014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f12015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12016d;

    public RunnableC0679i1(C0963t1 c0963t1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f12016d = c0963t1;
        this.f12013a = context;
        this.f12014b = startupParamsCallback;
        this.f12015c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118z0 c1118z0 = this.f12016d.f12756a;
        Context applicationContext = this.f12013a.getApplicationContext();
        c1118z0.getClass();
        C1092y0 a3 = C1092y0.a(applicationContext);
        a3.f().a(this.f12014b, this.f12015c);
    }
}
