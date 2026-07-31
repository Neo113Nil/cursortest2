package io.opentelemetry.api.metrics;

/* loaded from: classes3.dex */
public interface MeterProvider {
    MeterBuilder meterBuilder(String str);

    default Meter get(String str) {
        return meterBuilder(str).build();
    }

    static MeterProvider noop() {
        return DefaultMeterProvider.getInstance();
    }
}
