package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class H6 implements InterfaceC2882pb {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f37606a;

    /* renamed from: b, reason: collision with root package name */
    public final Sh f37607b;

    public H6(@NotNull I6 i6) {
        this.f37606a = i6;
        this.f37607b = i6.a();
        C3082x4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2882pb
    public final void a(@NotNull Nn nn) {
        Ji ji = this.f37606a.f37705a;
        Ih a4 = ji.a(nn, this.f37607b);
        Sh sh = a4.f37767e;
        Pl pl = ji.f37843e;
        if (pl != null) {
            sh.f38818b.setUuid(((Ol) pl).g());
        } else {
            sh.getClass();
        }
        ji.f37841c.b(a4);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + nn, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Sh sh = this.f37607b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (sh) {
                    W8 w8 = sh.f38256c;
                    w8.f38460b.b(w8.f38459a, key, value);
                }
            }
        }
    }
}
