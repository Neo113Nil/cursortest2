package io.opentelemetry.api.metrics;

import java.util.List;

/* loaded from: classes3.dex */
public interface LongHistogramBuilder {
    LongHistogram build();

    LongHistogramBuilder setDescription(String str);

    default LongHistogramBuilder setExplicitBucketBoundariesAdvice(List<Long> list) {
        return this;
    }

    LongHistogramBuilder setUnit(String str);
}
