package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.util.List;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public abstract class ImmutableExponentialHistogramBuckets implements ExponentialHistogramBuckets {
    ImmutableExponentialHistogramBuckets() {
    }

    public static ExponentialHistogramBuckets create(int i, int i2, List<Long> list) {
        return new AutoValue_ImmutableExponentialHistogramBuckets(i, i2, list, list.stream().mapToLong(new ToLongFunction() { // from class: io.opentelemetry.sdk.metrics.internal.data.ImmutableExponentialHistogramBuckets$$ExternalSyntheticLambda0
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long longValue;
                longValue = ((Long) obj).longValue();
                return longValue;
            }
        }).sum());
    }
}
