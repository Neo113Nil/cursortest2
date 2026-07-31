package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.proto.logs.v1.internal.ScopeLogs;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class InstrumentationScopeLogsStatelessMarshaler implements StatelessMarshaler2<InstrumentationScopeInfo, List<LogRecordData>> {
    static final InstrumentationScopeLogsStatelessMarshaler INSTANCE = new InstrumentationScopeLogsStatelessMarshaler();

    InstrumentationScopeLogsStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public void writeTo(Serializer serializer, InstrumentationScopeInfo instrumentationScopeInfo, List<LogRecordData> list, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeMessage(ScopeLogs.SCOPE, (InstrumentationScopeMarshaler) marshalerContext.getData(InstrumentationScopeMarshaler.class));
        serializer.serializeRepeatedMessageWithContext(ScopeLogs.LOG_RECORDS, list, LogStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeStringWithContext(ScopeLogs.SCHEMA_URL, instrumentationScopeInfo.getSchemaUrl(), marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public int getBinarySerializedSize(InstrumentationScopeInfo instrumentationScopeInfo, List<LogRecordData> list, MarshalerContext marshalerContext) {
        InstrumentationScopeMarshaler create = InstrumentationScopeMarshaler.create(instrumentationScopeInfo);
        marshalerContext.addData(create);
        return MarshalerUtil.sizeMessage(ScopeLogs.SCOPE, create) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ScopeLogs.LOG_RECORDS, list, LogStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeStringWithContext(ScopeLogs.SCHEMA_URL, instrumentationScopeInfo.getSchemaUrl(), marshalerContext);
    }
}
