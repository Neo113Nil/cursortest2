package io.opentelemetry.api.metrics;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface LongCounterBuilder {
    LongCounter build();

    ObservableLongCounter buildWithCallback(Consumer<ObservableLongMeasurement> consumer);

    DoubleCounterBuilder ofDoubles();

    LongCounterBuilder setDescription(String str);

    LongCounterBuilder setUnit(String str);

    default ObservableLongMeasurement buildObserver() {
        return DefaultMeter.getInstance().counterBuilder("noop").buildObserver();
    }
}
