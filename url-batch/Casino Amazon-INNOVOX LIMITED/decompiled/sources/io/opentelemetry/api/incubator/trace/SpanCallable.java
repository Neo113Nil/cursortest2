package io.opentelemetry.api.incubator.trace;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface SpanCallable<T, E extends Throwable> {
    T callInSpan() throws Throwable;
}
