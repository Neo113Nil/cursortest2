package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleGauge;
import io.opentelemetry.sdk.metrics.ExtendedSdkDoubleHistogram;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongCounter;
import io.opentelemetry.sdk.metrics.ExtendedSdkLongUpDownCounter;

/* loaded from: classes3.dex */
final class IncubatingUtil {
    private IncubatingUtil() {
    }

    static LongCounterBuilder createExtendedLongCounterBuilder(SdkMeter sdkMeter, String str) {
        return new ExtendedSdkLongCounter.ExtendedSdkLongCounterBuilder(sdkMeter, str);
    }

    static LongUpDownCounterBuilder createExtendedLongUpDownCounterBuilder(SdkMeter sdkMeter, String str) {
        return new ExtendedSdkLongUpDownCounter.ExtendedSdkLongUpDownCounterBuilder(sdkMeter, str);
    }

    static DoubleHistogramBuilder createExtendedDoubleHistogramBuilder(SdkMeter sdkMeter, String str) {
        return new ExtendedSdkDoubleHistogram.ExtendedSdkDoubleHistogramBuilder(sdkMeter, str);
    }

    static DoubleGaugeBuilder createExtendedDoubleGaugeBuilder(SdkMeter sdkMeter, String str) {
        return new ExtendedSdkDoubleGauge.ExtendedSdkDoubleGaugeBuilder(sdkMeter, str);
    }
}
