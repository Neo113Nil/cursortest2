package io.opentelemetry.exporter.otlp.trace;

import io.opentelemetry.exporter.internal.grpc.GrpcExporter;
import io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.otlp.traces.SpanReusableDataMarshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class OtlpGrpcSpanExporter implements SpanExporter {
    private final GrpcExporterBuilder<Marshaler> builder;
    private final GrpcExporter<Marshaler> delegate;
    private final SpanReusableDataMarshaler marshaler;

    public static OtlpGrpcSpanExporter getDefault() {
        return builder().build();
    }

    public static OtlpGrpcSpanExporterBuilder builder() {
        return new OtlpGrpcSpanExporterBuilder();
    }

    OtlpGrpcSpanExporter(GrpcExporterBuilder<Marshaler> grpcExporterBuilder, final GrpcExporter<Marshaler> grpcExporter, MemoryMode memoryMode) {
        this.builder = grpcExporterBuilder;
        this.delegate = grpcExporter;
        Objects.requireNonNull(grpcExporter);
        this.marshaler = new SpanReusableDataMarshaler(memoryMode, new BiFunction() { // from class: io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                CompletableResultCode export;
                export = GrpcExporter.this.export((Marshaler) obj, ((Integer) obj2).intValue());
                return export;
            }
        });
    }

    public OtlpGrpcSpanExporterBuilder toBuilder() {
        return new OtlpGrpcSpanExporterBuilder(this.builder.copy(), this.marshaler.getMemoryMode());
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    public CompletableResultCode export(Collection<SpanData> collection) {
        return this.marshaler.export(collection);
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    public CompletableResultCode flush() {
        return CompletableResultCode.ofSuccess();
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    public CompletableResultCode shutdown() {
        return this.delegate.shutdown();
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpGrpcSpanExporter{", "}");
        stringJoiner.add(this.builder.toString(false));
        stringJoiner.add("memoryMode=" + this.marshaler.getMemoryMode());
        return stringJoiner.toString();
    }
}
