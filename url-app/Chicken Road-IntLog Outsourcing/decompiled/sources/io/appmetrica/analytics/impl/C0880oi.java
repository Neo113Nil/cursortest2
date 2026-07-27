package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import g4.AbstractC0466k;
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
public final class C0880oi implements Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8937a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f8938b;

    /* renamed from: c, reason: collision with root package name */
    public final Bi f8939c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8940d;

    /* renamed from: e, reason: collision with root package name */
    public final Sl f8941e;

    /* renamed from: f, reason: collision with root package name */
    public final C1157zc f8942f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f8943g;

    /* renamed from: h, reason: collision with root package name */
    public final Gn f8944h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8945i;

    /* renamed from: j, reason: collision with root package name */
    public C0874oc f8946j;

    /* renamed from: k, reason: collision with root package name */
    public C0971s6 f8947k;

    public C0880oi(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        this.f8937a = context;
        this.f8938b = gf;
        this.f8939c = bi;
        this.f8940d = handler;
        this.f8941e = sl;
        this.f8942f = new C1157zc(context, gf, bi, sl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8943g = linkedHashMap;
        this.f8944h = new Gn(new C0932qi(linkedHashMap));
        this.f8945i = AbstractC0466k.A0("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC0511ab
    public final Za a() {
        return this;
    }

    public final C0880oi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0874oc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0784l0 c0784l0) {
        C0874oc c0874oc;
        try {
            c0874oc = this.f8946j;
            if (c0874oc != null) {
                C1157zc c1157zc = this.f8942f;
                c1157zc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1157zc.f9636f.f7239b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f8944h.a(appMetricaConfig.apiKey);
                C1157zc c1157zc2 = this.f8942f;
                c1157zc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1157zc2.f9636f.f7239b.applyFromAnonymousConfig(appMetricaConfig);
                c0874oc = new C0874oc(this.f8942f);
                c0874oc.f7307i = new C1054vb(this.f8940d, c0874oc);
                Sl sl = this.f8941e;
                Kh kh = c0874oc.f7300b;
                if (sl != null) {
                    kh.f7239b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0874oc.a(appMetricaConfig, c0784l0);
                c0874oc.k();
                this.f8939c.f6610f.f8053c = new C0854ni(c0874oc);
                this.f8943g.put(appMetricaConfig.apiKey, c0874oc);
                this.f8946j = c0874oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0874oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0874oc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0784l0 c0784l0) {
        C0874oc c0874oc;
        try {
            c0874oc = this.f8946j;
            if (c0874oc != null) {
                this.f8942f.a(appMetricaConfig, publicLogger);
                c0874oc.a(appMetricaConfig, c0784l0);
                C0736j4.l().getClass();
                this.f8943g.put(appMetricaConfig.apiKey, c0874oc);
            } else {
                this.f8944h.a(appMetricaConfig.apiKey);
                this.f8942f.a(appMetricaConfig, publicLogger);
                c0874oc = new C0874oc(this.f8942f);
                c0874oc.f7307i = new C1054vb(this.f8940d, c0874oc);
                Sl sl = this.f8941e;
                Kh kh = c0874oc.f7300b;
                if (sl != null) {
                    kh.f7239b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0874oc.a(appMetricaConfig, c0784l0);
                c0874oc.k();
                this.f8939c.f6610f.f8053c = new C0854ni(c0874oc);
                this.f8943g.put(appMetricaConfig.apiKey, c0874oc);
                C0736j4.l().getClass();
                this.f8946j = c0874oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0874oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f8943g.containsKey(reporterConfig.apiKey)) {
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
            ya = (Ya) this.f8943g.get(reporterConfig.apiKey);
            if (ya == null) {
                if (!this.f8945i.contains(reporterConfig.apiKey)) {
                    this.f8941e.i();
                }
                Context context = this.f8937a;
                Fc fc = new Fc(context, this.f8938b, reporterConfig, this.f8939c, new T9(context));
                fc.f7307i = new C1054vb(this.f8940d, fc);
                Sl sl = this.f8941e;
                Kh kh = fc.f7300b;
                if (sl != null) {
                    kh.f7239b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                fc.k();
                this.f8943g.put(reporterConfig.apiKey, fc);
                ya = fc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ya;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized InterfaceC0537bb a(AppMetricaConfig appMetricaConfig) {
        C0971s6 c0971s6;
        try {
            c0971s6 = this.f8947k;
            if (c0971s6 != null) {
                c0971s6.a(appMetricaConfig);
            } else {
                C0971s6 c0971s62 = new C0971s6(new C0997t6(this.f8938b, this.f8942f.f9635e, this.f8939c, appMetricaConfig));
                this.f8947k = c0971s62;
                c0971s6 = c0971s62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0971s6;
    }
}
