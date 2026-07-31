package io.opentelemetry.sdk.autoconfigure.spi;

/* loaded from: classes3.dex */
public interface Ordered {
    default int order() {
        return 0;
    }
}
