package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* loaded from: classes4.dex */
public interface Span {
    void end();

    void end(long j);

    SpanContext getSpanContext();

    Span setAttribute(InternalAttributeKeyImpl internalAttributeKeyImpl, String str);

    default void setAttribute(String str, String str2) {
        if (str == null) {
            str = "";
        }
        setAttribute(new InternalAttributeKeyImpl(str), str2);
    }
}
