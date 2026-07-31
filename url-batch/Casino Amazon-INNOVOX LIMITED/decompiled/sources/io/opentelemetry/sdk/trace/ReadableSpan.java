package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.InstrumentationScopeUtil;
import io.opentelemetry.sdk.trace.data.SpanData;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ReadableSpan {
    @Nullable
    <T> T getAttribute(AttributeKey<T> attributeKey);

    @Deprecated
    InstrumentationLibraryInfo getInstrumentationLibraryInfo();

    SpanKind getKind();

    long getLatencyNanos();

    String getName();

    SpanContext getParentSpanContext();

    SpanContext getSpanContext();

    boolean hasEnded();

    SpanData toSpanData();

    default InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return InstrumentationScopeUtil.toInstrumentationScopeInfo(getInstrumentationLibraryInfo());
    }

    default Attributes getAttributes() {
        return Attributes.empty();
    }
}
