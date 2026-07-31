package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporterBuilder;
import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ OtlpHttpMetricExporterBuilder f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.setAggregationTemporalitySelector((AggregationTemporalitySelector) obj);
    }
}
