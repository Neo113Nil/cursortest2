package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.exporter.internal.otlp.ResourceMarshaler;
import io.opentelemetry.proto.logs.v1.internal.ResourceLogs;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class ResourceLogsMarshaler extends MarshalerWithSize {
    private final InstrumentationScopeLogsMarshaler[] instrumentationScopeLogsMarshalers;
    private final ResourceMarshaler resourceMarshaler;
    private final byte[] schemaUrl;

    public static ResourceLogsMarshaler[] create(Collection<LogRecordData> collection) {
        Map<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> groupByResourceAndScope = groupByResourceAndScope(collection);
        ResourceLogsMarshaler[] resourceLogsMarshalerArr = new ResourceLogsMarshaler[groupByResourceAndScope.size()];
        int i = 0;
        for (Map.Entry<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> entry : groupByResourceAndScope.entrySet()) {
            InstrumentationScopeLogsMarshaler[] instrumentationScopeLogsMarshalerArr = new InstrumentationScopeLogsMarshaler[entry.getValue().size()];
            int i2 = 0;
            for (Map.Entry<InstrumentationScopeInfo, List<Marshaler>> entry2 : entry.getValue().entrySet()) {
                instrumentationScopeLogsMarshalerArr[i2] = new InstrumentationScopeLogsMarshaler(InstrumentationScopeMarshaler.create(entry2.getKey()), MarshalerUtil.toBytes(entry2.getKey().getSchemaUrl()), entry2.getValue());
                i2++;
            }
            resourceLogsMarshalerArr[i] = new ResourceLogsMarshaler(ResourceMarshaler.create(entry.getKey()), MarshalerUtil.toBytes(entry.getKey().getSchemaUrl()), instrumentationScopeLogsMarshalerArr);
            i++;
        }
        return resourceLogsMarshalerArr;
    }

    ResourceLogsMarshaler(ResourceMarshaler resourceMarshaler, byte[] bArr, InstrumentationScopeLogsMarshaler[] instrumentationScopeLogsMarshalerArr) {
        super(calculateSize(resourceMarshaler, bArr, instrumentationScopeLogsMarshalerArr));
        this.resourceMarshaler = resourceMarshaler;
        this.schemaUrl = bArr;
        this.instrumentationScopeLogsMarshalers = instrumentationScopeLogsMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(ResourceLogs.RESOURCE, this.resourceMarshaler);
        serializer.serializeRepeatedMessage(ResourceLogs.SCOPE_LOGS, this.instrumentationScopeLogsMarshalers);
        serializer.serializeString(ResourceLogs.SCHEMA_URL, this.schemaUrl);
    }

    private static int calculateSize(ResourceMarshaler resourceMarshaler, byte[] bArr, InstrumentationScopeLogsMarshaler[] instrumentationScopeLogsMarshalerArr) {
        return MarshalerUtil.sizeMessage(ResourceLogs.RESOURCE, resourceMarshaler) + MarshalerUtil.sizeBytes(ResourceLogs.SCHEMA_URL, bArr) + MarshalerUtil.sizeRepeatedMessage(ResourceLogs.SCOPE_LOGS, instrumentationScopeLogsMarshalerArr);
    }

    private static Map<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> groupByResourceAndScope(Collection<LogRecordData> collection) {
        return MarshalerUtil.groupByResourceAndScope(collection, new LowAllocationLogsRequestMarshaler$$ExternalSyntheticLambda0(), new LowAllocationLogsRequestMarshaler$$ExternalSyntheticLambda1(), new Function() { // from class: io.opentelemetry.exporter.internal.otlp.logs.ResourceLogsMarshaler$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LogMarshaler.create((LogRecordData) obj);
            }
        });
    }
}
