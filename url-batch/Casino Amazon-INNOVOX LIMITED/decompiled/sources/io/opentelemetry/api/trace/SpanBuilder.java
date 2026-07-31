package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public interface SpanBuilder {
    SpanBuilder addLink(SpanContext spanContext);

    SpanBuilder addLink(SpanContext spanContext, Attributes attributes);

    <T> SpanBuilder setAttribute(AttributeKey<T> attributeKey, T t);

    SpanBuilder setAttribute(String str, double d);

    SpanBuilder setAttribute(String str, long j);

    SpanBuilder setAttribute(String str, String str2);

    SpanBuilder setAttribute(String str, boolean z);

    SpanBuilder setNoParent();

    SpanBuilder setParent(Context context);

    SpanBuilder setSpanKind(SpanKind spanKind);

    SpanBuilder setStartTimestamp(long j, TimeUnit timeUnit);

    Span startSpan();

    default SpanBuilder setAttribute(AttributeKey<Long> attributeKey, int i) {
        return setAttribute((AttributeKey<AttributeKey<Long>>) attributeKey, (AttributeKey<Long>) Long.valueOf(i));
    }

    default SpanBuilder setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.trace.SpanBuilder$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    SpanBuilder.this.setAttribute((AttributeKey<AttributeKey<AttributeKey>>) ((AttributeKey<AttributeKey>) obj), (AttributeKey<AttributeKey>) ((AttributeKey) obj2));
                }
            });
        }
        return this;
    }

    default SpanBuilder setStartTimestamp(Instant instant) {
        return instant == null ? this : setStartTimestamp(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
    }
}
