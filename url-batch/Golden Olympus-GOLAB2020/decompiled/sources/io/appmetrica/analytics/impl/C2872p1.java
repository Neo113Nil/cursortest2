package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2872p1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3000u0 f39593a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f39594b;

    /* renamed from: c, reason: collision with root package name */
    public final Bi f39595c;

    /* renamed from: d, reason: collision with root package name */
    public final Z7 f39596d;

    /* renamed from: e, reason: collision with root package name */
    public final C2685hl f39597e;

    /* renamed from: f, reason: collision with root package name */
    public final M2 f39598f;

    /* renamed from: g, reason: collision with root package name */
    public final C2634fn f39599g;

    /* renamed from: h, reason: collision with root package name */
    public final Xk f39600h;

    public C2872p1(C3000u0 c3000u0, M2 m22, C2685hl c2685hl, Do r4, C2634fn c2634fn, Bi bi, Z7 z7, Xk xk) {
        this.f39593a = c3000u0;
        this.f39594b = r4;
        this.f39595c = bi;
        this.f39596d = z7;
        this.f39598f = m22;
        this.f39599g = c2634fn;
        this.f39597e = c2685hl;
        this.f39600h = xk;
    }

    public static IHandlerExecutor c() {
        return C3082x4.l().f40118c.a();
    }

    public final void a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        M2 m22 = this.f39598f;
        m22.f37946f.a(context);
        m22.f37942b.a(appMetricaConfig);
        C2634fn c2634fn = this.f39599g;
        Context applicationContext = context.getApplicationContext();
        c2634fn.f39009e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c2634fn.f39008d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c2634fn.f39005a.getClass();
        C2974t0 a4 = C2974t0.a(applicationContext);
        a4.f39826d.a(appMetricaConfig, a4);
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.tp
            @Override // java.lang.Runnable
            public final void run() {
                C2872p1.this.b(context, appMetricaConfig);
            }
        });
        this.f39593a.getClass();
        synchronized (C2974t0.class) {
            C2974t0.f39821f = true;
        }
    }

    public final String b() {
        this.f39593a.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        if (c2974t0 == null) {
            return null;
        }
        return c2974t0.f().e();
    }

    public final Ec d() {
        this.f39593a.getClass();
        return C2974t0.f39820e.f().i();
    }

    public final void e() {
        d().f37439a.a(this.f39600h.a());
    }

    public final void f() {
        this.f39598f.f37941a.a(null);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new R0(this));
    }

    public final void c(Activity activity) {
        this.f39598f.f37941a.a(null);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2532c1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C3000u0 c3000u0 = this.f39593a;
        Context applicationContext = context.getApplicationContext();
        c3000u0.getClass();
        C2974t0 a4 = C2974t0.a(applicationContext);
        a4.f().b(this.f39596d.a(appMetricaConfig));
        Context context2 = a4.f39823a;
        ((U9) C3082x4.l().f40118c.a()).execute(new RunnableC2949s1(context2));
    }

    public final void e(String str) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new P0(this, str));
    }

    public final void d(@NonNull String str) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37950j.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new K0(this, str));
    }

    public C2872p1() {
        this(C3082x4.l().d(), new Do());
    }

    public final void c(@NonNull String str, String str2) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37959s.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2742k1(this, str, str2));
    }

    public C2872p1(C3000u0 c3000u0, Do r11) {
        this(c3000u0, new M2(c3000u0), new C2685hl(c3000u0), r11, new C2634fn(c3000u0, r11), Bi.a(), C3082x4.l().j(), C3082x4.l().o());
    }

    public final void d(@NonNull String str, String str2) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        if (m22.f37955o.a(str).f39527a) {
            this.f39599g.getClass();
            IHandlerExecutor c4 = c();
            ((U9) c4).f38354b.post(new Z0(this, str, str2));
        }
    }

    public final void b(@NonNull String str) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37959s.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2716j1(this, str));
    }

    public final void c(boolean z4) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new M0(this, z4));
    }

    public final void b(@NonNull Activity activity) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37943c.a(activity);
        this.f39599g.getClass();
        Intent a4 = C2634fn.a(activity);
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new H0(this, a4));
    }

    public final void c(@NonNull String str) {
        if (this.f39597e.a((Void) null).f39527a && this.f39598f.f37954n.a(str).f39527a) {
            this.f39599g.getClass();
            IHandlerExecutor c4 = c();
            ((U9) c4).f38354b.post(new RunnableC2478a1(this, str));
        }
    }

    public final void a(Activity activity) {
        this.f39598f.f37941a.a(null);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2691i1(this, activity));
    }

    public final void b(boolean z4) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new O0(this, z4));
    }

    public final void a(@NonNull Application application) {
        this.f39598f.f37945e.a(application);
        this.f39599g.f39007c.a(application);
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.vp
            @Override // java.lang.Runnable
            public final void run() {
                C2872p1.this.e();
            }
        });
    }

    public final void b(@NonNull String str, String str2) {
        this.f39598f.f37952l.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new X0(this, str, str2));
    }

    public final void a(@NonNull String str, Map<String, Object> map) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37959s.a(str);
        this.f39599g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2768l1(this, str, listFromMap));
    }

    public final void b(@NonNull final Object... objArr) {
        this.f39598f.f37941a.a(null);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.up
            @Override // java.lang.Runnable
            public final void run() {
                C2872p1.a(objArr);
            }
        });
    }

    public final void b(@NonNull Context context) {
        this.f39598f.f37946f.a(context);
        this.f39599g.f39009e.a(context);
        this.f39593a.getClass();
        C2974t0.a(context);
    }

    public final void a(@NonNull String str, Throwable th) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37960t.a(str);
        this.f39599g.getClass();
        if (th == null) {
            th = new T1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2794m1(this, str, th));
    }

    public final void a(@NonNull String str, String str2, Throwable th) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37961u.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2820n1(this, str, str2, th));
    }

    public final void a(@NonNull Throwable th) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37962v.a(th);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2846o1(this, th));
    }

    public final void a(@NonNull String str) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37949i.a(str);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new I0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37944d.a(intent);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new J0(this, intent));
    }

    public final void a(Location location) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new L0(this, location));
    }

    public final void a(boolean z4) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new N0(this, z4));
    }

    public final void a(@NonNull UserProfile userProfile) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37963w.a(userProfile);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new Q0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37964x.a(revenue);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new S0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37965y.a(adRevenue);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new T0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37966z.a(eCommerceEvent);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new U0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37947g.a(deferredDeeplinkParametersListener);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new V0(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37947g.a(deferredDeeplinkListener);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new W0(this, deferredDeeplinkListener));
    }

    @NonNull
    public final InterfaceC2804mb a(@NonNull Context context, @NonNull String str) {
        M2 m22 = this.f39598f;
        m22.f37946f.a(context);
        m22.f37951k.a(str);
        C2634fn c2634fn = this.f39599g;
        c2634fn.f39009e.a(context.getApplicationContext());
        return this.f39595c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        M2 m22 = this.f39598f;
        m22.f37946f.a(context);
        m22.f37948h.a(reporterConfig);
        C2634fn c2634fn = this.f39599g;
        c2634fn.f39009e.a(context.getApplicationContext());
        Bi bi = this.f39595c;
        Context applicationContext = context.getApplicationContext();
        if (((C2992ti) bi.f37255a.get(reporterConfig.apiKey)) == null) {
            synchronized (bi.f37255a) {
                try {
                    if (((C2992ti) bi.f37255a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a4 = C3082x4.l().f40118c.a();
                        bi.f37256b.getClass();
                        if (C2974t0.f39820e == null) {
                            ((U9) a4).f38354b.post(new RunnableC3148zi(bi, applicationContext));
                        }
                        C2992ti c2992ti = new C2992ti(applicationContext.getApplicationContext(), str, new C3000u0());
                        bi.f37255a.put(str, c2992ti);
                        c2992ti.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37953m.a(webView);
        Do r02 = this.f39599g.f39006b;
        r02.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Ao ao = new Ao();
                synchronized (r02) {
                    try {
                        PublicLogger publicLogger = r02.f37390b;
                        if (publicLogger == null) {
                            r02.f37389a.add(ao);
                        } else {
                            ao.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                r02.a(new Bo());
            }
        } catch (Throwable th) {
            r02.a(new Co(th));
        }
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new Y0(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f39598f.f37946f.a(context);
        C2634fn c2634fn = this.f39599g;
        Context applicationContext = context.getApplicationContext();
        c2634fn.f39009e.a(applicationContext);
        c2634fn.f39010f.a(applicationContext);
        return C3082x4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, String str2) {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2505b1(this, str, str2));
    }

    public final void a() {
        this.f39598f.getClass();
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2559d1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        M2 m22 = this.f39598f;
        m22.f37946f.a(context);
        m22.f37956p.a(startupParamsCallback);
        C2634fn c2634fn = this.f39599g;
        c2634fn.f39009e.a(context.getApplicationContext());
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2585e1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37957q.a(anrListener);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2612f1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        M2 m22 = this.f39598f;
        m22.f37941a.a(null);
        m22.f37958r.a(externalAttribution);
        this.f39599g.getClass();
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2639g1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b4 = C3082x4.l().m().b();
        if (b4 != null) {
            b4.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f39598f.f37940A.a(map);
        this.f39599g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c4 = c();
        ((U9) c4).f38354b.post(new RunnableC2665h1(this, listFromMap));
    }

    public static InterfaceC2569db a(C2872p1 c2872p1) {
        return c2872p1.d().f37439a;
    }
}
