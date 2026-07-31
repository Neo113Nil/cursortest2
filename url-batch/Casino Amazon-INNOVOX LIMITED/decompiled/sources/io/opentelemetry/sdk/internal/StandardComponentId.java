package io.opentelemetry.sdk.internal;

import io.opentelemetry.sdk.internal.ComponentId;

/* loaded from: classes3.dex */
public class StandardComponentId extends ComponentId.Lazy {
    private final ExporterType standardType;

    @Override // io.opentelemetry.sdk.internal.ComponentId.Lazy, io.opentelemetry.sdk.internal.ComponentId
    public /* bridge */ /* synthetic */ String getComponentName() {
        return super.getComponentName();
    }

    @Override // io.opentelemetry.sdk.internal.ComponentId.Lazy, io.opentelemetry.sdk.internal.ComponentId
    public /* bridge */ /* synthetic */ String getTypeName() {
        return super.getTypeName();
    }

    public enum ExporterType {
        OTLP_GRPC_SPAN_EXPORTER("otlp_grpc_span_exporter", Signal.SPAN),
        OTLP_HTTP_SPAN_EXPORTER("otlp_http_span_exporter", Signal.SPAN),
        OTLP_HTTP_JSON_SPAN_EXPORTER("otlp_http_json_span_exporter", Signal.SPAN),
        OTLP_GRPC_LOG_EXPORTER("otlp_grpc_log_exporter", Signal.LOG),
        OTLP_HTTP_LOG_EXPORTER("otlp_http_log_exporter", Signal.LOG),
        OTLP_HTTP_JSON_LOG_EXPORTER("otlp_http_json_log_exporter", Signal.LOG),
        OTLP_GRPC_METRIC_EXPORTER("otlp_grpc_metric_exporter", Signal.METRIC),
        OTLP_HTTP_METRIC_EXPORTER("otlp_http_metric_exporter", Signal.METRIC),
        OTLP_HTTP_JSON_METRIC_EXPORTER("otlp_http_json_metric_exporter", Signal.METRIC),
        ZIPKIN_HTTP_SPAN_EXPORTER("zipkin_http_span_exporter", Signal.SPAN),
        ZIPKIN_HTTP_JSON_SPAN_EXPORTER("zipkin_http_span_exporter", Signal.SPAN),
        OTLP_GRPC_PROFILES_EXPORTER("TBD", Signal.PROFILE);

        private final Signal signal;
        final String value;

        ExporterType(String str, Signal signal) {
            this.value = str;
            this.signal = signal;
        }

        public Signal signal() {
            return this.signal;
        }
    }

    StandardComponentId(ExporterType exporterType) {
        super(exporterType.value);
        this.standardType = exporterType;
    }

    public ExporterType getStandardType() {
        return this.standardType;
    }
}
