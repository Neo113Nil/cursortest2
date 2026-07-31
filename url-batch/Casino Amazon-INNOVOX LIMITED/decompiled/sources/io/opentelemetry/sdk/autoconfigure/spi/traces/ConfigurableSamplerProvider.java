package io.opentelemetry.sdk.autoconfigure.spi.traces;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.trace.samplers.Sampler;

/* loaded from: classes3.dex */
public interface ConfigurableSamplerProvider {
    Sampler createSampler(ConfigProperties configProperties);

    String getName();
}
