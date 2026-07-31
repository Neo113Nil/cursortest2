package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.proto.logs.v1.internal.ScopeLogs;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class InstrumentationScopeLogsMarshaler extends MarshalerWithSize {
    private final InstrumentationScopeMarshaler instrumentationScope;
    private final List<Marshaler> logMarshalers;
    private final byte[] schemaUrlUtf8;

    InstrumentationScopeLogsMarshaler(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<Marshaler> list) {
        super(calculateSize(instrumentationScopeMarshaler, bArr, list));
        this.instrumentationScope = instrumentationScopeMarshaler;
        this.schemaUrlUtf8 = bArr;
        this.logMarshalers = list;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(ScopeLogs.SCOPE, this.instrumentationScope);
        serializer.serializeRepeatedMessage(ScopeLogs.LOG_RECORDS, this.logMarshalers);
        serializer.serializeString(ScopeLogs.SCHEMA_URL, this.schemaUrlUtf8);
    }

    private static int calculateSize(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<Marshaler> list) {
        return MarshalerUtil.sizeMessage(ScopeLogs.SCOPE, instrumentationScopeMarshaler) + MarshalerUtil.sizeBytes(ScopeLogs.SCHEMA_URL, bArr) + MarshalerUtil.sizeRepeatedMessage(ScopeLogs.LOG_RECORDS, list);
    }
}
