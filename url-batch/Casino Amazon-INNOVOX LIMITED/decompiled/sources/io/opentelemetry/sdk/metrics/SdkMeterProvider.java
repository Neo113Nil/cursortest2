package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.ComponentRegistry;
import io.opentelemetry.sdk.internal.ScopeConfigurator;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.CardinalityLimitSelector;
import io.opentelemetry.sdk.metrics.export.CollectionRegistration;
import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector;
import io.opentelemetry.sdk.metrics.export.MetricProducer;
import io.opentelemetry.sdk.metrics.export.MetricReader;
import io.opentelemetry.sdk.metrics.internal.MeterConfig;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarFilter;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.resources.Resource;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class SdkMeterProvider implements MeterProvider, Closeable {
    static final String DEFAULT_METER_NAME = "unknown";
    private static final Logger LOGGER = Logger.getLogger(SdkMeterProvider.class.getName());
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private ScopeConfigurator<MeterConfig> meterConfigurator;
    private final List<MetricProducer> metricProducers;
    private final List<RegisteredReader> registeredReaders;
    private final List<RegisteredView> registeredViews;
    private final ComponentRegistry<SdkMeter> registry;
    private final MeterProviderSharedState sharedState;

    public static SdkMeterProviderBuilder builder() {
        return new SdkMeterProviderBuilder();
    }

    SdkMeterProvider(final List<RegisteredView> list, IdentityHashMap<MetricReader, CardinalityLimitSelector> identityHashMap, List<MetricProducer> list2, Clock clock, Resource resource, ExemplarFilter exemplarFilter, ScopeConfigurator<MeterConfig> scopeConfigurator) {
        long now = clock.now();
        this.registeredViews = list;
        List<RegisteredReader> list3 = (List) identityHashMap.entrySet().stream().map(new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                RegisteredReader create;
                create = RegisteredReader.create((MetricReader) r2.getKey(), ViewRegistry.create((DefaultAggregationSelector) r2.getKey(), (CardinalityLimitSelector) ((Map.Entry) obj).getValue(), list));
                return create;
            }
        }).collect(Collectors.toList());
        this.registeredReaders = list3;
        this.metricProducers = list2;
        this.sharedState = MeterProviderSharedState.create(clock, resource, exemplarFilter, now);
        this.registry = new ComponentRegistry<>(new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SdkMeterProvider.this.m3952lambda$new$1$ioopentelemetrysdkmetricsSdkMeterProvider((InstrumentationScopeInfo) obj);
            }
        });
        this.meterConfigurator = scopeConfigurator;
        for (RegisteredReader registeredReader : list3) {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.add(new LeasedMetricProducer(this.registry, this.sharedState, registeredReader));
            registeredReader.getReader().register(new SdkCollectionRegistration(arrayList, this.sharedState));
            registeredReader.setLastCollectEpochNanos(now);
        }
    }

    /* renamed from: lambda$new$1$io-opentelemetry-sdk-metrics-SdkMeterProvider, reason: not valid java name */
    /* synthetic */ SdkMeter m3952lambda$new$1$ioopentelemetrysdkmetricsSdkMeterProvider(InstrumentationScopeInfo instrumentationScopeInfo) {
        return new SdkMeter(this.sharedState, instrumentationScopeInfo, this.registeredReaders, getMeterConfig(instrumentationScopeInfo));
    }

    private MeterConfig getMeterConfig(InstrumentationScopeInfo instrumentationScopeInfo) {
        MeterConfig apply = this.meterConfigurator.apply(instrumentationScopeInfo);
        return apply == null ? MeterConfig.defaultConfig() : apply;
    }

    void setMeterConfigurator(ScopeConfigurator<MeterConfig> scopeConfigurator) {
        this.meterConfigurator = scopeConfigurator;
        this.registry.getComponents().forEach(new Consumer() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SdkMeterProvider.this.m3953x27f24245((SdkMeter) obj);
            }
        });
    }

    /* renamed from: lambda$setMeterConfigurator$2$io-opentelemetry-sdk-metrics-SdkMeterProvider, reason: not valid java name */
    /* synthetic */ void m3953x27f24245(SdkMeter sdkMeter) {
        sdkMeter.updateMeterConfig(getMeterConfig(sdkMeter.getInstrumentationScopeInfo()));
    }

    @Override // io.opentelemetry.api.metrics.MeterProvider
    public MeterBuilder meterBuilder(String str) {
        if (this.registeredReaders.isEmpty()) {
            return MeterProvider.noop().meterBuilder(str);
        }
        if (str == null || str.isEmpty()) {
            LOGGER.fine("Meter requested without instrumentation scope name.");
            str = "unknown";
        }
        return new SdkMeterBuilder(this.registry, str);
    }

    void resetForTest() {
        this.registry.getComponents().forEach(new Consumer() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((SdkMeter) obj).resetForTest();
            }
        });
    }

    public CompletableResultCode forceFlush() {
        if (this.registeredReaders.isEmpty()) {
            return CompletableResultCode.ofSuccess();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RegisteredReader> it = this.registeredReaders.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReader().forceFlush());
        }
        return CompletableResultCode.ofAll(arrayList);
    }

    public CompletableResultCode shutdown() {
        if (!this.isClosed.compareAndSet(false, true)) {
            LOGGER.info("Multiple close calls");
            return CompletableResultCode.ofSuccess();
        }
        if (this.registeredReaders.isEmpty()) {
            return CompletableResultCode.ofSuccess();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RegisteredReader> it = this.registeredReaders.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReader().shutdown());
        }
        return CompletableResultCode.ofAll(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().join(10L, TimeUnit.SECONDS);
    }

    public String toString() {
        return "SdkMeterProvider{clock=" + this.sharedState.getClock() + ", resource=" + this.sharedState.getResource() + ", metricReaders=" + this.registeredReaders.stream().map(new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((RegisteredReader) obj).getReader();
            }
        }).collect(Collectors.toList()) + ", metricProducers=" + this.metricProducers + ", views=" + this.registeredViews + ", meterConfigurator=" + this.meterConfigurator + "}";
    }

    private static class LeasedMetricProducer implements MetricProducer {
        private final RegisteredReader registeredReader;
        private final ComponentRegistry<SdkMeter> registry;
        private final MeterProviderSharedState sharedState;

        LeasedMetricProducer(ComponentRegistry<SdkMeter> componentRegistry, MeterProviderSharedState meterProviderSharedState, RegisteredReader registeredReader) {
            this.registry = componentRegistry;
            this.sharedState = meterProviderSharedState;
            this.registeredReader = registeredReader;
        }

        @Override // io.opentelemetry.sdk.metrics.export.MetricProducer
        public Collection<MetricData> produce(Resource resource) {
            Collection<SdkMeter> components = this.registry.getComponents();
            ArrayList arrayList = new ArrayList();
            long now = this.sharedState.getClock().now();
            Iterator<SdkMeter> it = components.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().collectAll(this.registeredReader, now));
            }
            this.registeredReader.setLastCollectEpochNanos(now);
            return Collections.unmodifiableCollection(arrayList);
        }
    }

    private static class SdkCollectionRegistration implements CollectionRegistration {
        private final List<MetricProducer> metricProducers;
        private final MeterProviderSharedState sharedState;

        private SdkCollectionRegistration(List<MetricProducer> list, MeterProviderSharedState meterProviderSharedState) {
            this.metricProducers = list;
            this.sharedState = meterProviderSharedState;
        }

        @Override // io.opentelemetry.sdk.metrics.export.CollectionRegistration
        public Collection<MetricData> collectAllMetrics() {
            if (this.metricProducers.isEmpty()) {
                return Collections.emptyList();
            }
            Resource resource = this.sharedState.getResource();
            if (this.metricProducers.size() == 1) {
                return this.metricProducers.get(0).produce(resource);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<MetricProducer> it = this.metricProducers.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().produce(resource));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }
}
