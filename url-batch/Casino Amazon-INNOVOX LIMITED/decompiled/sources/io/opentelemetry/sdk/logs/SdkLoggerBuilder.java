package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.LoggerBuilder;
import io.opentelemetry.sdk.internal.ComponentRegistry;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class SdkLoggerBuilder implements LoggerBuilder {
    private final String instrumentationScopeName;

    @Nullable
    private String instrumentationScopeVersion;
    private final ComponentRegistry<SdkLogger> registry;

    @Nullable
    private String schemaUrl;

    SdkLoggerBuilder(ComponentRegistry<SdkLogger> componentRegistry, String str) {
        this.registry = componentRegistry;
        this.instrumentationScopeName = str;
    }

    @Override // io.opentelemetry.api.logs.LoggerBuilder
    public SdkLoggerBuilder setSchemaUrl(String str) {
        this.schemaUrl = str;
        return this;
    }

    @Override // io.opentelemetry.api.logs.LoggerBuilder
    public SdkLoggerBuilder setInstrumentationVersion(String str) {
        this.instrumentationScopeVersion = str;
        return this;
    }

    @Override // io.opentelemetry.api.logs.LoggerBuilder
    public SdkLogger build() {
        return this.registry.get(this.instrumentationScopeName, this.instrumentationScopeVersion, this.schemaUrl, Attributes.empty());
    }
}
