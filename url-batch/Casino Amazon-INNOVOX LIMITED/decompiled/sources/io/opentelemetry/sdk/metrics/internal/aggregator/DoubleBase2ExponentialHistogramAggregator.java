package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.data.EmptyExponentialHistogramBuckets;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableExponentialHistogramData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableExponentialHistogramPointData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableMetricData;
import io.opentelemetry.sdk.metrics.internal.data.MutableExponentialHistogramBuckets;
import io.opentelemetry.sdk.metrics.internal.data.MutableExponentialHistogramPointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class DoubleBase2ExponentialHistogramAggregator implements Aggregator<ExponentialHistogramPointData, DoubleExemplarData> {
    private final int maxBuckets;
    private final int maxScale;
    private final MemoryMode memoryMode;
    private final Supplier<ExemplarReservoir<DoubleExemplarData>> reservoirSupplier;

    public DoubleBase2ExponentialHistogramAggregator(Supplier<ExemplarReservoir<DoubleExemplarData>> supplier, int i, int i2, MemoryMode memoryMode) {
        this.reservoirSupplier = supplier;
        this.maxBuckets = i;
        this.maxScale = i2;
        this.memoryMode = memoryMode;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public AggregatorHandle<ExponentialHistogramPointData, DoubleExemplarData> createHandle() {
        return new Handle(this.reservoirSupplier.get(), this.maxBuckets, this.maxScale, this.memoryMode);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public MetricData toMetricData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, MetricDescriptor metricDescriptor, Collection<ExponentialHistogramPointData> collection, AggregationTemporality aggregationTemporality) {
        return ImmutableMetricData.createExponentialHistogram(resource, instrumentationScopeInfo, metricDescriptor.getName(), metricDescriptor.getDescription(), metricDescriptor.getSourceInstrument().getUnit(), ImmutableExponentialHistogramData.create(aggregationTemporality, collection));
    }

    static final class Handle extends AggregatorHandle<ExponentialHistogramPointData, DoubleExemplarData> {
        private long count;
        private int currentScale;
        private double max;
        private final int maxBuckets;
        private final int maxScale;
        private final MemoryMode memoryMode;
        private double min;

        @Nullable
        private DoubleBase2ExponentialHistogramBuckets negativeBuckets;

        @Nullable
        private DoubleBase2ExponentialHistogramBuckets positiveBuckets;

        @Nullable
        private final MutableExponentialHistogramPointData reusablePoint;
        private double sum;
        private long zeroCount;

        Handle(ExemplarReservoir<DoubleExemplarData> exemplarReservoir, int i, int i2, MemoryMode memoryMode) {
            super(exemplarReservoir);
            this.maxBuckets = i;
            this.maxScale = i2;
            this.sum = 0.0d;
            this.zeroCount = 0L;
            this.min = Double.MAX_VALUE;
            this.max = -1.0d;
            this.count = 0L;
            this.currentScale = i2;
            this.reusablePoint = memoryMode == MemoryMode.REUSABLE_DATA ? new MutableExponentialHistogramPointData() : null;
            this.memoryMode = memoryMode;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public synchronized ExponentialHistogramPointData doAggregateThenMaybeReset(long j, long j2, Attributes attributes, List<DoubleExemplarData> list, boolean z) {
            long j3;
            boolean z2;
            ExponentialHistogramPointData exponentialHistogramPointData;
            MutableExponentialHistogramPointData mutableExponentialHistogramPointData = this.reusablePoint;
            if (mutableExponentialHistogramPointData == null) {
                int i = this.currentScale;
                double d = this.sum;
                long j4 = this.zeroCount;
                long j5 = this.count;
                exponentialHistogramPointData = ImmutableExponentialHistogramPointData.create(i, d, j4, j5 > 0, this.min, j5 > 0, this.max, resolveBuckets(this.positiveBuckets, i, z, null), resolveBuckets(this.negativeBuckets, this.currentScale, z, null), j, j2, attributes, list);
            } else {
                int i2 = this.currentScale;
                double d2 = this.sum;
                long j6 = this.zeroCount;
                long j7 = this.count;
                if (j7 > 0) {
                    j3 = j7;
                    z2 = true;
                } else {
                    j3 = j7;
                    z2 = false;
                }
                exponentialHistogramPointData = mutableExponentialHistogramPointData.set(i2, d2, j6, z2, this.min, j3 > 0, this.max, resolveBuckets(this.positiveBuckets, i2, z, mutableExponentialHistogramPointData.getPositiveBuckets()), resolveBuckets(this.negativeBuckets, this.currentScale, z, this.reusablePoint.getNegativeBuckets()), j, j2, attributes, list);
            }
            if (z) {
                this.sum = 0.0d;
                this.zeroCount = 0L;
                this.min = Double.MAX_VALUE;
                this.max = -1.0d;
                this.count = 0L;
                this.currentScale = this.maxScale;
            }
            return exponentialHistogramPointData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ExponentialHistogramBuckets resolveBuckets(@Nullable DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets, int i, boolean z, @Nullable ExponentialHistogramBuckets exponentialHistogramBuckets) {
            MutableExponentialHistogramBuckets mutableExponentialHistogramBuckets;
            DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets2;
            if (doubleBase2ExponentialHistogramBuckets == null) {
                return EmptyExponentialHistogramBuckets.get(i);
            }
            if (exponentialHistogramBuckets == null) {
                doubleBase2ExponentialHistogramBuckets2 = doubleBase2ExponentialHistogramBuckets.copy();
            } else {
                if (exponentialHistogramBuckets instanceof MutableExponentialHistogramBuckets) {
                    mutableExponentialHistogramBuckets = (MutableExponentialHistogramBuckets) exponentialHistogramBuckets;
                } else {
                    mutableExponentialHistogramBuckets = new MutableExponentialHistogramBuckets();
                }
                MutableExponentialHistogramBuckets mutableExponentialHistogramBuckets2 = mutableExponentialHistogramBuckets;
                DynamicPrimitiveLongList reusableBucketCountsList = mutableExponentialHistogramBuckets2.getReusableBucketCountsList();
                doubleBase2ExponentialHistogramBuckets.getBucketCountsIntoReusableList(reusableBucketCountsList);
                mutableExponentialHistogramBuckets2.set(doubleBase2ExponentialHistogramBuckets.getScale(), doubleBase2ExponentialHistogramBuckets.getOffset(), doubleBase2ExponentialHistogramBuckets.getTotalCount(), reusableBucketCountsList);
                doubleBase2ExponentialHistogramBuckets2 = mutableExponentialHistogramBuckets2;
            }
            if (z) {
                doubleBase2ExponentialHistogramBuckets.clear(this.maxScale);
            }
            return doubleBase2ExponentialHistogramBuckets2;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected synchronized void doRecordDouble(double d) {
            DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets;
            if (Double.isFinite(d)) {
                this.sum += d;
                this.min = Math.min(this.min, d);
                this.max = Math.max(this.max, d);
                this.count++;
                int compare = Double.compare(d, 0.0d);
                if (compare == 0) {
                    this.zeroCount++;
                    return;
                }
                if (compare > 0) {
                    if (this.positiveBuckets == null) {
                        this.positiveBuckets = new DoubleBase2ExponentialHistogramBuckets(this.currentScale, this.maxBuckets, this.memoryMode);
                    }
                    doubleBase2ExponentialHistogramBuckets = this.positiveBuckets;
                } else {
                    if (this.negativeBuckets == null) {
                        this.negativeBuckets = new DoubleBase2ExponentialHistogramBuckets(this.currentScale, this.maxBuckets, this.memoryMode);
                    }
                    doubleBase2ExponentialHistogramBuckets = this.negativeBuckets;
                }
                if (!doubleBase2ExponentialHistogramBuckets.record(d)) {
                    downScale(doubleBase2ExponentialHistogramBuckets.getScaleReduction(d));
                    doubleBase2ExponentialHistogramBuckets.record(d);
                }
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected void doRecordLong(long j) {
            doRecordDouble(j);
        }

        void downScale(int i) {
            DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets = this.positiveBuckets;
            if (doubleBase2ExponentialHistogramBuckets != null) {
                doubleBase2ExponentialHistogramBuckets.downscale(i);
                this.currentScale = this.positiveBuckets.getScale();
            }
            DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets2 = this.negativeBuckets;
            if (doubleBase2ExponentialHistogramBuckets2 != null) {
                doubleBase2ExponentialHistogramBuckets2.downscale(i);
                this.currentScale = this.negativeBuckets.getScale();
            }
        }
    }
}
