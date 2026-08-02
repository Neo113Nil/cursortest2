package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644gi implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final C1118z0 f11935a;

    /* renamed from: b, reason: collision with root package name */
    public final Ah f11936b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f11937c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11938d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f11939e;

    /* renamed from: f, reason: collision with root package name */
    public final C0903qi f11940f;

    /* renamed from: g, reason: collision with root package name */
    public final Oe f11941g;

    public C0644gi(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C1118z0());
    }

    public static Ra a(C1118z0 c1118z0, Context context, ReporterConfig reporterConfig) {
        c1118z0.getClass();
        return C1092y0.a(context).f().c(reporterConfig);
    }

    public final void c(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Th(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0567di(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f11941g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0541ci(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f11936b.f10056h.a(adRevenue);
        this.f11940f.getClass();
        this.f11937c.execute(new Ph(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f11936b.f10058j.a(map);
        this.f11940f.getClass();
        this.f11937c.execute(new Zh(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f11936b.f10057i.a(eCommerceEvent);
        this.f11940f.getClass();
        this.f11937c.execute(new Rh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f11936b.f10050b.a(str);
        this.f11940f.getClass();
        if (th == null) {
            th = new N1();
            th.fillInStackTrace();
        }
        this.f11937c.execute(new Hh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f11936b.f10049a.a(str);
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0592ei(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f11936b.f10055g.a(revenue);
        this.f11940f.getClass();
        this.f11937c.execute(new Oh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f11936b.f10053e.a(th);
        this.f11940f.getClass();
        this.f11937c.execute(new Jh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f11936b.f10054f.a(userProfile);
        this.f11940f.getClass();
        this.f11937c.execute(new Nh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Kh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0515bi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Sh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Wh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Mh(this, str));
    }

    public C0644gi(Context context, String str, C1118z0 c1118z0) {
        this(context, new Ah(), c1118z0, new C0903qi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        this.f11936b.f10052d.a(qn);
        this.f11940f.getClass();
        this.f11937c.execute(new Yh(this, qn));
    }

    public C0644gi(Context context, Ah ah, C1118z0 c1118z0, C0903qi c0903qi, ReporterConfig reporterConfig) {
        this(context, ah, c1118z0, c0903qi, reporterConfig, new Oe(new Qh(c1118z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.f11936b.f10056h.a(adRevenue);
        this.f11940f.getClass();
        this.f11937c.execute(new Xh(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f11936b.f10049a.a(str);
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0618fi(this, str, str2));
    }

    public C0644gi(Context context, Ah ah, C1118z0 c1118z0, C0903qi c0903qi, ReporterConfig reporterConfig, Oe oe) {
        this.f11937c = C0501b4.l().g().a();
        this.f11938d = context;
        this.f11936b = ah;
        this.f11935a = c1118z0;
        this.f11940f = c0903qi;
        this.f11939e = reporterConfig;
        this.f11941g = oe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f11936b.f10051c.a(str);
        this.f11940f.getClass();
        this.f11937c.execute(new Ih(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0626g0
    public final void a(V v) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new RunnableC0489ai(this, v));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f11936b.f10049a.a(str);
        this.f11940f.getClass();
        this.f11937c.execute(new Gh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Uh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f11936b.getClass();
        this.f11940f.getClass();
        this.f11937c.execute(new Vh(this, moduleEvent));
    }
}
