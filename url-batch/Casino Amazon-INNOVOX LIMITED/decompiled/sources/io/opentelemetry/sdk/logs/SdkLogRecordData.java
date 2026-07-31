package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.Body;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
abstract class SdkLogRecordData implements LogRecordData {
    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract Value<?> getBodyValue();

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract String getEventName();

    SdkLogRecordData() {
    }

    static SdkLogRecordData create(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str, @Nullable Value<?> value, Attributes attributes, int i, @Nullable String str2) {
        return new AutoValue_SdkLogRecordData(resource, instrumentationScopeInfo, j, j2, spanContext, severity, str, attributes, i, value, str2);
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
