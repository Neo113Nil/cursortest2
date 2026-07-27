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
public final class C0966s1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1095x0 f9216a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f9217b;

    /* renamed from: c, reason: collision with root package name */
    public final C1009ti f9218c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f9219d;

    /* renamed from: e, reason: collision with root package name */
    public final C0805ll f9220e;

    /* renamed from: f, reason: collision with root package name */
    public final I2 f9221f;

    /* renamed from: g, reason: collision with root package name */
    public final C0755jn f9222g;

    /* renamed from: h, reason: collision with root package name */
    public final C0547bl f9223h;

    public C0966s1(C1095x0 c1095x0, I2 i2, C0805ll c0805ll, Io io2, C0755jn c0755jn, C1009ti c1009ti, L7 l7, C0547bl c0547bl) {
        this.f9216a = c1095x0;
        this.f9217b = io2;
        this.f9218c = c1009ti;
        this.f9219d = l7;
        this.f9221f = i2;
        this.f9222g = c0755jn;
        this.f9220e = c0805ll;
        this.f9223h = c0547bl;
    }

    public static IHandlerExecutor c() {
        return C0736j4.l().f8484c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        I2 i2 = this.f9221f;
        i2.f6910f.a(context);
        i2.f6906b.a(appMetricaConfig);
        C0755jn c0755jn = this.f9222g;
        Context applicationContext = context.getApplicationContext();
        c0755jn.f8588e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0755jn.f8587d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0755jn.f8584a.getClass();
        C1069w0 a6 = C1069w0.a(applicationContext);
        a6.f9496d.a(appMetricaConfig, a6);
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new J0.a(this, context, appMetricaConfig, 7));
        this.f9216a.getClass();
        C1095x0.b();
    }

    public final String b() {
        this.f9216a.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        if (c1069w0 == null) {
            return null;
        }
        return c1069w0.f().e();
    }

    public final C0926qc d() {
        this.f9216a.getClass();
        return C1069w0.f9490e.f().i();
    }

    public final void e() {
        d().f9092a.a(this.f9223h.a());
    }

    public final void f() {
        this.f9221f.f6905a.a(null);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new U0(this));
    }

    public final void c(Activity activity) {
        this.f9221f.f6905a.a(null);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0630f1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C1095x0 c1095x0 = this.f9216a;
        Context applicationContext = context.getApplicationContext();
        c1095x0.getClass();
        C1069w0 a6 = C1069w0.a(applicationContext);
        a6.f().b(this.f9219d.a(appMetricaConfig));
        Context context2 = a6.f9493a;
        ((G9) C0736j4.l().f8484c.a()).execute(new RunnableC1044v1(context2));
    }

    public final void e(String str) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new S0(this, str));
    }

    public final void d(String str) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6914j.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new N0(this, str));
    }

    public C0966s1() {
        this(C0736j4.l().d(), new Io());
    }

    public final void c(String str, String str2) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6923s.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0837n1(this, str, str2));
    }

    public C0966s1(C1095x0 c1095x0, Io io2) {
        this(c1095x0, new I2(c1095x0), new C0805ll(c1095x0), io2, new C0755jn(c1095x0, io2), C1009ti.a(), C0736j4.l().j(), C0736j4.l().o());
    }

    public final void d(String str, String str2) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        if (i2.f6919o.a(str).f9268a) {
            this.f9222g.getClass();
            IHandlerExecutor c2 = c();
            ((G9) c2).f6828b.post(new RunnableC0553c1(this, str, str2));
        }
    }

    public final void b(String str) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6923s.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0811m1(this, str));
    }

    public final void c(boolean z) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new P0(this, z));
    }

    public final void a(Activity activity) {
        this.f9221f.f6905a.a(null);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0785l1(this, activity));
    }

    public final void b(Activity activity) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6907c.a(activity);
        this.f9222g.getClass();
        Intent a6 = C0755jn.a(activity);
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new K0(this, a6));
    }

    public final void c(String str) {
        if (this.f9220e.a((Void) null).f9268a && this.f9221f.f6918n.a(str).f9268a) {
            this.f9222g.getClass();
            IHandlerExecutor c2 = c();
            ((G9) c2).f6828b.post(new RunnableC0579d1(this, str));
        }
    }

    public final void a(Application application) {
        this.f9221f.f6909e.a(application);
        this.f9222g.f8586c.a(application);
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new B2.b(15, this));
    }

    public final void b(boolean z) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new R0(this, z));
    }

    public final void b(String str, String str2) {
        this.f9221f.f6916l.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0501a1(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6923s.a(str);
        this.f9222g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0863o1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f9221f.f6905a.a(null);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new B2.b(16, objArr));
    }

    public final void a(String str, Throwable th) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6924t.a(str);
        this.f9222g.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0889p1(this, str, th));
    }

    public final void b(Context context) {
        this.f9221f.f6910f.a(context);
        this.f9222g.f8588e.a(context);
        this.f9216a.getClass();
        C1069w0.a(context);
    }

    public final void a(String str, String str2, Throwable th) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6925u.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0915q1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6926v.a(th);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0940r1(this, th));
    }

    public final void a(String str) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6913i.a(str);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new L0(this, str));
    }

    public final void a(Intent intent) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6908d.a(intent);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new M0(this, intent));
    }

    public final void a(Location location) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new O0(this, location));
    }

    public final void a(boolean z) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new Q0(this, z));
    }

    public final void a(UserProfile userProfile) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6927w.a(userProfile);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new T0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6928x.a(revenue);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new V0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6929y.a(adRevenue);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new W0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.z.a(eCommerceEvent);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new X0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6911g.a(deferredDeeplinkParametersListener);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new Y0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6911g.a(deferredDeeplinkListener);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new Z0(this, deferredDeeplinkListener));
    }

    public final Ya a(Context context, String str) {
        I2 i2 = this.f9221f;
        i2.f6910f.a(context);
        i2.f6915k.a(str);
        C0755jn c0755jn = this.f9222g;
        c0755jn.f8588e.a(context.getApplicationContext());
        return this.f9218c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        I2 i2 = this.f9221f;
        i2.f6910f.a(context);
        i2.f6912h.a(reporterConfig);
        C0755jn c0755jn = this.f9222g;
        c0755jn.f8588e.a(context.getApplicationContext());
        C1009ti c1009ti = this.f9218c;
        Context applicationContext = context.getApplicationContext();
        if (((C0802li) c1009ti.f9321a.get(reporterConfig.apiKey)) == null) {
            synchronized (c1009ti.f9321a) {
                try {
                    if (((C0802li) c1009ti.f9321a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a6 = C0736j4.l().f8484c.a();
                        c1009ti.f9322b.getClass();
                        if (C1069w0.f9490e == null) {
                            ((G9) a6).f6828b.post(new RunnableC0957ri(c1009ti, applicationContext));
                        }
                        C0802li c0802li = new C0802li(applicationContext.getApplicationContext(), str, new C1095x0());
                        c1009ti.f9321a.put(str, c0802li);
                        c0802li.a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    public final void a(WebView webView) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6917m.a(webView);
        Io io2 = this.f9222g.f8585b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo = new Fo();
                synchronized (io2) {
                    try {
                        PublicLogger publicLogger = io2.f6983b;
                        if (publicLogger == null) {
                            io2.f6982a.add(fo);
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
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0527b1(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f9221f.f6910f.a(context);
        C0755jn c0755jn = this.f9222g;
        Context applicationContext = context.getApplicationContext();
        c0755jn.f8588e.a(applicationContext);
        c0755jn.f8589f.a(applicationContext);
        return C0736j4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0604e1(this, str, str2));
    }

    public final void a() {
        this.f9221f.getClass();
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0656g1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        I2 i2 = this.f9221f;
        i2.f6910f.a(context);
        i2.f6920p.a(startupParamsCallback);
        C0755jn c0755jn = this.f9222g;
        c0755jn.f8588e.a(context.getApplicationContext());
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0682h1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6921q.a(anrListener);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0708i1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        I2 i2 = this.f9221f;
        i2.f6905a.a(null);
        i2.f6922r.a(externalAttribution);
        this.f9222g.getClass();
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0733j1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b6 = C0736j4.l().m().b();
        if (b6 != null) {
            b6.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f9221f.f6904A.a(map);
        this.f9222g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((G9) c2).f6828b.post(new RunnableC0759k1(this, listFromMap));
    }

    public static Pa a(C0966s1 c0966s1) {
        return c0966s1.d().f9092a;
    }
}
