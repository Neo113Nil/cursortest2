package io.opentelemetry.api.incubator.config;

import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.opentelemetry.semconv.TelemetryAttributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class InstrumentationConfigUtil {
    @Nullable
    public static Map<String, String> peerServiceMapping(ConfigProvider configProvider) {
        List list = (List) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List structuredList;
                structuredList = ((DeclarativeConfigProperties) obj).getStructuredList("service_mapping");
                return structuredList;
            }
        }, "general", "peer");
        if (list == null) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        list.forEach(new Consumer() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InstrumentationConfigUtil.lambda$peerServiceMapping$1(linkedHashMap, (DeclarativeConfigProperties) obj);
            }
        });
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    static /* synthetic */ void lambda$peerServiceMapping$1(Map map, DeclarativeConfigProperties declarativeConfigProperties) {
        String string = declarativeConfigProperties.getString("peer");
        String string2 = declarativeConfigProperties.getString(NotificationCompat.CATEGORY_SERVICE);
        if (string == null || string2 == null) {
            return;
        }
        map.put(string, string2);
    }

    @Nullable
    public static List<String> httpClientRequestCapturedHeaders(ConfigProvider configProvider) {
        return (List) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List scalarList;
                scalarList = ((DeclarativeConfigProperties) obj).getScalarList("request_captured_headers", String.class);
                return scalarList;
            }
        }, "general", "http", "client");
    }

    @Nullable
    public static List<String> httpClientResponseCapturedHeaders(ConfigProvider configProvider) {
        return (List) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List scalarList;
                scalarList = ((DeclarativeConfigProperties) obj).getScalarList("response_captured_headers", String.class);
                return scalarList;
            }
        }, "general", "http", "client");
    }

    @Nullable
    public static List<String> httpServerRequestCapturedHeaders(ConfigProvider configProvider) {
        return (List) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List scalarList;
                scalarList = ((DeclarativeConfigProperties) obj).getScalarList("request_captured_headers", String.class);
                return scalarList;
            }
        }, "general", "http", "server");
    }

    @Nullable
    public static List<String> httpServerResponseCapturedHeaders(ConfigProvider configProvider) {
        return (List) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List scalarList;
                scalarList = ((DeclarativeConfigProperties) obj).getScalarList("response_captured_headers", String.class);
                return scalarList;
            }
        }, "general", "http", "server");
    }

    @Nullable
    public static DeclarativeConfigProperties javaInstrumentationConfig(ConfigProvider configProvider, final String str) {
        return (DeclarativeConfigProperties) getOrNull(configProvider, new Function() { // from class: io.opentelemetry.api.incubator.config.InstrumentationConfigUtil$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DeclarativeConfigProperties structured;
                structured = ((DeclarativeConfigProperties) obj).getStructured(str);
                return structured;
            }
        }, TelemetryAttributes.TelemetrySdkLanguageValues.JAVA);
    }

    @Nullable
    public static <T> T getOrNull(ConfigProvider configProvider, Function<DeclarativeConfigProperties, T> function, String... strArr) {
        DeclarativeConfigProperties instrumentationConfig = configProvider.getInstrumentationConfig();
        if (instrumentationConfig == null) {
            return null;
        }
        for (String str : strArr) {
            instrumentationConfig = instrumentationConfig.getStructured(str);
            if (instrumentationConfig == null) {
                return null;
            }
        }
        return function.apply(instrumentationConfig);
    }

    private InstrumentationConfigUtil() {
    }

    @Nullable
    public static <T> T getInstrumentationConfigModel(ConfigProvider configProvider, String str, ObjectMapper objectMapper, Class<T> cls) {
        DeclarativeConfigProperties javaInstrumentationConfig = javaInstrumentationConfig(configProvider, str);
        if (javaInstrumentationConfig == null) {
            return null;
        }
        return (T) objectMapper.convertValue(DeclarativeConfigProperties.toMap(javaInstrumentationConfig), cls);
    }
}
