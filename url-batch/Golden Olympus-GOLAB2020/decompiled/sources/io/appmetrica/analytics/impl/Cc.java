package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Cc extends V2 implements InterfaceC2569db {

    /* renamed from: s, reason: collision with root package name */
    public static final Long f37289s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final Bn f37290p;

    /* renamed from: q, reason: collision with root package name */
    public final Nc f37291q;

    /* renamed from: r, reason: collision with root package name */
    public final Dc f37292r;

    public Cc(Nc nc) {
        super(nc.b(), nc.i(), nc.h(), nc.d(), nc.f(), nc.j(), nc.g(), nc.c(), nc.a(), nc.e());
        this.f37290p = new Bn(new C2859oe("Referral url"));
        this.f37291q = nc;
        this.f37292r = new Dc(this);
        l();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull String str, boolean z4) {
        this.f38393c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z4));
        String b4 = Bb.b(hashMap);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(b4, "", 8208, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void b(@NonNull String str) {
        this.f37290p.a(str);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String b4 = Bb.b(hashMap);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(b4, "", 8208, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void c() {
        Dc dc = this.f37292r;
        synchronized (dc) {
            dc.f37359b.a(dc.f37358a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final List<String> f() {
        return this.f38392b.f38817a.b();
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final void k() {
        super.k();
        C3082x4.l().m().c();
    }

    public final void l() {
        Ji ji = this.f38398h;
        ji.f37841c.a(this.f38392b.f38817a);
        C2743k2 c2743k2 = this.f37291q.f38011g;
        Bc bc = new Bc(this);
        long longValue = f37289s.longValue();
        synchronized (c2743k2) {
            c2743k2.a(bc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull EnumC2792m enumC2792m) {
        if (enumC2792m == EnumC2792m.f39416b) {
            this.f38393c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f38393c.warning("Could not enable activity auto tracking. " + enumC2792m.f39420a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void b(Activity activity) {
        if (this.f37291q.f38013i.a(activity, EnumC2844o.PAUSED)) {
            this.f38393c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C2743k2 c2743k2 = this.f37291q.f38011g;
            synchronized (c2743k2) {
                for (C2717j2 c2717j2 : c2743k2.f39327a) {
                    if (!c2717j2.f39254d) {
                        c2717j2.f39254d = true;
                        c2717j2.f39252b.executeDelayed(c2717j2.f39255e, c2717j2.f39253c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(Activity activity) {
        if (this.f37291q.f38013i.a(activity, EnumC2844o.RESUMED)) {
            this.f38393c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C2743k2 c2743k2 = this.f37291q.f38011g;
            synchronized (c2743k2) {
                for (C2717j2 c2717j2 : c2743k2.f39327a) {
                    if (c2717j2.f39254d) {
                        c2717j2.f39254d = false;
                        c2717j2.f39252b.remove(c2717j2.f39255e);
                        Cc cc = c2717j2.f39251a.f37234a;
                        cc.f38398h.f37841c.b(cc.f38392b.f38817a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void b(boolean z4) {
        this.f38393c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z4));
        this.f38392b.f38818b.setAdvIdentifiersTracking(z4);
    }

    public final void a(AppMetricaConfig appMetricaConfig, boolean z4) {
        if (z4) {
            clearAppEnvironment();
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f38393c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Qd qd = this.f37291q.f38007c;
            Context context = this.f38391a;
            qd.f38166d = new C0(this.f38392b.f38818b.getApiKey(), qd.f38163a.f38132a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, qd.f38163a.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), qd.f38163a.f38132a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f38392b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            C0 c02 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = qd.f38164b;
                D0 d02 = qd.f38165c;
                C0 c03 = qd.f38166d;
                if (c03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nativeCrashMetadata");
                } else {
                    c02 = c03;
                }
                d02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, D0.a(c02)));
            }
        }
        Dc dc = this.f37292r;
        synchronized (dc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                dc.f37358a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    dc.f37359b.a(dc.f37358a);
                } else {
                    dc.f37359b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(Location location) {
        this.f38392b.f38818b.setManualLocation(location);
        this.f38393c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(boolean z4) {
        this.f38392b.f38818b.setLocationTracking(z4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull Do r6) {
        PublicLogger publicLogger = this.f38393c;
        synchronized (r6) {
            r6.f37390b = publicLogger;
        }
        ArrayList arrayList = r6.f37389a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Consumer) obj).consume(publicLogger);
        }
        r6.f37389a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull AnrListener anrListener) {
        this.f37292r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f38393c.info("External attribution received: %s", externalAttribution);
        Ji ji = this.f38398h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(bytes, "", 42, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.V2, io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(String str, String str2) {
        super.a(str, str2);
        Qd qd = this.f37291q.f38007c;
        String d4 = this.f38392b.d();
        C0 c02 = qd.f38166d;
        if (c02 != null) {
            C0 c03 = new C0(c02.f37266a, c02.f37267b, c02.f37268c, c02.f37269d, c02.f37270e, d4);
            qd.f38166d = c03;
            NativeCrashClientModule nativeCrashClientModule = qd.f38164b;
            qd.f38165c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(D0.a(c03));
        }
    }
}
