package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import b0.CallableC0175f;
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

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918w0 implements InterfaceC0360ab {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0918w0 f8537e = null;
    public static volatile boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f8538g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8539a;

    /* renamed from: b, reason: collision with root package name */
    public final C0788r0 f8540b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f8541c;

    /* renamed from: d, reason: collision with root package name */
    public final Ia f8542d;

    public C0918w0(Context context) {
        this.f8539a = context;
        C0788r0 c3 = C0585j4.l().c();
        this.f8540b = c3;
        this.f8542d = c3.a(context, C0585j4.l().g());
        this.f8541c = new FutureTask(new CallableC0175f(2, this));
    }

    public static C0918w0 a(Context context) {
        C0918w0 c0918w0;
        C0918w0 c0918w02 = f8537e;
        if (c0918w02 != null) {
            return c0918w02;
        }
        synchronized (C0918w0.class) {
            try {
                c0918w0 = f8537e;
                if (c0918w0 == null) {
                    c0918w0 = new C0918w0(context);
                    c0918w0.j();
                    C0585j4.l().f7594c.a().execute(new RunnableC0892v0(c0918w0));
                    f8537e = c0918w0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0918w0;
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (C0918w0.class) {
            z = f;
        }
        return z;
    }

    public static boolean l() {
        return f8538g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (C0918w0.class) {
            C0918w0 c0918w0 = f8537e;
            if (c0918w0 != null && c0918w0.f8541c.isDone()) {
                z = c0918w0.f().i() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (C0918w0.class) {
            f8537e = null;
            f = false;
            f8538g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C0918w0.class) {
            f = true;
        }
    }

    public static void r() {
        f8538g = true;
    }

    public static C0918w0 s() {
        return f8537e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f8542d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0585j4.l().f7594c.a().execute(new RunnableC0893v1(this.f8539a));
    }

    public final String e() {
        return f().e();
    }

    public final Ja f() {
        try {
            return (Ja) this.f8541c.get();
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0775qc i() {
        return f().i();
    }

    public final void j() {
        Z3 z3 = C0585j4.l().f7594c;
        B0.n nVar = new B0.n(22, this);
        z3.f6928a.getClass();
        new InterruptionSafeThread(nVar, "IAA-INIT_CORE-" + Gd.f6039a.incrementAndGet()).start();
    }

    public final void o() {
        C0585j4.l().f7607r.a(this.f8539a);
        new C0431d4(this.f8539a).a(this.f8539a);
        C0585j4.l().a(this.f8539a).a();
        this.f8541c.run();
    }

    public final Ja p() {
        Ja ja;
        C0788r0 c0788r0 = this.f8540b;
        Context context = this.f8539a;
        Ia ia = this.f8542d;
        synchronized (c0788r0) {
            try {
                if (c0788r0.f8193d == null) {
                    if (c0788r0.a(context)) {
                        c0788r0.f8193d = new C0();
                    } else {
                        c0788r0.f8193d = new A0(context, ia);
                    }
                }
                ja = c0788r0.f8193d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0585j4.l().f7594c.a().execute(new RunnableC0893v1(this.f8539a));
    }

    public final Ya c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Oc c() {
        if (m()) {
            return f8537e.f();
        }
        return C0585j4.l().f7593b;
    }

    public final C0462ea d() {
        return f().d();
    }

    public final C0637l4 b() {
        return this.f8542d.a();
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

    public static synchronized void a(C0918w0 c0918w0) {
        synchronized (C0918w0.class) {
            f8537e = c0918w0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0360ab
    public final Za a() {
        return f().a();
    }
}
