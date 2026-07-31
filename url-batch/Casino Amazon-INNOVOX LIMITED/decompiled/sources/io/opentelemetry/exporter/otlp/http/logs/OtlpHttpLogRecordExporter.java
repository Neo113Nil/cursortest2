package io.opentelemetry.exporter.otlp.http.logs;

import io.opentelemetry.exporter.internal.http.HttpExporter;
import io.opentelemetry.exporter.internal.http.HttpExporterBuilder;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.otlp.logs.LogReusableDataMarshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class OtlpHttpLogRecordExporter implements LogRecordExporter {
    private final HttpExporterBuilder<Marshaler> builder;
    private final HttpExporter<Marshaler> delegate;
    private final LogReusableDataMarshaler marshaler;

    OtlpHttpLogRecordExporter(HttpExporterBuilder<Marshaler> httpExporterBuilder, final HttpExporter<Marshaler> httpExporter, MemoryMode memoryMode) {
        this.builder = httpExporterBuilder;
        this.delegate = httpExporter;
        Objects.requireNonNull(httpExporter);
        this.marshaler = new LogReusableDataMarshaler(memoryMode, new BiFunction() { // from class: io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporter$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                CompletableResultCode export;
                export = HttpExporter.this.export((Marshaler) obj, ((Integer) obj2).intValue());
                return export;
            }
        });
    }

    public static OtlpHttpLogRecordExporter getDefault() {
        return builder().build();
    }

    public static OtlpHttpLogRecordExporterBuilder builder() {
        return new OtlpHttpLogRecordExporterBuilder();
    }

    public OtlpHttpLogRecordExporterBuilder toBuilder() {
        return new OtlpHttpLogRecordExporterBuilder(this.builder.copy(), this.marshaler.getMemoryMode());
    }

    @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
    public CompletableResultCode export(Collection<LogRecordData> collection) {
        return this.marshaler.export(collection);
    }

    @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
    public CompletableResultCode flush() {
        return CompletableResultCode.ofSuccess();
    }

    @Override // io.opentelemetry.sdk.logs.export.LogRecordExporter
    public CompletableResultCode shutdown() {
        return this.delegate.shutdown();
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.builder.toString(false));
        stringJoiner.add("memoryMode=" + this.marshaler.getMemoryMode());
        return stringJoiner.toString();
    }
}
