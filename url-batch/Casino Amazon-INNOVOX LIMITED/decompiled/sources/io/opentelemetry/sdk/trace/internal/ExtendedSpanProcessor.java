package io.opentelemetry.sdk.trace.internal;

import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.SpanProcessor;

/* loaded from: classes3.dex */
public interface ExtendedSpanProcessor extends SpanProcessor {
    boolean isOnEndingRequired();

    void onEnding(ReadWriteSpan readWriteSpan);
}
