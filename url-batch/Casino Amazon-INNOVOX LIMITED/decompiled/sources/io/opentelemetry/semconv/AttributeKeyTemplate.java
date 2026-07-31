package io.opentelemetry.semconv;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class AttributeKeyTemplate<T> {
    private final Function<String, AttributeKey<T>> keyBuilder;
    private final ConcurrentMap<String, AttributeKey<T>> keysCache = new ConcurrentHashMap(1);
    private final String prefix;

    private AttributeKeyTemplate(String str, Function<String, AttributeKey<T>> function) {
        this.prefix = str;
        this.keyBuilder = function;
    }

    public static AttributeKeyTemplate<String> stringKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey stringKey;
                stringKey = AttributeKey.stringKey((String) obj);
                return stringKey;
            }
        });
    }

    public static AttributeKeyTemplate<List<String>> stringArrayKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey stringArrayKey;
                stringArrayKey = AttributeKey.stringArrayKey((String) obj);
                return stringArrayKey;
            }
        });
    }

    public static AttributeKeyTemplate<Boolean> booleanKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey booleanKey;
                booleanKey = AttributeKey.booleanKey((String) obj);
                return booleanKey;
            }
        });
    }

    public static AttributeKeyTemplate<List<Boolean>> booleanArrayKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey booleanArrayKey;
                booleanArrayKey = AttributeKey.booleanArrayKey((String) obj);
                return booleanArrayKey;
            }
        });
    }

    public static AttributeKeyTemplate<Long> longKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey longKey;
                longKey = AttributeKey.longKey((String) obj);
                return longKey;
            }
        });
    }

    public static AttributeKeyTemplate<List<Long>> longArrayKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey longArrayKey;
                longArrayKey = AttributeKey.longArrayKey((String) obj);
                return longArrayKey;
            }
        });
    }

    public static AttributeKeyTemplate<Double> doubleKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey doubleKey;
                doubleKey = AttributeKey.doubleKey((String) obj);
                return doubleKey;
            }
        });
    }

    public static AttributeKeyTemplate<List<Double>> doubleArrayKeyTemplate(String str) {
        return new AttributeKeyTemplate<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey doubleArrayKey;
                doubleArrayKey = AttributeKey.doubleArrayKey((String) obj);
                return doubleArrayKey;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AttributeKey<T> createAttributeKey(String str) {
        return this.keyBuilder.apply(this.prefix + "." + str);
    }

    public AttributeKey<T> getAttributeKey(String str) {
        return this.keysCache.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AttributeKey createAttributeKey;
                createAttributeKey = AttributeKeyTemplate.this.createAttributeKey((String) obj);
                return createAttributeKey;
            }
        });
    }
}
