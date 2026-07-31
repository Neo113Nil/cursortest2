package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Nc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38005a;

    /* renamed from: b, reason: collision with root package name */
    public final Ji f38006b;

    /* renamed from: c, reason: collision with root package name */
    public final Qd f38007c;

    /* renamed from: d, reason: collision with root package name */
    public final C2674ha f38008d;

    /* renamed from: e, reason: collision with root package name */
    public final W8 f38009e;

    /* renamed from: f, reason: collision with root package name */
    public final Sh f38010f;

    /* renamed from: g, reason: collision with root package name */
    public final C2743k2 f38011g;

    /* renamed from: h, reason: collision with root package name */
    public final M6 f38012h;

    /* renamed from: i, reason: collision with root package name */
    public final C2870p f38013i;

    /* renamed from: j, reason: collision with root package name */
    public final Xe f38014j;

    /* renamed from: k, reason: collision with root package name */
    public final On f38015k;

    /* renamed from: l, reason: collision with root package name */
    public final Rg f38016l;

    /* renamed from: m, reason: collision with root package name */
    public final Q6 f38017m;

    /* renamed from: n, reason: collision with root package name */
    public final C2504b0 f38018n;

    public Nc(Context context, Pf pf, Ji ji, Ol ol) {
        this.f38005a = context;
        this.f38006b = ji;
        this.f38007c = new Qd(pf);
        C2674ha c2674ha = new C2674ha(context);
        this.f38008d = c2674ha;
        W8 w8 = new W8(new C2943rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f38009e = w8;
        this.f38010f = new Sh(pf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), w8);
        this.f38011g = new C2743k2();
        this.f38012h = C3082x4.l().n();
        this.f38013i = new C2870p();
        this.f38014j = new Xe(c2674ha);
        this.f38015k = new On();
        this.f38016l = new Rg();
        this.f38017m = new Q6();
        this.f38018n = new C2504b0();
    }

    public final C2504b0 a() {
        return this.f38018n;
    }

    public final Context b() {
        return this.f38005a;
    }

    public final Q6 c() {
        return this.f38017m;
    }

    public final C2674ha d() {
        return this.f38008d;
    }

    public final Xe e() {
        return this.f38014j;
    }

    public final M6 f() {
        return this.f38012h;
    }

    public final Rg g() {
        return this.f38016l;
    }

    public final Sh h() {
        return this.f38010f;
    }

    public final Ji i() {
        return this.f38006b;
    }

    public final On j() {
        return this.f38015k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f38010f.f38818b.applyFromConfig(appMetricaConfig);
        Sh sh = this.f38010f;
        String str = appMetricaConfig.userProfileID;
        synchronized (sh) {
            sh.f38259f = str;
        }
        Sh sh2 = this.f38010f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        sh2.f38257d = new If(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
