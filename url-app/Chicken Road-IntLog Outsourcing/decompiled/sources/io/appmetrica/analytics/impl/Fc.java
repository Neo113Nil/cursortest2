package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes.dex */
public final class Fc extends Q2 {
    public Fc(Context context, Gf gf, ReporterConfig reporterConfig, Bi bi, T9 t9) {
        this(context, bi, new Kh(gf, new CounterConfiguration(reporterConfig), new I8(new C1064vl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), t9, C0736j4.l().n(), new Tn(), new Jg(), new C6(), new C0578d0(), new Oe(t9));
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[ManualReporter]";
    }

    public Fc(Context context, Bi bi, Kh kh, T9 t9, C1126y6 c1126y6, Tn tn, Jg jg, C6 c6, C0578d0 c0578d0, Oe oe) {
        super(context, bi, kh, t9, c1126y6, tn, jg, c6, c0578d0, oe);
        C0736j4.l().getClass();
    }
}
