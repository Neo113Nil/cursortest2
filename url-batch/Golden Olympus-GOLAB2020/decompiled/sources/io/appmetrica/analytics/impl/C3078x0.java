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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3078x0 implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40101a;

    /* renamed from: b, reason: collision with root package name */
    public final Wa f40102b;

    /* renamed from: c, reason: collision with root package name */
    public final C2730jf f40103c;

    /* renamed from: d, reason: collision with root package name */
    public final Ol f40104d;

    /* renamed from: e, reason: collision with root package name */
    public final C3068wg f40105e;

    /* renamed from: f, reason: collision with root package name */
    public final Pf f40106f;

    /* renamed from: g, reason: collision with root package name */
    public final C3070wi f40107g;

    /* renamed from: h, reason: collision with root package name */
    public final Ji f40108h;

    /* renamed from: i, reason: collision with root package name */
    public final Z7 f40109i;

    /* renamed from: j, reason: collision with root package name */
    public final Xk f40110j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Ec f40111k;

    /* renamed from: l, reason: collision with root package name */
    public final C2715j0 f40112l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40113m;

    public C3078x0(@NotNull Context context, @NotNull Wa wa) {
        this.f40101a = context;
        this.f40102b = wa;
        C2730jf b4 = C3082x4.l().b(context);
        this.f40103c = b4;
        Id.a();
        C3082x4 l4 = C3082x4.l();
        l4.m().a(new C2642g4(context));
        Pf a4 = AbstractC3104y0.a(context, AbstractC3104y0.a(wa.b(), this));
        this.f40106f = a4;
        Z7 j4 = l4.j();
        this.f40109i = j4;
        Ji a5 = AbstractC3104y0.a(a4, context, wa.getDefaultExecutor());
        this.f40108h = a5;
        j4.a(a5);
        Ol a6 = AbstractC3104y0.a(context, a5, b4, wa.b());
        this.f40104d = a6;
        a5.a(a6);
        this.f40105e = AbstractC3104y0.a(a5, b4, wa.b());
        this.f40107g = AbstractC3104y0.a(context, a4, a5, wa.b(), a6);
        this.f40110j = l4.o();
        this.f40112l = new C2715j0(b4);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @NotNull
    public final InterfaceC2804mb c(@NotNull ReporterConfig reporterConfig) {
        return this.f40107g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @NotNull
    public final C2958sa d() {
        return this.f40104d.e();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @Nullable
    public final String e() {
        return this.f40104d.d();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @Nullable
    public final Map<String, String> g() {
        return this.f40104d.b();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.f40104d.a();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    @Nullable
    public final Ec i() {
        return this.f40111k;
    }

    public final InterfaceC2569db j() {
        Ec ec = this.f40111k;
        Intrinsics.checkNotNull(ec);
        return ec.f37439a;
    }

    @NotNull
    public final C3070wi k() {
        return this.f40107g;
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void setDataSendingEnabled(boolean z4) {
        j().setDataSendingEnabled(z4);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        C2715j0 c2715j0 = this.f40112l;
        AppMetricaConfig f4 = c2715j0.f39247a.f();
        if (f4 == null) {
            C2922r0 c2922r0 = c2715j0.f39248b;
            c2922r0.getClass();
            AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c2922r0.f39693a.c() && Intrinsics.areEqual(c2922r0.f39694b.f40162a, Boolean.TRUE)) {
                newConfigBuilder.handleFirstActivationAsUpdate(true);
            }
            Boolean bool = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            newConfigBuilder.withAdvIdentifiersTracking(bool.booleanValue());
            f4 = newConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, f4, new C3052w0(this, f4, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z4;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a4 = a(orCreateMainPublicLogger, appMetricaConfig, new C3026v0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (a4 || this.f40113m) {
            z4 = false;
        } else {
            a(appMetricaConfig, orCreateMainPublicLogger);
            z4 = true;
        }
        if (a4 || z4) {
            this.f40103c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a4) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z4) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f40113m = true;
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void b(boolean z4) {
        j().b(z4);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.V6
    public final void a(int i4, @NotNull Bundle bundle) {
        this.f40104d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f40105e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f40105e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.f40107g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f40104d.a(startupParamsCallback, list, Bb.c(this.f40106f.f38132a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Rc rc) {
        int i4 = 0;
        if (this.f40111k == null) {
            a(appMetricaConfig, publicLogger);
            this.f40105e.a();
            Cc a4 = rc.a();
            U7 u7 = new U7(a4);
            Ec ec = new Ec(a4, u7);
            this.f40102b.c().a(u7);
            this.f40111k = ec;
            H5 h5 = this.f40110j.f38533b;
            synchronized (h5) {
                try {
                    h5.f37604a = a4;
                    ArrayList arrayList = h5.f37605b;
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC2885pe) obj).consume(a4);
                    }
                    h5.f37605b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        rc.a();
        return false;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
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
            this.f40102b.d().a(this.f40101a, appMetricaConfig, this);
            this.f40102b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f40102b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f40110j.a();
        } else {
            Xk xk = this.f40110j;
            synchronized (xk) {
                if (xk.f38538g) {
                    xk.f38532a.unregisterListener(xk.f38534c, ActivityEvent.RESUMED);
                    xk.f38532a.unregisterListener(xk.f38535d, ActivityEvent.PAUSED);
                    xk.f38538g = false;
                }
            }
        }
        this.f40106f.d(appMetricaConfig);
        Ol ol = this.f40104d;
        ol.f38097e = publicLogger;
        ol.b(appMetricaConfig.customHosts);
        Ol ol2 = this.f40104d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f40104d.a(str);
        if (str != null) {
            this.f40104d.b("api");
        }
        this.f40108h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking);
        this.f40104d.i();
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(boolean z4) {
        j().a(z4);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC2856ob
    public final InterfaceC2830nb a() {
        return this.f40107g;
    }
}
