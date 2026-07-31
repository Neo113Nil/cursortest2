package io.opentelemetry.exporter.otlp.internal;

import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class OtlpUserAgent {
    private static final String userAgent = "OTel-OTLP-Exporter-Java/1.55.0";

    public static String getUserAgent() {
        return userAgent;
    }

    public static void addUserAgentHeader(BiConsumer<String, String> biConsumer) {
        biConsumer.accept("User-Agent", userAgent);
    }

    private OtlpUserAgent() {
    }
}
