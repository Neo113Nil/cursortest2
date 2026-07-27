package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022u5 {

    /* renamed from: a, reason: collision with root package name */
    public final PublicLogger f9338a;

    public C1022u5(String str) {
        this.f9338a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i2) {
        if (i2 < 100) {
            this.f9338a.warning(B0.o.g(i2, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i2 <= 10000) {
            return i2;
        }
        this.f9338a.warning(B0.o.g(i2, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
