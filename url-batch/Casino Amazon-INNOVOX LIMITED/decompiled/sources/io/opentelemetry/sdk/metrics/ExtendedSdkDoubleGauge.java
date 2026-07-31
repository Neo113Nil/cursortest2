package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleGauge;
import io.opentelemetry.api.incubator.metrics.ExtendedDoubleGaugeBuilder;
import io.opentelemetry.api.incubator.metrics.ExtendedLongGaugeBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleGauge;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongGauge;
import io.opentelemetry.sdk.metrics.InstrumentBuilder;
import io.opentelemetry.sdk.metrics.SdkDoubleGauge;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;
import java.util.List;

/* loaded from: classes3.dex */
final class ExtendedSdkDoubleGauge extends SdkDoubleGauge implements ExtendedDoubleGauge {
    private ExtendedSdkDoubleGauge(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor, sdkMeter, writeableMetricStorage);
    }

    @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleGauge
    public boolean isEnabled() {
        return this.sdkMeter.isMeterEnabled() && this.storage.isEnabled();
    }

    static final class ExtendedSdkDoubleGaugeBuilder extends SdkDoubleGauge.SdkDoubleGaugeBuilder implements ExtendedDoubleGaugeBuilder {
        ExtendedSdkDoubleGaugeBuilder(SdkMeter sdkMeter, String str) {
            super(sdkMeter, str);
        }

        static /* synthetic */ ExtendedSdkDoubleGauge lambda$build$0(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
            return new ExtendedSdkDoubleGauge(instrumentDescriptor, sdkMeter, writeableMetricStorage);
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleGauge.SdkDoubleGaugeBuilder, io.opentelemetry.api.metrics.DoubleGaugeBuilder
        public ExtendedSdkDoubleGauge build() {
            return (ExtendedSdkDoubleGauge) this.builder.buildSynchronousInstrument(new InstrumentBuilder.SynchronousInstrumentConstructor() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleGauge$ExtendedSdkDoubleGaugeBuilder$$ExternalSyntheticLambda0
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SynchronousInstrumentConstructor
                public final AbstractInstrument createInstrument(InstrumentDescriptor instrumentDescriptor, SdkMeter sdkMeter, WriteableMetricStorage writeableMetricStorage) {
                    return ExtendedSdkDoubleGauge.ExtendedSdkDoubleGaugeBuilder.lambda$build$0(instrumentDescriptor, sdkMeter, writeableMetricStorage);
                }
            });
        }

        @Override // io.opentelemetry.api.incubator.metrics.ExtendedDoubleGaugeBuilder
        public ExtendedDoubleGaugeBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
            this.builder.setAdviceAttributes(list);
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.SdkDoubleGauge.SdkDoubleGaugeBuilder, io.opentelemetry.api.metrics.DoubleGaugeBuilder
        public ExtendedLongGaugeBuilder ofLongs() {
            return (ExtendedLongGaugeBuilder) this.builder.swapBuilder(new InstrumentBuilder.SwapBuilder() { // from class: io.opentelemetry.sdk.metrics.ExtendedSdkDoubleGauge$ExtendedSdkDoubleGaugeBuilder$$ExternalSyntheticLambda1
                @Override // io.opentelemetry.sdk.metrics.InstrumentBuilder.SwapBuilder
                public final Object newBuilder(SdkMeter sdkMeter, String str, String str2, String str3, Advice.AdviceBuilder adviceBuilder) {
                    return new ExtendedSdkLongGauge.ExtendedSdkLongGaugeBuilder(sdkMeter, str, str2, str3, adviceBuilder);
                }
            });
        }
    }
}
