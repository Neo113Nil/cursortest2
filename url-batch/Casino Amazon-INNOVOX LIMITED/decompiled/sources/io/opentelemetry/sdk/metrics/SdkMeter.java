package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.BatchCallback;
import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.api.metrics.ObservableMeasurement;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.SdkDoubleGauge;
import io.opentelemetry.sdk.metrics.SdkDoubleHistogram;
import io.opentelemetry.sdk.metrics.SdkLongCounter;
import io.opentelemetry.sdk.metrics.SdkLongUpDownCounter;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.MeterConfig;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage;
import io.opentelemetry.sdk.metrics.internal.state.CallbackRegistration;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorage;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorageRegistry;
import io.opentelemetry.sdk.metrics.internal.state.SdkObservableMeasurement;
import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
final class SdkMeter implements Meter {
    private static final boolean INCUBATOR_AVAILABLE;
    private static final String NOOP_INSTRUMENT_NAME = "noop";
    private static final Meter NOOP_METER;
    private static final Pattern VALID_INSTRUMENT_NAME_PATTERN;
    private static final Logger logger = Logger.getLogger(SdkMeter.class.getName());
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    private boolean meterEnabled;
    private final MeterProviderSharedState meterProviderSharedState;
    private final Map<RegisteredReader, MetricStorageRegistry> readerStorageRegistries;
    private final Object collectLock = new Object();
    private final Object callbackLock = new Object();
    private final List<CallbackRegistration> callbackRegistrations = new ArrayList();

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.metrics.ExtendedDefaultMeterProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        INCUBATOR_AVAILABLE = z;
        VALID_INSTRUMENT_NAME_PATTERN = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
        NOOP_METER = MeterProvider.noop().get(NOOP_INSTRUMENT_NAME);
    }

    SdkMeter(MeterProviderSharedState meterProviderSharedState, InstrumentationScopeInfo instrumentationScopeInfo, List<RegisteredReader> list, MeterConfig meterConfig) {
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.meterProviderSharedState = meterProviderSharedState;
        this.readerStorageRegistries = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeter$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SdkMeter.lambda$new$0((RegisteredReader) obj);
            }
        }));
        this.meterEnabled = meterConfig.isEnabled();
    }

    static /* synthetic */ MetricStorageRegistry lambda$new$0(RegisteredReader registeredReader) {
        return new MetricStorageRegistry();
    }

    void updateMeterConfig(MeterConfig meterConfig) {
        this.meterEnabled = meterConfig.isEnabled();
        Iterator<RegisteredReader> it = this.readerStorageRegistries.keySet().iterator();
        while (it.hasNext()) {
            Iterator<MetricStorage> it2 = ((MetricStorageRegistry) Objects.requireNonNull(this.readerStorageRegistries.get(it.next()))).getStorages().iterator();
            while (it2.hasNext()) {
                it2.next().setEnabled(this.meterEnabled);
            }
        }
    }

    InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    Collection<MetricData> collectAll(RegisteredReader registeredReader, long j) {
        ArrayList arrayList;
        List unmodifiableList;
        synchronized (this.callbackLock) {
            arrayList = new ArrayList(this.callbackRegistrations);
        }
        synchronized (this.collectLock) {
            if (this.meterEnabled) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RegisteredReader registeredReader2 = registeredReader;
                    long j2 = j;
                    ((CallbackRegistration) it.next()).invokeCallback(registeredReader2, this.meterProviderSharedState.getStartEpochNanos(), j2);
                    registeredReader = registeredReader2;
                    j = j2;
                }
            }
            long j3 = j;
            Collection<MetricStorage> storages = ((MetricStorageRegistry) Objects.requireNonNull(this.readerStorageRegistries.get(registeredReader))).getStorages();
            ArrayList arrayList2 = new ArrayList(storages.size());
            Iterator<MetricStorage> it2 = storages.iterator();
            while (it2.hasNext()) {
                long j4 = j3;
                MetricData collect = it2.next().collect(this.meterProviderSharedState.getResource(), getInstrumentationScopeInfo(), this.meterProviderSharedState.getStartEpochNanos(), j4);
                j3 = j4;
                if (!collect.isEmpty()) {
                    arrayList2.add(collect);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        return unmodifiableList;
    }

    void resetForTest() {
        synchronized (this.collectLock) {
            synchronized (this.callbackLock) {
                this.callbackRegistrations.clear();
            }
            this.readerStorageRegistries.values().forEach(new Consumer() { // from class: io.opentelemetry.sdk.metrics.SdkMeter$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((MetricStorageRegistry) obj).resetForTest();
                }
            });
        }
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public LongCounterBuilder counterBuilder(String str) {
        if (!checkValidInstrumentName(str)) {
            return NOOP_METER.counterBuilder(NOOP_INSTRUMENT_NAME);
        }
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedLongCounterBuilder(this, str);
        }
        return new SdkLongCounter.SdkLongCounterBuilder(this, str);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public LongUpDownCounterBuilder upDownCounterBuilder(String str) {
        if (!checkValidInstrumentName(str)) {
            return NOOP_METER.upDownCounterBuilder(NOOP_INSTRUMENT_NAME);
        }
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedLongUpDownCounterBuilder(this, str);
        }
        return new SdkLongUpDownCounter.SdkLongUpDownCounterBuilder(this, str);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public DoubleHistogramBuilder histogramBuilder(String str) {
        if (!checkValidInstrumentName(str)) {
            return NOOP_METER.histogramBuilder(NOOP_INSTRUMENT_NAME);
        }
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedDoubleHistogramBuilder(this, str);
        }
        return new SdkDoubleHistogram.SdkDoubleHistogramBuilder(this, str);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public DoubleGaugeBuilder gaugeBuilder(String str) {
        if (!checkValidInstrumentName(str)) {
            return NOOP_METER.gaugeBuilder(NOOP_INSTRUMENT_NAME);
        }
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedDoubleGaugeBuilder(this, str);
        }
        return new SdkDoubleGauge.SdkDoubleGaugeBuilder(this, str);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public BatchCallback batchCallback(Runnable runnable, ObservableMeasurement observableMeasurement, ObservableMeasurement... observableMeasurementArr) {
        HashSet<ObservableMeasurement> hashSet = new HashSet();
        hashSet.add(observableMeasurement);
        Collections.addAll(hashSet, observableMeasurementArr);
        ArrayList arrayList = new ArrayList();
        for (ObservableMeasurement observableMeasurement2 : hashSet) {
            if (!(observableMeasurement2 instanceof SdkObservableMeasurement)) {
                logger.log(Level.WARNING, "batchCallback called with instruments that were not created by the SDK.");
            } else {
                SdkObservableMeasurement sdkObservableMeasurement = (SdkObservableMeasurement) observableMeasurement2;
                if (!this.instrumentationScopeInfo.equals(sdkObservableMeasurement.getInstrumentationScopeInfo())) {
                    logger.log(Level.WARNING, "batchCallback called with instruments that belong to a different Meter.");
                } else {
                    arrayList.add(sdkObservableMeasurement);
                }
            }
        }
        CallbackRegistration create = CallbackRegistration.create(arrayList, runnable);
        registerCallback(create);
        return new SdkObservableInstrument(this, create);
    }

    void removeCallback(CallbackRegistration callbackRegistration) {
        synchronized (this.callbackLock) {
            this.callbackRegistrations.remove(callbackRegistration);
        }
    }

    void registerCallback(CallbackRegistration callbackRegistration) {
        synchronized (this.callbackLock) {
            this.callbackRegistrations.add(callbackRegistration);
        }
    }

    boolean isMeterEnabled() {
        return this.meterEnabled;
    }

    WriteableMetricStorage registerSynchronousMetricStorage(InstrumentDescriptor instrumentDescriptor) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<RegisteredReader, MetricStorageRegistry> entry : this.readerStorageRegistries.entrySet()) {
            RegisteredReader key = entry.getKey();
            MetricStorageRegistry value = entry.getValue();
            for (RegisteredView registeredView : key.getViewRegistry().findViews(instrumentDescriptor, getInstrumentationScopeInfo())) {
                if (Aggregation.drop() != registeredView.getView().getAggregation()) {
                    arrayList.add((SynchronousMetricStorage) value.register(SynchronousMetricStorage.create(key, registeredView, instrumentDescriptor, this.meterProviderSharedState.getExemplarFilter(), this.meterEnabled)));
                }
            }
        }
        if (arrayList.size() == 1) {
            return (WriteableMetricStorage) arrayList.get(0);
        }
        return new MultiWritableMetricStorage(arrayList);
    }

    SdkObservableMeasurement registerObservableMeasurement(InstrumentDescriptor instrumentDescriptor) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<RegisteredReader, MetricStorageRegistry> entry : this.readerStorageRegistries.entrySet()) {
            RegisteredReader key = entry.getKey();
            MetricStorageRegistry value = entry.getValue();
            for (RegisteredView registeredView : key.getViewRegistry().findViews(instrumentDescriptor, getInstrumentationScopeInfo())) {
                if (Aggregation.drop() != registeredView.getView().getAggregation()) {
                    arrayList.add((AsynchronousMetricStorage) value.register(AsynchronousMetricStorage.create(key, registeredView, instrumentDescriptor, this.meterEnabled)));
                }
            }
        }
        return SdkObservableMeasurement.create(this.instrumentationScopeInfo, instrumentDescriptor, arrayList);
    }

    public String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.instrumentationScopeInfo + "}";
    }

    static boolean checkValidInstrumentName(String str) {
        if (str != null && VALID_INSTRUMENT_NAME_PATTERN.matcher(str).matches()) {
            return true;
        }
        Logger logger2 = logger;
        if (!logger2.isLoggable(Level.WARNING)) {
            return false;
        }
        logger2.log(Level.WARNING, "Instrument name \"" + str + "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter.", (Throwable) new AssertionError());
        return false;
    }

    private static class MultiWritableMetricStorage implements WriteableMetricStorage {
        private final List<? extends WriteableMetricStorage> storages;

        private MultiWritableMetricStorage(List<? extends WriteableMetricStorage> list) {
            this.storages = list;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
        public void recordLong(long j, Attributes attributes, Context context) {
            Iterator<? extends WriteableMetricStorage> it = this.storages.iterator();
            while (it.hasNext()) {
                it.next().recordLong(j, attributes, context);
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
        public void recordDouble(double d, Attributes attributes, Context context) {
            Iterator<? extends WriteableMetricStorage> it = this.storages.iterator();
            while (it.hasNext()) {
                it.next().recordDouble(d, attributes, context);
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
        public boolean isEnabled() {
            Iterator<? extends WriteableMetricStorage> it = this.storages.iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    return true;
                }
            }
            return false;
        }
    }
}
