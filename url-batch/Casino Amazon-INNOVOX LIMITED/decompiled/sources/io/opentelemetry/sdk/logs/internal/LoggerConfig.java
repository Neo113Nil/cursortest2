package io.opentelemetry.sdk.logs.internal;

import io.opentelemetry.sdk.internal.ScopeConfigurator;
import io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder;

/* loaded from: classes3.dex */
public abstract class LoggerConfig {
    private static final LoggerConfig DEFAULT_CONFIG = new AutoValue_LoggerConfig(true);
    private static final LoggerConfig DISABLED_CONFIG = new AutoValue_LoggerConfig(false);

    public abstract boolean isEnabled();

    public static LoggerConfig disabled() {
        return DISABLED_CONFIG;
    }

    public static LoggerConfig enabled() {
        return DEFAULT_CONFIG;
    }

    public static LoggerConfig defaultConfig() {
        return DEFAULT_CONFIG;
    }

    public static ScopeConfiguratorBuilder<LoggerConfig> configuratorBuilder() {
        return ScopeConfigurator.builder();
    }

    LoggerConfig() {
    }
}
