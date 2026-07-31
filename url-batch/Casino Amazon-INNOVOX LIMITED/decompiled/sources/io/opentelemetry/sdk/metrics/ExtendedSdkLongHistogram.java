package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedLongHistogram;
import io.opentelemetry.api.incubator.metrics.ExtendedLongHistogramBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongHistogram;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkLongHistogram;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkLongHistogram extends SdkLongHistogram implements ExtendedLongHistogram {
    private ExtendedSdkLongHistogram(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongHistogram
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkLongHistogramBuilder extends SdkLongHistogram.SdkLongHistogramBuilder implements ExtendedLongHistogramBuilder {
        ExtendedSdkLongHistogramBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
            super(sdkMeter, str, str2, str3, adviceBuilder);
        }

        static /* synthetic */ ExtendedSdkLongHistogram lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkLongHistogram(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkLongHistogram.SdkLongHistogramBuilder, io.opentelemetry.api.metrics.LongHistogramBuilder
        public ExtendedSdkLongHistogram build() {
            return (ExtendedSdkLongHistogram) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkLongHistogram$ExtendedSdkLongHistogramBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkLongHistogram.ExtendedSdkLongHistogramBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedLongHistogramBuilder
        public ExtendedLongHistogramBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }
    }
}
