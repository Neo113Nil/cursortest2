package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6 implements BiConsumer {
    public final /* synthetic */ OtlpHttpLogRecordExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.setClientTls((byte[]) obj, (byte[]) obj2);
    }
}
