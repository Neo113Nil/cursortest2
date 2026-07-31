package io.opentelemetry.api.metrics;

import java.util.List;

/* loaded from: classes3.dex */
public interface DoubleHistogramBuilder {
    DoubleHistogram build();

    LongHistogramBuilder ofLongs();

    DoubleHistogramBuilder setDescription(String str);

    default DoubleHistogramBuilder setExplicitBucketBoundariesAdvice(List<Double> list) {
        return this;
    }

    DoubleHistogramBuilder setUnit(String str);
}
