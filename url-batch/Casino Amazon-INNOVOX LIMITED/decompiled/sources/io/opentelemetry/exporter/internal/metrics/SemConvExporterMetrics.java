package io.opentelemetry.exporter.internal.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.metrics.ExporterMetrics;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.internal.ComponentId;
import io.opentelemetry.sdk.internal.SemConvAttributes;
import io.opentelemetry.sdk.internal.Signal;
import java.util.Collections;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class SemConvExporterMetrics implements ExporterMetrics {
    private static final Clock CLOCK = Clock.getDefault();
    private final Attributes additionalAttributes;
    private final ComponentId componentId;
    private final Supplier<MeterProvider> meterProviderSupplier;
    private final Signal signal;

    @Nullable
    private volatile LongUpDownCounter inflight = null;

    @Nullable
    private volatile LongCounter exported = null;

    @Nullable
    private volatile DoubleHistogram duration = null;

    @Nullable
    private volatile Attributes allAttributes = null;

    public SemConvExporterMetrics(Supplier<MeterProvider> supplier, Signal signal, ComponentId componentId, Attributes attributes) {
        this.meterProviderSupplier = supplier;
        this.componentId = componentId;
        this.signal = signal;
        this.additionalAttributes = attributes;
    }

    @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics
    public ExporterMetrics.Recording startRecordingExport(int i) {
        return new Recording(i);
    }

    private Meter meter() {
        MeterProvider meterProvider = this.meterProviderSupplier.get();
        if (meterProvider == null) {
            meterProvider = MeterProvider.noop();
        }
        return meterProvider.get("io.opentelemetry.exporters." + this.componentId.getTypeName());
    }

    private Attributes allAttributes() {
        Attributes attributes = this.allAttributes;
        if (attributes != null) {
            return attributes;
        }
        AttributesBuilder builder = Attributes.builder();
        builder.put((AttributeKey<AttributeKey<String>>) SemConvAttributes.OTEL_COMPONENT_TYPE, (AttributeKey<String>) this.componentId.getTypeName());
        builder.put((AttributeKey<AttributeKey<String>>) SemConvAttributes.OTEL_COMPONENT_NAME, (AttributeKey<String>) this.componentId.getComponentName());
        builder.putAll(this.additionalAttributes);
        Attributes build = builder.build();
        this.allAttributes = build;
        return build;
    }

    private LongUpDownCounter inflight() {
        LongUpDownCounter longUpDownCounter = this.inflight;
        if (longUpDownCounter != null && !isNoop(longUpDownCounter)) {
            return longUpDownCounter;
        }
        String metricUnit = this.signal.getMetricUnit();
        LongUpDownCounter build = meter().upDownCounterBuilder(this.signal.getExporterMetricNamespace() + ".inflight").setUnit("{" + metricUnit + "}").setDescription("The number of " + metricUnit + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").build();
        this.inflight = build;
        return build;
    }

    private LongCounter exported() {
        LongCounter longCounter = this.exported;
        if (longCounter != null && !isNoop(longCounter)) {
            return longCounter;
        }
        String metricUnit = this.signal.getMetricUnit();
        LongCounter build = meter().counterBuilder(this.signal.getExporterMetricNamespace() + ".exported").setUnit("{" + metricUnit + "}").setDescription("The number of " + metricUnit + "s for which the export has finished, either successful or failed").build();
        this.exported = build;
        return build;
    }

    private DoubleHistogram duration() {
        DoubleHistogram doubleHistogram = this.duration;
        if (doubleHistogram != null && !isNoop(doubleHistogram)) {
            return doubleHistogram;
        }
        DoubleHistogram build = meter().histogramBuilder("otel.sdk.exporter.operation.duration").setUnit("s").setDescription("The duration of exporting a batch of telemetry records").setExplicitBucketBoundariesAdvice(Collections.emptyList()).build();
        this.duration = build;
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementInflight(long j) {
        inflight().add(j, allAttributes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInflight(long j) {
        inflight().add(-j, allAttributes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementExported(long j, @Nullable String str) {
        exported().add(j, getAttributesWithPotentialError(str, Attributes.empty()));
    }

    static boolean isNoop(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    private Attributes getAttributesWithPotentialError(@Nullable String str, Attributes attributes) {
        Attributes allAttributes = allAttributes();
        boolean z = (str == null || str.isEmpty()) ? false : true;
        if (!z && attributes.isEmpty()) {
            return allAttributes;
        }
        AttributesBuilder builder = allAttributes.toBuilder();
        if (z) {
            builder.put((AttributeKey<AttributeKey<String>>) SemConvAttributes.ERROR_TYPE, (AttributeKey<String>) str);
        }
        return builder.putAll(attributes).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordDuration(double d, @Nullable String str, Attributes attributes) {
        duration().record(d, getAttributesWithPotentialError(str, attributes));
    }

    private class Recording extends ExporterMetrics.Recording {
        private final int itemCount;
        private final long startNanoTime;

        private Recording(int i) {
            this.itemCount = i;
            this.startNanoTime = SemConvExporterMetrics.CLOCK.nanoTime();
            SemConvExporterMetrics.this.incrementInflight(i);
        }

        @Override // io.opentelemetry.exporter.internal.metrics.ExporterMetrics.Recording
        protected void doFinish(@Nullable String str, Attributes attributes) {
            SemConvExporterMetrics.this.decrementInflight(this.itemCount);
            SemConvExporterMetrics.this.incrementExported(this.itemCount, str);
            SemConvExporterMetrics.this.recordDuration((SemConvExporterMetrics.CLOCK.nanoTime() - this.startNanoTime) / 1.0E9d, str, attributes);
        }
    }
}
