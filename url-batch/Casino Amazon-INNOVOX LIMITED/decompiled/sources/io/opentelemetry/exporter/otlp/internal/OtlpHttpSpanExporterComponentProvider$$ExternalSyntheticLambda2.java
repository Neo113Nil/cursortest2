package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2 implements BiConsumer {
    public final /* synthetic */ OtlpHttpSpanExporterBuilder f$0;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f$0.addHeader((String) obj, (String) obj2);
    }
}
