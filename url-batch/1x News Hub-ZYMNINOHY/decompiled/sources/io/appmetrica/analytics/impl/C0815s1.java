package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
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

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815s1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0944x0 f8278a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f8279b;

    /* renamed from: c, reason: collision with root package name */
    public final C0858ti f8280c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f8281d;

    /* renamed from: e, reason: collision with root package name */
    public final C0654ll f8282e;
    public final I2 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0604jn f8283g;

    /* renamed from: h, reason: collision with root package name */
    public final C0396bl f8284h;

    public C0815s1(C0944x0 c0944x0, I2 i22, C0654ll c0654ll, Io io2, C0604jn c0604jn, C0858ti c0858ti, L7 l7, C0396bl c0396bl) {
        this.f8278a = c0944x0;
        this.f8279b = io2;
        this.f8280c = c0858ti;
        this.f8281d = l7;
        this.f = i22;
        this.f8283g = c0604jn;
        this.f8282e = c0654ll;
        this.f8284h = c0396bl;
    }

    public static IHandlerExecutor c() {
        return C0585j4.l().f7594c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6110b.a(appMetricaConfig);
        C0604jn c0604jn = this.f8283g;
        Context applicationContext = context.getApplicationContext();
        c0604jn.f7689e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0604jn.f7688d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0604jn.f7685a.getClass();
        C0918w0 a3 = C0918w0.a(applicationContext);
        a3.f8542d.a(appMetricaConfig, a3);
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new A0.a(this, context, appMetricaConfig, 10));
        this.f8278a.getClass();
        C0944x0.b();
    }

    public final String b() {
        this.f8278a.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        if (c0918w0 == null) {
            return null;
        }
        return c0918w0.f().e();
    }

    public final C0775qc d() {
        this.f8278a.getClass();
        return C0918w0.f8537e.f().i();
    }

    public final void e() {
        d().f8159a.a(this.f8284h.a());
    }

    public final void f() {
        this.f.f6109a.a(null);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new U0(this));
    }

    public final void c(Activity activity) {
        this.f.f6109a.a(null);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0479f1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C0944x0 c0944x0 = this.f8278a;
        Context applicationContext = context.getApplicationContext();
        c0944x0.getClass();
        C0918w0 a3 = C0918w0.a(applicationContext);
        a3.f().b(this.f8281d.a(appMetricaConfig));
        Context context2 = a3.f8539a;
        ((G9) C0585j4.l().f7594c.a()).execute(new RunnableC0893v1(context2));
    }

    public final void e(String str) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new S0(this, str));
    }

    public final void d(String str) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6117j.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new N0(this, str));
    }

    public C0815s1() {
        this(C0585j4.l().d(), new Io());
    }

    public final void c(String str, String str2) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6125s.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0686n1(this, str, str2));
    }

    public C0815s1(C0944x0 c0944x0, Io io2) {
        this(c0944x0, new I2(c0944x0), new C0654ll(c0944x0), io2, new C0604jn(c0944x0, io2), C0858ti.a(), C0585j4.l().j(), C0585j4.l().o());
    }

    public final void d(String str, String str2) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        if (i22.o.a(str).f8327a) {
            this.f8283g.getClass();
            IHandlerExecutor c3 = c();
            ((G9) c3).f6035b.post(new RunnableC0402c1(this, str, str2));
        }
    }

    public final void b(String str) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6125s.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0660m1(this, str));
    }

    public final void c(boolean z) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new P0(this, z));
    }

    public final void a(Activity activity) {
        this.f.f6109a.a(null);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0634l1(this, activity));
    }

    public final void b(Activity activity) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6111c.a(activity);
        this.f8283g.getClass();
        Intent a3 = C0604jn.a(activity);
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new K0(this, a3));
    }

    public final void c(String str) {
        if (this.f8282e.a((Void) null).f8327a && this.f.f6121n.a(str).f8327a) {
            this.f8283g.getClass();
            IHandlerExecutor c3 = c();
            ((G9) c3).f6035b.post(new RunnableC0428d1(this, str));
        }
    }

    public final void a(Application application) {
        this.f.f6113e.a(application);
        this.f8283g.f7687c.a(application);
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new B0.n(21, this));
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new R0(this, z));
    }

    public final void b(String str, String str2) {
        this.f.f6119l.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0350a1(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6125s.a(str);
        this.f8283g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0712o1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f.f6109a.a(null);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new com.startapp.sdk.ads.nativead.k(1, objArr));
    }

    public final void a(String str, Throwable th) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6126t.a(str);
        this.f8283g.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0738p1(this, str, th));
    }

    public final void b(Context context) {
        this.f.f.a(context);
        this.f8283g.f7689e.a(context);
        this.f8278a.getClass();
        C0918w0.a(context);
    }

    public final void a(String str, String str2, Throwable th) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6127u.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0764q1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.v.a(th);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0789r1(this, th));
    }

    public final void a(String str) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6116i.a(str);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new L0(this, str));
    }

    public final void a(Intent intent) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6112d.a(intent);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new M0(this, intent));
    }

    public final void a(Location location) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new O0(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new Q0(this, z));
    }

    public final void a(UserProfile userProfile) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6128w.a(userProfile);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new T0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6129x.a(revenue);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new V0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6130y.a(adRevenue);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new W0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.z.a(eCommerceEvent);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new X0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6114g.a(deferredDeeplinkParametersListener);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new Y0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6114g.a(deferredDeeplinkListener);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new Z0(this, deferredDeeplinkListener));
    }

    public final Ya a(Context context, String str) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6118k.a(str);
        C0604jn c0604jn = this.f8283g;
        c0604jn.f7689e.a(context.getApplicationContext());
        return this.f8280c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6115h.a(reporterConfig);
        C0604jn c0604jn = this.f8283g;
        c0604jn.f7689e.a(context.getApplicationContext());
        C0858ti c0858ti = this.f8280c;
        Context applicationContext = context.getApplicationContext();
        if (((C0651li) c0858ti.f8377a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0858ti.f8377a) {
                try {
                    if (((C0651li) c0858ti.f8377a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a3 = C0585j4.l().f7594c.a();
                        c0858ti.f8378b.getClass();
                        if (C0918w0.f8537e == null) {
                            ((G9) a3).f6035b.post(new RunnableC0806ri(c0858ti, applicationContext));
                        }
                        C0651li c0651li = new C0651li(applicationContext.getApplicationContext(), str, new C0944x0());
                        c0858ti.f8377a.put(str, c0651li);
                        c0651li.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(WebView webView) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6120m.a(webView);
        Io io2 = this.f8283g.f7686b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo = new Fo();
                synchronized (io2) {
                    try {
                        PublicLogger publicLogger = io2.f6182b;
                        if (publicLogger == null) {
                            io2.f6181a.add(fo);
                        } else {
                            fo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                io2.a(new Go());
            }
        } catch (Throwable th) {
            io2.a(new Ho(th));
        }
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0376b1(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f.f.a(context);
        C0604jn c0604jn = this.f8283g;
        Context applicationContext = context.getApplicationContext();
        c0604jn.f7689e.a(applicationContext);
        c0604jn.f.a(applicationContext);
        return C0585j4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0453e1(this, str, str2));
    }

    public final void a() {
        this.f.getClass();
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0505g1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6122p.a(startupParamsCallback);
        C0604jn c0604jn = this.f8283g;
        c0604jn.f7689e.a(context.getApplicationContext());
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0531h1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6123q.a(anrListener);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0557i1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        I2 i22 = this.f;
        i22.f6109a.a(null);
        i22.f6124r.a(externalAttribution);
        this.f8283g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0582j1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b3 = C0585j4.l().m().b();
        if (b3 != null) {
            b3.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f.f6108A.a(map);
        this.f8283g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c3 = c();
        ((G9) c3).f6035b.post(new RunnableC0608k1(this, listFromMap));
    }

    public static Pa a(C0815s1 c0815s1) {
        return c0815s1.d().f8159a;
    }
}
