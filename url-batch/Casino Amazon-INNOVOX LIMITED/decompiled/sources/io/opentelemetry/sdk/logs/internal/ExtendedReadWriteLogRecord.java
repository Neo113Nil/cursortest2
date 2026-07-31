package io.opentelemetry.sdk.logs.internal;

import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.sdk.logs.ReadWriteLogRecord;
import io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExtendedReadWriteLogRecord extends ReadWriteLogRecord {
    @Nullable
    <T> T getAttribute(ExtendedAttributeKey<T> extendedAttributeKey);

    ExtendedAttributes getExtendedAttributes();

    <T> ExtendedReadWriteLogRecord setAttribute(ExtendedAttributeKey<T> extendedAttributeKey, T t);

    @Override // 
    ExtendedLogRecordData toLogRecordData();

    default ExtendedReadWriteLogRecord setAllAttributes(ExtendedAttributes extendedAttributes) {
        if (extendedAttributes != null && !extendedAttributes.isEmpty()) {
            extendedAttributes.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ExtendedReadWriteLogRecord.this.setAttribute((ExtendedAttributeKey<ExtendedAttributeKey<ExtendedAttributeKey>>) ((ExtendedAttributeKey<ExtendedAttributeKey>) obj), (ExtendedAttributeKey<ExtendedAttributeKey>) ((ExtendedAttributeKey) obj2));
                }
            });
        }
        return this;
    }
}
