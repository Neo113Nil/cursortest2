package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.diskbuffering.proto.common.v1.InstrumentationScope;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.InstrumentationScopeInfoBuilder;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class BaseProtoSignalsDataMapper<SIGNAL_ITEM, PROTO_SIGNAL_ITEM, PROTO_DATA, PROTO_RESOURCE_ITEM, PROTO_SCOPE_ITEM> {
    protected abstract PROTO_DATA createProtoData(Map<Resource, Map<InstrumentationScopeInfo, List<PROTO_SIGNAL_ITEM>>> map);

    protected abstract InstrumentationScopeInfo getInstrumentationScopeFromProto(PROTO_SCOPE_ITEM proto_scope_item);

    protected abstract InstrumentationScopeInfo getInstrumentationScopeInfo(SIGNAL_ITEM signal_item);

    protected abstract List<PROTO_RESOURCE_ITEM> getProtoResources(PROTO_DATA proto_data);

    protected abstract Resource getResourceFromProto(PROTO_RESOURCE_ITEM proto_resource_item);

    protected abstract Resource getResourceFromSignal(SIGNAL_ITEM signal_item);

    protected abstract List<PROTO_SCOPE_ITEM> getScopes(PROTO_RESOURCE_ITEM proto_resource_item);

    protected abstract List<PROTO_SIGNAL_ITEM> getSignalsFromProto(PROTO_SCOPE_ITEM proto_scope_item);

    protected abstract SIGNAL_ITEM protoToSignalItem(PROTO_SIGNAL_ITEM proto_signal_item, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo);

    protected abstract PROTO_SIGNAL_ITEM signalItemToProto(SIGNAL_ITEM signal_item);

    public PROTO_DATA toProto(Collection<SIGNAL_ITEM> collection) {
        final HashMap hashMap = new HashMap();
        collection.forEach(new Consumer() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.BaseProtoSignalsDataMapper$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BaseProtoSignalsDataMapper.this.m3913x8585383f(hashMap, obj);
            }
        });
        return createProtoData(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$toProto$0$io-opentelemetry-contrib-disk-buffering-internal-serialization-mapping-common-BaseProtoSignalsDataMapper, reason: not valid java name */
    /* synthetic */ void m3913x8585383f(Map map, Object obj) {
        Resource resourceFromSignal = getResourceFromSignal(obj);
        InstrumentationScopeInfo instrumentationScopeInfo = getInstrumentationScopeInfo(obj);
        Map map2 = (Map) map.get(resourceFromSignal);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(resourceFromSignal, map2);
        }
        List list = (List) map2.get(instrumentationScopeInfo);
        if (list == null) {
            list = new ArrayList();
            map2.put(instrumentationScopeInfo, list);
        }
        list.add(signalItemToProto(obj));
    }

    public List<SIGNAL_ITEM> fromProto(PROTO_DATA proto_data) {
        ArrayList arrayList = new ArrayList();
        for (PROTO_RESOURCE_ITEM proto_resource_item : getProtoResources(proto_data)) {
            Resource resourceFromProto = getResourceFromProto(proto_resource_item);
            for (PROTO_SCOPE_ITEM proto_scope_item : getScopes(proto_resource_item)) {
                InstrumentationScopeInfo instrumentationScopeFromProto = getInstrumentationScopeFromProto(proto_scope_item);
                Iterator<PROTO_SIGNAL_ITEM> it = getSignalsFromProto(proto_scope_item).iterator();
                while (it.hasNext()) {
                    arrayList.add(protoToSignalItem(it.next(), resourceFromProto, instrumentationScopeFromProto));
                }
            }
        }
        return arrayList;
    }

    protected io.opentelemetry.diskbuffering.proto.resource.v1.Resource resourceToProto(Resource resource) {
        return ResourceMapper.getInstance().mapToProto(resource);
    }

    protected Resource protoToResource(io.opentelemetry.diskbuffering.proto.resource.v1.Resource resource, String str) {
        ResourceMapper resourceMapper = ResourceMapper.getInstance();
        if (str.isEmpty()) {
            str = null;
        }
        return resourceMapper.mapToSdk(resource, str);
    }

    protected InstrumentationScopeInfo protoToInstrumentationScopeInfo(InstrumentationScope instrumentationScope, @Nullable String str) {
        InstrumentationScopeInfoBuilder builder = InstrumentationScopeInfo.builder(instrumentationScope.name);
        builder.setAttributes(protoToAttributes(instrumentationScope.attributes));
        if (!instrumentationScope.version.isEmpty()) {
            builder.setVersion(instrumentationScope.version);
        }
        if (str != null) {
            builder.setSchemaUrl(str);
        }
        return builder.build();
    }

    protected InstrumentationScope instrumentationScopeToProto(InstrumentationScopeInfo instrumentationScopeInfo) {
        InstrumentationScope.Builder name = new InstrumentationScope.Builder().name(instrumentationScopeInfo.getName());
        if (instrumentationScopeInfo.getVersion() != null) {
            name.version(instrumentationScopeInfo.getVersion());
        }
        name.attributes.addAll(attributesToProto(instrumentationScopeInfo.getAttributes()));
        return name.build();
    }

    private static List<KeyValue> attributesToProto(Attributes attributes) {
        return AttributesMapper.getInstance().attributesToProto(attributes);
    }

    private static Attributes protoToAttributes(List<KeyValue> list) {
        return AttributesMapper.getInstance().protoToAttributes(list);
    }
}
