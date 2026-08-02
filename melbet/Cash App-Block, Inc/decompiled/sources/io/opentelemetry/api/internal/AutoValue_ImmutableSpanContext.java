package io.opentelemetry.api.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import io.opentelemetry.api.trace.ArrayBasedTraceStateBuilder;
import io.opentelemetry.api.trace.AutoValue_ArrayBasedTraceState;
import io.opentelemetry.api.trace.ImmutableTraceFlags;
import io.opentelemetry.api.trace.SpanContext;

/* loaded from: classes4.dex */
public final class AutoValue_ImmutableSpanContext implements SpanContext {
    public static final AutoValue_ImmutableSpanContext INVALID = new AutoValue_ImmutableSpanContext(ImmutableTraceFlags.DEFAULT, ArrayBasedTraceStateBuilder.EMPTY);
    public final ImmutableTraceFlags traceFlags;
    public final AutoValue_ArrayBasedTraceState traceState;

    public AutoValue_ImmutableSpanContext(ImmutableTraceFlags immutableTraceFlags, AutoValue_ArrayBasedTraceState autoValue_ArrayBasedTraceState) {
        if (immutableTraceFlags == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null traceFlags");
            throw null;
        }
        this.traceFlags = immutableTraceFlags;
        if (autoValue_ArrayBasedTraceState != null) {
            this.traceState = autoValue_ArrayBasedTraceState;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null traceState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_ImmutableSpanContext)) {
            return false;
        }
        AutoValue_ImmutableSpanContext autoValue_ImmutableSpanContext = (AutoValue_ImmutableSpanContext) obj;
        return this.traceFlags.equals(autoValue_ImmutableSpanContext.traceFlags) && this.traceState.equals(autoValue_ImmutableSpanContext.traceState);
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String getSpanId() {
        return "0000000000000000";
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final ImmutableTraceFlags getTraceFlags() {
        return this.traceFlags;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String getTraceId() {
        return "00000000000000000000000000000000";
    }

    public final int hashCode() {
        return ((((this.traceState.hashCode() ^ ((this.traceFlags.hashCode() ^ 741203163) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean isValid() {
        return false;
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=00000000000000000000000000000000, spanId=0000000000000000, traceFlags=" + this.traceFlags + ", traceState=" + this.traceState + ", remote=false, valid=false}";
    }
}
