package io.opentelemetry.api.logs;

import io.opentelemetry.api.internal.IncubatingUtil;

/* loaded from: classes3.dex */
public interface LoggerProvider {
    LoggerBuilder loggerBuilder(String str);

    default Logger get(String str) {
        return loggerBuilder(str).build();
    }

    static LoggerProvider noop() {
        return (LoggerProvider) IncubatingUtil.incubatingApiIfAvailable(DefaultLoggerProvider.getInstance(), "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider");
    }
}
