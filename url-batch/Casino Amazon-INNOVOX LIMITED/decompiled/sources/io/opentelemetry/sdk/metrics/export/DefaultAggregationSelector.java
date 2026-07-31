package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregationUtil;
import java.util.Objects;
import java.util.StringJoiner;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface DefaultAggregationSelector {
    Aggregation getDefaultAggregation(InstrumentType instrumentType);

    static DefaultAggregationSelector getDefault() {
        return new DefaultAggregationSelector() { // from class: io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector$$ExternalSyntheticLambda1
            @Override // io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector
            public final Aggregation getDefaultAggregation(InstrumentType instrumentType) {
                Aggregation defaultAggregation;
                defaultAggregation = Aggregation.defaultAggregation();
                return defaultAggregation;
            }
        };
    }

    default DefaultAggregationSelector with(final InstrumentType instrumentType, final Aggregation aggregation) {
        Objects.requireNonNull(instrumentType, "instrumentType");
        Objects.requireNonNull(aggregation, "aggregation");
        return new DefaultAggregationSelector() { // from class: io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector
            public final Aggregation getDefaultAggregation(InstrumentType instrumentType2) {
                return DefaultAggregationSelector.lambda$with$1(DefaultAggregationSelector.this, instrumentType, aggregation, instrumentType2);
            }
        };
    }

    static /* synthetic */ Aggregation lambda$with$1(DefaultAggregationSelector _this, InstrumentType instrumentType, Aggregation aggregation, InstrumentType instrumentType2) {
        return instrumentType2 == instrumentType ? aggregation : _this.getDefaultAggregation(instrumentType2);
    }

    static String asString(DefaultAggregationSelector defaultAggregationSelector) {
        StringJoiner stringJoiner = new StringJoiner(", ", "DefaultAggregationSelector{", "}");
        for (InstrumentType instrumentType : InstrumentType.values()) {
            stringJoiner.add(instrumentType.name() + "=" + AggregationUtil.aggregationName(defaultAggregationSelector.getDefaultAggregation(instrumentType)));
        }
        return stringJoiner.toString();
    }
}
