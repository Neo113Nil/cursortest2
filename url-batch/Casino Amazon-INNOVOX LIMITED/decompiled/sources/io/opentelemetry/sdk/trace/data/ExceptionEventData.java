package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.common.Attributes;

/* loaded from: classes3.dex */
public interface ExceptionEventData extends EventData {
    Throwable getException();

    static ExceptionEventData create(long j, Throwable th, Attributes attributes, int i) {
        return ImmutableExceptionEventData.create(j, th, attributes, i);
    }
}
