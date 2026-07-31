package io.opentelemetry.sdk.autoconfigure.spi.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;

/* loaded from: classes3.dex */
public interface ComponentProvider<T> {
    T create(DeclarativeConfigProperties declarativeConfigProperties);

    String getName();

    Class<T> getType();
}
