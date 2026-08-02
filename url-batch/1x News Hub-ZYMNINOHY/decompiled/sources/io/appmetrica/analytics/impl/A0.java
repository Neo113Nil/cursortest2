package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class A0 implements Ja {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5708a;

    /* renamed from: b, reason: collision with root package name */
    public final Ia f5709b;

    /* renamed from: c, reason: collision with root package name */
    public final C0364af f5710c;

    /* renamed from: d, reason: collision with root package name */
    public final Sl f5711d;

    /* renamed from: e, reason: collision with root package name */
    public final C0727og f5712e;
    public final Gf f;

    /* renamed from: g, reason: collision with root package name */
    public final C0729oi f5713g;

    /* renamed from: h, reason: collision with root package name */
    public final Bi f5714h;

    /* renamed from: i, reason: collision with root package name */
    public final L7 f5715i;

    /* renamed from: j, reason: collision with root package name */
    public final C0396bl f5716j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0775qc f5717k;

    /* renamed from: l, reason: collision with root package name */
    public final C0659m0 f5718l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5719m;

    public A0(Context context, Ia ia) {
        this.f5708a = context;
        this.f5709b = ia;
        C0364af b3 = C0585j4.l().b(context);
        this.f5710c = b3;
        ArrayList a3 = C1007zd.a();
        C0585j4 l3 = C0585j4.l();
        l3.m().a(new S3(context));
        B0.a(context).a(a3);
        Gf a4 = B0.a(context, B0.a(ia.b(), this));
        this.f = a4;
        L7 j3 = l3.j();
        this.f5715i = j3;
        Bi a5 = B0.a(a4, context, ia.getDefaultExecutor());
        this.f5714h = a5;
        j3.a(a5);
        Sl a6 = B0.a(context, a5, b3, ia.b());
        this.f5711d = a6;
        a5.a(a6);
        this.f5712e = B0.a(a5, b3, ia.b());
        this.f5713g = B0.a(context, a4, a5, ia.b(), a6);
        this.f5716j = l3.o();
        this.f5718l = new C0659m0(b3);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Ya c(ReporterConfig reporterConfig) {
        return this.f5713g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0462ea d() {
        return this.f5711d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final String e() {
        return this.f5711d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Map<String, String> g() {
        return this.f5711d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final AdvIdentifiersResult h() {
        return this.f5711d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0775qc i() {
        return this.f5717k;
    }

    public final Pa j() {
        C0775qc c0775qc = this.f5717k;
        kotlin.jvm.internal.j.b(c0775qc);
        return c0775qc.f8159a;
    }

    public final C0729oi k() {
        return this.f5713g;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0659m0 c0659m0 = this.f5718l;
        C0866u0 c0866u0 = c0659m0.f7847b;
        c0866u0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0866u0.f8385a.b() && kotlin.jvm.internal.j.a(c0866u0.f8386b.f7633a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c0659m0.f7846a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new C0994z0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a3 = a(orCreateMainPublicLogger, appMetricaConfig, new C0969y0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a3 || this.f5719m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a3 || z) {
            this.f5710c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a3) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f5719m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.H6
    public final void a(int i3, Bundle bundle) {
        this.f5711d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5712e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5712e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(ReporterConfig reporterConfig) {
        this.f5713g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f5711d.a(startupParamsCallback, list, AbstractC0696nb.c(this.f.f6044a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Dc dc, boolean z) {
        if (this.f5717k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.f5712e.a();
            C0723oc a3 = dc.a();
            G7 g7 = new G7(a3);
            C0775qc c0775qc = new C0775qc(a3, g7);
            this.f5709b.c().a(g7);
            this.f5717k = c0775qc;
            C0845t5 c0845t5 = this.f5716j.f7098b;
            synchronized (c0845t5) {
                try {
                    c0845t5.f8336a = a3;
                    Iterator it = c0845t5.f8337b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0544he) it.next()).consume(a3);
                    }
                    c0845t5.f8337b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        dc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f5709b.d().a(this.f5708a, appMetricaConfig, this);
            this.f5709b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f5709b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f5716j.a();
        } else {
            C0396bl c0396bl = this.f5716j;
            synchronized (c0396bl) {
                if (c0396bl.f7102g) {
                    c0396bl.f7097a.unregisterListener(c0396bl.f7099c, ActivityEvent.RESUMED);
                    c0396bl.f7097a.unregisterListener(c0396bl.f7100d, ActivityEvent.PAUSED);
                    c0396bl.f7102g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        Sl sl = this.f5711d;
        sl.f6658e = publicLogger;
        sl.b(appMetricaConfig.customHosts);
        Sl sl2 = this.f5711d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        sl2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f5711d.a(str);
        if (str != null) {
            this.f5711d.b("api");
        }
        this.f5714h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.f5711d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z2) {
        j().a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.InterfaceC0360ab
    public final Za a() {
        return this.f5713g;
    }
}
