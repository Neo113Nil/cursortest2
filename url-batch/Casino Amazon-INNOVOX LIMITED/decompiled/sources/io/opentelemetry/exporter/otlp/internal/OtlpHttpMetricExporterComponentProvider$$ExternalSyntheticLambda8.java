package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8 implements BiConsumer {
    public final /* synthetic */ OtlpHttpMetricExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.setClientTls((byte[]) obj, (byte[]) obj2);
    }
}
