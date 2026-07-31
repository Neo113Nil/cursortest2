package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.DoubleCounterBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.ObservableLongCounter;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class SdkLongCounter extends AbstractInstrument implements LongCounter {
    private static final Logger logger = Logger.getLogger(SdkLongCounter.class.getName());
    final SdkMeter sdkMeter;
    final WriteableMetricStorage storage;
    private final ThrottlingLogger throttlingLogger;

    SdkLongCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor);
        this.throttlingLogger = new ThrottlingLogger(logger);
        this.sdkMeter = sdkMeter;
        this.storage = writeableMetricStorage;
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public void add(long j, Attributes attributes, Context context) {
        if (j < 0) {
            this.throttlingLogger.log(Level.WARNING, "Counters can only increase. Instrument " + getDescriptor().getName() + " has recorded a negative value.");
        } else {
            this.storage.recordLong(j, attributes, context);
        }
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public void add(long j, Attributes attributes) {
        add(j, attributes, Context.current());
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public void add(long j) {
        add(j, Attributes.empty());
    }

    static class SdkLongCounterBuilder implements LongCounterBuilder {
        final InstrumentBuilder builder;

        SdkLongCounterBuilder(SdkMeter sdkMeter, String str) {
            this.builder = new InstrumentBuilder(str, InstrumentType.COUNTER, InstrumentValueType.LONG, sdkMeter);
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public LongCounterBuilder setDescription(String str) {
            this.builder.setDescription(str);
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public LongCounterBuilder setUnit(String str) {
            this.builder.setUnit(str);
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public SdkLongCounter build() {
            return (SdkLongCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.SdkLongCounter$SdkLongCounterBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return new SdkLongCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public DoubleCounterBuilder ofDoubles() {
            return (DoubleCounterBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.SdkLongCounter$SdkLongCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new SdkDoubleCounter.SdkDoubleCounterBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public ObservableLongCounter buildWithCallback(Consumer<ObservableLongMeasurement> consumer) {
            return this.builder.buildLongAsynchronousInstrument(InstrumentType.OBSERVABLE_COUNTER, consumer);
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public ObservableLongMeasurement buildObserver() {
            return this.builder.buildObservableMeasurement(InstrumentType.OBSERVABLE_COUNTER);
        }

        public String toString() {
            return this.builder.toStringHelper(getClass().getSimpleName());
        }
    }
}
