package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.internal.RandomSupplier;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.aggregator.DoubleBase2ExponentialHistogramAggregator;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarFilter;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class Base2ExponentialHistogramAggregation implements Aggregation, AggregatorFactory {
    private static final int DEFAULT_MAX_SCALE = 20;
    private final int maxBuckets;
    private final int maxScale;
    private static final int DEFAULT_MAX_BUCKETS = 160;
    private static final Aggregation DEFAULT = new Base2ExponentialHistogramAggregation(DEFAULT_MAX_BUCKETS, 20);

    private Base2ExponentialHistogramAggregation(int i, int i2) {
        this.maxBuckets = i;
        this.maxScale = i2;
    }

    public static Aggregation getDefault() {
        return DEFAULT;
    }

    public static Aggregation create(int i, int i2) {
        Utils.checkArgument(i >= 2, "maxBuckets must be >= 2");
        Utils.checkArgument(i2 <= 20 && i2 >= -10, "maxScale must be -10 <= x <= 20");
        return new Base2ExponentialHistogramAggregation(i, i2);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public <T extends PointData, U extends ExemplarData> Aggregator<T, U> createAggregator(InstrumentDescriptor instrumentDescriptor, final ExemplarFilter exemplarFilter, MemoryMode memoryMode) {
        return new DoubleBase2ExponentialHistogramAggregator(new Supplier() { // from class: io.opentelemetry.sdk.metrics.internal.view.Base2ExponentialHistogramAggregation$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                ExemplarReservoir filtered;
                filtered = ExemplarReservoir.filtered(ExemplarFilter.this, ExemplarReservoir.longToDouble(ExemplarReservoir.doubleFixedSizeReservoir(Clock.getDefault(), Runtime.getRuntime().availableProcessors(), RandomSupplier.platformDefault())));
                return filtered;
            }
        }, this.maxBuckets, this.maxScale, memoryMode);
    }

    /* renamed from: io.opentelemetry.sdk.metrics.internal.view.Base2ExponentialHistogramAggregation$1, reason: invalid class name */
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
        return "Base2ExponentialHistogramAggregation{maxBuckets=" + this.maxBuckets + ",maxScale=" + this.maxScale + "}";
    }
}
