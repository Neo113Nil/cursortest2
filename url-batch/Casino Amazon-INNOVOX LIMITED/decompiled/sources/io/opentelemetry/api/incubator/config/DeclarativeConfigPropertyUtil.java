package io.opentelemetry.api.incubator.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class DeclarativeConfigPropertyUtil {
    private static final List<BiFunction<String, DeclarativeConfigProperties, Object>> valueResolvers = Arrays.asList(new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda3
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object string;
            string = DeclarativeConfigPropertyUtil.getString((String) obj, (DeclarativeConfigProperties) obj2);
            return string;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda5
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object obj3;
            obj3 = DeclarativeConfigPropertyUtil.getBoolean((String) obj, (DeclarativeConfigProperties) obj2);
            return obj3;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda6
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object obj3;
            obj3 = DeclarativeConfigPropertyUtil.getLong((String) obj, (DeclarativeConfigProperties) obj2);
            return obj3;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda7
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object obj3;
            obj3 = DeclarativeConfigPropertyUtil.getDouble((String) obj, (DeclarativeConfigProperties) obj2);
            return obj3;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda8
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object stringList;
            stringList = DeclarativeConfigPropertyUtil.getStringList((String) obj, (DeclarativeConfigProperties) obj2);
            return stringList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda9
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object booleanList;
            booleanList = DeclarativeConfigPropertyUtil.getBooleanList((String) obj, (DeclarativeConfigProperties) obj2);
            return booleanList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda10
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object longList;
            longList = DeclarativeConfigPropertyUtil.getLongList((String) obj, (DeclarativeConfigProperties) obj2);
            return longList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda11
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object doubleList;
            doubleList = DeclarativeConfigPropertyUtil.getDoubleList((String) obj, (DeclarativeConfigProperties) obj2);
            return doubleList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda8
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object stringList;
            stringList = DeclarativeConfigPropertyUtil.getStringList((String) obj, (DeclarativeConfigProperties) obj2);
            return stringList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda1
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object structuredList;
            structuredList = DeclarativeConfigPropertyUtil.getStructuredList((String) obj, (DeclarativeConfigProperties) obj2);
            return structuredList;
        }
    }, new BiFunction() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda4
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            Object structured;
            structured = DeclarativeConfigPropertyUtil.getStructured((String) obj, (DeclarativeConfigProperties) obj2);
            return structured;
        }
    });

    private DeclarativeConfigPropertyUtil() {
    }

    static Map<String, Object> toMap(DeclarativeConfigProperties declarativeConfigProperties) {
        HashMap hashMap = new HashMap(declarativeConfigProperties.getPropertyKeys().size());
        for (String str : declarativeConfigProperties.getPropertyKeys()) {
            hashMap.put(str, resolveValue(str, declarativeConfigProperties));
        }
        return hashMap;
    }

    @Nullable
    private static Object resolveValue(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        Object apply;
        int i = 0;
        while (true) {
            List<BiFunction<String, DeclarativeConfigProperties, Object>> list = valueResolvers;
            if (i >= list.size()) {
                return null;
            }
            try {
                apply = list.get(i).apply(str, declarativeConfigProperties);
            } catch (DeclarativeConfigException unused) {
            }
            if (apply != null) {
                return apply;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getString(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getBoolean(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getBoolean(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getLong(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getLong(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getDouble(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getDouble(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getStringList(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getScalarList(str, String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getBooleanList(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getScalarList(str, Boolean.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getLongList(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getScalarList(str, Long.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getDoubleList(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getScalarList(str, Double.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getStructuredList(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return Optional.ofNullable(declarativeConfigProperties.getStructuredList(str)).map(new Function() { // from class: io.opentelemetry.api.incubator.config.DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DeclarativeConfigPropertyUtil.lambda$getStructuredList$0((List) obj);
            }
        }).orElse(null);
    }

    static /* synthetic */ List lambda$getStructuredList$0(List list) {
        return (List) list.stream().map(new DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda0()).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Object getStructured(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return Optional.ofNullable(declarativeConfigProperties.getStructured(str)).map(new DeclarativeConfigPropertyUtil$$ExternalSyntheticLambda0()).orElse(null);
    }
}
