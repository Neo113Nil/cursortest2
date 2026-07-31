package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.internal.ApiUsageLogger;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.ImplicitContextKeyed;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface Span extends ImplicitContextKeyed {
    Span addEvent(String str, Attributes attributes);

    Span addEvent(String str, Attributes attributes, long j, TimeUnit timeUnit);

    default Span addLink(SpanContext spanContext, Attributes attributes) {
        return this;
    }

    void end();

    void end(long j, TimeUnit timeUnit);

    SpanContext getSpanContext();

    boolean isRecording();

    Span recordException(Throwable th, Attributes attributes);

    <T> Span setAttribute(AttributeKey<T> attributeKey, @Nullable T t);

    Span setStatus(StatusCode statusCode, String str);

    Span updateName(String str);

    static Span current() {
        Span span = (Span) Context.current().get(SpanContextKey.KEY);
        return span == null ? getInvalid() : span;
    }

    static Span fromContext(Context context) {
        if (context == null) {
            ApiUsageLogger.log("context is null");
            return getInvalid();
        }
        Span span = (Span) context.get(SpanContextKey.KEY);
        return span == null ? getInvalid() : span;
    }

    @Nullable
    static Span fromContextOrNull(Context context) {
        if (context == null) {
            ApiUsageLogger.log("context is null");
            return null;
        }
        return (Span) context.get(SpanContextKey.KEY);
    }

    static Span getInvalid() {
        return PropagatedSpan.INVALID;
    }

    static Span wrap(SpanContext spanContext) {
        if (spanContext == null) {
            ApiUsageLogger.log("context is null");
            return getInvalid();
        }
        return PropagatedSpan.create(spanContext);
    }

    default Span setAttribute(String str, @Nullable String str2) {
        return setAttribute((AttributeKey<AttributeKey<String>>) AttributeKey.stringKey(str), (AttributeKey<String>) str2);
    }

    default Span setAttribute(String str, long j) {
        return setAttribute((AttributeKey<AttributeKey<Long>>) AttributeKey.longKey(str), (AttributeKey<Long>) Long.valueOf(j));
    }

    default Span setAttribute(String str, double d) {
        return setAttribute((AttributeKey<AttributeKey<Double>>) AttributeKey.doubleKey(str), (AttributeKey<Double>) Double.valueOf(d));
    }

    default Span setAttribute(String str, boolean z) {
        return setAttribute((AttributeKey<AttributeKey<Boolean>>) AttributeKey.booleanKey(str), (AttributeKey<Boolean>) Boolean.valueOf(z));
    }

    default Span setAttribute(AttributeKey<Long> attributeKey, int i) {
        return setAttribute((AttributeKey<AttributeKey<Long>>) attributeKey, (AttributeKey<Long>) Long.valueOf(i));
    }

    default Span setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.trace.Span$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Span.this.setAttribute((AttributeKey<AttributeKey<AttributeKey>>) ((AttributeKey<AttributeKey>) obj), (AttributeKey<AttributeKey>) ((AttributeKey) obj2));
                }
            });
        }
        return this;
    }

    default Span addEvent(String str) {
        return addEvent(str, Attributes.empty());
    }

    default Span addEvent(String str, long j, TimeUnit timeUnit) {
        return addEvent(str, Attributes.empty(), j, timeUnit);
    }

    default Span addEvent(String str, Instant instant) {
        if (instant == null) {
            return addEvent(str);
        }
        return addEvent(str, TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
    }

    default Span addEvent(String str, Attributes attributes, Instant instant) {
        if (instant == null) {
            return addEvent(str, attributes);
        }
        return addEvent(str, attributes, TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
    }

    default Span setStatus(StatusCode statusCode) {
        return setStatus(statusCode, "");
    }

    default Span recordException(Throwable th) {
        return recordException(th, Attributes.empty());
    }

    default Span addLink(SpanContext spanContext) {
        return addLink(spanContext, Attributes.empty());
    }

    default void end(Instant instant) {
        if (instant == null) {
            end();
        } else {
            end(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
        }
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    default Context storeInContext(Context context) {
        return context.with(SpanContextKey.KEY, this);
    }
}
