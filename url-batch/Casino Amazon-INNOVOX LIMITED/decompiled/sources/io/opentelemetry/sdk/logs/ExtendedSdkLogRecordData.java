package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.Body;
import io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
abstract class ExtendedSdkLogRecordData implements ExtendedLogRecordData {
    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract Value<?> getBodyValue();

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract String getEventName();

    ExtendedSdkLogRecordData() {
    }

    static ExtendedSdkLogRecordData create(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, @Nullable String str, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str2, @Nullable Value<?> value, ExtendedAttributes extendedAttributes, int i) {
        return new AutoValue_ExtendedSdkLogRecordData(resource, instrumentationScopeInfo, j, j2, spanContext, severity, str2, i, extendedAttributes, value, str);
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public Body getBody() {
        Value<?> bodyValue = getBodyValue();
        if (bodyValue == null) {
            return Body.empty();
        }
        return Body.string(bodyValue.asString());
    }
}
