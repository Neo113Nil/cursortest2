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

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963t1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1118z0 f12756a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f12757b;

    /* renamed from: c, reason: collision with root package name */
    public final C0851oi f12758c;

    /* renamed from: d, reason: collision with root package name */
    public final D7 f12759d;

    /* renamed from: e, reason: collision with root package name */
    public final C0673hl f12760e;

    /* renamed from: f, reason: collision with root package name */
    public final A2 f12761f;

    /* renamed from: g, reason: collision with root package name */
    public final C0649gn f12762g;

    /* renamed from: h, reason: collision with root package name */
    public final Wk f12763h;

    public C0963t1(C1118z0 c1118z0, A2 a22, C0673hl c0673hl, Ho ho, C0649gn c0649gn, C0851oi c0851oi, D7 d7, Wk wk) {
        this.f12756a = c1118z0;
        this.f12757b = ho;
        this.f12758c = c0851oi;
        this.f12759d = d7;
        this.f12761f = a22;
        this.f12762g = c0649gn;
        this.f12760e = c0673hl;
        this.f12763h = wk;
    }

    public static IHandlerExecutor c() {
        return C0501b4.l().f11457c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        A2 a22 = this.f12761f;
        a22.f10003f.a(context);
        a22.f9999b.a(appMetricaConfig);
        C0649gn c0649gn = this.f12762g;
        Context applicationContext = context.getApplicationContext();
        c0649gn.f11956e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0649gn.f11955d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0649gn.f11952a.getClass();
        C1092y0 a3 = C1092y0.a(applicationContext);
        a3.f13048d.a(appMetricaConfig, a3);
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new Q1.a(this, context, appMetricaConfig, 13));
        this.f12756a.getClass();
        C1118z0.b();
    }

    public final String b() {
        this.f12756a.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        if (c1092y0 == null) {
            return null;
        }
        return c1092y0.f().e();
    }

    public final C0715jc d() {
        this.f12756a.getClass();
        return C1092y0.f13042e.f().i();
    }

    public final void e() {
        d().f12127a.a(this.f12763h.a());
    }

    public final void f() {
        this.f12761f.f9998a.a(null);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new W0(this));
    }

    public final void c(Activity activity) {
        this.f12761f.f9998a.a(null);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0653h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C1118z0 c1118z0 = this.f12756a;
        Context applicationContext = context.getApplicationContext();
        c1118z0.getClass();
        C1092y0 a3 = C1092y0.a(applicationContext);
        a3.f().b(this.f12759d.a(appMetricaConfig));
        Context context2 = a3.f13045a;
        ((C1127z9) C0501b4.l().f11457c.a()).execute(new RunnableC1041w1(context2));
    }

    public final void d(String str) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new T0(this, str));
    }

    public C0963t1() {
        this(C0501b4.l().d(), new Ho());
    }

    public final void c(String str, String str2) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10013r.a(str);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0834o1(this, str, str2));
    }

    public final void d(String str, String str2) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        if (a22.n.a(str).f12630a) {
            this.f12762g.getClass();
            IHandlerExecutor c4 = c();
            ((C1127z9) c4).f13097b.post(new RunnableC0550d1(this, str, str2));
        }
    }

    public C0963t1(C1118z0 c1118z0, Ho ho) {
        this(c1118z0, new A2(c1118z0), new C0673hl(c1118z0), ho, new C0649gn(c1118z0, ho), C0851oi.a(), C0501b4.l().j(), C0501b4.l().o());
    }

    public final void b(String str) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10013r.a(str);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0808n1(this, str));
    }

    public final void c(boolean z) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new Q0(this, z));
    }

    public final void a(Activity activity) {
        this.f12761f.f9998a.a(null);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0782m1(this, activity));
    }

    public final void b(Activity activity) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10000c.a(activity);
        this.f12762g.getClass();
        Intent a3 = C0649gn.a(activity);
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new M0(this, a3));
    }

    public final void c(String str) {
        if (this.f12760e.a((Void) null).f12630a && this.f12761f.f10010m.a(str).f12630a) {
            this.f12762g.getClass();
            IHandlerExecutor c4 = c();
            ((C1127z9) c4).f13097b.post(new RunnableC0575e1(this, str));
        }
    }

    public final void a(Application application) {
        this.f12761f.f10002e.a(application);
        this.f12762g.f11954c.a(application);
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new R1.n(29, this));
    }

    public final void b(boolean z) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new S0(this, z));
    }

    public final void b(String str, String str2) {
        this.f12761f.f10008k.a(str);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0498b1(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10013r.a(str);
        this.f12762g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0860p1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f12761f.f9998a.a(null);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new com.startapp.sdk.ads.nativead.k(1, objArr));
    }

    public final void a(String str, Throwable th) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10014s.a(str);
        this.f12762g.getClass();
        if (th == null) {
            th = new N1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0886q1(this, str, th));
    }

    public final void b(Context context) {
        this.f12761f.f10003f.a(context);
        this.f12762g.f11956e.a(context);
        this.f12756a.getClass();
        C1092y0.a(context);
    }

    public final void a(String str, String str2, Throwable th) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10015t.a(str);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0911r1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10016u.a(th);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0937s1(this, th));
    }

    public final void a(String str) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10006i.a(str);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new N0(this, str));
    }

    public final void a(Intent intent) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10001d.a(intent);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new O0(this, intent));
    }

    public final void a(Location location) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new P0(this, location));
    }

    public final void a(boolean z) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new R0(this, z));
    }

    public final void a(UserProfile userProfile) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.v.a(userProfile);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new U0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10017w.a(revenue);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new V0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10018x.a(adRevenue);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new X0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10019y.a(eCommerceEvent);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new Y0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10004g.a(deferredDeeplinkParametersListener);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new Z0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10004g.a(deferredDeeplinkListener);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0472a1(this, deferredDeeplinkListener));
    }

    public final Ra a(Context context, String str) {
        A2 a22 = this.f12761f;
        a22.f10003f.a(context);
        a22.f10007j.a(str);
        C0649gn c0649gn = this.f12762g;
        c0649gn.f11956e.a(context.getApplicationContext());
        return this.f12758c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        A2 a22 = this.f12761f;
        a22.f10003f.a(context);
        a22.f10005h.a(reporterConfig);
        C0649gn c0649gn = this.f12762g;
        c0649gn.f11956e.a(context.getApplicationContext());
        C0851oi c0851oi = this.f12758c;
        Context applicationContext = context.getApplicationContext();
        if (((C0644gi) c0851oi.f12525a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0851oi.f12525a) {
                try {
                    if (((C0644gi) c0851oi.f12525a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a3 = C0501b4.l().f11457c.a();
                        c0851oi.f12526b.getClass();
                        if (C1092y0.f13042e == null) {
                            ((C1127z9) a3).f13097b.post(new RunnableC0799mi(c0851oi, applicationContext));
                        }
                        C0644gi c0644gi = new C0644gi(applicationContext.getApplicationContext(), str, new C1118z0());
                        c0851oi.f12525a.put(str, c0644gi);
                        c0644gi.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(WebView webView) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10009l.a(webView);
        Ho ho = this.f12762g.f11953b;
        ho.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Eo eo = new Eo();
                synchronized (ho) {
                    try {
                        PublicLogger publicLogger = ho.f10387b;
                        if (publicLogger == null) {
                            ho.f10386a.add(eo);
                        } else {
                            eo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ho.a(new Fo());
            }
        } catch (Throwable th) {
            ho.a(new Go(th));
        }
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0524c1(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f12761f.f10003f.a(context);
        C0649gn c0649gn = this.f12762g;
        Context applicationContext = context.getApplicationContext();
        c0649gn.f11956e.a(applicationContext);
        c0649gn.f11957f.a(applicationContext);
        return C0501b4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0601f1(this, str, str2));
    }

    public final void a() {
        this.f12761f.getClass();
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0627g1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        A2 a22 = this.f12761f;
        a22.f10003f.a(context);
        a22.o.a(startupParamsCallback);
        C0649gn c0649gn = this.f12762g;
        c0649gn.f11956e.a(context.getApplicationContext());
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0679i1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10011p.a(anrListener);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0704j1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        A2 a22 = this.f12761f;
        a22.f9998a.a(null);
        a22.f10012q.a(externalAttribution);
        this.f12762g.getClass();
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0730k1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b4 = C0501b4.l().m().b();
        if (b4 != null) {
            b4.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f12761f.z.a(map);
        this.f12762g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c4 = c();
        ((C1127z9) c4).f13097b.post(new RunnableC0756l1(this, listFromMap));
    }

    public static Ia a(C0963t1 c0963t1) {
        return c0963t1.d().f12127a;
    }
}
