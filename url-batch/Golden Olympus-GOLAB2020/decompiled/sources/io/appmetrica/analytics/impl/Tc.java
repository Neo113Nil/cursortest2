package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes3.dex */
public final class Tc extends V2 {
    public Tc(Context context, Pf pf, ReporterConfig reporterConfig, Ji ji, C2674ha c2674ha) {
        this(context, ji, new Sh(pf, new CounterConfiguration(reporterConfig), new W8(new C2943rl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), c2674ha, C3082x4.l().n(), new On(), new Rg(), new Q6(), new C2504b0(), new Xe(c2674ha));
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[ManualReporter]";
    }

    public Tc(Context context, Ji ji, Sh sh, C2674ha c2674ha, M6 m6, On on, Rg rg, Q6 q6, C2504b0 c2504b0, Xe xe) {
        super(context, ji, sh, c2674ha, m6, on, rg, q6, c2504b0, xe);
        C3082x4.l().getClass();
    }
}
