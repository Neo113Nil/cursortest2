package com.mopub.common.logging;

import android.util.Log;
import com.mopub.common.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class MoPubLog {
    private static final String LOGTAG = "MoPub";
    public static final String LOGGER_NAMESPACE = "com.mopub";
    private static final Logger LOGGER = Logger.getLogger(LOGGER_NAMESPACE);
    private static final MoPubLogHandler LOG_HANDLER = new MoPubLogHandler();

    static {
        LOGGER.setUseParentHandlers(false);
        LOGGER.setLevel(Level.ALL);
        LOG_HANDLER.setLevel(Level.FINE);
        LogManager.getLogManager().addLogger(LOGGER);
        addHandler(LOGGER, LOG_HANDLER);
    }

    private MoPubLog() {
    }

    public static void c(String str) {
        c(str, null);
    }

    public static void v(String str) {
        v(str, null);
    }

    public static void d(String str) {
        d(str, null);
    }

    public static void i(String str) {
        i(str, null);
    }

    public static void w(String str) {
        w(str, null);
    }

    public static void e(String str) {
        e(str, null);
    }

    public static void c(String str, Throwable th) {
        LOGGER.log(Level.FINEST, str, th);
    }

    public static void v(String str, Throwable th) {
        LOGGER.log(Level.FINE, str, th);
    }

    public static void d(String str, Throwable th) {
        LOGGER.log(Level.CONFIG, str, th);
    }

    public static void i(String str, Throwable th) {
        LOGGER.log(Level.INFO, str, th);
    }

    public static void w(String str, Throwable th) {
        LOGGER.log(Level.WARNING, str, th);
    }

    public static void e(String str, Throwable th) {
        LOGGER.log(Level.SEVERE, str, th);
    }

    @VisibleForTesting
    public static void setSdkHandlerLevel(Level level) {
        LOG_HANDLER.setLevel(level);
    }

    private static void addHandler(Logger logger, Handler handler) {
        for (Handler handler2 : logger.getHandlers()) {
            if (handler2.equals(handler)) {
                return;
            }
        }
        logger.addHandler(handler);
    }

    private static final class MoPubLogHandler extends Handler {
        private static final Map<Level, Integer> LEVEL_TO_LOG = new HashMap(7);

        @Override // java.util.logging.Handler
        public void close() {
        }

        @Override // java.util.logging.Handler
        public void flush() {
        }

        private MoPubLogHandler() {
        }

        static {
            LEVEL_TO_LOG.put(Level.FINEST, 2);
            LEVEL_TO_LOG.put(Level.FINER, 2);
            LEVEL_TO_LOG.put(Level.FINE, 2);
            LEVEL_TO_LOG.put(Level.CONFIG, 3);
            LEVEL_TO_LOG.put(Level.INFO, 4);
            LEVEL_TO_LOG.put(Level.WARNING, 5);
            LEVEL_TO_LOG.put(Level.SEVERE, 6);
        }

        @Override // java.util.logging.Handler
        public void publish(LogRecord logRecord) {
            if (isLoggable(logRecord)) {
                int intValue = LEVEL_TO_LOG.containsKey(logRecord.getLevel()) ? LEVEL_TO_LOG.get(logRecord.getLevel()).intValue() : 2;
                String str = logRecord.getMessage() + "\n";
                Throwable thrown = logRecord.getThrown();
                if (thrown != null) {
                    str = str + Log.getStackTraceString(thrown);
                }
                Log.println(intValue, MoPubLog.LOGTAG, str);
            }
        }
    }
}
