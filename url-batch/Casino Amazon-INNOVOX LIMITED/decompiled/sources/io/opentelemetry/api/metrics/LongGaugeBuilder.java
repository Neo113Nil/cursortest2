package io.opentelemetry.api.metrics;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface LongGaugeBuilder {
    ObservableLongGauge buildWithCallback(Consumer<ObservableLongMeasurement> consumer);

    LongGaugeBuilder setDescription(String str);

    LongGaugeBuilder setUnit(String str);

    default ObservableLongMeasurement buildObserver() {
        return DefaultMeter.getInstance().gaugeBuilder("noop").ofLongs().buildObserver();
    }

    default LongGauge build() {
        return DefaultMeter.getInstance().gaugeBuilder("noop").ofLongs().build();
    }
}
