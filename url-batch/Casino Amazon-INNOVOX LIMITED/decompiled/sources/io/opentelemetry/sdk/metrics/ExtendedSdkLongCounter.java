package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleCounterBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongCounter;
import io.opentelemetry.api.incubator.metrics.ExtendedLongCounterBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleCounter;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongCounter;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkLongCounter;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkLongCounter extends SdkLongCounter implements ExtendedLongCounter {
    private ExtendedSdkLongCounter(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongCounter
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkLongCounterBuilder extends SdkLongCounter.SdkLongCounterBuilder implements ExtendedLongCounterBuilder {
        ExtendedSdkLongCounterBuilder(SdkMeter sdkMeter, String str) {
            super(sdkMeter, str);
        }

        static /* synthetic */ ExtendedSdkLongCounter lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkLongCounter(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkLongCounter.SdkLongCounterBuilder, io.opentelemetry.api.metrics.LongCounterBuilder
        public ExtendedSdkLongCounter build() {
            return (ExtendedSdkLongCounter) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkLongCounter$ExtendedSdkLongCounterBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkLongCounter.ExtendedSdkLongCounterBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.sdk.metrics.SdkLongCounter.SdkLongCounterBuilder, io.opentelemetry.api.metrics.LongCounterBuilder
        public ExtendedDoubleCounterBuilder ofDoubles() {
            return (ExtendedDoubleCounterBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkLongCounter$ExtendedSdkLongCounterBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new ExtendedSdkDoubleCounter.ExtendedSdkDoubleCounterBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongCounterBuilder
        public ExtendedLongCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
