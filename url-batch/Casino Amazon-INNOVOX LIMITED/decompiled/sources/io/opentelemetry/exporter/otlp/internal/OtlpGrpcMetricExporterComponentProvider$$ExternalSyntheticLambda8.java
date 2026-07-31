package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8 implements BiConsumer {
    public final /* synthetic */ OtlpGrpcMetricExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.setClientTls((byte[]) obj, (byte[]) obj2);
    }
}
