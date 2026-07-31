package io.opentelemetry.sdk.metrics.internal;

import io.opentelemetry.sdk.internal.ScopeConfigurator;
import io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder;

/* loaded from: classes3.dex */
public abstract class MeterConfig {
    private static final MeterConfig DEFAULT_CONFIG = new AutoValue_MeterConfig(true);
    private static final MeterConfig DISABLED_CONFIG = new AutoValue_MeterConfig(false);

    public abstract boolean isEnabled();

    public static MeterConfig disabled() {
        return DISABLED_CONFIG;
    }

    public static MeterConfig enabled() {
        return DEFAULT_CONFIG;
    }

    public static MeterConfig defaultConfig() {
        return DEFAULT_CONFIG;
    }

    public static ScopeConfiguratorBuilder<MeterConfig> configuratorBuilder() {
        return ScopeConfigurator.builder();
    }

    MeterConfig() {
    }
}
