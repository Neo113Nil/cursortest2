package io.opentelemetry.exporter.internal;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector;
import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregationUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class ExporterBuilderUtil {
    public static URI validateEndpoint(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            return uri;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: " + str, e);
        }
    }

    public static void configureExporterMemoryMode(ConfigProperties configProperties, Consumer<MemoryMode> consumer) {
        String string = configProperties.getString("otel.java.exporter.memory_mode");
        if (string == null) {
            return;
        }
        try {
            consumer.accept(MemoryMode.valueOf(string.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException e) {
            throw new ConfigurationException("Unrecognized memory mode: " + string, e);
        }
    }

    public static void configureHistogramDefaultAggregation(String str, Consumer<DefaultAggregationSelector> consumer) {
        if (AggregationUtil.aggregationName(Aggregation.base2ExponentialBucketHistogram()).equalsIgnoreCase(str)) {
            consumer.accept(DefaultAggregationSelector.getDefault().with(InstrumentType.HISTOGRAM, Aggregation.base2ExponentialBucketHistogram()));
        } else if (!AggregationUtil.aggregationName(Aggregation.explicitBucketHistogram()).equalsIgnoreCase(str)) {
            throw new ConfigurationException("Unrecognized default histogram aggregation: " + str);
        }
    }

    public static void configureOtlpAggregationTemporality(ConfigProperties configProperties, Consumer<AggregationTemporalitySelector> consumer) {
        AggregationTemporalitySelector lowMemory;
        String string = configProperties.getString("otel.exporter.otlp.metrics.temporality.preference");
        if (string == null) {
            return;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "lowmemory":
                lowMemory = AggregationTemporalitySelector.lowMemory();
                break;
            case "delta":
                lowMemory = AggregationTemporalitySelector.deltaPreferred();
                break;
            case "cumulative":
                lowMemory = AggregationTemporalitySelector.alwaysCumulative();
                break;
            default:
                throw new ConfigurationException("Unrecognized aggregation temporality: " + string);
        }
        consumer.accept(lowMemory);
    }

    public static void configureOtlpHistogramDefaultAggregation(ConfigProperties configProperties, Consumer<DefaultAggregationSelector> consumer) {
        String string = configProperties.getString("otel.exporter.otlp.metrics.default.histogram.aggregation");
        if (string != null) {
            configureHistogramDefaultAggregation(string, consumer);
        }
    }

    private ExporterBuilderUtil() {
    }
}
