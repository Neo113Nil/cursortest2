package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.common.Attributes;

/* loaded from: classes3.dex */
abstract class ImmutableExceptionEventData implements ExceptionEventData {
    private static final String EXCEPTION_EVENT_NAME = "exception";

    @Override // io.opentelemetry.sdk.trace.data.EventData
    public final String getName() {
        return EXCEPTION_EVENT_NAME;
    }

    static ExceptionEventData create(long j, Throwable th, Attributes attributes, int i) {
        return new AutoValue_ImmutableExceptionEventData(attributes, j, i, th);
    }

    ImmutableExceptionEventData() {
    }
}
