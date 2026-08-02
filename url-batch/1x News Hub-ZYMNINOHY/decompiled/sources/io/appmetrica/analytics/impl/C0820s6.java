package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820s6 implements InterfaceC0386bb {

    /* renamed from: a, reason: collision with root package name */
    public final C0846t6 f8296a;

    /* renamed from: b, reason: collision with root package name */
    public final Kh f8297b;

    public C0820s6(C0846t6 c0846t6) {
        this.f8296a = c0846t6;
        this.f8297b = c0846t6.a();
        C0585j4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0386bb
    public final void a(Sn sn) {
        Bi bi = this.f8296a.f8338a;
        Ah a3 = bi.a(sn, this.f8297b);
        Kh kh = a3.f5757e;
        Tl tl = bi.f5828e;
        if (tl != null) {
            kh.f6428b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f5826c.b(a3);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + sn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Kh kh = this.f8297b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (kh) {
                    I8 i8 = kh.f6234c;
                    i8.f6141b.b(i8.f6140a, key, value);
                }
            }
        }
    }
}
