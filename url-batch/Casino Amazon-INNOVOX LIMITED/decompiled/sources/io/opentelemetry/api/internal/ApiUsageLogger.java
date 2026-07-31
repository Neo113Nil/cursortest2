package io.opentelemetry.api.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ApiUsageLogger {
    private static final Logger API_USAGE_LOGGER = Logger.getLogger(ApiUsageLogger.class.getName());

    public static void log(String str) {
        log(str, Level.FINEST);
    }

    public static void log(String str, Level level) {
        Logger logger = API_USAGE_LOGGER;
        if (logger.isLoggable(level)) {
            logger.log(level, str, (Throwable) new AssertionError());
        }
    }

    private ApiUsageLogger() {
    }
}
