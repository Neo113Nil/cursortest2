package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ OtlpGrpcMetricExporterBuilder f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.setCompression((String) obj);
    }
}
