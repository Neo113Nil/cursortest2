package io.opentelemetry.sdk.trace;

/* loaded from: classes3.dex */
public interface IdGenerator {
    String generateSpanId();

    String generateTraceId();

    static IdGenerator random() {
        return RandomIdGenerator.INSTANCE;
    }
}
