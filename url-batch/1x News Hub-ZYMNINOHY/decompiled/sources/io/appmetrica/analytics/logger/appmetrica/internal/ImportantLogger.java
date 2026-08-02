package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseImportantLogger;

/* loaded from: classes.dex */
public final class ImportantLogger extends BaseImportantLogger {
    public static final ImportantLogger INSTANCE = new ImportantLogger();

    private ImportantLogger() {
        super("AppMetrica");
    }
}
