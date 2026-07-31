package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorage;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface CardinalityLimitSelector {
    int getCardinalityLimit(InstrumentType instrumentType);

    static CardinalityLimitSelector defaultCardinalityLimitSelector() {
        return new CardinalityLimitSelector() { // from class: io.opentelemetry.sdk.metrics.export.CardinalityLimitSelector$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.sdk.metrics.export.CardinalityLimitSelector
            public final int getCardinalityLimit(InstrumentType instrumentType) {
                int i;
                i = MetricStorage.DEFAULT_MAX_CARDINALITY;
                return i;
            }
        };
    }
}
