package io.opentelemetry.sdk.trace.internal;

import io.opentelemetry.sdk.internal.ScopeConfigurator;
import io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder;

/* loaded from: classes3.dex */
public abstract class TracerConfig {
    private static final TracerConfig DEFAULT_CONFIG = new AutoValue_TracerConfig(true);
    private static final TracerConfig DISABLED_CONFIG = new AutoValue_TracerConfig(false);

    public abstract boolean isEnabled();

    public static TracerConfig disabled() {
        return DISABLED_CONFIG;
    }

    public static TracerConfig enabled() {
        return DEFAULT_CONFIG;
    }

    public static TracerConfig defaultConfig() {
        return DEFAULT_CONFIG;
    }

    public static ScopeConfiguratorBuilder<TracerConfig> configuratorBuilder() {
        return ScopeConfigurator.builder();
    }

    TracerConfig() {
    }
}
