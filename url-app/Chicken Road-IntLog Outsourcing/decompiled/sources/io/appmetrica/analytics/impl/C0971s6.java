package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971s6 implements InterfaceC0537bb {

    /* renamed from: a, reason: collision with root package name */
    public final C0997t6 f9236a;

    /* renamed from: b, reason: collision with root package name */
    public final Kh f9237b;

    public C0971s6(C0997t6 c0997t6) {
        this.f9236a = c0997t6;
        this.f9237b = c0997t6.a();
        C0736j4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0537bb
    public final void a(Sn sn) {
        Bi bi = this.f9236a.f9279a;
        Ah a6 = bi.a(sn, this.f9237b);
        Kh kh = a6.f6534e;
        Tl tl = bi.f6609e;
        if (tl != null) {
            kh.f7239b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f6607c.b(a6);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + sn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Kh kh = this.f9237b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (kh) {
                    I8 i8 = kh.f7037c;
                    i8.f6940b.b(i8.f6939a, key, value);
                }
            }
        }
    }
}
