package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounterBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounterBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleUpDownCounter;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongUpDownCounter;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkLongUpDownCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkLongUpDownCounter extends SdkLongUpDownCounter implements ExtendedLongUpDownCounter {
    private ExtendedSdkLongUpDownCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounter
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkLongUpDownCounterBuilder extends SdkLongUpDownCounter.SdkLongUpDownCounterBuilder implements ExtendedLongUpDownCounterBuilder {
        ExtendedSdkLongUpDownCounterBuilder(SdkMeter sdkMeter, String str) {
            super(sdkMeter, str);
        }

        static /* synthetic */ ExtendedSdkLongUpDownCounter lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkLongUpDownCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkLongUpDownCounter.SdkLongUpDownCounterBuilder, io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public ExtendedLongUpDownCounter build() {
            return (ExtendedLongUpDownCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkLongUpDownCounter$ExtendedSdkLongUpDownCounterBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkLongUpDownCounter.ExtendedSdkLongUpDownCounterBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.sdk.metrics.SdkLongUpDownCounter.SdkLongUpDownCounterBuilder, io.opentelemetry.api.metrics.LongUpDownCounterBuilder
        public ExtendedDoubleUpDownCounterBuilder ofDoubles() {
            return (ExtendedDoubleUpDownCounterBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkLongUpDownCounter$ExtendedSdkLongUpDownCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new ExtendedSdkDoubleUpDownCounter.ExtendedSdkDoubleUpDownCounterBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongUpDownCounterBuilder
        public ExtendedLongUpDownCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
