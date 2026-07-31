package io.opentelemetry.sdk.logs.data.internal;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.sdk.logs.data.LogRecordData;

/* loaded from: classes3.dex */
public interface ExtendedLogRecordData extends LogRecordData {
    ExtendedAttributes getExtendedAttributes();

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Deprecated
    default Attributes getAttributes() {
        return getExtendedAttributes().asAttributes();
    }
}
