package io.opentelemetry.sdk.metrics;

import io.opentelemetry.sdk.metrics.internal.view.Base2ExponentialHistogramAggregation;
import io.opentelemetry.sdk.metrics.internal.view.DefaultAggregation;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;
import io.opentelemetry.sdk.metrics.internal.view.ExplicitBucketHistogramAggregation;
import io.opentelemetry.sdk.metrics.internal.view.LastValueAggregation;
import io.opentelemetry.sdk.metrics.internal.view.SumAggregation;
import java.util.List;

/* loaded from: classes3.dex */
public interface Aggregation {
    static Aggregation drop() {
        return DropAggregation.getInstance();
    }

    static Aggregation defaultAggregation() {
        return DefaultAggregation.getInstance();
    }

    static Aggregation sum() {
        return SumAggregation.getInstance();
    }

    static Aggregation lastValue() {
        return LastValueAggregation.getInstance();
    }

    static Aggregation explicitBucketHistogram() {
        return ExplicitBucketHistogramAggregation.getDefault();
    }

    static Aggregation explicitBucketHistogram(List<Double> list) {
        return ExplicitBucketHistogramAggregation.create(list);
    }

    static Aggregation base2ExponentialBucketHistogram() {
        return Base2ExponentialHistogramAggregation.getDefault();
    }

    static Aggregation base2ExponentialBucketHistogram(int i, int i2) {
        return Base2ExponentialHistogramAggregation.create(i, i2);
    }
}
