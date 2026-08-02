package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664hc extends I2 implements Ia {

    /* renamed from: r, reason: collision with root package name */
    public static final Long f11992r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final C0948sc f11993p;

    /* renamed from: q, reason: collision with root package name */
    public final C0690ic f11994q;

    public C0664hc(C0948sc c0948sc) {
        super(c0948sc.b(), c0948sc.i(), c0948sc.h(), c0948sc.d(), c0948sc.f(), c0948sc.j(), c0948sc.g(), c0948sc.c(), c0948sc.a(), c0948sc.e());
        this.f11993p = c0948sc;
        this.f11994q = new C0690ic(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0755l0 c0755l0) {
        if (c0755l0.f12254b) {
            clearAppEnvironment();
        }
        List<String> list = c0755l0.f12253a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f10390b.f10356b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f10391c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Bd bd = this.f11993p.f12733c;
            Context context = this.f10389a;
            bd.f10107d = new H0(this.f10390b.f10356b.getApiKey(), bd.f10104a.f10112a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, bd.f10104a.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), bd.f10104a.f10112a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f10390b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = bd.f10105b;
                I0 i02 = bd.f10106c;
                H0 h02 = bd.f10107d;
                if (h02 == null) {
                    kotlin.jvm.internal.i.i("nativeCrashMetadata");
                    throw null;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h02)));
            }
        }
        C0690ic c0690ic = this.f11994q;
        synchronized (c0690ic) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0690ic.f12038a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0690ic.f12039b.a(c0690ic.f12038a);
                } else {
                    c0690ic.f12039b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(Activity activity) {
        if (this.f11993p.f12739i.a(activity, EnumC0858p.PAUSED)) {
            this.f10391c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C0576e2 c0576e2 = this.f11993p.f12737g;
            synchronized (c0576e2) {
                for (C0551d2 c0551d2 : c0576e2.f11722a) {
                    if (!c0551d2.f11646d) {
                        c0551d2.f11646d = true;
                        c0551d2.f11644b.executeDelayed(c0551d2.f11647e, c0551d2.f11645c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
        C0690ic c0690ic = this.f11994q;
        synchronized (c0690ic) {
            c0690ic.f12039b.a(c0690ic.f12038a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final List<String> f() {
        return this.f10390b.f10355a.b();
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final void k() {
        super.k();
        C0501b4.l().m().c();
    }

    public final void l() {
        C1058wi c1058wi = this.f10396h;
        c1058wi.f12946c.a(this.f10390b.f10355a);
        C0576e2 c0576e2 = this.f11993p.f12737g;
        C0638gc c0638gc = new C0638gc(this);
        long longValue = f11992r.longValue();
        synchronized (c0576e2) {
            c0576e2.a(c0638gc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(String str, boolean z) {
        this.f10391c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z));
        String b4 = AbstractC0637gb.b(hashMap);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(b4, "", 8208, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(EnumC0806n enumC0806n) {
        if (enumC0806n == EnumC0806n.f12382b) {
            this.f10391c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f10391c.warning("Could not enable activity auto tracking. " + enumC0806n.f12386a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Activity activity) {
        if (this.f11993p.f12739i.a(activity, EnumC0858p.RESUMED)) {
            this.f10391c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0576e2 c0576e2 = this.f11993p.f12737g;
            synchronized (c0576e2) {
                for (C0551d2 c0551d2 : c0576e2.f11722a) {
                    if (c0551d2.f11646d) {
                        c0551d2.f11646d = false;
                        c0551d2.f11644b.remove(c0551d2.f11647e);
                        C0664hc c0664hc = c0551d2.f11643a.f11928a;
                        c0664hc.f10396h.f12946c.b(c0664hc.f10390b.f10355a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f10390b.f10356b.setManualLocation(location);
        this.f10391c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z) {
        this.f10390b.f10356b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z, boolean z4) {
        this.f10391c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.f10390b.f10356b.setAdvIdentifiersTracking(z, z4);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Ho ho) {
        PublicLogger publicLogger = this.f10391c;
        synchronized (ho) {
            ho.f10387b = publicLogger;
        }
        ArrayList arrayList = ho.f10386a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(publicLogger);
        }
        ho.f10386a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AnrListener anrListener) {
        this.f11994q.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(ExternalAttribution externalAttribution) {
        this.f10391c.info("External attribution received: %s", externalAttribution);
        C1058wi c1058wi = this.f10396h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(bytes, "", 42, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.I2, io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Bd bd = this.f11993p.f12733c;
        String d4 = this.f10390b.d();
        H0 h02 = bd.f10107d;
        if (h02 != null) {
            H0 h03 = new H0(h02.f10348a, h02.f10349b, h02.f10350c, h02.f10351d, h02.f10352e, d4);
            bd.f10107d = h03;
            NativeCrashClientModule nativeCrashClientModule = bd.f10105b;
            bd.f10106c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        this.f10391c.info("Add auto collected data subscriber: %s", str);
        this.f10390b.f10356b.addAutoCollectedDataSubscriber(str);
    }
}
