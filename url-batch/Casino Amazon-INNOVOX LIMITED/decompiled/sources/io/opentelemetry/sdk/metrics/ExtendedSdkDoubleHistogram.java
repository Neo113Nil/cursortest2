package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogram;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogramBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongHistogramBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongHistogram;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleHistogram;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkDoubleHistogram extends SdkDoubleHistogram implements ExtendedDoubleHistogram {
    ExtendedSdkDoubleHistogram(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogram
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkDoubleHistogramBuilder extends SdkDoubleHistogram.SdkDoubleHistogramBuilder implements ExtendedDoubleHistogramBuilder {
        ExtendedSdkDoubleHistogramBuilder(SdkMeter sdkMeter, String str) {
            super(sdkMeter, str);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleHistogram.SdkDoubleHistogramBuilder, io.opentelemetry.api.metrics.DoubleHistogramBuilder
        public ExtendedSdkDoubleHistogram build() {
            return (ExtendedSdkDoubleHistogram) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleHistogram$ExtendedSdkDoubleHistogramBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return new ExtendedSdkDoubleHistogram(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleHistogram.SdkDoubleHistogramBuilder, io.opentelemetry.api.metrics.DoubleHistogramBuilder
        public ExtendedLongHistogramBuilder ofLongs() {
            return (ExtendedLongHistogramBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleHistogram$ExtendedSdkDoubleHistogramBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new ExtendedSdkLongHistogram.ExtendedSdkLongHistogramBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleHistogramBuilder
        public ExtendedDoubleHistogramBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
