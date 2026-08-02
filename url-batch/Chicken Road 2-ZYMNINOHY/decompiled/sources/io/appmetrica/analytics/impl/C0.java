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
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C0 implements Ca {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10137a;

    /* renamed from: b, reason: collision with root package name */
    public final Ba f10138b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f10139c;

    /* renamed from: d, reason: collision with root package name */
    public final Ol f10140d;

    /* renamed from: e, reason: collision with root package name */
    public final C0719jg f10141e;

    /* renamed from: f, reason: collision with root package name */
    public final Bf f10142f;

    /* renamed from: g, reason: collision with root package name */
    public final C0721ji f10143g;

    /* renamed from: h, reason: collision with root package name */
    public final C1058wi f10144h;

    /* renamed from: i, reason: collision with root package name */
    public final D7 f10145i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f10146j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0715jc f10147k;

    /* renamed from: l, reason: collision with root package name */
    public final C0781m0 f10148l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10149m;

    public C0(Context context, Ba ba) {
        this.f10137a = context;
        this.f10138b = ba;
        Ve b4 = C0501b4.l().b(context);
        this.f10139c = b4;
        ArrayList a3 = C0949sd.a();
        C0501b4 l4 = C0501b4.l();
        l4.m().a(new K3(context));
        D0.a(context).a(a3);
        Bf a4 = D0.a(context, D0.a(ba.b(), this));
        this.f10142f = a4;
        D7 j4 = l4.j();
        this.f10145i = j4;
        C1058wi a5 = D0.a(a4, context, ba.getDefaultExecutor());
        this.f10144h = a5;
        j4.a(a5);
        Ol a6 = D0.a(context, a5, b4, ba.b());
        this.f10140d = a6;
        a5.a(a6);
        this.f10141e = D0.a(a5, b4, ba.b());
        this.f10143g = D0.a(context, a4, a5, ba.b(), a6);
        this.f10146j = l4.o();
        this.f10148l = new C0781m0(b4);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Ra c(ReporterConfig reporterConfig) {
        return this.f10143g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final X9 d() {
        return this.f10140d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final String e() {
        return this.f10140d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Map<String, String> g() {
        return this.f10140d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final AdvIdentifiersResult h() {
        return this.f10140d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final C0715jc i() {
        return this.f10147k;
    }

    public final Ia j() {
        C0715jc c0715jc = this.f10147k;
        kotlin.jvm.internal.i.b(c0715jc);
        return c0715jc.f12127a;
    }

    public final C0721ji k() {
        return this.f10143g;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0781m0 c0781m0 = this.f10148l;
        C1040w0 c1040w0 = c0781m0.f12315b;
        c1040w0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c1040w0.f12906a.b() && kotlin.jvm.internal.i.a(c1040w0.f12907b.f11599a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f4 = c0781m0.f12314a.f();
        if (f4 != null) {
            if (f4.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f4.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f4.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new B0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a3 = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a3 || this.f10149m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a3 || z) {
            this.f10139c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a3) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f10149m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.A6
    public final void a(int i4, Bundle bundle) {
        this.f10140d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f10141e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f10141e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(ReporterConfig reporterConfig) {
        this.f10143g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f10140d.a(startupParamsCallback, list, AbstractC0637gb.c(this.f10142f.f10112a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC1052wc interfaceC1052wc, boolean z) {
        int i4 = 0;
        if (this.f10147k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.f10141e.a();
            C0664hc a3 = interfaceC1052wc.a();
            C1099y7 c1099y7 = new C1099y7(a3);
            C0715jc c0715jc = new C0715jc(a3, c1099y7);
            this.f10138b.c().a(c1099y7);
            this.f10147k = c0715jc;
            C0786m5 c0786m5 = this.f10146j.f11195b;
            synchronized (c0786m5) {
                try {
                    c0786m5.f12324a = a3;
                    ArrayList arrayList = c0786m5.f12325b;
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC0485ae) obj).consume(a3);
                    }
                    c0786m5.f12325b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC1052wc.a();
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
            this.f10138b.d().a(this.f10137a, appMetricaConfig, this);
            this.f10138b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f10138b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f10146j.a();
        } else {
            Wk wk = this.f10146j;
            synchronized (wk) {
                if (wk.f11200g) {
                    wk.f11194a.unregisterListener(wk.f11196c, ActivityEvent.RESUMED);
                    wk.f11194a.unregisterListener(wk.f11197d, ActivityEvent.PAUSED);
                    wk.f11200g = false;
                }
            }
        }
        this.f10142f.d(appMetricaConfig);
        Ol ol = this.f10140d;
        ol.f10772e = publicLogger;
        ol.b(appMetricaConfig.customHosts);
        Ol ol2 = this.f10140d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f10140d.a(str);
        if (str != null) {
            this.f10140d.b("api");
        }
        this.f10144h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.f10140d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z, boolean z4) {
        j().a(z, z4);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this.f10143g;
    }
}
