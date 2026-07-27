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
public final class C0802li implements Ya {

    /* renamed from: a, reason: collision with root package name */
    public final C1095x0 f8739a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f8740b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f8741c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8742d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f8743e;

    /* renamed from: f, reason: collision with root package name */
    public final C1061vi f8744f;

    /* renamed from: g, reason: collision with root package name */
    public final Te f8745g;

    public C0802li(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C1095x0());
    }

    public static Ya a(C1095x0 c1095x0, Context context, ReporterConfig reporterConfig) {
        c1095x0.getClass();
        return C1069w0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0724ii(this));
    }

    public final void d(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Yh(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f8745g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Qh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0699hi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f8740b.f6792h.a(adRevenue);
        this.f8744f.getClass();
        this.f8741c.execute(new Uh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f8740b.f6794j.a(map);
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0621ei(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f8740b.f6793i.a(eCommerceEvent);
        this.f8744f.getClass();
        this.f8741c.execute(new Wh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f8740b.f6786b.a(str);
        this.f8744f.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        this.f8741c.execute(new Mh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f8740b.f6785a.a(str);
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0750ji(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f8740b.f6791g.a(revenue);
        this.f8744f.getClass();
        this.f8741c.execute(new Th(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f8740b.f6789e.a(th);
        this.f8744f.getClass();
        this.f8741c.execute(new Oh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f8740b.f6790f.a(userProfile);
        this.f8744f.getClass();
        this.f8741c.execute(new Sh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Ph(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0673gi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Xh(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0544bi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Rh(this, str));
    }

    public C0802li(Context context, String str, C1095x0 c1095x0) {
        this(context, new Fh(), c1095x0, new C1061vi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0537bb
    public final void a(Sn sn) {
        this.f8740b.f6788d.a(sn);
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0596di(this, sn));
    }

    public C0802li(Context context, Fh fh, C1095x0 c1095x0, C1061vi c1061vi, ReporterConfig reporterConfig) {
        this(context, fh, c1095x0, c1061vi, reporterConfig, new Te(new Vh(c1095x0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.f8740b.f6792h.a(adRevenue);
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0570ci(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f8740b.f6785a.a(str);
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0776ki(this, str, str2));
    }

    public C0802li(Context context, Fh fh, C1095x0 c1095x0, C1061vi c1061vi, ReporterConfig reporterConfig, Te te) {
        this.f8741c = C0736j4.l().g().a();
        this.f8742d = context;
        this.f8740b = fh;
        this.f8739a = c1095x0;
        this.f8744f = c1061vi;
        this.f8743e = reporterConfig;
        this.f8745g = te;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f8740b.f6787c.a(str);
        this.f8744f.getClass();
        this.f8741c.execute(new Nh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0655g0
    public final void a(V v4) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0647fi(this, v4));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f8740b.f6785a.a(str);
        this.f8744f.getClass();
        this.f8741c.execute(new Lh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new Zh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f8740b.getClass();
        this.f8744f.getClass();
        this.f8741c.execute(new RunnableC0518ai(this, moduleEvent));
    }
}
