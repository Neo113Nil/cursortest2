package io.opentelemetry.api.metrics;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface DoubleGaugeBuilder {
    ObservableDoubleGauge buildWithCallback(Consumer<ObservableDoubleMeasurement> consumer);

    LongGaugeBuilder ofLongs();

    DoubleGaugeBuilder setDescription(String str);

    DoubleGaugeBuilder setUnit(String str);

    default ObservableDoubleMeasurement buildObserver() {
        return DefaultMeter.getInstance().gaugeBuilder("noop").buildObserver();
    }

    default DoubleGauge build() {
        return DefaultMeter.getInstance().gaugeBuilder("noop").build();
    }
}
