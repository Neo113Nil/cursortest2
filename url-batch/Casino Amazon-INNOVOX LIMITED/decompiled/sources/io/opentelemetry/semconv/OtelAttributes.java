package io.opentelemetry.semconv;

import io.opentelemetry.api.common.AttributeKey;

/* loaded from: classes3.dex */
public final class OtelAttributes {
    public static final AttributeKey<String> OTEL_SCOPE_NAME = AttributeKey.stringKey("otel.scope.name");
    public static final AttributeKey<String> OTEL_SCOPE_VERSION = AttributeKey.stringKey("otel.scope.version");
    public static final AttributeKey<String> OTEL_STATUS_CODE = AttributeKey.stringKey("otel.status_code");
    public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION = AttributeKey.stringKey("otel.status_description");

    public static final class OtelStatusCodeValues {
        public static final String ERROR = "ERROR";
        public static final String OK = "OK";

        private OtelStatusCodeValues() {
        }
    }

    private OtelAttributes() {
    }
}
