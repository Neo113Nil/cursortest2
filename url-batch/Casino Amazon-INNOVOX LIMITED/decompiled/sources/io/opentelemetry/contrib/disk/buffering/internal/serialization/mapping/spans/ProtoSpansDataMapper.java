package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper;
import io.opentelemetry.diskbuffering.proto.collector.trace.v1.ExportTraceServiceRequest;
import io.opentelemetry.diskbuffering.proto.trace.v1.ResourceSpans;
import io.opentelemetry.diskbuffering.proto.trace.v1.ScopeSpans;
import io.opentelemetry.diskbuffering.proto.trace.v1.Span;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class ProtoSpansDataMapper extends BaseProtoSignalsDataMapper<SpanData, Span, ExportTraceServiceRequest, ResourceSpans, ScopeSpans> {
    private static final ProtoSpansDataMapper INSTANCE = new ProtoSpansDataMapper();

    public static ProtoSpansDataMapper getInstance() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Span signalItemToProto(SpanData spanData) {
        return SpanDataMapper.getInstance().mapToProto(spanData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ResourceSpans> getProtoResources(ExportTraceServiceRequest exportTraceServiceRequest) {
        return exportTraceServiceRequest.resource_spans;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public SpanData protoToSignalItem(Span span, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        return SpanDataMapper.getInstance().mapToSdk(span, resource, instrumentationScopeInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public ExportTraceServiceRequest createProtoData(Map<Resource, Map<InstrumentationScopeInfo, List<Span>>> map) {
        final ArrayList arrayList = new ArrayList();
        map.forEach(new BiConsumer() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.ProtoSpansDataMapper$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ProtoSpansDataMapper.this.m3917x7a7a9ddb(arrayList, (Resource) obj, (Map) obj2);
            }
        });
        return new ExportTraceServiceRequest.Builder().resource_spans(arrayList).build();
    }

    /* renamed from: lambda$createProtoData$0$io-opentelemetry-contrib-disk-buffering-internal-serialization-mapping-spans-ProtoSpansDataMapper, reason: not valid java name */
    /* synthetic */ void m3917x7a7a9ddb(List list, Resource resource, Map map) {
        ResourceSpans.Builder createProtoResourceBuilder = createProtoResourceBuilder(resource);
        for (Map.Entry entry : map.entrySet()) {
            ScopeSpans.Builder createProtoScopeBuilder = createProtoScopeBuilder((InstrumentationScopeInfo) entry.getKey());
            createProtoScopeBuilder.spans.addAll((Collection) entry.getValue());
            createProtoResourceBuilder.scope_spans.add(createProtoScopeBuilder.build());
        }
        list.add(createProtoResourceBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<Span> getSignalsFromProto(ScopeSpans scopeSpans) {
        return scopeSpans.spans;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeFromProto(ScopeSpans scopeSpans) {
        return protoToInstrumentationScopeInfo(scopeSpans.scope, scopeSpans.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public List<ScopeSpans> getScopes(ResourceSpans resourceSpans) {
        return resourceSpans.scope_spans;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromProto(ResourceSpans resourceSpans) {
        return protoToResource(resourceSpans.resource, resourceSpans.schema_url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public Resource getResourceFromSignal(SpanData spanData) {
        return spanData.getResource();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper
    public InstrumentationScopeInfo getInstrumentationScopeInfo(SpanData spanData) {
        return spanData.getInstrumentationScopeInfo();
    }

    private ResourceSpans.Builder createProtoResourceBuilder(Resource resource) {
        ResourceSpans.Builder resource2 = new ResourceSpans.Builder().resource(resourceToProto(resource));
        if (resource.getSchemaUrl() != null) {
            resource2.schema_url(resource.getSchemaUrl());
        }
        return resource2;
    }

    private ScopeSpans.Builder createProtoScopeBuilder(InstrumentationScopeInfo instrumentationScopeInfo) {
        ScopeSpans.Builder scope = new ScopeSpans.Builder().scope(instrumentationScopeToProto(instrumentationScopeInfo));
        if (instrumentationScopeInfo.getSchemaUrl() != null) {
            scope.schema_url(instrumentationScopeInfo.getSchemaUrl());
        }
        return scope;
    }
}
