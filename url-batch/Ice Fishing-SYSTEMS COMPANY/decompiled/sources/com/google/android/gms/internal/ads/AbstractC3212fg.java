package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3212fg {

    /* renamed from: a, reason: collision with root package name */
    public static final C3157eg f30738a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3157eg f30739b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3157eg f30740c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3103dg f30741d;

    /* renamed from: e, reason: collision with root package name */
    public static final XD f30742e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3157eg f30743f;

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f30744g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3157eg f30745h;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        C3151ea c3151ea = AbstractC3368ia.Hc;
        q2.r rVar = q2.r.f40116e;
        if (rVar.f40119c.b(c3151ea) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea)).booleanValue()) {
                C3151ea c3151ea2 = AbstractC3368ia.Ic;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea2) != null) {
                    C3151ea c3151ea3 = AbstractC3368ia.Jc;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea3) != null) {
                        threadPoolExecutor = new ThreadPoolExecutor(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea2)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3993u7("Default"));
                        threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.b(c3151ea3)).booleanValue());
                        f30738a = new C3157eg((Executor) threadPoolExecutor);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3993u7("Loader"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(true);
                        f30739b = new C3157eg((Executor) threadPoolExecutor2);
                        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3993u7("Activeview"));
                        threadPoolExecutor3.allowCoreThreadTimeOut(true);
                        f30740c = new C3157eg((Executor) threadPoolExecutor3);
                        C3103dg c3103dg = new C3103dg(3, new ThreadFactoryC3993u7("Schedule"));
                        f30741d = c3103dg;
                        f30742e = new XD(c3103dg);
                        f30743f = new C3157eg(new I());
                        f30744g = Executors.newSingleThreadExecutor(new ThreadFactoryC3993u7("AdQualityMetrics"));
                        f30745h = new C3157eg(HD.f25326n);
                    }
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC3993u7("Default"));
        f30738a = new C3157eg((Executor) threadPoolExecutor);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3993u7("Loader"));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        f30739b = new C3157eg((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3993u7("Activeview"));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        f30740c = new C3157eg((Executor) threadPoolExecutor32);
        C3103dg c3103dg2 = new C3103dg(3, new ThreadFactoryC3993u7("Schedule"));
        f30741d = c3103dg2;
        f30742e = new XD(c3103dg2);
        f30743f = new C3157eg(new I());
        f30744g = Executors.newSingleThreadExecutor(new ThreadFactoryC3993u7("AdQualityMetrics"));
        f30745h = new C3157eg(HD.f25326n);
    }
}
