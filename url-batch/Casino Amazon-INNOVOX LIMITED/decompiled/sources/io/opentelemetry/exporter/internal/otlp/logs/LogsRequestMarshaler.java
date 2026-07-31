package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.collector.logs.v1.internal.ExportLogsServiceRequest;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class LogsRequestMarshaler extends MarshalerWithSize {
    private final ResourceLogsMarshaler[] resourceLogsMarshalers;

    public static LogsRequestMarshaler create(Collection<LogRecordData> collection) {
        return new LogsRequestMarshaler(ResourceLogsMarshaler.create(collection));
    }

    private LogsRequestMarshaler(ResourceLogsMarshaler[] resourceLogsMarshalerArr) {
        super(MarshalerUtil.sizeRepeatedMessage(ExportLogsServiceRequest.RESOURCE_LOGS, resourceLogsMarshalerArr));
        this.resourceLogsMarshalers = resourceLogsMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(ExportLogsServiceRequest.RESOURCE_LOGS, this.resourceLogsMarshalers);
    }
}
