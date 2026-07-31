package io.opentelemetry.api.incubator.logs;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Context;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExtendedLogRecordBuilder extends LogRecordBuilder {
    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    <T> ExtendedLogRecordBuilder setAttribute(AttributeKey<T> attributeKey, @Nullable T t);

    <T> ExtendedLogRecordBuilder setAttribute(ExtendedAttributeKey<T> extendedAttributeKey, T t);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setBody(String str);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setContext(Context context);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setEventName(String str);

    ExtendedLogRecordBuilder setException(Throwable th);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setObservedTimestamp(long j, TimeUnit timeUnit);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setObservedTimestamp(Instant instant);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setSeverity(Severity severity);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setSeverityText(String str);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setTimestamp(long j, TimeUnit timeUnit);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    ExtendedLogRecordBuilder setTimestamp(Instant instant);

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    /* bridge */ /* synthetic */ default LogRecordBuilder setAttribute(AttributeKey attributeKey, @Nullable Object obj) {
        return setAttribute((AttributeKey<AttributeKey>) attributeKey, (AttributeKey) obj);
    }

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    /* bridge */ /* synthetic */ default LogRecordBuilder setBody(Value value) {
        return setBody((Value<?>) value);
    }

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    default ExtendedLogRecordBuilder setBody(Value<?> value) {
        setBody(value.asString());
        return this;
    }

    @Override // io.opentelemetry.api.logs.LogRecordBuilder
    default ExtendedLogRecordBuilder setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.logs.ExtendedLogRecordBuilder$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ExtendedLogRecordBuilder.this.setAttribute((AttributeKey<AttributeKey<AttributeKey>>) ((AttributeKey<AttributeKey>) obj), (AttributeKey<AttributeKey>) ((AttributeKey) obj2));
                }
            });
        }
        return this;
    }

    default ExtendedLogRecordBuilder setAllAttributes(ExtendedAttributes extendedAttributes) {
        if (extendedAttributes != null && !extendedAttributes.isEmpty()) {
            extendedAttributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.logs.ExtendedLogRecordBuilder$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ExtendedLogRecordBuilder.this.setAttribute((ExtendedAttributeKey<ExtendedAttributeKey<ExtendedAttributeKey>>) ((ExtendedAttributeKey<ExtendedAttributeKey>) obj), (ExtendedAttributeKey<ExtendedAttributeKey>) ((ExtendedAttributeKey) obj2));
                }
            });
        }
        return this;
    }
}
