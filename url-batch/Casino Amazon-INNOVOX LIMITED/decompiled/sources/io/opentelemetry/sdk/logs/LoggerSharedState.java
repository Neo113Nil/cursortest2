package io.opentelemetry.sdk.logs;

import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.internal.ExceptionAttributeResolver;
import io.opentelemetry.sdk.resources.Resource;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class LoggerSharedState {
    private final Clock clock;
    private final ExceptionAttributeResolver exceptionAttributeResolver;
    private final Supplier<LogLimits> logLimitsSupplier;
    private final LogRecordProcessor logRecordProcessor;
    private final Resource resource;
    private final Object lock = new Object();

    @Nullable
    private volatile CompletableResultCode shutdownResult = null;

    LoggerSharedState(Resource resource, Supplier<LogLimits> supplier, LogRecordProcessor logRecordProcessor, Clock clock, ExceptionAttributeResolver exceptionAttributeResolver) {
        this.resource = resource;
        this.logLimitsSupplier = supplier;
        this.logRecordProcessor = logRecordProcessor;
        this.clock = clock;
        this.exceptionAttributeResolver = exceptionAttributeResolver;
    }

    Resource getResource() {
        return this.resource;
    }

    LogLimits getLogLimits() {
        return this.logLimitsSupplier.get();
    }

    LogRecordProcessor getLogRecordProcessor() {
        return this.logRecordProcessor;
    }

    Clock getClock() {
        return this.clock;
    }

    ExceptionAttributeResolver getExceptionAttributeResolver() {
        return this.exceptionAttributeResolver;
    }

    boolean hasBeenShutdown() {
        return this.shutdownResult != null;
    }

    CompletableResultCode shutdown() {
        synchronized (this.lock) {
            if (this.shutdownResult != null) {
                return this.shutdownResult;
            }
            this.shutdownResult = this.logRecordProcessor.shutdown();
            return this.shutdownResult;
        }
    }
}
