package io.opentelemetry.api.incubator;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.incubator.config.ConfigProvider;

/* loaded from: classes3.dex */
public interface ExtendedOpenTelemetry extends OpenTelemetry {
    default ConfigProvider getConfigProvider() {
        return ConfigProvider.noop();
    }
}
