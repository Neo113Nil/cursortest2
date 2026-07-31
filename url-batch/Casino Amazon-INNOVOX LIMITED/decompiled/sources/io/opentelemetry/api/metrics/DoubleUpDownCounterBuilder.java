package io.opentelemetry.api.metrics;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface DoubleUpDownCounterBuilder {
    DoubleUpDownCounter build();

    ObservableDoubleUpDownCounter buildWithCallback(Consumer<ObservableDoubleMeasurement> consumer);

    DoubleUpDownCounterBuilder setDescription(String str);

    DoubleUpDownCounterBuilder setUnit(String str);

    default ObservableDoubleMeasurement buildObserver() {
        return DefaultMeter.getInstance().upDownCounterBuilder("noop").ofDoubles().buildObserver();
    }
}
