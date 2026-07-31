package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common;

import io.opentelemetry.diskbuffering.proto.resource.v1.Resource;
import io.opentelemetry.sdk.resources.ResourceBuilder;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ResourceMapper {
    private static final ResourceMapper INSTANCE = new ResourceMapper();

    public static ResourceMapper getInstance() {
        return INSTANCE;
    }

    public Resource mapToProto(io.opentelemetry.sdk.resources.Resource resource) {
        return new Resource.Builder().attributes(AttributesMapper.getInstance().attributesToProto(resource.getAttributes())).build();
    }

    public io.opentelemetry.sdk.resources.Resource mapToSdk(Resource resource, @Nullable String str) {
        ResourceBuilder builder = io.opentelemetry.sdk.resources.Resource.builder();
        if (str != null) {
            builder.setSchemaUrl(str);
        }
        builder.putAll(AttributesMapper.getInstance().protoToAttributes(resource.attributes));
        return builder.build();
    }
}
