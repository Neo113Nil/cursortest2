package io.opentelemetry.api.metrics;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface DoubleCounterBuilder {
    DoubleCounter build();

    ObservableDoubleCounter buildWithCallback(Consumer<ObservableDoubleMeasurement> consumer);

    DoubleCounterBuilder setDescription(String str);

    DoubleCounterBuilder setUnit(String str);

    default ObservableDoubleMeasurement buildObserver() {
        return DefaultMeter.getInstance().counterBuilder("noop").ofDoubles().buildObserver();
    }
}
