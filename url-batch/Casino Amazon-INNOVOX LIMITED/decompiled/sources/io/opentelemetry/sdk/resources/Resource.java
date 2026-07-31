package io.opentelemetry.sdk.resources;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.internal.StringUtils;
import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.semconv.TelemetryAttributes;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class Resource {
    private static final Resource DEFAULT;
    private static final Resource EMPTY;
    private static final String ERROR_MESSAGE_INVALID_CHARS = " should be a ASCII string with a length greater than 0 and not exceed 255 characters.";
    private static final String ERROR_MESSAGE_INVALID_VALUE = " should be a ASCII string with a length not exceed 255 characters.";
    private static final Resource MANDATORY;
    private static final int MAX_LENGTH = 255;
    private static final AttributeKey<String> SERVICE_NAME;
    private static final Resource TELEMETRY_SDK;
    private static final AttributeKey<String> TELEMETRY_SDK_LANGUAGE;
    private static final AttributeKey<String> TELEMETRY_SDK_NAME;
    private static final AttributeKey<String> TELEMETRY_SDK_VERSION;
    private static final Logger logger = Logger.getLogger(Resource.class.getName());

    public abstract Attributes getAttributes();

    @Nullable
    public abstract String getSchemaUrl();

    static {
        AttributeKey<String> stringKey = AttributeKey.stringKey("service.name");
        SERVICE_NAME = stringKey;
        AttributeKey<String> stringKey2 = AttributeKey.stringKey("telemetry.sdk.language");
        TELEMETRY_SDK_LANGUAGE = stringKey2;
        AttributeKey<String> stringKey3 = AttributeKey.stringKey("telemetry.sdk.name");
        TELEMETRY_SDK_NAME = stringKey3;
        AttributeKey<String> stringKey4 = AttributeKey.stringKey("telemetry.sdk.version");
        TELEMETRY_SDK_VERSION = stringKey4;
        EMPTY = create(Attributes.empty());
        Resource create = create(Attributes.of(stringKey, "unknown_service:java"));
        MANDATORY = create;
        Resource create2 = create(Attributes.builder().put((AttributeKey<AttributeKey<String>>) stringKey3, (AttributeKey<String>) "opentelemetry").put((AttributeKey<AttributeKey<String>>) stringKey2, (AttributeKey<String>) TelemetryAttributes.TelemetrySdkLanguageValues.JAVA).put((AttributeKey<AttributeKey<String>>) stringKey4, (AttributeKey<String>) "1.55.0").build());
        TELEMETRY_SDK = create2;
        DEFAULT = create.merge(create2);
    }

    public static Resource getDefault() {
        return DEFAULT;
    }

    public static Resource empty() {
        return EMPTY;
    }

    public static Resource create(Attributes attributes) {
        return create(attributes, null);
    }

    public static Resource create(Attributes attributes, @Nullable String str) {
        checkAttributes((Attributes) Objects.requireNonNull(attributes, "attributes"));
        return new AutoValue_Resource(str, attributes);
    }

    @Nullable
    public <T> T getAttribute(AttributeKey<T> attributeKey) {
        return (T) getAttributes().get(attributeKey);
    }

    public Resource merge(@Nullable Resource resource) {
        if (resource == null || resource == EMPTY) {
            return this;
        }
        AttributesBuilder builder = Attributes.builder();
        builder.putAll(getAttributes());
        builder.putAll(resource.getAttributes());
        if (resource.getSchemaUrl() == null) {
            return create(builder.build(), getSchemaUrl());
        }
        if (getSchemaUrl() == null) {
            return create(builder.build(), resource.getSchemaUrl());
        }
        if (!resource.getSchemaUrl().equals(getSchemaUrl())) {
            logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + getSchemaUrl() + " Schema 2: " + resource.getSchemaUrl());
            return create(builder.build(), null);
        }
        return create(builder.build(), getSchemaUrl());
    }

    private static void checkAttributes(Attributes attributes) {
        attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.resources.Resource$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Resource.lambda$checkAttributes$0((AttributeKey) obj, obj2);
            }
        });
    }

    static /* synthetic */ void lambda$checkAttributes$0(AttributeKey attributeKey, Object obj) {
        Utils.checkArgument(isValidAndNotEmpty(attributeKey), "Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
        Objects.requireNonNull(obj, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }

    private static boolean isValid(String str) {
        return str.length() <= 255 && StringUtils.isPrintableString(str);
    }

    private static boolean isValidAndNotEmpty(AttributeKey<?> attributeKey) {
        return !attributeKey.getKey().isEmpty() && isValid(attributeKey.getKey());
    }

    public static ResourceBuilder builder() {
        return new ResourceBuilder();
    }

    public ResourceBuilder toBuilder() {
        ResourceBuilder putAll = builder().putAll(this);
        if (getSchemaUrl() != null) {
            putAll.setSchemaUrl(getSchemaUrl());
        }
        return putAll;
    }

    Resource() {
    }
}
