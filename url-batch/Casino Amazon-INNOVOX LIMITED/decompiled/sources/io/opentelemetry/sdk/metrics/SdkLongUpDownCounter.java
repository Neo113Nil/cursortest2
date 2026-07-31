package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.DoubleUpDownCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.api.metrics.ObservableLongUpDownCounter;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleUpDownCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
class SdkLongUpDownCounter extends AbstractInstrument implements LongUpDownCounter {
    final SdkMeter sdkMeter;
    final WriteableMetricStorage storage;

    SdkLongUpDownCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor);
        this.sdkMeter = sdkMeter;
        this.storage = writeableMetricStorage;
    }

    @Override // io.opentelemetry.api.metrics.LongUpDownCounter
    public void add(long j, Attributes attributes, Context context) {
        this.storage.recordLong(j, attributes, context);
    }

    @Override // io.opentelemetry.api.metrics.LongUpDownCounter
    public void add(long j, Attributes attributes) {
        add(j, attributes, Context.current());
    }

    @Override // io.opentelemetry.api.metrics.LongUpDownCounter
    public void add(long j) {
        add(j, Attributes.empty());
    }

    static class SdkLongUpDownCounterBuilder implements LongUpDownCounterBuilder {
        final InstrumentBuilder builder;

        SdkLongUpDownCounterBuilder(SdkMeter sdkMeter, String str) {
            this.builder = new InstrumentBuilder(str, InstrumentType.UP_DOWN_COUNTER, InstrumentValueType.LONG, sdkMeter);
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public LongUpDownCounterBuilder setDescription(String str) {
            this.builder.setDescription(str);
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public LongUpDownCounterBuilder setUnit(String str) {
            this.builder.setUnit(str);
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public LongUpDownCounter build() {
            return (LongUpDownCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.SdkLongUpDownCounter$SdkLongUpDownCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return new SdkLongUpDownCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public DoubleUpDownCounterBuilder ofDoubles() {
            return (DoubleUpDownCounterBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.SdkLongUpDownCounter$SdkLongUpDownCounterBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new SdkDoubleUpDownCounter.SdkDoubleUpDownCounterBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public ObservableLongUpDownCounter buildWithCallback(Consumer<ObservableLongMeasurement> consumer) {
            return this.builder.buildLongAsynchronousInstrument(InstrumentType.OBSERVABLE_UP_DOWN_COUNTER, consumer);
        }

        @Override // io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public ObservableLongMeasurement buildObserver() {
            return this.builder.buildObservableMeasurement(InstrumentType.OBSERVABLE_UP_DOWN_COUNTER);
        }

        public String toString() {
            return this.builder.toStringHelper(getClass().getSimpleName());
        }
    }
}
