package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948sc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12731a;

    /* renamed from: b, reason: collision with root package name */
    public final C1058wi f12732b;

    /* renamed from: c, reason: collision with root package name */
    public final Bd f12733c;

    /* renamed from: d, reason: collision with root package name */
    public final M9 f12734d;

    /* renamed from: e, reason: collision with root package name */
    public final D8 f12735e;

    /* renamed from: f, reason: collision with root package name */
    public final Fh f12736f;

    /* renamed from: g, reason: collision with root package name */
    public final C0576e2 f12737g;

    /* renamed from: h, reason: collision with root package name */
    public final C0916r6 f12738h;

    /* renamed from: i, reason: collision with root package name */
    public final C0884q f12739i;

    /* renamed from: j, reason: collision with root package name */
    public final Je f12740j;

    /* renamed from: k, reason: collision with root package name */
    public final Rn f12741k;

    /* renamed from: l, reason: collision with root package name */
    public final Eg f12742l;

    /* renamed from: m, reason: collision with root package name */
    public final C1020v6 f12743m;
    public final C0549d0 n;

    public C0948sc(Context context, Bf bf, C1058wi c1058wi, Ol ol) {
        this.f12731a = context;
        this.f12732b = c1058wi;
        this.f12733c = new Bd(bf);
        M9 m9 = new M9(context);
        this.f12734d = m9;
        D8 d8 = new D8(new C0931rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f12735e = d8;
        this.f12736f = new Fh(bf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), d8);
        this.f12737g = new C0576e2();
        this.f12738h = C0501b4.l().n();
        this.f12739i = new C0884q();
        this.f12740j = new Je(m9);
        this.f12741k = new Rn();
        this.f12742l = new Eg();
        this.f12743m = new C1020v6();
        this.n = new C0549d0();
    }

    public final C0549d0 a() {
        return this.n;
    }

    public final Context b() {
        return this.f12731a;
    }

    public final C1020v6 c() {
        return this.f12743m;
    }

    public final M9 d() {
        return this.f12734d;
    }

    public final Je e() {
        return this.f12740j;
    }

    public final C0916r6 f() {
        return this.f12738h;
    }

    public final Eg g() {
        return this.f12742l;
    }

    public final Fh h() {
        return this.f12736f;
    }

    public final C1058wi i() {
        return this.f12732b;
    }

    public final Rn j() {
        return this.f12741k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f12736f.f10356b.applyFromConfig(appMetricaConfig);
        Fh fh = this.f12736f;
        String str = appMetricaConfig.userProfileID;
        synchronized (fh) {
            fh.f10284f = str;
        }
        Fh fh2 = this.f12736f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        fh2.f10282d = new C1003uf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
