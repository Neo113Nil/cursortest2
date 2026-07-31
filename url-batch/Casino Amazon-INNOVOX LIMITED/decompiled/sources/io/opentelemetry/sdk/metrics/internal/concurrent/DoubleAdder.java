package io.opentelemetry.sdk.metrics.internal.concurrent;

/* loaded from: classes3.dex */
public interface DoubleAdder {
    void add(double d);

    void reset();

    double sum();

    double sumThenReset();

    default long longValue() {
        return (long) sum();
    }

    default int intValue() {
        return (int) sum();
    }

    default float floatValue() {
        return (float) sum();
    }

    default double doubleValue() {
        return sum();
    }
}
