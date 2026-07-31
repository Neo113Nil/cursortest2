package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper;
import io.opentelemetry.diskbuffering.proto.collector.logs.v1.ExportLogsServiceRequest;
import io.opentelemetry.diskbuffering.proto.logs.v1.LogRecord;
import io.opentelemetry.diskbuffering.proto.logs.v1.ResourceLogs;
import io.opentelemetry.diskbuffering.proto.logs.v1.ScopeLogs;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class ProtoLogsDataMapper extends BaseProtoSignalsDataMapper<LogRecordData, LogRecord, ExportLogsServiceRequest, ResourceLogs, ScopeLogs> {
    private static final ProtoLogsDataMapper INSTANCE = new ProtoLogsDataMapper();

    public static ProtoLogsDataMapper getInstance() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public LogRecord signalItemToProto(LogRecordData logRecordData) {
        return LogRecordDataMapper.getInstance().mapToProto(logRecordData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public LogRecordData protoToSignalItem(LogRecord logRecord, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        return LogRecordDataMapper.getInstance().mapToSdk(logRecord, resource, instrumentationScopeInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ResourceLogs> getProtoResources(ExportLogsServiceRequest exportLogsServiceRequest) {
        return exportLogsServiceRequest.resource_logs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public ExportLogsServiceRequest createProtoData(Map<Resource, Map<InstrumentationScopeInfo, List<LogRecord>>> map) {
        final ArrayList arrayList = new ArrayList();
        map.forEach(new BiConsumer() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.ProtoLogsDataMapper$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ProtoLogsDataMapper.this.m3915xef40312f(arrayList, (Resource) obj, (Map) obj2);
            }
        });
        return new ExportLogsServiceRequest.Builder().resource_logs(arrayList).build();
    }

    /* renamed from: lambda$createProtoData$0$io-opentelemetry-contrib-disk-buffering-internal-serialization-mapping-logs-ProtoLogsDataMapper, reason: not valid java name */
    /* synthetic */ void m3915xef40312f(List list, Resource resource, Map map) {
        ResourceLogs.Builder createProtoResourceBuilder = createProtoResourceBuilder(resource);
        for (Map.Entry entry : map.entrySet()) {
            ScopeLogs.Builder createProtoScopeBuilder = createProtoScopeBuilder((InstrumentationScopeInfo) entry.getKey());
            createProtoScopeBuilder.log_records.addAll((Collection) entry.getValue());
            createProtoResourceBuilder.scope_logs.add(createProtoScopeBuilder.build());
        }
        list.add(createProtoResourceBuilder.build());
    }

    private ScopeLogs.Builder createProtoScopeBuilder(InstrumentationScopeInfo instrumentationScopeInfo) {
        ScopeLogs.Builder scope = new ScopeLogs.Builder().scope(instrumentationScopeToProto(instrumentationScopeInfo));
        if (instrumentationScopeInfo.getSchemaUrl() != null) {
            scope.schema_url(instrumentationScopeInfo.getSchemaUrl());
        }
        return scope;
    }

    private ResourceLogs.Builder createProtoResourceBuilder(Resource resource) {
        ResourceLogs.Builder resource2 = new ResourceLogs.Builder().resource(resourceToProto(resource));
        if (resource.getSchemaUrl() != null) {
            resource2.schema_url(resource.getSchemaUrl());
        }
        return resource2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<LogRecord> getSignalsFromProto(ScopeLogs scopeLogs) {
        return scopeLogs.log_records;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeFromProto(ScopeLogs scopeLogs) {
        return protoToInstrumentationScopeInfo(scopeLogs.scope, scopeLogs.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ScopeLogs> getScopes(ResourceLogs resourceLogs) {
        return resourceLogs.scope_logs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromProto(ResourceLogs resourceLogs) {
        return protoToResource(resourceLogs.resource, resourceLogs.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromSignal(LogRecordData logRecordData) {
        return logRecordData.getResource();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeInfo(LogRecordData logRecordData) {
        return logRecordData.getInstrumentationScopeInfo();
    }
}
