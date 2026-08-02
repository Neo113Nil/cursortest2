package io.opentelemetry.api.trace;

import io.opentelemetry.context.Context;

/* loaded from: classes7.dex */
public interface SpanBuilder {
    SpanBuilder setAttribute(String str, String str2);

    SpanBuilder setNoParent();

    SpanBuilder setParent(Context context);

    SpanBuilder setStartTimestamp(long j);

    Span startSpan();
}
