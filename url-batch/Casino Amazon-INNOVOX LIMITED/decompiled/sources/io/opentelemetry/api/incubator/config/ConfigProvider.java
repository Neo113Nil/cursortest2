package io.opentelemetry.api.incubator.config;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ConfigProvider {
    static /* synthetic */ DeclarativeConfigProperties lambda$noop$0() {
        return null;
    }

    @Nullable
    DeclarativeConfigProperties getInstrumentationConfig();

    static ConfigProvider noop() {
        return new ConfigProvider() { // from class: io.opentelemetry.api.incubator.config.ConfigProvider$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.api.incubator.config.ConfigProvider
            public final DeclarativeConfigProperties getInstrumentationConfig() {
                return ConfigProvider.lambda$noop$0();
            }
        };
    }
}
