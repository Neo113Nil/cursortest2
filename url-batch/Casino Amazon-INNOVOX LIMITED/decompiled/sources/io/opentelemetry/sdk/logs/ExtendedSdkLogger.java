package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.incubator.logs.ExtendedLogRecordBuilder;
import io.opentelemetry.api.incubator.logs.ExtendedLogger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.internal.LoggerConfig;

/* loaded from: classes3.dex */
final class ExtendedSdkLogger extends SdkLogger implements ExtendedLogger {
    ExtendedSdkLogger(LoggerSharedState loggerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, LoggerConfig loggerConfig) {
        super(loggerSharedState, instrumentationScopeInfo, loggerConfig);
    }

    @Override // io.opentelemetry.sdk.logs.SdkLogger, io.opentelemetry.api.incubator.logs.ExtendedLogger
    public boolean isEnabled(Severity severity, Context context) {
        return super.isEnabled(severity, context);
    }

    @Override // io.opentelemetry.sdk.logs.SdkLogger, io.opentelemetry.api.logs.Logger
    public ExtendedLogRecordBuilder logRecordBuilder() {
        return (ExtendedLogRecordBuilder) super.logRecordBuilder();
    }
}
