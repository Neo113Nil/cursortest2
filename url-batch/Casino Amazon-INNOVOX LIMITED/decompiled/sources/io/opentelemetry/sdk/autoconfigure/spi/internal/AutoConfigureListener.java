package io.opentelemetry.sdk.autoconfigure.spi.internal;

import io.opentelemetry.sdk.OpenTelemetrySdk;

/* loaded from: classes3.dex */
public interface AutoConfigureListener {
    void afterAutoConfigure(OpenTelemetrySdk openTelemetrySdk);
}
