package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle;
import io.opentelemetry.sdk.metrics.internal.aggregator.EmptyMetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class DefaultSynchronousMetricStorage<T extends PointData, U extends ExemplarData> implements SynchronousMetricStorage {
    private static final Logger internalLogger = Logger.getLogger(DefaultSynchronousMetricStorage.class.getName());
    private final AggregationTemporality aggregationTemporality;
    private final Aggregator<T, U> aggregator;
    private final AttributesProcessor attributesProcessor;
    private boolean enabled;
    private final int maxCardinality;
    private final MemoryMode memoryMode;
    private final MetricDescriptor metricDescriptor;
    private final RegisteredReader registeredReader;
    private final ThrottlingLogger logger = new ThrottlingLogger(internalLogger);
    private volatile AggregatorHolder<T, U> aggregatorHolder = new AggregatorHolder<>();
    private final ArrayList<T> reusableResultList = new ArrayList<>();
    private volatile ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> previousCollectionAggregatorHandles = new ConcurrentHashMap<>();
    private final ConcurrentLinkedQueue<AggregatorHandle<T, U>> aggregatorHandlePool = new ConcurrentLinkedQueue<>();

    DefaultSynchronousMetricStorage(RegisteredReader registeredReader, MetricDescriptor metricDescriptor, Aggregator<T, U> aggregator, AttributesProcessor attributesProcessor, int i, boolean z) {
        this.registeredReader = registeredReader;
        this.metricDescriptor = metricDescriptor;
        this.aggregationTemporality = registeredReader.getReader().getAggregationTemporality(metricDescriptor.getSourceInstrument().getType());
        this.aggregator = aggregator;
        this.attributesProcessor = attributesProcessor;
        this.maxCardinality = i - 1;
        this.memoryMode = registeredReader.getReader().getMemoryMode();
        this.enabled = z;
    }

    Queue<AggregatorHandle<T, U>> getAggregatorHandlePool() {
        return this.aggregatorHandlePool;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public void recordLong(long j, Attributes attributes, Context context) {
        if (this.enabled) {
            AggregatorHolder<T, U> holderForRecord = getHolderForRecord();
            try {
                getAggregatorHandle(((AggregatorHolder) holderForRecord).aggregatorHandles, attributes, context).recordLong(j, attributes, context);
            } finally {
                releaseHolderForRecord(holderForRecord);
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public void recordDouble(double d, Attributes attributes, Context context) {
        if (this.enabled) {
            if (Double.isNaN(d)) {
                this.logger.log(Level.FINE, "Instrument " + this.metricDescriptor.getSourceInstrument().getName() + " has recorded measurement Not-a-Number (NaN) value with attributes " + attributes + ". Dropping measurement.");
                return;
            }
            AggregatorHolder<T, U> holderForRecord = getHolderForRecord();
            try {
                getAggregatorHandle(((AggregatorHolder) holderForRecord).aggregatorHandles, attributes, context).recordDouble(d, attributes, context);
            } finally {
                releaseHolderForRecord(holderForRecord);
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public boolean isEnabled() {
        return this.enabled;
    }

    private AggregatorHolder<T, U> getHolderForRecord() {
        while (true) {
            AggregatorHolder<T, U> aggregatorHolder = this.aggregatorHolder;
            if (((AggregatorHolder) aggregatorHolder).activeRecordingThreads.addAndGet(2) % 2 == 0) {
                return aggregatorHolder;
            }
            ((AggregatorHolder) aggregatorHolder).activeRecordingThreads.addAndGet(-2);
        }
    }

    private void releaseHolderForRecord(AggregatorHolder<T, U> aggregatorHolder) {
        ((AggregatorHolder) aggregatorHolder).activeRecordingThreads.addAndGet(-2);
    }

    private AggregatorHandle<T, U> getAggregatorHandle(ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> concurrentHashMap, Attributes attributes, Context context) {
        Objects.requireNonNull(attributes, "attributes");
        Attributes process = this.attributesProcessor.process(attributes, context);
        AggregatorHandle<T, U> aggregatorHandle = concurrentHashMap.get(process);
        if (aggregatorHandle != null) {
            return aggregatorHandle;
        }
        if (concurrentHashMap.size() >= this.maxCardinality) {
            this.logger.log(Level.WARNING, "Instrument " + this.metricDescriptor.getSourceInstrument().getName() + " has exceeded the maximum allowed cardinality (" + this.maxCardinality + ").");
            process = MetricStorage.CARDINALITY_OVERFLOW;
            AggregatorHandle<T, U> aggregatorHandle2 = concurrentHashMap.get(process);
            if (aggregatorHandle2 != null) {
                return aggregatorHandle2;
            }
        }
        AggregatorHandle<T, U> poll = this.aggregatorHandlePool.poll();
        if (poll == null) {
            poll = this.aggregator.createHandle();
        }
        AggregatorHandle<T, U> putIfAbsent = concurrentHashMap.putIfAbsent(process, poll);
        return putIfAbsent != null ? putIfAbsent : poll;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public MetricData collect(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, final long j2) {
        ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> concurrentHashMap;
        ArrayList<T> arrayList;
        AggregatorHolder<T, U> aggregatorHolder;
        final boolean z = this.aggregationTemporality == AggregationTemporality.DELTA;
        final long lastCollectEpochNanos = this.aggregationTemporality == AggregationTemporality.DELTA ? this.registeredReader.getLastCollectEpochNanos() : j;
        if (z) {
            AggregatorHolder<T, U> aggregatorHolder2 = this.aggregatorHolder;
            if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
                aggregatorHolder = new AggregatorHolder<>(this.previousCollectionAggregatorHandles);
            } else {
                aggregatorHolder = new AggregatorHolder<>();
            }
            this.aggregatorHolder = aggregatorHolder;
            for (int addAndGet = ((AggregatorHolder) aggregatorHolder2).activeRecordingThreads.addAndGet(1); addAndGet > 1; addAndGet = ((AggregatorHolder) aggregatorHolder2).activeRecordingThreads.get()) {
            }
            concurrentHashMap = ((AggregatorHolder) aggregatorHolder2).aggregatorHandles;
        } else {
            concurrentHashMap = ((AggregatorHolder) this.aggregatorHolder).aggregatorHandles;
        }
        final ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> concurrentHashMap2 = concurrentHashMap;
        if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
            this.reusableResultList.clear();
            arrayList = this.reusableResultList;
        } else {
            arrayList = new ArrayList<>(concurrentHashMap2.size());
        }
        final ArrayList<T> arrayList2 = arrayList;
        if (this.memoryMode == MemoryMode.REUSABLE_DATA && z && concurrentHashMap2.size() >= this.maxCardinality) {
            concurrentHashMap2.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.DefaultSynchronousMetricStorage$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    DefaultSynchronousMetricStorage.lambda$collect$0(concurrentHashMap2, (Attributes) obj, (AggregatorHandle) obj2);
                }
            });
        }
        concurrentHashMap2.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.state.DefaultSynchronousMetricStorage$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                DefaultSynchronousMetricStorage.this.m3962x265efbaf(lastCollectEpochNanos, j2, z, arrayList2, (Attributes) obj, (AggregatorHandle) obj2);
            }
        });
        int size = this.aggregatorHandlePool.size() - (this.maxCardinality + 1);
        for (int i = 0; i < size; i++) {
            this.aggregatorHandlePool.poll();
        }
        if (z && this.memoryMode == MemoryMode.REUSABLE_DATA) {
            this.previousCollectionAggregatorHandles = concurrentHashMap2;
        }
        if (arrayList2.isEmpty() || !this.enabled) {
            return EmptyMetricData.getInstance();
        }
        return this.aggregator.toMetricData(resource, instrumentationScopeInfo, this.metricDescriptor, arrayList2, this.aggregationTemporality);
    }

    static /* synthetic */ void lambda$collect$0(ConcurrentHashMap concurrentHashMap, Attributes attributes, AggregatorHandle aggregatorHandle) {
        if (aggregatorHandle.hasRecordedValues()) {
            return;
        }
        concurrentHashMap.remove(attributes);
    }

    /* renamed from: lambda$collect$1$io-opentelemetry-sdk-metrics-internal-state-DefaultSynchronousMetricStorage, reason: not valid java name */
    /* synthetic */ void m3962x265efbaf(long j, long j2, boolean z, List list, Attributes attributes, AggregatorHandle aggregatorHandle) {
        if (aggregatorHandle.hasRecordedValues()) {
            PointData aggregateThenMaybeReset = aggregatorHandle.aggregateThenMaybeReset(j, j2, attributes, z);
            if (z && this.memoryMode == MemoryMode.IMMUTABLE_DATA) {
                this.aggregatorHandlePool.offer(aggregatorHandle);
            }
            if (aggregateThenMaybeReset != null) {
                list.add(aggregateThenMaybeReset);
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public MetricDescriptor getMetricDescriptor() {
        return this.metricDescriptor;
    }

    private static class AggregatorHolder<T extends PointData, U extends ExemplarData> {
        private final AtomicInteger activeRecordingThreads;
        private final ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> aggregatorHandles;

        private AggregatorHolder() {
            this.activeRecordingThreads = new AtomicInteger(0);
            this.aggregatorHandles = new ConcurrentHashMap<>();
        }

        private AggregatorHolder(ConcurrentHashMap<Attributes, AggregatorHandle<T, U>> concurrentHashMap) {
            this.activeRecordingThreads = new AtomicInteger(0);
            this.aggregatorHandles = concurrentHashMap;
        }
    }
}
