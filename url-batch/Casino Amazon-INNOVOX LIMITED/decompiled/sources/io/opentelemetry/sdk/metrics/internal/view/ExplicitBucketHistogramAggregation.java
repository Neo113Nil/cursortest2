package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.aggregator.DoubleExplicitBucketHistogramAggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.ExplicitBucketHistogramUtils;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarFilter;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class ExplicitBucketHistogramAggregation implements Aggregation, AggregatorFactory {
    private static final Aggregation DEFAULT = new ExplicitBucketHistogramAggregation(ExplicitBucketHistogramUtils.DEFAULT_HISTOGRAM_BUCKET_BOUNDARIES);
    private final List<Double> bucketBoundaries;
    private final double[] bucketBoundaryArray;

    public static Aggregation getDefault() {
        return DEFAULT;
    }

    public static Aggregation create(List<Double> list) {
        return new ExplicitBucketHistogramAggregation(list);
    }

    private ExplicitBucketHistogramAggregation(List<Double> list) {
        this.bucketBoundaries = list;
        this.bucketBoundaryArray = ExplicitBucketHistogramUtils.createBoundaryArray(list);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public <T extends PointData, U extends ExemplarData> Aggregator<T, U> createAggregator(InstrumentDescriptor instrumentDescriptor, final ExemplarFilter exemplarFilter, MemoryMode memoryMode) {
        return new DoubleExplicitBucketHistogramAggregator(this.bucketBoundaryArray, new Supplier() { // from class: io.opentelemetry.sdk.metrics.internal.view.ExplicitBucketHistogramAggregation$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ExplicitBucketHistogramAggregation.this.m3965x50def6e0(exemplarFilter);
            }
        }, memoryMode);
    }

    /* renamed from: lambda$createAggregator$0$io-opentelemetry-sdk-metrics-internal-view-ExplicitBucketHistogramAggregation, reason: not valid java name */
    /* synthetic */ ExemplarReservoir m3965x50def6e0(ExemplarFilter exemplarFilter) {
        return ExemplarReservoir.filtered(exemplarFilter, ExemplarReservoir.longToDouble(ExemplarReservoir.histogramBucketReservoir(Clock.getDefault(), this.bucketBoundaries)));
    }

    /* renamed from: io.opentelemetry.sdk.metrics.internal.view.ExplicitBucketHistogramAggregation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$metrics$InstrumentType;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            $SwitchMap$io$opentelemetry$sdk$metrics$InstrumentType = iArr;
            try {
                iArr[InstrumentType.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$InstrumentType[InstrumentType.HISTOGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public boolean isCompatibleWithInstrument(InstrumentDescriptor instrumentDescriptor) {
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$metrics$InstrumentType[instrumentDescriptor.getType().ordinal()];
        return i == 1 || i == 2;
    }

    public String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.bucketBoundaries.toString() + ")";
    }
}
