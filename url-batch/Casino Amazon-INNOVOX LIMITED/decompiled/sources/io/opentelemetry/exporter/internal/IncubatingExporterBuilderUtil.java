package io.opentelemetry.exporter.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector;
import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregationUtil;
import java.util.Locale;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class IncubatingExporterBuilderUtil {
    public static void configureExporterMemoryMode(DeclarativeConfigProperties declarativeConfigProperties, Consumer<MemoryMode> consumer) {
        String string = declarativeConfigProperties.getString("memory_mode");
        if (string == null) {
            return;
        }
        try {
            consumer.accept(MemoryMode.valueOf(string.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException e) {
            throw new ConfigurationException("Unrecognized memory_mode: " + string, e);
        }
    }

    public static void configureOtlpAggregationTemporality(DeclarativeConfigProperties declarativeConfigProperties, Consumer<AggregationTemporalitySelector> consumer) {
        AggregationTemporalitySelector lowMemory;
        String string = declarativeConfigProperties.getString("temporality_preference");
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
                throw new ConfigurationException("Unrecognized temporality_preference: " + string);
        }
        consumer.accept(lowMemory);
    }

    public static void configureOtlpHistogramDefaultAggregation(DeclarativeConfigProperties declarativeConfigProperties, Consumer<DefaultAggregationSelector> consumer) {
        String string = declarativeConfigProperties.getString("default_histogram_aggregation");
        if (string == null) {
            return;
        }
        if (AggregationUtil.aggregationName(Aggregation.base2ExponentialBucketHistogram()).equalsIgnoreCase(string)) {
            consumer.accept(DefaultAggregationSelector.getDefault().with(InstrumentType.HISTOGRAM, Aggregation.base2ExponentialBucketHistogram()));
        } else if (!AggregationUtil.aggregationName(Aggregation.explicitBucketHistogram()).equalsIgnoreCase(string)) {
            throw new ConfigurationException("Unrecognized default_histogram_aggregation: " + string);
        }
    }

    private IncubatingExporterBuilderUtil() {
    }
}
