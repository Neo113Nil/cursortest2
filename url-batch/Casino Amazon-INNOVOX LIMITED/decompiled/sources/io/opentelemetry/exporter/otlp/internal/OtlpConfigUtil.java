package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.ExporterBuilderUtil;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class OtlpConfigUtil {
    public static final String DATA_TYPE_LOGS = "logs";
    public static final String DATA_TYPE_METRICS = "metrics";
    public static final String DATA_TYPE_TRACES = "traces";
    public static final String PROTOCOL_GRPC = "grpc";
    public static final String PROTOCOL_HTTP_PROTOBUF = "http/protobuf";
    private static final Logger logger = Logger.getLogger(OtlpConfigUtil.class.getName());

    public static String getOtlpProtocol(String str, ConfigProperties configProperties) {
        String string = configProperties.getString("otel.exporter.otlp." + str + ".protocol");
        return string != null ? string : configProperties.getString("otel.exporter.otlp.protocol", PROTOCOL_GRPC);
    }

    public static void configureOtlpExporterBuilder(String str, ConfigProperties configProperties, Consumer<ComponentLoader> consumer, Consumer<String> consumer2, BiConsumer<String, String> biConsumer, Consumer<String> consumer3, Consumer<Duration> consumer4, Consumer<byte[]> consumer5, BiConsumer<byte[], byte[]> biConsumer2, Consumer<RetryPolicy> consumer6, Consumer<MemoryMode> consumer7) {
        consumer.accept(configProperties.getComponentLoader());
        boolean equals = getOtlpProtocol(str, configProperties).equals(PROTOCOL_HTTP_PROTOBUF);
        URL validateEndpoint = validateEndpoint(configProperties.getString("otel.exporter.otlp." + str + ".endpoint"), equals);
        if (validateEndpoint != null) {
            if (validateEndpoint.getPath().isEmpty()) {
                validateEndpoint = createUrl(validateEndpoint, "/");
            }
        } else {
            validateEndpoint = validateEndpoint(configProperties.getString("otel.exporter.otlp.endpoint"), equals);
            if (validateEndpoint != null && equals) {
                String path = validateEndpoint.getPath();
                if (!path.endsWith("/")) {
                    path = path + "/";
                }
                validateEndpoint = createUrl(validateEndpoint, path + signalPath(str));
            }
        }
        if (validateEndpoint != null) {
            consumer2.accept(validateEndpoint.toString());
        }
        configureOtlpHeaders(configProperties, str, biConsumer);
        String string = configProperties.getString("otel.exporter.otlp." + str + ".compression");
        if (string == null) {
            string = configProperties.getString("otel.exporter.otlp.compression");
        }
        if (string != null) {
            consumer3.accept(string);
        }
        Duration duration = configProperties.getDuration("otel.exporter.otlp." + str + ".timeout");
        if (duration == null) {
            duration = configProperties.getDuration("otel.exporter.otlp.timeout");
        }
        if (duration != null) {
            consumer4.accept(duration);
        }
        String string2 = configProperties.getString(determinePropertyByType(configProperties, "otel.exporter.otlp", str, "certificate"));
        String string3 = configProperties.getString(determinePropertyByType(configProperties, "otel.exporter.otlp", str, "client.key"));
        String string4 = configProperties.getString(determinePropertyByType(configProperties, "otel.exporter.otlp", str, "client.certificate"));
        if (string3 != null && string4 == null) {
            throw new ConfigurationException("client key provided without client certificate - both client key and client certificate must be set");
        }
        if (string3 == null && string4 != null) {
            throw new ConfigurationException("client certificate provided without client key - both client key and client_certificate must be set");
        }
        byte[] readFileBytes = readFileBytes(string2);
        if (readFileBytes != null) {
            consumer5.accept(readFileBytes);
        }
        byte[] readFileBytes2 = readFileBytes(string3);
        byte[] readFileBytes3 = readFileBytes(string4);
        if (readFileBytes2 != null && readFileBytes3 != null) {
            biConsumer2.accept(readFileBytes2, readFileBytes3);
        }
        Boolean bool = configProperties.getBoolean("otel.java.exporter.otlp.retry.disabled");
        if (bool != null && bool.booleanValue()) {
            consumer6.accept(null);
        }
        ExporterBuilderUtil.configureExporterMemoryMode(configProperties, consumer7);
    }

    static void configureOtlpHeaders(ConfigProperties configProperties, String str, BiConsumer<String, String> biConsumer) {
        Map<String, String> map = configProperties.getMap("otel.exporter.otlp." + str + ".headers");
        if (map.isEmpty()) {
            map = configProperties.getMap("otel.exporter.otlp.headers");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            try {
                biConsumer.accept(key, URLDecoder.decode(value, StandardCharsets.UTF_8.displayName()));
            } catch (Exception e) {
                throw new ConfigurationException("Cannot decode header value: " + value, e);
            }
        }
    }

    private static URL createUrl(URL url, String str) {
        try {
            return new URL(url, str);
        } catch (MalformedURLException e) {
            throw new ConfigurationException("Unexpected exception creating URL.", e);
        }
    }

    @Nullable
    static URL validateEndpoint(@Nullable String str, boolean z) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                throw new ConfigurationException("OTLP endpoint scheme must be http or https: " + url.getProtocol());
            }
            if (url.getQuery() != null) {
                throw new ConfigurationException("OTLP endpoint must not have a query string: " + url.getQuery());
            }
            if (url.getRef() != null) {
                throw new ConfigurationException("OTLP endpoint must not have a fragment: " + url.getRef());
            }
            if (!z && !url.getPath().isEmpty() && !url.getPath().equals("/")) {
                throw new ConfigurationException("OTLP endpoint must not have a path: " + url.getPath());
            }
            if ((url.getPort() == 4317 && z) || (url.getPort() == 4318 && !z)) {
                int i = z ? 4318 : 4317;
                String str2 = z ? PROTOCOL_HTTP_PROTOBUF : PROTOCOL_GRPC;
                logger.warning("OTLP exporter endpoint port is likely incorrect for protocol version \"" + str2 + "\". The endpoint " + url + " has port " + url.getPort() + ". Typically, the \"" + str2 + "\" version of OTLP uses port " + i + ".");
            }
            return url;
        } catch (MalformedURLException e) {
            throw new ConfigurationException("OTLP endpoint must be a valid URL: " + str, e);
        }
    }

    @Nullable
    static byte[] readFileBytes(@Nullable String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new ConfigurationException("Invalid OTLP certificate/key path: " + str);
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            } finally {
            }
        } catch (IOException e) {
            throw new ConfigurationException("Error reading content of file (" + str + ")", e);
        }
    }

    private static String determinePropertyByType(ConfigProperties configProperties, String str, String str2, String str3) {
        String str4 = str + "." + str2 + "." + str3;
        return configContainsKey(configProperties, str4) ? str4 : str + "." + str3;
    }

    private static boolean configContainsKey(ConfigProperties configProperties, String str) {
        return configProperties.getString(str) != null;
    }

    private static String signalPath(String str) {
        str.hashCode();
        switch (str) {
            case "traces":
                return "v1/traces";
            case "logs":
                return "v1/logs";
            case "metrics":
                return "v1/metrics";
            default:
                throw new IllegalArgumentException("Cannot determine signal path for unrecognized data type: " + str);
        }
    }

    private OtlpConfigUtil() {
    }
}
