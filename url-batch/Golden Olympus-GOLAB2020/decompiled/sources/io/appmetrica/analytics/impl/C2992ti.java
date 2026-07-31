package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
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

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2992ti implements InterfaceC2804mb {

    /* renamed from: a, reason: collision with root package name */
    public final C3000u0 f39864a;

    /* renamed from: b, reason: collision with root package name */
    public final Nh f39865b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f39866c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f39867d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f39868e;

    /* renamed from: f, reason: collision with root package name */
    public final Di f39869f;

    /* renamed from: g, reason: collision with root package name */
    public final C2546cf f39870g;

    public C2992ti(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C3000u0());
    }

    public static InterfaceC2804mb a(C3000u0 c3000u0, Context context, ReporterConfig reporterConfig) {
        c3000u0.getClass();
        return C2974t0.a(context).f().c(reporterConfig);
    }

    public final void c(@NonNull String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2656gi(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2915qi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f39870g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new Yh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, String str2) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2889pi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f39865b.f38028h.a(adRevenue);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2549ci(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f39865b.f38030j.a(map);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2811mi(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f39865b.f38029i.a(eCommerceEvent);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2602ei(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th) {
        this.f39865b.f38022b.a(str);
        this.f39869f.getClass();
        if (th == null) {
            th = new T1();
            th.fillInStackTrace();
        }
        this.f39866c.execute(new Uh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f39865b.f38021a.a(str);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2940ri(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f39865b.f38027g.a(revenue);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2522bi(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        this.f39865b.f38025e.a(th);
        this.f39869f.getClass();
        this.f39866c.execute(new Wh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f39865b.f38026f.a(userProfile);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2495ai(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new Xh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2863oi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z4) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2629fi(this, z4));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2733ji(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new Zh(this, str));
    }

    public C2992ti(Context context, String str, C3000u0 c3000u0) {
        this(context, new Nh(), c3000u0, new Di(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2804mb, io.appmetrica.analytics.impl.InterfaceC2882pb
    public final void a(@NonNull Nn nn) {
        this.f39865b.f38024d.a(nn);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2785li(this, nn));
    }

    public C2992ti(Context context, Nh nh, C3000u0 c3000u0, Di di, ReporterConfig reporterConfig) {
        this(context, nh, c3000u0, di, reporterConfig, new C2546cf(new C2576di(c3000u0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z4) {
        this.f39865b.f38028h.a(adRevenue);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2759ki(this, adRevenue, z4));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f39865b.f38021a.a(str);
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2966si(this, str, str2));
    }

    public C2992ti(Context context, Nh nh, C3000u0 c3000u0, Di di, ReporterConfig reporterConfig, C2546cf c2546cf) {
        this.f39866c = C3082x4.l().g().a();
        this.f39867d = context;
        this.f39865b = nh;
        this.f39864a = c3000u0;
        this.f39869f = di;
        this.f39868e = reporterConfig;
        this.f39870g = c2546cf;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th) {
        this.f39865b.f38023c.a(str);
        this.f39869f.getClass();
        this.f39866c.execute(new Vh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2804mb, io.appmetrica.analytics.impl.InterfaceC2584e0
    public final void a(@NonNull U u4) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2837ni(this, u4));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        this.f39865b.f38021a.a(str);
        this.f39869f.getClass();
        this.f39866c.execute(new Th(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2682hi(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f39865b.getClass();
        this.f39869f.getClass();
        this.f39866c.execute(new RunnableC2707ii(this, moduleEvent));
    }
}
