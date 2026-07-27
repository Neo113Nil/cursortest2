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

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069w0 implements InterfaceC0511ab {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C1069w0 f9490e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f9491f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f9492g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9493a;

    /* renamed from: b, reason: collision with root package name */
    public final C0939r0 f9494b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f9495c;

    /* renamed from: d, reason: collision with root package name */
    public final Ia f9496d;

    public C1069w0(Context context) {
        this.f9493a = context;
        C0939r0 c2 = C0736j4.l().c();
        this.f9494b = c2;
        this.f9496d = c2.a(context, C0736j4.l().g());
        this.f9495c = new FutureTask(new C0.g(2, this));
    }

    public static C1069w0 a(Context context) {
        C1069w0 c1069w0 = f9490e;
        if (c1069w0 == null) {
            synchronized (C1069w0.class) {
                try {
                    c1069w0 = f9490e;
                    if (c1069w0 == null) {
                        c1069w0 = new C1069w0(context);
                        c1069w0.j();
                        C0736j4.l().f8484c.a().execute(new RunnableC1043v0(c1069w0));
                        f9490e = c1069w0;
                    }
                } finally {
                }
            }
        }
        return c1069w0;
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (C1069w0.class) {
            z = f9491f;
        }
        return z;
    }

    public static boolean l() {
        return f9492g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (C1069w0.class) {
            C1069w0 c1069w0 = f9490e;
            if (c1069w0 != null && c1069w0.f9495c.isDone()) {
                z = c1069w0.f().i() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (C1069w0.class) {
            f9490e = null;
            f9491f = false;
            f9492g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C1069w0.class) {
            f9491f = true;
        }
    }

    public static void r() {
        f9492g = true;
    }

    public static C1069w0 s() {
        return f9490e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f9496d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0736j4.l().f8484c.a().execute(new RunnableC1044v1(this.f9493a));
    }

    public final String e() {
        return f().e();
    }

    public final Ja f() {
        try {
            return (Ja) this.f9495c.get();
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

    public final C0926qc i() {
        return f().i();
    }

    public final void j() {
        Z3 z32 = C0736j4.l().f8484c;
        B2.b bVar = new B2.b(17, this);
        z32.f7768a.getClass();
        new InterruptionSafeThread(bVar, "IAA-INIT_CORE-" + Gd.f6832a.incrementAndGet()).start();
    }

    public final void o() {
        C0736j4.l().f8499r.a(this.f9493a);
        new C0582d4(this.f9493a).a(this.f9493a);
        C0736j4.l().a(this.f9493a).a();
        this.f9495c.run();
    }

    public final Ja p() {
        Ja ja;
        C0939r0 c0939r0 = this.f9494b;
        Context context = this.f9493a;
        Ia ia = this.f9496d;
        synchronized (c0939r0) {
            try {
                if (c0939r0.f9127d == null) {
                    if (c0939r0.a(context)) {
                        c0939r0.f9127d = new C0();
                    } else {
                        c0939r0.f9127d = new A0(context, ia);
                    }
                }
                ja = c0939r0.f9127d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0736j4.l().f8484c.a().execute(new RunnableC1044v1(this.f9493a));
    }

    public final Ya c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Oc c() {
        if (m()) {
            return f9490e.f();
        }
        return C0736j4.l().f8483b;
    }

    public final C0613ea d() {
        return f().d();
    }

    public final C0788l4 b() {
        return this.f9496d.a();
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

    public static synchronized void a(C1069w0 c1069w0) {
        synchronized (C1069w0.class) {
            f9490e = c1069w0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0511ab
    public final Za a() {
        return f().a();
    }
}
