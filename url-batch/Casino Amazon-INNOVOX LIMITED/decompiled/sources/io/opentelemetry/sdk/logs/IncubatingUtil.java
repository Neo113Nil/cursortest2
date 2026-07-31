package io.opentelemetry.sdk.logs;

import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.internal.LoggerConfig;

/* loaded from: classes3.dex */
final class IncubatingUtil {
    private IncubatingUtil() {
    }

    static SdkLogger createExtendedLogger(LoggerSharedState loggerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, LoggerConfig loggerConfig) {
        return new ExtendedSdkLogger(loggerSharedState, instrumentationScopeInfo, loggerConfig);
    }

    static SdkLogRecordBuilder createExtendedLogRecordBuilder(LoggerSharedState loggerSharedState, InstrumentationScopeInfo instrumentationScopeInfo) {
        return new ExtendedSdkLogRecordBuilder(loggerSharedState, instrumentationScopeInfo);
    }
}
