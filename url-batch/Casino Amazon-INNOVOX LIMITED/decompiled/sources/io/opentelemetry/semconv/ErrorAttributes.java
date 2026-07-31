package io.opentelemetry.semconv;

import io.opentelemetry.api.common.AttributeKey;

/* loaded from: classes3.dex */
public final class ErrorAttributes {
    public static final AttributeKey<String> ERROR_TYPE = AttributeKey.stringKey("error.type");

    public static final class ErrorTypeValues {
        public static final String OTHER = "_OTHER";

        private ErrorTypeValues() {
        }
    }

    private ErrorAttributes() {
    }
}
