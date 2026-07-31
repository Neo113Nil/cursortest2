package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounterBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleCounter;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkDoubleCounter extends SdkDoubleCounter implements ExtendedDoubleCounter {
    private ExtendedSdkDoubleCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounter
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkDoubleCounterBuilder extends SdkDoubleCounter.SdkDoubleCounterBuilder implements ExtendedDoubleCounterBuilder {
        ExtendedSdkDoubleCounterBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
            super(sdkMeter, str, str2, str3, adviceBuilder);
        }

        static /* synthetic */ ExtendedSdkDoubleCounter lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkDoubleCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleCounter.SdkDoubleCounterBuilder, io.opentelemetry.api.metrics.DoubleCounterBuilder
        public ExtendedSdkDoubleCounter build() {
            return (ExtendedSdkDoubleCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleCounter$ExtendedSdkDoubleCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkDoubleCounter.ExtendedSdkDoubleCounterBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounterBuilder
        public ExtendedDoubleCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
