package io.opentelemetry.sdk.autoconfigure.spi;

/* loaded from: classes3.dex */
public interface AutoConfigurationCustomizerProvider extends Ordered {
    void customize(AutoConfigurationCustomizer autoConfigurationCustomizer);
}
