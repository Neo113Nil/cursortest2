package io.opentelemetry.sdk.autoconfigure.spi.traces;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.trace.SdkTracerProviderBuilder;

@Deprecated
/* loaded from: classes3.dex */
public interface SdkTracerProviderConfigurer {
    void configure(SdkTracerProviderBuilder sdkTracerProviderBuilder, ConfigProperties configProperties);
}
