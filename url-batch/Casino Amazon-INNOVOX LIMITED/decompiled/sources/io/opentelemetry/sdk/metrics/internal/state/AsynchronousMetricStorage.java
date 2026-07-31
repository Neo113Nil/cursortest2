package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle;
import io.opentelemetry.sdk.metrics.internal.aggregator.EmptyMetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarFilter;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class AsynchronousMetricStorage<T extends PointData, U extends ExemplarData> implements MetricStorage {
    private static final Logger logger = Logger.getLogger(AsynchronousMetricStorage.class.getName());
    private final AggregationTemporality aggregationTemporality;
    private final Aggregator<T, U> aggregator;
    private final Map<Attributes, AggregatorHandle<T, U>> aggregatorHandles;
    private final AttributesProcessor attributesProcessor;
    private boolean enabled;
    private long epochNanos;
    private final Function<Attributes, AggregatorHandle<T, U>> handleBuilder;
    private final BiConsumer<Attributes, AggregatorHandle<T, U>> handleReleaser;
    private Map<Attributes, T> lastPoints;
    private final int maxCardinality;
    private final MemoryMode memoryMode;
    private final MetricDescriptor metricDescriptor;
    private final BiConsumer<Attributes, T> pointReleaser;
    private final RegisteredReader registeredReader;
    private final ObjectPool<AggregatorHandle<T, U>> reusableHandlesPool;
    private final ObjectPool<T> reusablePointsPool;
    private long startEpochNanos;
    private final ThrottlingLogger throttlingLogger = new ThrottlingLogger(logger);
    private final List<T> reusablePointsList = new ArrayList();
    private Map<Attributes, T> reusablePointsMap = new PooledHashMap();

    private AsynchronousMetricStorage(RegisteredReader registeredReader, MetricDescriptor metricDescriptor, final Aggregator<T, U> aggregator, AttributesProcessor attributesProcessor, int i, boolean z) {
        this.registeredReader = registeredReader;
        this.metricDescriptor = metricDescriptor;
        this.aggregationTemporality = registeredReader.getReader().getAggregationTemporality(metricDescriptor.getSourceInstrument().getType());
        MemoryMode memoryMode = registeredReader.getReader().getMemoryMode();
        this.memoryMode = memoryMode;
        this.aggregator = aggregator;
        this.attributesProcessor = attributesProcessor;
        this.maxCardinality = i - 1;
        this.enabled = z;
        Objects.requireNonNull(aggregator);
        this.reusablePointsPool = new ObjectPool<>(new Supplier() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return Aggregator.this.createReusablePoint();
            }
        });
        Objects.requireNonNull(aggregator);
        this.reusableHandlesPool = new ObjectPool<>(new Supplier() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return Aggregator.this.createHandle();
            }
        });
        this.handleBuilder = new Function() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AsynchronousMetricStorage.this.m3959x9194fb64((Attributes) obj);
            }
        };
        this.handleReleaser = new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AsynchronousMetricStorage.this.m3960x74c0aea5((Attributes) obj, (AggregatorHandle) obj2);
            }
        };
        this.pointReleaser = new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AsynchronousMetricStorage.this.m3961x57ec61e6((Attributes) obj, (PointData) obj2);
            }
        };
        if (memoryMode == MemoryMode.REUSABLE_DATA) {
            this.lastPoints = new PooledHashMap();
            this.aggregatorHandles = new PooledHashMap();
        } else {
            this.lastPoints = new HashMap();
            this.aggregatorHandles = new HashMap();
        }
    }

    /* renamed from: lambda$new$0$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ AggregatorHandle m3959x9194fb64(Attributes attributes) {
        return this.reusableHandlesPool.borrowObject();
    }

    /* renamed from: lambda$new$1$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3960x74c0aea5(Attributes attributes, AggregatorHandle aggregatorHandle) {
        this.reusableHandlesPool.returnObject(aggregatorHandle);
    }

    /* renamed from: lambda$new$2$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3961x57ec61e6(Attributes attributes, PointData pointData) {
        this.reusablePointsPool.returnObject(pointData);
    }

    public static <T extends PointData, U extends ExemplarData> AsynchronousMetricStorage<T, U> create(RegisteredReader registeredReader, RegisteredView registeredView, InstrumentDescriptor instrumentDescriptor, boolean z) {
        View view = registeredView.getView();
        return new AsynchronousMetricStorage<>(registeredReader, MetricDescriptor.create(view, registeredView.getViewSourceInfo(), instrumentDescriptor), ((AggregatorFactory) view.getAggregation()).createAggregator(instrumentDescriptor, ExemplarFilter.alwaysOff(), registeredReader.getReader().getMemoryMode()), registeredView.getViewAttributesProcessor(), registeredView.getCardinalityLimit(), z);
    }

    void record(Attributes attributes, long j) {
        Attributes validateAndProcessAttributes = validateAndProcessAttributes(attributes);
        this.aggregatorHandles.computeIfAbsent(validateAndProcessAttributes, this.handleBuilder).recordLong(j, validateAndProcessAttributes, Context.current());
    }

    void record(Attributes attributes, double d) {
        Attributes validateAndProcessAttributes = validateAndProcessAttributes(attributes);
        this.aggregatorHandles.computeIfAbsent(validateAndProcessAttributes, this.handleBuilder).recordDouble(d, validateAndProcessAttributes, Context.current());
    }

    void setEpochInformation(long j, long j2) {
        if (this.aggregationTemporality == AggregationTemporality.DELTA) {
            j = this.registeredReader.getLastCollectEpochNanos();
        }
        this.startEpochNanos = j;
        this.epochNanos = j2;
    }

    private Attributes validateAndProcessAttributes(Attributes attributes) {
        if (this.aggregatorHandles.size() >= this.maxCardinality) {
            this.throttlingLogger.log(Level.WARNING, "Instrument " + this.metricDescriptor.getSourceInstrument().getName() + " has exceeded the maximum allowed cardinality (" + this.maxCardinality + ").");
            return MetricStorage.CARDINALITY_OVERFLOW;
        }
        return this.attributesProcessor.process(attributes, Context.current());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public MetricDescriptor getMetricDescriptor() {
        return this.metricDescriptor;
    }

    public RegisteredReader getRegisteredReader() {
        return this.registeredReader;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public MetricData collect(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2) {
        Collection<T> collectWithCumulativeAggregationTemporality;
        if (this.aggregationTemporality == AggregationTemporality.DELTA) {
            collectWithCumulativeAggregationTemporality = collectWithDeltaAggregationTemporality();
        } else {
            collectWithCumulativeAggregationTemporality = collectWithCumulativeAggregationTemporality();
        }
        Collection<T> collection = collectWithCumulativeAggregationTemporality;
        this.aggregatorHandles.forEach(this.handleReleaser);
        this.aggregatorHandles.clear();
        if (this.enabled) {
            return this.aggregator.toMetricData(resource, instrumentationScopeInfo, this.metricDescriptor, collection, this.aggregationTemporality);
        }
        return EmptyMetricData.getInstance();
    }

    private Collection<T> collectWithDeltaAggregationTemporality() {
        final Map<Attributes, T> hashMap;
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            List<T> list = this.reusablePointsList;
            final ObjectPool<T> objectPool = this.reusablePointsPool;
            Objects.requireNonNull(objectPool);
            list.forEach(new Consumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda5
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ObjectPool.this.returnObject((PointData) obj);
                }
            });
            this.reusablePointsList.clear();
            hashMap = this.reusablePointsMap;
        } else {
            hashMap = new HashMap<>();
        }
        this.aggregatorHandles.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AsynchronousMetricStorage.this.m3957xb6deea13(hashMap, (Attributes) obj, (AggregatorHandle) obj2);
            }
        });
        final List arrayList = this.memoryMode == MemoryMode.REUSABLE_DATA ? this.reusablePointsList : new ArrayList();
        hashMap.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda7
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AsynchronousMetricStorage.this.m3958x9a0a9d54(arrayList, (Attributes) obj, (PointData) obj2);
            }
        });
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            this.lastPoints.forEach(this.pointReleaser);
            this.lastPoints.clear();
            Map<Attributes, T> map = this.lastPoints;
            this.lastPoints = this.reusablePointsMap;
            this.reusablePointsMap = map;
            return arrayList;
        }
        this.lastPoints = hashMap;
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$collectWithDeltaAggregationTemporality$3$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3957xb6deea13(Map map, Attributes attributes, AggregatorHandle aggregatorHandle) {
        PointData aggregateThenMaybeReset = aggregatorHandle.aggregateThenMaybeReset(this.startEpochNanos, this.epochNanos, attributes, true);
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            T borrowObject = this.reusablePointsPool.borrowObject();
            this.aggregator.copyPoint(aggregateThenMaybeReset, borrowObject);
            aggregateThenMaybeReset = borrowObject;
        }
        map.put(attributes, aggregateThenMaybeReset);
    }

    /* renamed from: lambda$collectWithDeltaAggregationTemporality$4$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3958x9a0a9d54(List list, Attributes attributes, PointData pointData) {
        T remove = this.lastPoints.remove(attributes);
        if (remove == null) {
            if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
                remove = this.reusablePointsPool.borrowObject();
                this.aggregator.copyPoint(pointData, remove);
                pointData = remove;
            }
        } else if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            this.aggregator.diffInPlace(remove, pointData);
            pointData = remove;
        } else {
            pointData = this.aggregator.diff(remove, pointData);
        }
        list.add(pointData);
    }

    private Collection<T> collectWithCumulativeAggregationTemporality() {
        final List arrayList;
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            this.reusablePointsList.clear();
            arrayList = this.reusablePointsList;
        } else {
            arrayList = new ArrayList();
        }
        this.aggregatorHandles.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$$ExternalSyntheticLambda8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AsynchronousMetricStorage.this.m3956x22e12616(arrayList, (Attributes) obj, (AggregatorHandle) obj2);
            }
        });
        return arrayList;
    }

    /* renamed from: lambda$collectWithCumulativeAggregationTemporality$5$io-opentelemetry-sdk-metrics-internal-state-AsynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3956x22e12616(List list, Attributes attributes, AggregatorHandle aggregatorHandle) {
        list.add(aggregatorHandle.aggregateThenMaybeReset(this.startEpochNanos, this.epochNanos, attributes, true));
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public void setEnabled(boolean z) {
        this.enabled = z;
    }
}
