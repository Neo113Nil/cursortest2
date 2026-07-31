package io.opentelemetry.sdk.common;

/* loaded from: classes3.dex */
public interface Clock {
    long nanoTime();

    long now();

    static Clock getDefault() {
        return SystemClock.getInstance();
    }

    default long now(boolean z) {
        return now();
    }
}
