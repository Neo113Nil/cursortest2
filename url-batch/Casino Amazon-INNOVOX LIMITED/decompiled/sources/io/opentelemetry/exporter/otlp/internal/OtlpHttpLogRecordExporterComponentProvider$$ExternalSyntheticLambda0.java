package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporterBuilder;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ OtlpHttpLogRecordExporterBuilder f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.setComponentLoader((ComponentLoader) obj);
    }
}
