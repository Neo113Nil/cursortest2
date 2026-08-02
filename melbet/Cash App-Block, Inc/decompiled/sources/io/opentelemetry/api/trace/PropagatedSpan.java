package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.AutoValue_ImmutableSpanContext;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* loaded from: classes9.dex */
public final class PropagatedSpan implements Span {
    public static final PropagatedSpan INVALID = new PropagatedSpan(AutoValue_ImmutableSpanContext.INVALID);
    public final SpanContext spanContext;

    public PropagatedSpan(SpanContext spanContext) {
        this.spanContext = spanContext;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void end() {
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void end(long j) {
    }

    @Override // io.opentelemetry.api.trace.Span
    public final SpanContext getSpanContext() {
        return this.spanContext;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span setAttribute(InternalAttributeKeyImpl internalAttributeKeyImpl, String str) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void setAttribute(String str, String str2) {
    }

    public final String toString() {
        return "PropagatedSpan{" + this.spanContext + '}';
    }
}
