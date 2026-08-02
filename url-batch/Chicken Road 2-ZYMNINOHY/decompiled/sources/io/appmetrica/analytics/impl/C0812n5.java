package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812n5 {

    /* renamed from: a, reason: collision with root package name */
    public final PublicLogger f12391a;

    public C0812n5(String str) {
        this.f12391a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i4) {
        if (i4 < 100) {
            this.f12391a.warning(AbstractC0005f.k(i4, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i4 <= 10000) {
            return i4;
        }
        this.f12391a.warning(AbstractC0005f.k(i4, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
