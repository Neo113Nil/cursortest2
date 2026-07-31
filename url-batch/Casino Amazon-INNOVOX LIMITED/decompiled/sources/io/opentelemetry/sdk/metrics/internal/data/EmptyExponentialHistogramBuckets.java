package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class EmptyExponentialHistogramBuckets implements ExponentialHistogramBuckets {
    private static final Map<Integer, ExponentialHistogramBuckets> ZERO_BUCKETS = new ConcurrentHashMap();

    EmptyExponentialHistogramBuckets() {
    }

    public static ExponentialHistogramBuckets get(int i) {
        return ZERO_BUCKETS.computeIfAbsent(Integer.valueOf(i), new Function() { // from class: io.opentelemetry.sdk.metrics.internal.data.EmptyExponentialHistogramBuckets$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EmptyExponentialHistogramBuckets.lambda$get$0((Integer) obj);
            }
        });
    }

    static /* synthetic */ ExponentialHistogramBuckets lambda$get$0(Integer num) {
        return new AutoValue_EmptyExponentialHistogramBuckets(num.intValue(), 0, Collections.emptyList(), 0L);
    }
}
