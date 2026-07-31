package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0677zc extends J2 {
    public C0677zc(Context context, Cf cf, ReporterConfig reporterConfig, C0633xi c0633xi, N9 n9) {
        this(context, c0633xi, new Gh(cf, new CounterConfiguration(reporterConfig), new E8(new C0511sl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), n9, C0088c4.l().n(), new Sn(), new Fg(), new C0596w6(), new C0110d0(), new Ke(n9));
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[ManualReporter]";
    }

    public C0677zc(Context context, C0633xi c0633xi, Gh gh, N9 n9, C0496s6 c0496s6, Sn sn, Fg fg, C0596w6 c0596w6, C0110d0 c0110d0, Ke ke) {
        super(context, c0633xi, gh, n9, c0496s6, sn, fg, c0596w6, c0110d0, ke);
        C0088c4.l().getClass();
    }
}
