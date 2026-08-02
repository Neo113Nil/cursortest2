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

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721ji implements Sa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12142a;

    /* renamed from: b, reason: collision with root package name */
    public final Bf f12143b;

    /* renamed from: c, reason: collision with root package name */
    public final C1058wi f12144c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f12145d;

    /* renamed from: e, reason: collision with root package name */
    public final Ol f12146e;

    /* renamed from: f, reason: collision with root package name */
    public final C0948sc f12147f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f12148g;

    /* renamed from: h, reason: collision with root package name */
    public final En f12149h;

    /* renamed from: i, reason: collision with root package name */
    public final List f12150i;

    /* renamed from: j, reason: collision with root package name */
    public C0664hc f12151j;

    /* renamed from: k, reason: collision with root package name */
    public C0761l6 f12152k;

    public C0721ji(Context context, Bf bf, C1058wi c1058wi, Handler handler, Ol ol) {
        this.f12142a = context;
        this.f12143b = bf;
        this.f12144c = c1058wi;
        this.f12145d = handler;
        this.f12146e = ol;
        this.f12147f = new C0948sc(context, bf, c1058wi, ol);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12148g = linkedHashMap;
        this.f12149h = new En(new C0773li(linkedHashMap));
        this.f12150i = d3.j.W("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this;
    }

    public final C0721ji b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0664hc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0755l0 c0755l0) {
        C0664hc c0664hc;
        try {
            c0664hc = this.f12151j;
            if (c0664hc != null) {
                C0948sc c0948sc = this.f12147f;
                c0948sc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0948sc.f12736f.f10356b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f12149h.a(appMetricaConfig.apiKey);
                C0948sc c0948sc2 = this.f12147f;
                c0948sc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0948sc2.f12736f.f10356b.applyFromAnonymousConfig(appMetricaConfig);
                c0664hc = new C0664hc(this.f12147f);
                c0664hc.f10397i = new C0844ob(this.f12145d, c0664hc);
                Ol ol = this.f12146e;
                Fh fh = c0664hc.f10390b;
                if (ol != null) {
                    fh.f10356b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0664hc.a(appMetricaConfig, c0755l0);
                c0664hc.k();
                this.f12144c.f12949f.f11316c = new C0695ii(c0664hc);
                this.f12148g.put(appMetricaConfig.apiKey, c0664hc);
                this.f12151j = c0664hc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0664hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0664hc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0755l0 c0755l0) {
        C0664hc c0664hc;
        try {
            c0664hc = this.f12151j;
            if (c0664hc != null) {
                this.f12147f.a(appMetricaConfig, publicLogger);
                c0664hc.a(appMetricaConfig, c0755l0);
                C0501b4.l().getClass();
                this.f12148g.put(appMetricaConfig.apiKey, c0664hc);
            } else {
                this.f12149h.a(appMetricaConfig.apiKey);
                this.f12147f.a(appMetricaConfig, publicLogger);
                c0664hc = new C0664hc(this.f12147f);
                c0664hc.f10397i = new C0844ob(this.f12145d, c0664hc);
                Ol ol = this.f12146e;
                Fh fh = c0664hc.f10390b;
                if (ol != null) {
                    fh.f10356b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0664hc.a(appMetricaConfig, c0755l0);
                c0664hc.k();
                this.f12144c.f12949f.f11316c = new C0695ii(c0664hc);
                this.f12148g.put(appMetricaConfig.apiKey, c0664hc);
                C0501b4.l().getClass();
                this.f12151j = c0664hc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0664hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f12148g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized Ra b(ReporterConfig reporterConfig) {
        Ra ra;
        try {
            Ra ra2 = (Ra) this.f12148g.get(reporterConfig.apiKey);
            ra = ra2;
            if (ra2 == null) {
                if (!this.f12150i.contains(reporterConfig.apiKey)) {
                    this.f12146e.i();
                }
                Context context = this.f12142a;
                C1104yc c1104yc = new C1104yc(context, this.f12143b, reporterConfig, this.f12144c, new M9(context));
                c1104yc.f10397i = new C0844ob(this.f12145d, c1104yc);
                Ol ol = this.f12146e;
                Fh fh = c1104yc.f10390b;
                if (ol != null) {
                    fh.f10356b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c1104yc.k();
                this.f12148g.put(reporterConfig.apiKey, c1104yc);
                ra = c1104yc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ra;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized Ua a(AppMetricaConfig appMetricaConfig) {
        C0761l6 c0761l6;
        try {
            c0761l6 = this.f12152k;
            if (c0761l6 != null) {
                c0761l6.a(appMetricaConfig);
            } else {
                C0761l6 c0761l62 = new C0761l6(new C0787m6(this.f12143b, this.f12147f.f12735e, this.f12144c, appMetricaConfig));
                this.f12152k = c0761l62;
                c0761l6 = c0761l62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0761l6;
    }
}
