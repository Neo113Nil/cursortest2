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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723oc extends Q2 implements Pa {

    /* renamed from: s, reason: collision with root package name */
    public static final Long f8000s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final Gn f8001p;

    /* renamed from: q, reason: collision with root package name */
    public final C1006zc f8002q;

    /* renamed from: r, reason: collision with root package name */
    public final C0749pc f8003r;

    public C0723oc(C1006zc c1006zc) {
        super(c1006zc.b(), c1006zc.i(), c1006zc.h(), c1006zc.d(), c1006zc.f(), c1006zc.j(), c1006zc.g(), c1006zc.c(), c1006zc.a(), c1006zc.e());
        this.f8001p = new Gn(new C0518ge("Referral url"));
        this.f8002q = c1006zc;
        this.f8003r = new C0749pc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0633l0 c0633l0) {
        if (c0633l0.f7748b) {
            clearAppEnvironment();
        }
        List<String> list = c0633l0.f7747a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f6484b.f6428b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f6485c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Id id = this.f8002q.f8675c;
            Context context = this.f6483a;
            id.f6154d = new F0(this.f6484b.f6428b.getApiKey(), id.f6151a.f6044a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, id.f6151a.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), id.f6151a.f6044a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f6484b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = id.f6152b;
                G0 g02 = id.f6153c;
                F0 f02 = id.f6154d;
                if (f02 == null) {
                    kotlin.jvm.internal.j.g("nativeCrashMetadata");
                    throw null;
                }
                g02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, G0.a(f02)));
            }
        }
        C0749pc c0749pc = this.f8003r;
        synchronized (c0749pc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0749pc.f8077a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0749pc.f8078b.a(c0749pc.f8077a);
                } else {
                    c0749pc.f8078b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(Activity activity) {
        if (this.f8002q.f8680i.a(activity, EnumC0736p.PAUSED)) {
            this.f6485c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0687n2 c0687n2 = this.f8002q.f8678g;
            synchronized (c0687n2) {
                for (C0661m2 c0661m2 : c0687n2.f7921a) {
                    if (!c0661m2.f7853d) {
                        c0661m2.f7853d = true;
                        c0661m2.f7851b.executeDelayed(c0661m2.f7854e, c0661m2.f7852c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c() {
        C0749pc c0749pc = this.f8003r;
        synchronized (c0749pc) {
            c0749pc.f8078b.a(c0749pc.f8077a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final List<String> f() {
        return this.f6484b.f6427a.b();
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final void k() {
        super.k();
        C0585j4.l().m().c();
    }

    public final void l() {
        Bi bi = this.f6489h;
        bi.f5826c.a(this.f6484b.f6427a);
        C0687n2 c0687n2 = this.f8002q.f8678g;
        C0697nc c0697nc = new C0697nc(this);
        long longValue = f8000s.longValue();
        synchronized (c0687n2) {
            c0687n2.a(c0697nc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c(String str) {
        this.f8001p.a(str);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String b3 = AbstractC0696nb.b(hashMap);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(b3, "", 8208, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(String str, boolean z) {
        this.f6485c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z));
        String b3 = AbstractC0696nb.b(hashMap);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(b3, "", 8208, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(EnumC0684n enumC0684n) {
        if (enumC0684n == EnumC0684n.f7912b) {
            this.f6485c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f6485c.warning("Could not enable activity auto tracking. " + enumC0684n.f7916a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Activity activity) {
        if (this.f8002q.f8680i.a(activity, EnumC0736p.RESUMED)) {
            this.f6485c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C0687n2 c0687n2 = this.f8002q.f8678g;
            synchronized (c0687n2) {
                for (C0661m2 c0661m2 : c0687n2.f7921a) {
                    if (c0661m2.f7853d) {
                        c0661m2.f7853d = false;
                        c0661m2.f7851b.remove(c0661m2.f7854e);
                        C0723oc c0723oc = c0661m2.f7850a.f7946a;
                        c0723oc.f6489h.f5826c.b(c0723oc.f6484b.f6427a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f6484b.f6428b.setManualLocation(location);
        this.f6485c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        this.f6484b.f6428b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z2) {
        this.f6485c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.f6484b.f6428b.setAdvIdentifiersTracking(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Io io2) {
        PublicLogger publicLogger = this.f6485c;
        synchronized (io2) {
            io2.f6182b = publicLogger;
        }
        Iterator it = io2.f6181a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f6181a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(AnrListener anrListener) {
        this.f8003r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(ExternalAttribution externalAttribution) {
        this.f6485c.info("External attribution received: %s", externalAttribution);
        Bi bi = this.f6489h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(bytes, "", 42, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Id id = this.f8002q.f8675c;
        String d3 = this.f6484b.d();
        F0 f02 = id.f6154d;
        if (f02 != null) {
            F0 f03 = new F0(f02.f5972a, f02.f5973b, f02.f5974c, f02.f5975d, f02.f5976e, d3);
            id.f6154d = f03;
            NativeCrashClientModule nativeCrashClientModule = id.f6152b;
            id.f6153c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(G0.a(f03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f6485c.info("Add auto collected data subscriber: %s", str);
        this.f6484b.f6428b.addAutoCollectedDataSubscriber(str);
    }
}
