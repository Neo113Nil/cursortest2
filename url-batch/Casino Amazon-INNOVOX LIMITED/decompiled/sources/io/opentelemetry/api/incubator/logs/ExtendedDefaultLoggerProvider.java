package io.opentelemetry.api.incubator.logs;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.LoggerBuilder;
import io.opentelemetry.api.logs.LoggerProvider;

/* loaded from: classes3.dex */
public class ExtendedDefaultLoggerProvider implements LoggerProvider {
    private static final LoggerProvider INSTANCE = new ExtendedDefaultLoggerProvider();
    private static final LoggerBuilder NOOP_BUILDER = new NoopLoggerBuilder();

    private ExtendedDefaultLoggerProvider() {
    }

    public static LoggerProvider getNoop() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.api.logs.LoggerProvider
    public LoggerBuilder loggerBuilder(String str) {
        return NOOP_BUILDER;
    }

    private static class NoopLoggerBuilder implements LoggerBuilder {
        @Override // io.opentelemetry.api.logs.LoggerBuilder
        public LoggerBuilder setInstrumentationVersion(String str) {
            return this;
        }

        @Override // io.opentelemetry.api.logs.LoggerBuilder
        public LoggerBuilder setSchemaUrl(String str) {
            return this;
        }

        private NoopLoggerBuilder() {
        }

        @Override // io.opentelemetry.api.logs.LoggerBuilder
        public Logger build() {
            return ExtendedDefaultLogger.getNoop();
        }
    }
}
