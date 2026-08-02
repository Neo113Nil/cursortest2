package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104yc extends I2 {
    public C1104yc(Context context, Bf bf, ReporterConfig reporterConfig, C1058wi c1058wi, M9 m9) {
        this(context, c1058wi, new Fh(bf, new CounterConfiguration(reporterConfig), new D8(new C0931rl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), m9, C0501b4.l().n(), new Rn(), new Eg(), new C1020v6(), new C0549d0(), new Je(m9));
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[ManualReporter]";
    }

    public C1104yc(Context context, C1058wi c1058wi, Fh fh, M9 m9, C0916r6 c0916r6, Rn rn, Eg eg, C1020v6 c1020v6, C0549d0 c0549d0, Je je) {
        super(context, c1058wi, fh, m9, c0916r6, rn, eg, c1020v6, c0549d0, je);
        C0501b4.l().getClass();
    }
}
