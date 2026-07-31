package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2 implements BiConsumer {
    public final /* synthetic */ OtlpGrpcSpanExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.addHeader((String) obj, (String) obj2);
    }
}
