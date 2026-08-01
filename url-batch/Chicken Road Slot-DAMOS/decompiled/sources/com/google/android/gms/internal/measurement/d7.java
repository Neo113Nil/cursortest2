package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d7 {
    public static volatile d7 g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2225a;

    /* renamed from: b, reason: collision with root package name */
    public final AppMeasurementSdk f2226b;

    /* renamed from: c, reason: collision with root package name */
    public int f2227c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2228d;

    /* renamed from: e, reason: collision with root package name */
    public volatile d6 f2229e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f2230f;

    public d7(Context context, Bundle bundle) {
        z6 z6Var = new z6(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), z6Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2225a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f2226b = new AppMeasurementSdk(this);
        new ArrayList();
        int i3 = 0;
        try {
            if (s7.d2.b(context, s7.d2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, d7.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f2228d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new t6(this, context, bundle, i3));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c7(this));
        }
    }

    public static d7 c(Context context, Bundle bundle) {
        c7.c0.g(context);
        if (g == null) {
            synchronized (d7.class) {
                try {
                    if (g == null) {
                        g = new d7(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(a7 a7Var) {
        this.f2225a.execute(a7Var);
    }

    public final void b(Exception exc, boolean z10, boolean z11) {
        this.f2228d |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(new q6(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        a6 a6Var = new a6();
        a(new w6(this, a6Var, 2));
        Long l10 = (Long) a6.E(a6Var.D(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i3 = this.f2227c + 1;
        this.f2227c = i3;
        return nextLong + i3;
    }
}
