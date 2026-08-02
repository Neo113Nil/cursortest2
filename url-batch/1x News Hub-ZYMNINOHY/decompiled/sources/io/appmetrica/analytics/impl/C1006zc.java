package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006zc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8673a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f8674b;

    /* renamed from: c, reason: collision with root package name */
    public final Id f8675c;

    /* renamed from: d, reason: collision with root package name */
    public final T9 f8676d;

    /* renamed from: e, reason: collision with root package name */
    public final I8 f8677e;
    public final Kh f;

    /* renamed from: g, reason: collision with root package name */
    public final C0687n2 f8678g;

    /* renamed from: h, reason: collision with root package name */
    public final C0975y6 f8679h;

    /* renamed from: i, reason: collision with root package name */
    public final C0762q f8680i;

    /* renamed from: j, reason: collision with root package name */
    public final Oe f8681j;

    /* renamed from: k, reason: collision with root package name */
    public final Tn f8682k;

    /* renamed from: l, reason: collision with root package name */
    public final Jg f8683l;

    /* renamed from: m, reason: collision with root package name */
    public final C6 f8684m;

    /* renamed from: n, reason: collision with root package name */
    public final C0427d0 f8685n;

    public C1006zc(Context context, Gf gf, Bi bi, Sl sl) {
        this.f8673a = context;
        this.f8674b = bi;
        this.f8675c = new Id(gf);
        T9 t9 = new T9(context);
        this.f8676d = t9;
        I8 i8 = new I8(new C0913vl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f8677e = i8;
        this.f = new Kh(gf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), i8);
        this.f8678g = new C0687n2();
        this.f8679h = C0585j4.l().n();
        this.f8680i = new C0762q();
        this.f8681j = new Oe(t9);
        this.f8682k = new Tn();
        this.f8683l = new Jg();
        this.f8684m = new C6();
        this.f8685n = new C0427d0();
    }

    public final C0427d0 a() {
        return this.f8685n;
    }

    public final Context b() {
        return this.f8673a;
    }

    public final C6 c() {
        return this.f8684m;
    }

    public final T9 d() {
        return this.f8676d;
    }

    public final Oe e() {
        return this.f8681j;
    }

    public final C0975y6 f() {
        return this.f8679h;
    }

    public final Jg g() {
        return this.f8683l;
    }

    public final Kh h() {
        return this.f;
    }

    public final Bi i() {
        return this.f8674b;
    }

    public final Tn j() {
        return this.f8682k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f.f6428b.applyFromConfig(appMetricaConfig);
        Kh kh = this.f;
        String str = appMetricaConfig.userProfileID;
        synchronized (kh) {
            kh.f = str;
        }
        Kh kh2 = this.f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        kh2.f6235d = new C1009zf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
