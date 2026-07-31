package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.IncubatingExporterBuilderUtil;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.autoconfigure.spi.internal.DefaultConfigProperties;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class OtlpDeclarativeConfigUtil {
    public static String getStructuredConfigOtlpProtocol(DeclarativeConfigProperties declarativeConfigProperties) {
        return declarativeConfigProperties.getString("protocol", OtlpConfigUtil.PROTOCOL_HTTP_PROTOBUF);
    }

    public static void configureOtlpExporterBuilder(String str, DeclarativeConfigProperties declarativeConfigProperties, Consumer<ComponentLoader> consumer, Consumer<String> consumer2, final BiConsumer<String, String> biConsumer, Consumer<String> consumer3, Consumer<Duration> consumer4, Consumer<byte[]> consumer5, BiConsumer<byte[], byte[]> biConsumer2, Consumer<RetryPolicy> consumer6, Consumer<MemoryMode> consumer7, boolean z) {
        consumer.accept(declarativeConfigProperties.getComponentLoader());
        URL validateEndpoint = OtlpConfigUtil.validateEndpoint(declarativeConfigProperties.getString("endpoint"), z);
        if (validateEndpoint != null) {
            consumer2.accept(validateEndpoint.toString());
        }
        String string = declarativeConfigProperties.getString("headers_list");
        if (string != null) {
            OtlpConfigUtil.configureOtlpHeaders(DefaultConfigProperties.createFromMap(Collections.singletonMap("otel.exporter.otlp.headers", string)), str, biConsumer);
        }
        List<DeclarativeConfigProperties> structuredList = declarativeConfigProperties.getStructuredList("headers");
        if (structuredList != null) {
            structuredList.forEach(new Consumer() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpDeclarativeConfigUtil$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    OtlpDeclarativeConfigUtil.lambda$configureOtlpExporterBuilder$0(biConsumer, (DeclarativeConfigProperties) obj);
                }
            });
        }
        String string2 = declarativeConfigProperties.getString("compression");
        if (string2 != null) {
            consumer3.accept(string2);
        }
        if (declarativeConfigProperties.getInt("timeout") != null) {
            consumer4.accept(Duration.ofMillis(r0.intValue()));
        }
        String string3 = declarativeConfigProperties.getString("certificate_file");
        String string4 = declarativeConfigProperties.getString("client_key_file");
        String string5 = declarativeConfigProperties.getString("client_certificate_file");
        if (string4 != null && string5 == null) {
            throw new ConfigurationException("client_key_file provided without client_certificate_file - both client_key_file and client_certificate_file must be set");
        }
        if (string4 == null && string5 != null) {
            throw new ConfigurationException("client_certificate_file provided without client_key_file - both client_key_file and client_certificate_file must be set");
        }
        byte[] readFileBytes = OtlpConfigUtil.readFileBytes(string3);
        if (readFileBytes != null) {
            consumer5.accept(readFileBytes);
        }
        byte[] readFileBytes2 = OtlpConfigUtil.readFileBytes(string4);
        byte[] readFileBytes3 = OtlpConfigUtil.readFileBytes(string5);
        if (readFileBytes2 != null && readFileBytes3 != null) {
            biConsumer2.accept(readFileBytes2, readFileBytes3);
        }
        IncubatingExporterBuilderUtil.configureExporterMemoryMode(declarativeConfigProperties, consumer7);
    }

    static /* synthetic */ void lambda$configureOtlpExporterBuilder$0(BiConsumer biConsumer, DeclarativeConfigProperties declarativeConfigProperties) {
        String string = declarativeConfigProperties.getString("name");
        String string2 = declarativeConfigProperties.getString("value");
        if (string == null || string2 == null) {
            return;
        }
        biConsumer.accept(string, string2);
    }

    private OtlpDeclarativeConfigUtil() {
    }
}
