package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
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
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092y0 implements Ta {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C1092y0 f13042e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f13043f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f13044g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13045a;

    /* renamed from: b, reason: collision with root package name */
    public final C0910r0 f13046b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f13047c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f13048d;

    public C1092y0(Context context) {
        this.f13045a = context;
        C0910r0 c4 = C0501b4.l().c();
        this.f13046b = c4;
        this.f13048d = c4.a(context, C0501b4.l().g());
        this.f13047c = new FutureTask(new Qo(1, this));
    }

    public static C1092y0 a(Context context) {
        C1092y0 c1092y0;
        C1092y0 c1092y02 = f13042e;
        if (c1092y02 != null) {
            return c1092y02;
        }
        synchronized (C1092y0.class) {
            try {
                c1092y0 = f13042e;
                if (c1092y0 == null) {
                    c1092y0 = new C1092y0(context);
                    c1092y0.j();
                    C0501b4.l().f11457c.a().execute(new RunnableC1066x0(c1092y0));
                    f13042e = c1092y0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1092y0;
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (C1092y0.class) {
            z = f13043f;
        }
        return z;
    }

    public static boolean l() {
        return f13044g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (C1092y0.class) {
            C1092y0 c1092y0 = f13042e;
            if (c1092y0 != null && c1092y0.f13047c.isDone()) {
                z = c1092y0.f().i() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (C1092y0.class) {
            f13042e = null;
            f13043f = false;
            f13044g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C1092y0.class) {
            f13043f = true;
        }
    }

    public static void r() {
        f13044g = true;
    }

    public static C1092y0 s() {
        return f13042e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f13048d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0501b4.l().f11457c.a().execute(new RunnableC1041w1(this.f13045a));
    }

    public final String e() {
        return f().e();
    }

    public final Ca f() {
        try {
            return (Ca) this.f13047c.get();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0715jc i() {
        return f().i();
    }

    public final void j() {
        R3 r32 = C0501b4.l().f11457c;
        ap apVar = new ap(0, this);
        r32.f10867a.getClass();
        new InterruptionSafeThread(apVar, "IAA-INIT_CORE-" + ThreadFactoryC1131zd.f13101a.incrementAndGet()).start();
    }

    public final void o() {
        C0501b4.l().f11470r.a(this.f13045a);
        new V3(this.f13045a).a(this.f13045a);
        C0501b4.l().a(this.f13045a).a();
        this.f13047c.run();
    }

    public final Ca p() {
        Ca ca;
        C0910r0 c0910r0 = this.f13046b;
        Context context = this.f13045a;
        Ba ba = this.f13048d;
        synchronized (c0910r0) {
            try {
                if (c0910r0.f12638d == null) {
                    if (c0910r0.a(context)) {
                        c0910r0.f12638d = new E0();
                    } else {
                        c0910r0.f12638d = new C0(context, ba);
                    }
                }
                ca = c0910r0.f12638d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ca;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0501b4.l().f11457c.a().execute(new RunnableC1041w1(this.f13045a));
    }

    public final Ra c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Hc c() {
        if (m()) {
            return f13042e.f();
        }
        return C0501b4.l().f11456b;
    }

    public final X9 d() {
        return f().d();
    }

    public final C0578e4 b() {
        return this.f13048d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z) {
        c().a(z);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C1092y0 c1092y0) {
        synchronized (C1092y0.class) {
            f13042e = c1092y0;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return f().a();
    }
}
