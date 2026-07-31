package io.opentelemetry.sdk.common;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class SystemClock implements Clock {
    private static final SystemClock INSTANCE = new SystemClock();

    private SystemClock() {
    }

    static Clock getInstance() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.sdk.common.Clock
    public long now() {
        return now(true);
    }

    @Override // io.opentelemetry.sdk.common.Clock
    public long now(boolean z) {
        if (z) {
            return TimeUnit.SECONDS.toNanos(java.time.Clock.systemUTC().instant().getEpochSecond()) + r5.getNano();
        }
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // io.opentelemetry.sdk.common.Clock
    public long nanoTime() {
        return System.nanoTime();
    }

    public String toString() {
        return "SystemClock{}";
    }
}
