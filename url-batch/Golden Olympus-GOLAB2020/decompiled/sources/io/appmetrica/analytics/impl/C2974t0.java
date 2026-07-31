package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2974t0 implements InterfaceC2856ob {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C2974t0 f39820e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f39821f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f39822g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f39823a;

    /* renamed from: b, reason: collision with root package name */
    public final C2845o0 f39824b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f39825c;

    /* renamed from: d, reason: collision with root package name */
    public final Wa f39826d;

    public C2974t0(@NonNull Context context) {
        this.f39823a = context;
        C2845o0 c4 = C3082x4.l().c();
        this.f39824b = c4;
        this.f39826d = c4.a(context, C3082x4.l().g());
        this.f39825c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.yp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2974t0.this.p();
            }
        });
    }

    @NonNull
    public static C2974t0 a(@NonNull Context context) {
        C2974t0 c2974t0;
        C2974t0 c2974t02 = f39820e;
        if (c2974t02 != null) {
            return c2974t02;
        }
        synchronized (C2974t0.class) {
            try {
                c2974t0 = f39820e;
                if (c2974t0 == null) {
                    c2974t0 = new C2974t0(context);
                    c2974t0.j();
                    C3082x4.l().f40118c.a().execute(new RunnableC2948s0(c2974t0));
                    f39820e = c2974t0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2974t0;
    }

    public static void b(boolean z4) {
        c().b(z4);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z4;
        synchronized (C2974t0.class) {
            z4 = f39821f;
        }
        return z4;
    }

    public static boolean l() {
        return f39822g;
    }

    public static synchronized boolean m() {
        boolean z4;
        synchronized (C2974t0.class) {
            C2974t0 c2974t0 = f39820e;
            if (c2974t0 != null && c2974t0.f39825c.isDone()) {
                z4 = c2974t0.f().i() != null;
            }
        }
        return z4;
    }

    public static synchronized void n() {
        synchronized (C2974t0.class) {
            f39820e = null;
            f39821f = false;
            f39822g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C2974t0.class) {
            f39821f = true;
        }
    }

    public static void r() {
        f39822g = true;
    }

    public static C2974t0 s() {
        return f39820e;
    }

    public static void setDataSendingEnabled(boolean z4) {
        c().setDataSendingEnabled(z4);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f39826d.a(appMetricaConfig, this);
    }

    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C3082x4.l().f40118c.a().execute(new RunnableC2949s1(this.f39823a));
    }

    public final String e() {
        return f().e();
    }

    public final Xa f() {
        try {
            return (Xa) this.f39825c.get();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final Ec i() {
        return f().i();
    }

    public final void j() {
        C2823n4 c2823n4 = C3082x4.l().f40118c;
        Runnable runnable = new Runnable() { // from class: io.appmetrica.analytics.impl.zp
            @Override // java.lang.Runnable
            public final void run() {
                C2974t0.this.o();
            }
        };
        c2823n4.f39486a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE-" + Od.f38077a.incrementAndGet()).start();
    }

    public final void o() {
        C3082x4.l().f40133r.a(this.f39823a);
        new C2926r4(this.f39823a).a(this.f39823a);
        C3082x4.l().a(this.f39823a).a();
        this.f39825c.run();
    }

    public final Xa p() {
        Xa xa;
        C2845o0 c2845o0 = this.f39824b;
        Context context = this.f39823a;
        Wa wa = this.f39826d;
        synchronized (c2845o0) {
            try {
                if (c2845o0.f39535d == null) {
                    if (c2845o0.a(context)) {
                        c2845o0.f39535d = new C3130z0();
                    } else {
                        c2845o0.f39535d = new C3078x0(context, wa);
                    }
                }
                xa = c2845o0.f39535d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xa;
    }

    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C3082x4.l().f40118c.a().execute(new RunnableC2949s1(this.f39823a));
    }

    @NonNull
    public final InterfaceC2804mb c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static InterfaceC2544cd c() {
        if (m()) {
            return f39820e.f();
        }
        return C3082x4.l().f40117b;
    }

    @NonNull
    public final C2958sa d() {
        return f().d();
    }

    @NonNull
    public final C3134z4 b() {
        return this.f39826d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z4) {
        c().a(z4);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C2974t0 c2974t0) {
        synchronized (C2974t0.class) {
            f39820e = c2974t0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2856ob
    @NonNull
    public final InterfaceC2830nb a() {
        return f().a();
    }
}
