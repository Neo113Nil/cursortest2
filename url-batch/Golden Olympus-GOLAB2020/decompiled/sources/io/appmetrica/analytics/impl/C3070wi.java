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
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3070wi implements InterfaceC2830nb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40086a;

    /* renamed from: b, reason: collision with root package name */
    public final Pf f40087b;

    /* renamed from: c, reason: collision with root package name */
    public final Ji f40088c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f40089d;

    /* renamed from: e, reason: collision with root package name */
    public final Ol f40090e;

    /* renamed from: f, reason: collision with root package name */
    public final Nc f40091f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f40092g;

    /* renamed from: h, reason: collision with root package name */
    public final Bn f40093h;

    /* renamed from: i, reason: collision with root package name */
    public final List f40094i;

    /* renamed from: j, reason: collision with root package name */
    public Cc f40095j;

    /* renamed from: k, reason: collision with root package name */
    public H6 f40096k;

    public C3070wi(@NotNull Context context, @NotNull Pf pf, @NotNull Ji ji, @NotNull Handler handler, @NotNull Ol ol) {
        this.f40086a = context;
        this.f40087b = pf;
        this.f40088c = ji;
        this.f40089d = handler;
        this.f40090e = ol;
        this.f40091f = new Nc(context, pf, ji, ol);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f40092g = linkedHashMap;
        this.f40093h = new Bn(new C3122yi(linkedHashMap));
        this.f40094i = CollectionsKt.listOf((Object[]) new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb, io.appmetrica.analytics.impl.InterfaceC2856ob
    public final InterfaceC2830nb a() {
        return this;
    }

    @NotNull
    public final C3070wi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Cc a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, boolean z4) {
        Cc cc;
        try {
            cc = this.f40095j;
            if (cc == null) {
                this.f40093h.a(appMetricaConfig.apiKey);
                this.f40091f.a(appMetricaConfig, publicLogger);
                cc = new Cc(this.f40091f);
                cc.f38399i = new Jb(this.f40089d, cc);
                Ol ol = this.f40090e;
                Sh sh = cc.f38392b;
                if (ol != null) {
                    sh.f38818b.setUuid(ol.g());
                } else {
                    sh.getClass();
                }
                cc.a(appMetricaConfig, z4);
                cc.k();
                this.f40088c.f37844f.f39210c = new C3044vi(cc);
                this.f40092g.put(appMetricaConfig.apiKey, cc);
                this.f40095j = cc;
            }
        } finally {
        }
        return cc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Cc b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, boolean z4) {
        Cc cc;
        try {
            cc = this.f40095j;
            if (cc != null) {
                this.f40091f.a(appMetricaConfig, publicLogger);
                cc.a(appMetricaConfig, z4);
                C3082x4.l().getClass();
                this.f40092g.put(appMetricaConfig.apiKey, cc);
            } else {
                this.f40093h.a(appMetricaConfig.apiKey);
                this.f40091f.a(appMetricaConfig, publicLogger);
                cc = new Cc(this.f40091f);
                cc.f38399i = new Jb(this.f40089d, cc);
                Ol ol = this.f40090e;
                Sh sh = cc.f38392b;
                if (ol != null) {
                    sh.f38818b.setUuid(ol.g());
                } else {
                    sh.getClass();
                }
                cc.a(appMetricaConfig, z4);
                cc.k();
                this.f40088c.f37844f.f39210c = new C3044vi(cc);
                this.f40092g.put(appMetricaConfig.apiKey, cc);
                C3082x4.l().getClass();
                this.f40095j = cc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return cc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.f40092g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NotNull
    public final synchronized InterfaceC2804mb b(@NotNull ReporterConfig reporterConfig) {
        InterfaceC2804mb interfaceC2804mb;
        try {
            InterfaceC2804mb interfaceC2804mb2 = (InterfaceC2804mb) this.f40092g.get(reporterConfig.apiKey);
            interfaceC2804mb = interfaceC2804mb2;
            if (interfaceC2804mb2 == null) {
                if (!this.f40094i.contains(reporterConfig.apiKey)) {
                    this.f40090e.i();
                }
                Context context = this.f40086a;
                Tc tc = new Tc(context, this.f40087b, reporterConfig, this.f40088c, new C2674ha(context));
                tc.f38399i = new Jb(this.f40089d, tc);
                Ol ol = this.f40090e;
                Sh sh = tc.f38392b;
                if (ol != null) {
                    sh.f38818b.setUuid(ol.g());
                } else {
                    sh.getClass();
                }
                tc.k();
                this.f40092g.put(reporterConfig.apiKey, tc);
                interfaceC2804mb = tc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC2804mb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NotNull
    public final synchronized InterfaceC2882pb a(@NotNull AppMetricaConfig appMetricaConfig) {
        H6 h6;
        try {
            h6 = this.f40096k;
            if (h6 != null) {
                h6.a(appMetricaConfig);
            } else {
                H6 h62 = new H6(new I6(this.f40087b, this.f40091f.f38009e, this.f40088c, appMetricaConfig));
                this.f40096k = h62;
                h6 = h62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return h6;
    }
}
