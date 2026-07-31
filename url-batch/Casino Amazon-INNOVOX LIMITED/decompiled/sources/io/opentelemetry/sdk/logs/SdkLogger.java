package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.LoggerProvider;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.internal.LoggerConfig;

/* loaded from: classes3.dex */
class SdkLogger implements Logger {
    private static final boolean INCUBATOR_AVAILABLE;
    private static final Logger NOOP_LOGGER = LoggerProvider.noop().get("noop");
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    protected boolean loggerEnabled;
    private final LoggerSharedState loggerSharedState;

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        INCUBATOR_AVAILABLE = z;
    }

    SdkLogger(LoggerSharedState loggerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, LoggerConfig loggerConfig) {
        this.loggerSharedState = loggerSharedState;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.loggerEnabled = loggerConfig.isEnabled();
    }

    static SdkLogger create(LoggerSharedState loggerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, LoggerConfig loggerConfig) {
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedLogger(loggerSharedState, instrumentationScopeInfo, loggerConfig);
        }
        return new SdkLogger(loggerSharedState, instrumentationScopeInfo, loggerConfig);
    }

    @Override // io.opentelemetry.api.logs.Logger
    public LogRecordBuilder logRecordBuilder() {
        if (this.loggerEnabled) {
            if (INCUBATOR_AVAILABLE) {
                return IncubatingUtil.createExtendedLogRecordBuilder(this.loggerSharedState, this.instrumentationScopeInfo);
            }
            return new SdkLogRecordBuilder(this.loggerSharedState, this.instrumentationScopeInfo);
        }
        return NOOP_LOGGER.logRecordBuilder();
    }

    InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    public boolean isEnabled(Severity severity, Context context) {
        return this.loggerEnabled;
    }

    void updateLoggerConfig(LoggerConfig loggerConfig) {
        this.loggerEnabled = loggerConfig.isEnabled();
    }
}
