package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    public final PublicLogger f37704a;

    public I5(String str) {
        this.f37704a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i4) {
        if (i4 < 100) {
            this.f37704a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i4 + ". Default value (100) will be used", new Object[0]);
            return 100;
        }
        if (i4 <= 10000) {
            return i4;
        }
        this.f37704a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i4 + ". Default value (10000) will be used", new Object[0]);
        return 10000;
    }
}
