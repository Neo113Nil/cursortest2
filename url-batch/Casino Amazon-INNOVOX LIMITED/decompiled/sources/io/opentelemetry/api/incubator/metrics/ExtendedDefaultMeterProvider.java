package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.metrics.MeterProvider;

/* loaded from: classes3.dex */
public class ExtendedDefaultMeterProvider implements MeterProvider {
    private static final ExtendedDefaultMeterProvider INSTANCE = new ExtendedDefaultMeterProvider();
    private static final MeterBuilder BUILDER_INSTANCE = new NoopMeterBuilder();

    @Override // io.opentelemetry.api.metrics.MeterProvider
    public MeterBuilder meterBuilder(String str) {
        return BUILDER_INSTANCE;
    }

    public static MeterProvider getNoop() {
        return INSTANCE;
    }

    private ExtendedDefaultMeterProvider() {
    }

    private static class NoopMeterBuilder implements MeterBuilder {
        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public MeterBuilder setInstrumentationVersion(String str) {
            return this;
        }

        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public MeterBuilder setSchemaUrl(String str) {
            return this;
        }

        private NoopMeterBuilder() {
        }

        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public Meter build() {
            return ExtendedDefaultMeter.getNoop();
        }
    }
}
