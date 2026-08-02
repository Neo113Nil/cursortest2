package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729oi implements Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8016a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f8017b;

    /* renamed from: c, reason: collision with root package name */
    public final Bi f8018c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8019d;

    /* renamed from: e, reason: collision with root package name */
    public final Sl f8020e;
    public final C1006zc f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f8021g;

    /* renamed from: h, reason: collision with root package name */
    public final Gn f8022h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8023i;

    /* renamed from: j, reason: collision with root package name */
    public C0723oc f8024j;

    /* renamed from: k, reason: collision with root package name */
    public C0820s6 f8025k;

    public C0729oi(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        this.f8016a = context;
        this.f8017b = gf;
        this.f8018c = bi;
        this.f8019d = handler;
        this.f8020e = sl;
        this.f = new C1006zc(context, gf, bi, sl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8021g = linkedHashMap;
        this.f8022h = new Gn(new C0781qi(linkedHashMap));
        this.f8023i = c2.f.L("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC0360ab
    public final Za a() {
        return this;
    }

    public final C0729oi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0723oc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0) {
        C0723oc c0723oc;
        try {
            c0723oc = this.f8024j;
            if (c0723oc != null) {
                C1006zc c1006zc = this.f;
                c1006zc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1006zc.f.f6428b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f8022h.a(appMetricaConfig.apiKey);
                C1006zc c1006zc2 = this.f;
                c1006zc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1006zc2.f.f6428b.applyFromAnonymousConfig(appMetricaConfig);
                c0723oc = new C0723oc(this.f);
                c0723oc.f6490i = new C0903vb(this.f8019d, c0723oc);
                Sl sl = this.f8020e;
                Kh kh = c0723oc.f6484b;
                if (sl != null) {
                    kh.f6428b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0723oc.a(appMetricaConfig, c0633l0);
                c0723oc.k();
                this.f8018c.f.f7195c = new C0703ni(c0723oc);
                this.f8021g.put(appMetricaConfig.apiKey, c0723oc);
                this.f8024j = c0723oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0723oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0723oc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0) {
        C0723oc c0723oc;
        try {
            c0723oc = this.f8024j;
            if (c0723oc != null) {
                this.f.a(appMetricaConfig, publicLogger);
                c0723oc.a(appMetricaConfig, c0633l0);
                C0585j4.l().getClass();
                this.f8021g.put(appMetricaConfig.apiKey, c0723oc);
            } else {
                this.f8022h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                c0723oc = new C0723oc(this.f);
                c0723oc.f6490i = new C0903vb(this.f8019d, c0723oc);
                Sl sl = this.f8020e;
                Kh kh = c0723oc.f6484b;
                if (sl != null) {
                    kh.f6428b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0723oc.a(appMetricaConfig, c0633l0);
                c0723oc.k();
                this.f8018c.f.f7195c = new C0703ni(c0723oc);
                this.f8021g.put(appMetricaConfig.apiKey, c0723oc);
                C0585j4.l().getClass();
                this.f8024j = c0723oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0723oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f8021g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized Ya b(ReporterConfig reporterConfig) {
        Ya ya;
        try {
            Ya ya2 = (Ya) this.f8021g.get(reporterConfig.apiKey);
            ya = ya2;
            if (ya2 == null) {
                if (!this.f8023i.contains(reporterConfig.apiKey)) {
                    this.f8020e.i();
                }
                Context context = this.f8016a;
                Fc fc = new Fc(context, this.f8017b, reporterConfig, this.f8018c, new T9(context));
                fc.f6490i = new C0903vb(this.f8019d, fc);
                Sl sl = this.f8020e;
                Kh kh = fc.f6484b;
                if (sl != null) {
                    kh.f6428b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                fc.k();
                this.f8021g.put(reporterConfig.apiKey, fc);
                ya = fc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ya;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized InterfaceC0386bb a(AppMetricaConfig appMetricaConfig) {
        C0820s6 c0820s6;
        try {
            c0820s6 = this.f8025k;
            if (c0820s6 != null) {
                c0820s6.a(appMetricaConfig);
            } else {
                C0820s6 c0820s62 = new C0820s6(new C0846t6(this.f8017b, this.f.f8677e, this.f8018c, appMetricaConfig));
                this.f8025k = c0820s62;
                c0820s6 = c0820s62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0820s6;
    }
}
