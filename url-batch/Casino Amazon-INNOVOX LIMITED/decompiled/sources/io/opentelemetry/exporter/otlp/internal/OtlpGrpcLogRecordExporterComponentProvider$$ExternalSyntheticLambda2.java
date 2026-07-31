package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2 implements BiConsumer {
    public final /* synthetic */ OtlpGrpcLogRecordExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.addHeader((String) obj, (String) obj2);
    }
}
