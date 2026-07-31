package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0308ki implements Ta {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1345a;
    public final Cf b;
    public final C0633xi c;
    public final Handler d;
    public final Pl e;
    public final C0527tc f;
    public final LinkedHashMap g;
    public final Fn h;
    public final List i;
    public C0251ic j;
    public C0347m6 k;

    public C0308ki(Context context, Cf cf, C0633xi c0633xi, Handler handler, Pl pl) {
        this.f1345a = context;
        this.b = cf;
        this.c = c0633xi;
        this.d = handler;
        this.e = pl;
        this.f = new C0527tc(context, cf, c0633xi, pl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new Fn(new C0359mi(linkedHashMap));
        this.i = CollectionsKt.listOf((Object[]) new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    public final Ta a() {
        return this;
    }

    public final C0308ki b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0251ic b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0316l0 c0316l0) {
        C0251ic c0251ic;
        c0251ic = this.j;
        if (c0251ic != null) {
            C0527tc c0527tc = this.f;
            c0527tc.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c0527tc.f.b.applyFromAnonymousConfig(appMetricaConfig);
        } else {
            this.h.a(appMetricaConfig.apiKey);
            C0527tc c0527tc2 = this.f;
            c0527tc2.getClass();
            publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
            c0527tc2.f.b.applyFromAnonymousConfig(appMetricaConfig);
            c0251ic = new C0251ic(this.f);
            c0251ic.i = new C0427pb(this.d, c0251ic);
            Pl pl = this.e;
            Gh gh = c0251ic.b;
            if (pl != null) {
                gh.b.setUuid(pl.g());
            } else {
                gh.getClass();
            }
            c0251ic.a(appMetricaConfig, c0316l0);
            c0251ic.k();
            this.c.f.c = new C0282ji(c0251ic);
            this.g.put(appMetricaConfig.apiKey, c0251ic);
            this.j = c0251ic;
        }
        return c0251ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0251ic a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0316l0 c0316l0) {
        C0251ic c0251ic;
        c0251ic = this.j;
        if (c0251ic != null) {
            this.f.a(appMetricaConfig, publicLogger);
            c0251ic.a(appMetricaConfig, c0316l0);
            C0088c4.l().getClass();
            this.g.put(appMetricaConfig.apiKey, c0251ic);
        } else {
            this.h.a(appMetricaConfig.apiKey);
            this.f.a(appMetricaConfig, publicLogger);
            c0251ic = new C0251ic(this.f);
            c0251ic.i = new C0427pb(this.d, c0251ic);
            Pl pl = this.e;
            Gh gh = c0251ic.b;
            if (pl != null) {
                gh.b.setUuid(pl.g());
            } else {
                gh.getClass();
            }
            c0251ic.a(appMetricaConfig, c0316l0);
            c0251ic.k();
            this.c.f.c = new C0282ji(c0251ic);
            this.g.put(appMetricaConfig.apiKey, c0251ic);
            C0088c4.l().getClass();
            this.j = c0251ic;
        }
        return c0251ic;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Sa b(ReporterConfig reporterConfig) {
        Sa sa;
        Sa sa2 = (Sa) this.g.get(reporterConfig.apiKey);
        sa = sa2;
        if (sa2 == null) {
            if (!this.i.contains(reporterConfig.apiKey)) {
                this.e.i();
            }
            Context context = this.f1345a;
            C0677zc c0677zc = new C0677zc(context, this.b, reporterConfig, this.c, new N9(context));
            c0677zc.i = new C0427pb(this.d, c0677zc);
            Pl pl = this.e;
            Gh gh = c0677zc.b;
            if (pl != null) {
                gh.b.setUuid(pl.g());
            } else {
                gh.getClass();
            }
            c0677zc.k();
            this.g.put(reporterConfig.apiKey, c0677zc);
            sa = c0677zc;
        }
        return sa;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void a(ReporterConfig reporterConfig) {
        if (this.g.containsKey(reporterConfig.apiKey)) {
            LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
        } else {
            b(reporterConfig);
            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Va a(AppMetricaConfig appMetricaConfig) {
        C0347m6 c0347m6;
        c0347m6 = this.k;
        if (c0347m6 != null) {
            c0347m6.a(appMetricaConfig);
        } else {
            C0347m6 c0347m62 = new C0347m6(new C0372n6(this.b, this.f.e, this.c, appMetricaConfig));
            this.k = c0347m62;
            c0347m6 = c0347m62;
        }
        return c0347m6;
    }
}
