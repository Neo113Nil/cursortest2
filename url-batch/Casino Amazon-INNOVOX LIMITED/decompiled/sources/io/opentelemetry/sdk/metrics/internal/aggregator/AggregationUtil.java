package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.metrics.Aggregation;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class AggregationUtil {
    private static final String AGGREGATION_BASE2_EXPONENTIAL_HISTOGRAM = "base2_exponential_bucket_histogram";
    private static final String AGGREGATION_DEFAULT = "default";
    private static final String AGGREGATION_DROP = "drop";
    private static final String AGGREGATION_EXPLICIT_BUCKET_HISTOGRAM = "explicit_bucket_histogram";
    private static final String AGGREGATION_LAST_VALUE = "last_value";
    private static final String AGGREGATION_SUM = "sum";
    private static final Map<String, Aggregation> aggregationByName;
    private static final Map<Class<? extends Aggregation>, String> nameByAggregation;

    static {
        HashMap hashMap = new HashMap();
        aggregationByName = hashMap;
        hashMap.put("default", Aggregation.defaultAggregation());
        hashMap.put(AGGREGATION_SUM, Aggregation.sum());
        hashMap.put(AGGREGATION_LAST_VALUE, Aggregation.lastValue());
        hashMap.put(AGGREGATION_DROP, Aggregation.drop());
        hashMap.put(AGGREGATION_EXPLICIT_BUCKET_HISTOGRAM, Aggregation.explicitBucketHistogram());
        hashMap.put(AGGREGATION_BASE2_EXPONENTIAL_HISTOGRAM, Aggregation.base2ExponentialBucketHistogram());
        HashMap hashMap2 = new HashMap();
        nameByAggregation = hashMap2;
        hashMap2.put(Aggregation.defaultAggregation().getClass(), "default");
        hashMap2.put(Aggregation.sum().getClass(), AGGREGATION_SUM);
        hashMap2.put(Aggregation.lastValue().getClass(), AGGREGATION_LAST_VALUE);
        hashMap2.put(Aggregation.drop().getClass(), AGGREGATION_DROP);
        hashMap2.put(Aggregation.explicitBucketHistogram().getClass(), AGGREGATION_EXPLICIT_BUCKET_HISTOGRAM);
        hashMap2.put(Aggregation.base2ExponentialBucketHistogram().getClass(), AGGREGATION_BASE2_EXPONENTIAL_HISTOGRAM);
    }

    private AggregationUtil() {
    }

    public static Aggregation forName(String str) {
        Aggregation aggregation = aggregationByName.get(str.toLowerCase(Locale.ROOT));
        if (aggregation != null) {
            return aggregation;
        }
        throw new IllegalArgumentException("Unrecognized aggregation name " + str);
    }

    public static String aggregationName(Aggregation aggregation) {
        String str = nameByAggregation.get(aggregation.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation " + aggregation.getClass().getName());
    }
}
