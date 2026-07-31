package io.opentelemetry.api.incubator.trace;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface SpanRunnable<E extends Throwable> {
    void runInSpan() throws Throwable;
}
