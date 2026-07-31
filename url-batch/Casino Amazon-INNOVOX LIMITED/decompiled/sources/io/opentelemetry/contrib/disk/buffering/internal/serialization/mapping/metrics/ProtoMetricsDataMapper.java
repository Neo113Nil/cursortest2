package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.metrics;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper;
import io.opentelemetry.diskbuffering.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.diskbuffering.proto.metrics.v1.Metric;
import io.opentelemetry.diskbuffering.proto.metrics.v1.ResourceMetrics;
import io.opentelemetry.diskbuffering.proto.metrics.v1.ScopeMetrics;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class ProtoMetricsDataMapper extends BaseProtoSignalsDataMapper<MetricData, Metric, ExportMetricsServiceRequest, ResourceMetrics, ScopeMetrics> {
    private static final ProtoMetricsDataMapper INSTANCE = new ProtoMetricsDataMapper();

    public static ProtoMetricsDataMapper getInstance() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Metric signalItemToProto(MetricData metricData) {
        return MetricDataMapper.getInstance().mapToProto(metricData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public MetricData protoToSignalItem(Metric metric, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        return MetricDataMapper.getInstance().mapToSdk(metric, resource, instrumentationScopeInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ResourceMetrics> getProtoResources(ExportMetricsServiceRequest exportMetricsServiceRequest) {
        return exportMetricsServiceRequest.resource_metrics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public ExportMetricsServiceRequest createProtoData(Map<Resource, Map<InstrumentationScopeInfo, List<Metric>>> map) {
        final ArrayList arrayList = new ArrayList();
        map.forEach(new BiConsumer() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.metrics.ProtoMetricsDataMapper$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ProtoMetricsDataMapper.this.m3916xdb3ee39b(arrayList, (Resource) obj, (Map) obj2);
            }
        });
        return new ExportMetricsServiceRequest.Builder().resource_metrics(arrayList).build();
    }

    /* renamed from: lambda$createProtoData$0$io-opentelemetry-contrib-disk-buffering-internal-serialization-mapping-metrics-ProtoMetricsDataMapper, reason: not valid java name */
    /* synthetic */ void m3916xdb3ee39b(List list, Resource resource, Map map) {
        ResourceMetrics.Builder createProtoResourceBuilder = createProtoResourceBuilder(resource);
        for (Map.Entry entry : map.entrySet()) {
            ScopeMetrics.Builder createProtoScopeBuilder = createProtoScopeBuilder((InstrumentationScopeInfo) entry.getKey());
            createProtoScopeBuilder.metrics.addAll((Collection) entry.getValue());
            createProtoResourceBuilder.scope_metrics.add(createProtoScopeBuilder.build());
        }
        list.add(createProtoResourceBuilder.build());
    }

    private ScopeMetrics.Builder createProtoScopeBuilder(InstrumentationScopeInfo instrumentationScopeInfo) {
        ScopeMetrics.Builder scope = new ScopeMetrics.Builder().scope(instrumentationScopeToProto(instrumentationScopeInfo));
        if (instrumentationScopeInfo.getSchemaUrl() != null) {
            scope.schema_url(instrumentationScopeInfo.getSchemaUrl());
        }
        return scope;
    }

    private ResourceMetrics.Builder createProtoResourceBuilder(Resource resource) {
        ResourceMetrics.Builder resource2 = new ResourceMetrics.Builder().resource(resourceToProto(resource));
        if (resource.getSchemaUrl() != null) {
            resource2.schema_url(resource.getSchemaUrl());
        }
        return resource2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<Metric> getSignalsFromProto(ScopeMetrics scopeMetrics) {
        return scopeMetrics.metrics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeFromProto(ScopeMetrics scopeMetrics) {
        return protoToInstrumentationScopeInfo(scopeMetrics.scope, scopeMetrics.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ScopeMetrics> getScopes(ResourceMetrics resourceMetrics) {
        return resourceMetrics.scope_metrics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromProto(ResourceMetrics resourceMetrics) {
        return protoToResource(resourceMetrics.resource, resourceMetrics.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromSignal(MetricData metricData) {
        return metricData.getResource();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeInfo(MetricData metricData) {
        return metricData.getInstrumentationScopeInfo();
    }
}
