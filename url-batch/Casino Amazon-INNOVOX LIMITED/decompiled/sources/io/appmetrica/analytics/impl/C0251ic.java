package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0251ic extends J2 implements Ja {
    public static final Long s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));
    public final Fn p;
    public final C0527tc q;
    public final C0276jc r;

    public C0251ic(C0527tc c0527tc) {
        super(c0527tc.b(), c0527tc.i(), c0527tc.h(), c0527tc.d(), c0527tc.f(), c0527tc.j(), c0527tc.g(), c0527tc.c(), c0527tc.a(), c0527tc.e());
        this.p = new Fn(new C0046ae("Referral url"));
        this.q = c0527tc;
        this.r = new C0276jc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0316l0 c0316l0) {
        if (c0316l0.b) {
            clearAppEnvironment();
        }
        List<String> list = c0316l0.f1349a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.b.b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE)).booleanValue();
        this.c.info("native crash reporting enabled: %b", Boolean.valueOf(booleanValue));
        if (booleanValue) {
            Cd cd = this.q.c;
            Context context = this.f899a;
            cd.d = new H0(this.b.b.getApiKey(), cd.f796a.f798a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, cd.f796a.f798a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), cd.f796a.f798a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            H0 h0 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = cd.b;
                I0 i0 = cd.c;
                H0 h02 = cd.d;
                if (h02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nativeCrashMetadata");
                } else {
                    h0 = h02;
                }
                i0.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h0)));
            }
        }
        C0276jc c0276jc = this.r;
        synchronized (c0276jc) {
            Integer num = appMetricaConfig.anrMonitoringTimeout;
            c0276jc.f1321a = num != null ? num.intValue() : 5;
            Boolean bool = appMetricaConfig.anrMonitoring;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                c0276jc.b.a(c0276jc.f1321a);
            } else {
                c0276jc.b.b();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(Activity activity) {
        if (this.q.i.a(activity, EnumC0415p.PAUSED)) {
            this.c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0163f2 c0163f2 = this.q.g;
            synchronized (c0163f2) {
                c0163f2.getClass();
                for (C0137e2 c0137e2 : c0163f2.f1247a) {
                    if (!c0137e2.d) {
                        c0137e2.d = true;
                        c0137e2.b.executeDelayed(c0137e2.e, c0137e2.c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c() {
        C0276jc c0276jc = this.r;
        synchronized (c0276jc) {
            c0276jc.b.a(c0276jc.f1321a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final List<String> f() {
        return this.b.f884a.b();
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final void k() {
        super.k();
        C0088c4.l().m().c();
    }

    public final void l() {
        C0633xi c0633xi = this.h;
        c0633xi.c.a(this.b.f884a);
        C0163f2 c0163f2 = this.q.g;
        C0225hc c0225hc = new C0225hc(this);
        long longValue = s.longValue();
        synchronized (c0163f2) {
            c0163f2.a(c0225hc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c(String str) {
        this.p.a(str);
        C0633xi c0633xi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC0624x9.f1563a;
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String b = AbstractC0224hb.b(hashMap);
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        N3 n3 = new N3(b, "", 8208, 0, publicLogger);
        Gh gh = this.b;
        c0633xi.getClass();
        c0633xi.a(C0633xi.a(n3, gh), gh, 1, (Map) null);
        this.c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(String str, boolean z) {
        this.c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0633xi c0633xi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = AbstractC0624x9.f1563a;
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z));
        String b = AbstractC0224hb.b(hashMap);
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        N3 n3 = new N3(b, "", 8208, 0, publicLogger);
        Gh gh = this.b;
        c0633xi.getClass();
        c0633xi.a(C0633xi.a(n3, gh), gh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(EnumC0365n enumC0365n) {
        if (enumC0365n == EnumC0365n.b) {
            this.c.info("Enable activity auto tracking", new Object[0]);
        } else {
            this.c.warning("Could not enable activity auto tracking. " + enumC0365n.f1383a, new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(Activity activity) {
        if (this.q.i.a(activity, EnumC0415p.RESUMED)) {
            this.c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C0163f2 c0163f2 = this.q.g;
            synchronized (c0163f2) {
                c0163f2.getClass();
                for (C0137e2 c0137e2 : c0163f2.f1247a) {
                    if (c0137e2.d) {
                        c0137e2.d = false;
                        c0137e2.b.remove(c0137e2.e);
                        C0251ic c0251ic = c0137e2.f1228a.f1288a;
                        c0251ic.h.c.b(c0251ic.b.f884a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(Location location) {
        this.b.b.setManualLocation(location);
        this.c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z) {
        this.b.b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z, boolean z2) {
        this.c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.b.b.setAdvIdentifiersTracking(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(Io io2) {
        PublicLogger publicLogger = this.c;
        synchronized (io2) {
            io2.b = publicLogger;
        }
        Iterator it = io2.f896a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f896a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(AnrListener anrListener) {
        this.r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(ExternalAttribution externalAttribution) {
        this.c.info("External attribution received: %s", externalAttribution);
        C0633xi c0633xi = this.h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.c;
        Set set = AbstractC0624x9.f1563a;
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        N3 n3 = new N3(bytes, "", 42, publicLogger);
        Gh gh = this.b;
        c0633xi.getClass();
        c0633xi.a(C0633xi.a(n3, gh), gh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        super.a(str, str2);
        Cd cd = this.q.c;
        String d = this.b.d();
        H0 h0 = cd.d;
        if (h0 != null) {
            H0 h02 = new H0(h0.f865a, h0.b, h0.c, h0.d, h0.e, d);
            cd.d = h02;
            NativeCrashClientModule nativeCrashClientModule = cd.b;
            cd.c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h02));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str) {
        this.c.info("Add auto collected data subscriber: %s", str);
        this.b.b.addAutoCollectedDataSubscriber(str);
    }
}
