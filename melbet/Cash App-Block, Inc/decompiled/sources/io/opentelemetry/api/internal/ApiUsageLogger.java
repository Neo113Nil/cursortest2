package io.opentelemetry.api.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class ApiUsageLogger {
    public static final Logger API_USAGE_LOGGER = Logger.getLogger(ApiUsageLogger.class.getName());

    public static void log() {
        Level level = Level.FINEST;
        Logger logger = API_USAGE_LOGGER;
        if (logger.isLoggable(level)) {
            logger.log(level, "context is null", (Throwable) new AssertionError());
        }
    }
}
