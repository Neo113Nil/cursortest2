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

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0231hi implements Sa {

    /* renamed from: a, reason: collision with root package name */
    public final C0665z0 f1292a;
    public final Bh b;
    public final IHandlerExecutor c;
    public final Context d;
    public final ReporterConfig e;
    public final C0483ri f;
    public final Pe g;

    public C0231hi(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C0665z0());
    }

    public static Sa a(C0665z0 c0665z0, Context context, ReporterConfig reporterConfig) {
        c0665z0.getClass();
        return C0640y0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0153ei(this));
    }

    public final void d(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Uh(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Mh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0128di(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new Qh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.b.j.a(map);
        this.f.getClass();
        this.c.execute(new RunnableC0050ai(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new Sh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.b.b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new O1();
            th.fillInStackTrace();
        }
        this.c.execute(new Ih(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.b.f778a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC0179fi(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new Ph(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.b.e.a(th);
        this.f.getClass();
        this.c.execute(new Kh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new Oh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0102ci(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Th(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Xh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Nh(this, str));
    }

    public C0231hi(Context context, String str, C0665z0 c0665z0) {
        this(context, new Bh(), c0665z0, new C0483ri(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(Rn rn) {
        this.b.d.a(rn);
        this.f.getClass();
        this.c.execute(new Zh(this, rn));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new Yh(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.b.f778a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC0205gi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.b.c.a(str);
        this.f.getClass();
        this.c.execute(new Jh(this, str, str2, th));
    }

    public C0231hi(Context context, Bh bh, C0665z0 c0665z0, C0483ri c0483ri, ReporterConfig reporterConfig) {
        this(context, bh, c0665z0, c0483ri, reporterConfig, new Pe(new Rh(c0665z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC0187g0
    public final void a(V v) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0076bi(this, v));
    }

    public C0231hi(Context context, Bh bh, C0665z0 c0665z0, C0483ri c0483ri, ReporterConfig reporterConfig, Pe pe) {
        this.c = C0088c4.l().g().a();
        this.d = context;
        this.b = bh;
        this.f1292a = c0665z0;
        this.f = c0483ri;
        this.e = reporterConfig;
        this.g = pe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.b.f778a.a(str);
        this.f.getClass();
        this.c.execute(new Hh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Vh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Wh(this, moduleEvent));
    }
}
