package io.opentelemetry.api.logs;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.context.Context;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface LogRecordBuilder {
    void emit();

    <T> LogRecordBuilder setAttribute(AttributeKey<T> attributeKey, @Nullable T t);

    LogRecordBuilder setBody(String str);

    LogRecordBuilder setContext(Context context);

    default LogRecordBuilder setEventName(String str) {
        return this;
    }

    LogRecordBuilder setObservedTimestamp(long j, TimeUnit timeUnit);

    LogRecordBuilder setObservedTimestamp(Instant instant);

    LogRecordBuilder setSeverity(Severity severity);

    LogRecordBuilder setSeverityText(String str);

    LogRecordBuilder setTimestamp(long j, TimeUnit timeUnit);

    LogRecordBuilder setTimestamp(Instant instant);

    default LogRecordBuilder setBody(Value<?> value) {
        setBody(value.asString());
        return this;
    }

    default LogRecordBuilder setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.logs.LogRecordBuilder$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    LogRecordBuilder.this.setAttribute((AttributeKey<AttributeKey<AttributeKey>>) ((AttributeKey<AttributeKey>) obj), (AttributeKey<AttributeKey>) ((AttributeKey) obj2));
                }
            });
        }
        return this;
    }

    default LogRecordBuilder setAttribute(String str, @Nullable String str2) {
        return setAttribute((AttributeKey<AttributeKey<String>>) AttributeKey.stringKey(str), (AttributeKey<String>) str2);
    }

    default LogRecordBuilder setAttribute(String str, long j) {
        return setAttribute((AttributeKey<AttributeKey<Long>>) AttributeKey.longKey(str), (AttributeKey<Long>) Long.valueOf(j));
    }

    default LogRecordBuilder setAttribute(String str, double d) {
        return setAttribute((AttributeKey<AttributeKey<Double>>) AttributeKey.doubleKey(str), (AttributeKey<Double>) Double.valueOf(d));
    }

    default LogRecordBuilder setAttribute(String str, boolean z) {
        return setAttribute((AttributeKey<AttributeKey<Boolean>>) AttributeKey.booleanKey(str), (AttributeKey<Boolean>) Boolean.valueOf(z));
    }

    default LogRecordBuilder setAttribute(String str, int i) {
        return setAttribute(str, i);
    }
}
