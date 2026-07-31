package io.opentelemetry.sdk.metrics.internal.exemplar;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import java.util.List;

/* loaded from: classes3.dex */
class LongToDoubleExemplarReservoir<T extends ExemplarData> implements ExemplarReservoir<T> {
    private final ExemplarReservoir<T> delegate;

    LongToDoubleExemplarReservoir(ExemplarReservoir<T> exemplarReservoir) {
        this.delegate = exemplarReservoir;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir
    public void offerDoubleMeasurement(double d, Attributes attributes, Context context) {
        this.delegate.offerDoubleMeasurement(d, attributes, context);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir
    public void offerLongMeasurement(long j, Attributes attributes, Context context) {
        offerDoubleMeasurement(j, attributes, context);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir
    public List<T> collectAndReset(Attributes attributes) {
        return this.delegate.collectAndReset(attributes);
    }
}
