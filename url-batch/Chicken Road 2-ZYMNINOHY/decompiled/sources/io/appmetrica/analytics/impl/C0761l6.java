package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761l6 implements Ua {

    /* renamed from: a, reason: collision with root package name */
    public final C0787m6 f12267a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f12268b;

    public C0761l6(C0787m6 c0787m6) {
        this.f12267a = c0787m6;
        this.f12268b = c0787m6.a();
        C0501b4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        C1058wi c1058wi = this.f12267a.f12326a;
        C1031vh a3 = c1058wi.a(qn, this.f12268b);
        Fh fh = a3.f12897e;
        Pl pl = c1058wi.f12948e;
        if (pl != null) {
            fh.f10356b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        c1058wi.f12946c.b(a3);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + qn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Fh fh = this.f12268b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (fh) {
                    D8 d8 = fh.f10281c;
                    d8.f10191b.b(d8.f10190a, key, value);
                }
            }
        }
    }
}
