package io.opentelemetry.sdk.autoconfigure.spi;

import io.opentelemetry.sdk.resources.Resource;

/* loaded from: classes3.dex */
public interface ResourceProvider extends Ordered {
    Resource createResource(ConfigProperties configProperties);
}
