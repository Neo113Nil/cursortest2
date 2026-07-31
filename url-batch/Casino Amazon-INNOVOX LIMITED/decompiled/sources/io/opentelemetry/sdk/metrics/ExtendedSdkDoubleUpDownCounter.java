package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounterBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleUpDownCounter;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleUpDownCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkDoubleUpDownCounter extends SdkDoubleUpDownCounter implements ExtendedDoubleUpDownCounter {
    private ExtendedSdkDoubleUpDownCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounter
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkDoubleUpDownCounterBuilder extends SdkDoubleUpDownCounter.SdkDoubleUpDownCounterBuilder implements ExtendedDoubleUpDownCounterBuilder {
        ExtendedSdkDoubleUpDownCounterBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
            super(sdkMeter, str, str2, str3, adviceBuilder);
        }

        static /* synthetic */ ExtendedSdkDoubleUpDownCounter lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkDoubleUpDownCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleUpDownCounter.SdkDoubleUpDownCounterBuilder, io.opentelemetry.api.metrics.DoubleUpDownCounterBuilder
        public ExtendedDoubleUpDownCounter build() {
            return (ExtendedDoubleUpDownCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleUpDownCounter$ExtendedSdkDoubleUpDownCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkDoubleUpDownCounter.ExtendedSdkDoubleUpDownCounterBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleUpDownCounterBuilder
        public ExtendedDoubleUpDownCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
