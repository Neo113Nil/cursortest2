package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ OtlpHttpSpanExporterBuilder f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.setCompression((String) obj);
    }
}
