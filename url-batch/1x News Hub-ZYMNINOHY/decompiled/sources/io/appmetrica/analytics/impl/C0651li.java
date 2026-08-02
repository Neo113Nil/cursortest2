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

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651li implements Ya {

    /* renamed from: a, reason: collision with root package name */
    public final C0944x0 f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f7832b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f7833c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7834d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f7835e;
    public final C0910vi f;

    /* renamed from: g, reason: collision with root package name */
    public final Te f7836g;

    public C0651li(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C0944x0());
    }

    public static Ya a(C0944x0 c0944x0, Context context, ReporterConfig reporterConfig) {
        c0944x0.getClass();
        return C0918w0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0573ii(this));
    }

    public final void d(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Yh(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f7836g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Qh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0548hi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f7832b.f6000h.a(adRevenue);
        this.f.getClass();
        this.f7833c.execute(new Uh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f7832b.f6002j.a(map);
        this.f.getClass();
        this.f7833c.execute(new RunnableC0470ei(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f7832b.f6001i.a(eCommerceEvent);
        this.f.getClass();
        this.f7833c.execute(new Wh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f7832b.f5995b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        this.f7833c.execute(new Mh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f7832b.f5994a.a(str);
        this.f.getClass();
        this.f7833c.execute(new RunnableC0599ji(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f7832b.f5999g.a(revenue);
        this.f.getClass();
        this.f7833c.execute(new Th(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f7832b.f5998e.a(th);
        this.f.getClass();
        this.f7833c.execute(new Oh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f7832b.f.a(userProfile);
        this.f.getClass();
        this.f7833c.execute(new Sh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Ph(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0522gi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Xh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0393bi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Rh(this, str));
    }

    public C0651li(Context context, String str, C0944x0 c0944x0) {
        this(context, new Fh(), c0944x0, new C0910vi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0386bb
    public final void a(Sn sn) {
        this.f7832b.f5997d.a(sn);
        this.f.getClass();
        this.f7833c.execute(new RunnableC0445di(this, sn));
    }

    public C0651li(Context context, Fh fh, C0944x0 c0944x0, C0910vi c0910vi, ReporterConfig reporterConfig) {
        this(context, fh, c0944x0, c0910vi, reporterConfig, new Te(new Vh(c0944x0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.f7832b.f6000h.a(adRevenue);
        this.f.getClass();
        this.f7833c.execute(new RunnableC0419ci(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f7832b.f5994a.a(str);
        this.f.getClass();
        this.f7833c.execute(new RunnableC0625ki(this, str, str2));
    }

    public C0651li(Context context, Fh fh, C0944x0 c0944x0, C0910vi c0910vi, ReporterConfig reporterConfig, Te te) {
        this.f7833c = C0585j4.l().g().a();
        this.f7834d = context;
        this.f7832b = fh;
        this.f7831a = c0944x0;
        this.f = c0910vi;
        this.f7835e = reporterConfig;
        this.f7836g = te;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f7832b.f5996c.a(str);
        this.f.getClass();
        this.f7833c.execute(new Nh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0504g0
    public final void a(V v) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0496fi(this, v));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f7832b.f5994a.a(str);
        this.f.getClass();
        this.f7833c.execute(new Lh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new Zh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f7832b.getClass();
        this.f.getClass();
        this.f7833c.execute(new RunnableC0367ai(this, moduleEvent));
    }
}
